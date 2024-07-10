package main.visitor.codeGenerator;

import jdk.jshell.VarSnippet;
import main.ast.node.Program;
import main.ast.node.declaration.*;
import main.ast.node.expression.*;
import main.ast.node.expression.operators.UnaryOperator;
import main.ast.node.expression.values.*;
import main.ast.node.statement.*;
import main.ast.type.Type;
import main.ast.type.complexType.OrderType;
import main.ast.type.complexType.TradeType;
import main.ast.type.primitiveType.*;
import main.compileError.CompileError;
import main.compileError.name.MethodRedefinition;
import main.symbolTable.SymbolTable;
import main.symbolTable.symbolTableItems.*;
import main.visitor.Visitor;
import main.ast.node.expression.BinaryExpression;
import main.ast.node.expression.Identifier;
import main.ast.node.expression.operators.BinaryOperator;
import main.ast.type.primitiveType.BoolType;
import main.symbolTable.itemException.ItemAlreadyExistsException;
import main.visitor.typeAnalyzer.*;
import java.util.ArrayList;


import java.io.*;

public class CodeGenerator extends Visitor<String> {
    TypeChecker expressionTypeChecker;
    private ArrayList<CompileError> typeErrors;
    private String outputPath;
    private FileWriter currentFile;
    private FunctionDeclaration currentFunc;
    private int lastSlot = -1;
    private int lastLabel = 0;

    public CodeGenerator(ArrayList<CompileError> typeErrorsList) {
        typeErrors = typeErrorsList;
        this.expressionTypeChecker = new TypeChecker(typeErrors);
        this.prepareOutputFolder();
    }

    public String SlotIndex(int index) {
        String resultIndex;
        if (index < 4)
            resultIndex = "_" + String.valueOf(index);
        else
            resultIndex = " " + String.valueOf(index);
        return resultIndex;
    }

    private void addDefaultValueCommand(Type type, Expression expression) {
        if (type instanceof IntType) {
            if (expression == null)
                addCommand("ldc 0");
            else
                addCommand(expression.accept(this));
            addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
        }
        else if (type instanceof BoolType) {
            if (expression == null)
                addCommand("ldc 0");
            else
                addCommand(expression.accept(this));
            addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
        }
        else if (type instanceof FloatType) {
            if (expression == null)
                addCommand("ldc 0");
            else
                addCommand(expression.accept(this));
            addCommand("invokestatic java/lang/Float/valueOf(F)Ljava/lang/Float;");
        }
        else if (type instanceof StringType) {
            if (expression == null)
                addCommand("ldc \"\"");
            else
                addCommand(expression.accept(this));
        }
        else { //Complex Types
            addCommand(expression.accept(this));
        }
    }

    private void addDefaultValueCommandArray(Type type, int length) {
        addCommand("ldc " + length);
        if (type instanceof IntType) {
            addCommand("anewarray java/lang/Integer;");
        }
        else if (type instanceof BoolType) {
            addCommand("anewarray java/lang/Boolean;");
        }
        else if (type instanceof FloatType) {
            addCommand("anewarray java/lang/Float;");
        }
        else if (type instanceof StringType) {;
            addCommand("anewarray java/lang/String;");
        }
    }

    private String castToNonPrimitive(Type type) {
        if (type instanceof StringType)
            return "";
        if (type.isPrimitive) {
            type.isPrimitive = false;
            if (type instanceof IntType) {
                return "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;";
            } else if (type instanceof BoolType) {
                return "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;";
            } else if (type instanceof FloatType) {
                return "invokestatic java/lang/Float/valueOf(F)Ljava/lang/Float;";
            }
        }
        return null;
    }

    private String castToPrimitive(Type type) {
        if (type instanceof StringType)
            return "";
        if (!type.isPrimitive) {
            type.isPrimitive = true;
            if (type instanceof IntType) {
                return "invokevirtual java/lang/Integer/intValue()I";
            } else if (type instanceof BoolType) {
                return "invokevirtual java/lang/Boolean/booleanValue()Z";
            } else if (type instanceof FloatType) {
                return "invokevirtual java/lang/Float/floatValue()F";
            }
        }
        return null;
    }

    private int slotOf(String identifier) {
        if (identifier.equals("")) {
            if (lastSlot == -1) {
                int localVarsCount = 0;
                for (var localVar : currentFunc.getBody()) {
                    if (localVar instanceof VarDeclaration) {
                        localVarsCount += 1;
                    }
                }
                lastSlot = localVarsCount + currentFunc.getArgs().size();
            }
            lastSlot++;
            return lastSlot;
        }

        int i = 1;
        for (var arg : currentFunc.getArgs()) {
            if (arg.getIdentifier().getName().equals(identifier))
                return i;
            i++;
        }
        i = findNextSlot(currentFunc.getBody(), i, identifier);
        return i;
    }

    private int findNextSlot(ArrayList<Statement> statements, int i, String identifier) {
        for (var localVar : statements) {
            if (localVar instanceof VarDeclaration) {
                if (((VarDeclaration) localVar).getIdentifier().getName().equals(identifier))
                    return i;
                i++;
            }
            else if (localVar instanceof IfElseStmt) {
                int j = findNextSlot(((IfElseStmt) localVar).getThenBody(), i, identifier);
                int k = findNextSlot(((IfElseStmt) localVar).getElseBody(), i, identifier);
                if (j > 0)
                    return j;
                else if (k > 0)
                    return k;
            }
            else if (localVar instanceof WhileStmt) {
                int z = findNextSlot(((WhileStmt) localVar).getBody(), i, identifier);
                if (z > 0)
                    return z;
            }
        }
        return 0;
    }

    private void prepareOutputFolder() {
        this.outputPath = "output/";
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) { }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");
    }

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) { }
    }

    private void createFile(String name) {
        try {
            String path = this.outputPath + name + ".j";
            File file = new File(path);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(path);
            this.currentFile = fileWriter;
        } catch (IOException e) {}
    }

    private void addCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                this.currentFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                this.currentFile.write(command + "\n");
            else
                this.currentFile.write("\t\t" + command + "\n");
            this.currentFile.flush();
        } catch (IOException e) {}
    }

    private String makeTypeSignature(Type t) {
        if (t instanceof IntType)
            return  "Ljava/lang/Integer;";
        else if (t instanceof BoolType)
            return "Ljava/lang/Boolean;";
        else if (t instanceof StringType)
            return "Ljava/lang/String;";
        else if (t instanceof FloatType)
            return "Ljava/lang/Float;";
        else if (t instanceof NullType || t instanceof VoidType)
            return "V";
        else if (t instanceof TradeType)
            return "LTrade;";
        return null;
    }

    public String visit(Program program) {
        createFile("Main");

        addCommand(".class public Main");
        addCommand(".super java/lang/Object");
        addCommand(".method public <init>()V");
        addCommand("aload_0");
        addCommand("invokespecial java/lang/Object/<init>()V");
        addCommand("return");
        addCommand(".end method");
        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);
        for (var variable : program.getVars())
            handleGlobalVars(variable);
        for (var variable : program.getVars())
            handleGlobalVarsPutField(variable);
        for (var func : program.getFunctions()) {
            currentFunc = func;
            func.accept(this);
        }
        for (var onInit : program.getInits()) {
            FunctionDeclaration onInitFunc = new FunctionDeclaration();
            VarDeclaration initArg = new VarDeclaration();
            initArg.setIdentifier(onInit.getTradeName());
            initArg.setType(new TradeType());
            var onInitArgs = new ArrayList<VarDeclaration>();
            onInitArgs.add(initArg);
            onInitFunc.setArgs(onInitArgs);
            onInitFunc.setBody(onInit.getBody());
            currentFunc = onInitFunc;
            onInit.accept(this);
        }
        for (var onStart : program.getStarts()) {
            FunctionDeclaration onStartFunc = new FunctionDeclaration();
            VarDeclaration initArg = new VarDeclaration();
            initArg.setIdentifier(onStart.getTradeName());
            initArg.setType(new TradeType());
            var onStartArgs = new ArrayList<VarDeclaration>();
            onStartArgs.add(initArg);
            onStartFunc.setArgs(onStartArgs);
            onStartFunc.setBody(onStart.getBody());
            currentFunc = onStartFunc;
            onStart.accept(this);
        }
        FunctionDeclaration mainFunc = new FunctionDeclaration();
        mainFunc.setArgs(new ArrayList<VarDeclaration>());
        mainFunc.setBody(program.getMain().getBody());
        currentFunc = mainFunc;
        program.getMain().accept(this);

        return null;
    }

    public void handleGlobalVars(VarDeclaration varDeclaration) {
        String commands = "";
        commands += ".field public " + varDeclaration.getIdentifier().getName() + " ";
        Type varType = varDeclaration.getType();
        if (varDeclaration.getLength() > 0)
            commands += "[";
        commands += makeTypeSignature(varType);
        addCommand(commands);
        VariableItem varItem = new VariableItem(varDeclaration);
        try {
            SymbolTable.top.put(varItem);
        } catch (ItemAlreadyExistsException ignored) {};
    }

    public void handleGlobalVarsPutField(VarDeclaration varDeclaration) {
        String commands = "";
        if (varDeclaration.getRValue() == null)
            return;
        commands += "aload_0";
        commands += "\n" + varDeclaration.getRValue().accept(this);
        Type expType = varDeclaration.getRValue().accept(expressionTypeChecker);
        commands += "\n" + castToNonPrimitive(expType);
        commands += "\nputfield Main/" + varDeclaration.getIdentifier().getName() + " " + makeTypeSignature(varDeclaration.getType());
        addCommand(commands);
    }

    @Override
    public String visit(MainDeclaration mainDeclaration) {
        addCommand(".method public main()V");
        addCommand(".limit locals 128");
        addCommand(".limit stack 128");
        MainItem mainItem = new MainItem(mainDeclaration);
        SymbolTable mainSymbolTable = new SymbolTable(SymbolTable.top, "main");
        mainItem.setMainSymbolTable(mainSymbolTable);
        SymbolTable.push(mainSymbolTable);
        for (var stmt : mainDeclaration.getBody()) {
            stmt.accept(this);
        }
        SymbolTable.pop();
        addCommand("return");
        addCommand(".end method");
        return null;
    }

    @Override
    public String visit(FunctionDeclaration functionDeclaration) {
        String command = ".method public " + functionDeclaration.getName().getName();
        command += "(";
        FunctionItem functionItem = new FunctionItem(functionDeclaration);
        try {
            SymbolTable.top.put(functionItem);
        } catch (ItemAlreadyExistsException ignored) {}
        SymbolTable funcSymbolTable = new SymbolTable(SymbolTable.top,  functionDeclaration.getName().getName());
        functionItem.setFunctionSymbolTable(funcSymbolTable);
        SymbolTable.push(funcSymbolTable);
        for (VarDeclaration arg : functionDeclaration.getArgs()) {
            command += makeTypeSignature(arg.getType());
            VariableItem varItem = new VariableItem(arg);
            try {
                SymbolTable.top.put(varItem);
            } catch (Exception ignored) {}
        }
        command += ")";
        command += makeTypeSignature(functionDeclaration.getReturnType());
        addCommand(command);
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");

        for (var stmt : functionDeclaration.getBody())
            stmt.accept(this);
        SymbolTable.pop();
        if (functionDeclaration.getReturnType() instanceof VoidType)
            addCommand("return");
        addCommand(".end method");
        return null;
    }

    @Override
    public String visit(OnStartDeclaration onStartDeclaration) {
        String command = ".method public " + "OnStart_" + onStartDeclaration.getTradeName().getName();
        command += "(";
        OnStartItem onStartItem = new OnStartItem(onStartDeclaration);
        try {
            SymbolTable.top.put(onStartItem);
        } catch (ItemAlreadyExistsException ignored) {}
        SymbolTable onStartSymbolTable = new SymbolTable(SymbolTable.top,  onStartDeclaration.getTradeName().getName());
        onStartItem.setOnStartSymbolTable(onStartSymbolTable);
        SymbolTable.push(onStartSymbolTable);
        command += "LTrade;";
        VarDeclaration initArg = new VarDeclaration();
        initArg.setIdentifier(onStartDeclaration.getTradeName());
        initArg.setType(new TradeType());
        VariableItem varItem = new VariableItem(initArg);
        try {
            SymbolTable.top.put(varItem);
        } catch (Exception ignored) {}
        command += ")";
        command += makeTypeSignature(new NullType());
        addCommand(command);
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        for (var stmt : onStartDeclaration.getBody())
            stmt.accept(this);
        SymbolTable.pop();
        addCommand("return");
        addCommand(".end method");
        return null;
    }

    @Override
    public String visit(OnInitDeclaration onInitDeclaration) {
        String command = ".method public " + "OnInit_" + onInitDeclaration.getTradeName().getName();
        command += "(";
        OnInitItem onInitItem = new OnInitItem(onInitDeclaration);
        try {
            SymbolTable.top.put(onInitItem);
        } catch (ItemAlreadyExistsException ignored) {}
        SymbolTable onInitSymbolTable = new SymbolTable(SymbolTable.top,  onInitDeclaration.getTradeName().getName());
        onInitItem.setOnInitSymbolTable(onInitSymbolTable);
        SymbolTable.push(onInitSymbolTable);
        command += "LTrade;";
        VarDeclaration initArg = new VarDeclaration();
        initArg.setIdentifier(onInitDeclaration.getTradeName());
        initArg.setType(new TradeType());
        VariableItem varItem = new VariableItem(initArg);
        try {
            SymbolTable.top.put(varItem);
        } catch (Exception ignored) {}
        command += ")";
        command += makeTypeSignature(new NullType());
        addCommand(command);
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        for (var stmt : onInitDeclaration.getBody())
            stmt.accept(this);
        SymbolTable.pop();
        addCommand("return");
        addCommand(".end method");
        return null;
    }

    @Override
    public String visit(VarDeclaration varDeclaration) {
        int slot = slotOf(varDeclaration.getIdentifier().getName());
        Type varType = varDeclaration.getType();
        if (varDeclaration.getLength() == 0)
            addDefaultValueCommand(varType, varDeclaration.getRValue());
        else
            addDefaultValueCommandArray(varType, varDeclaration.getLength());
        addCommand("astore" + SlotIndex(slot));
        VariableItem varItem = new VariableItem(varDeclaration);
        try {
            SymbolTable.top.put(varItem);
        } catch (ItemAlreadyExistsException ignored) {}
        return null;
    }

    @Override
    public String visit(AssignStmt assignStmt) {
        BinaryExpression assignExp = new BinaryExpression(assignStmt.getLValue(),
                assignStmt.getRValue(), assignStmt.getBinaryOperator());
        addCommand(assignExp.accept(this));
        return null;
    }

    //@Override
    //public String visit(BlockStmt blockStmt) {
        //todo
        //return null;
    //}

    private String newLabel() {
        String label = "Label_" + lastLabel;
        lastLabel++;
        return label;
    }

    @Override
    public String visit(IfElseStmt ifElseStmt) {
        String elseLabel = newLabel();
        String afterLabel = newLabel();
        addCommand("Start If " + ifElseStmt.getLine());
        addCommand(ifElseStmt.getCondition().accept(this));
        addCommand("ifeq " + elseLabel);
        for (var thenStmt : ifElseStmt.getThenBody())
            thenStmt.accept(this);
        addCommand("goto " + afterLabel);
        addCommand(elseLabel + ":");
        if (ifElseStmt.getElseBody() != null)
            for (var elseStmt : ifElseStmt.getElseBody())
                elseStmt.accept(this);
        addCommand(afterLabel + ":");
        return null;
    }

    @Override
    public String visit(WhileStmt whileStmt) {
        String startLabel = newLabel();
        String breakLabel = newLabel();
        addCommand("Start While " + whileStmt.getLine());
        addCommand(startLabel + ":");
        addCommand(whileStmt.getCondition().accept(this));
        addCommand("ifeq " + breakLabel);
        for (var bodyStmt : whileStmt.getBody())
            bodyStmt.accept(this);
        addCommand("goto " + startLabel);
        addCommand(breakLabel + ":");
        return null;
    }

    public String handleOrders(FunctionCall functionCall) {
        String commands = "";
        commands += "new Order";
        commands += "\ndup";
        commands += "\nldc " + "\"" + ((TradeValue) functionCall.getArgs().get(0)).getConstant() + "\"";
        Type argType = new IntType();
        commands += "\n" + functionCall.getArgs().get(1).accept(this);
        if (functionCall.getArgs().get(1).accept(expressionTypeChecker) instanceof FloatType)
            commands += "\nf2i";
        argType.isPrimitive = true;
        commands += "\n" + castToNonPrimitive(argType);
        commands += "\n" + functionCall.getArgs().get(2).accept(this);
        if (functionCall.getArgs().get(2).accept(expressionTypeChecker) instanceof FloatType)
            commands += "\nf2i";
        argType.isPrimitive = true;
        commands += "\n" + castToNonPrimitive(argType);
        commands += "\n" + functionCall.getArgs().get(3).accept(this);
        if (functionCall.getArgs().get(3).accept(expressionTypeChecker) instanceof FloatType)
            commands += "\nf2i";
        argType.isPrimitive = true;
        commands += "\n" + castToNonPrimitive(argType);
        commands += "\ninvokespecial Order/<init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V";
        return commands;
    }

    @Override
    public String visit(FunctionCall functionCall) {
        String commands = "";
        if (functionCall.getFunctionName().getName().equals("Order")) {
            commands = handleOrders(functionCall);
            return commands;
        }
        commands += "aload_0";
        for (Expression arg : functionCall.getArgs()) {
            commands += "\n" + arg.accept(this);
            Type argType = arg.accept(expressionTypeChecker);
            argType.isPrimitive = true;
            String castStr = castToNonPrimitive(argType);
            if (castStr != null && !castStr.equals(""))
                commands += "\n" + castStr;
        }
        commands += "\n";
        commands += "invokevirtual Main/" + functionCall.getFunctionName().getName() + "(";
        for (Expression arg : functionCall.getArgs())
            commands += makeTypeSignature(arg.accept(expressionTypeChecker));
        commands += ")";
        commands += makeTypeSignature(functionCall.accept(expressionTypeChecker));
        return commands;
    }

    private String makePrimitiveSignature(Type t) {
        if (t instanceof IntType)
            return  "I";
        else if (t instanceof BoolType)
            return "Z";
        else if (t instanceof FloatType)
            return "F";
        return null;
    }

    @Override
    public String visit(PrintStmt print) {
        Type type = print.getArg().accept(expressionTypeChecker);
        addCommand("; Print Statement " + print.getLine());
        addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
        addCommand(print.getArg().accept(this));
        addCommand("invokevirtual java/io/PrintStream/print(" + makePrimitiveSignature(type) + ")V");
        return null;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        Type type = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        if(type instanceof NullType) {
            addCommand("return");
        }
        else {
            addCommand(returnStmt.getReturnedExpr().accept(this));
            if (type instanceof IntType) {
                addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
            }
            else if (type instanceof BoolType) {
                addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
            }
            else if (type instanceof FloatType) {
                addCommand("invokestatic java/lang/Float/valueOf(F)Ljava/lang/Float;");
            }
            addCommand("areturn");
        }
        return null;
    }

    @Override
    public String visit(Identifier identifier) {
        String commands = "";
        int slot = slotOf(identifier.getName());
        commands += "aload" + SlotIndex(slot);
        Type type = identifier.accept(expressionTypeChecker);
        String castCmd = castToPrimitive(type);
        if (castCmd != null && (!castCmd.equals("")))
            commands += "\n" + castCmd;
        return commands;
    }

    @Override
    public String visit(ArrayIdentifier arrayIdentifier) {
        String commands = "";
        int slot = slotOf(arrayIdentifier.getName());
        commands += "aload" + SlotIndex(slot);
        commands += "\n" + arrayIdentifier.getIndex().accept(this);
        Type type = arrayIdentifier.accept(expressionTypeChecker);
        if (type != null) {
            String castCmd = castToPrimitive(type);
            if (castCmd != null)
                commands += "\n" + castCmd;
        }
        commands += "\n" + "aaload";
        return commands;
    }

    @Override
    public String visit(VarAccess varAccess) {
        String commands = "";
        String tradeName = varAccess.getVariable().getName();
        commands += "aload_1";
        if (tradeName.equals("Bid"))
            commands += "\ninvokevirtual LTrade/getBid()F";
        else if (tradeName.equals("Ask"))
            commands += "\ninvokevirtual LTrade/getAsk()F";
        else if (tradeName.equals("High"))
            commands += "\ninvokevirtual LTrade/getHigh()F";
        else if (tradeName.equals("Low"))
            commands += "\ninvokevirtual LTrade/getLow()F";
        else if (tradeName.equals("Time"))
            commands += "\ninvokevirtual LTrade/getTime()F";
        else if (tradeName.equals("Digits"))
            commands += "\ninvokevirtual LTrade/getDigits()I";
        else if (tradeName.equals("Volume"))
            commands += "\ninvokevirtual LTrade/getVolume()F";
        else if (tradeName.equals("Type"))
            commands += "\ninvokevirtual LTrade/getType()I";
        else if (tradeName.equals("Text"))
            commands += "\ninvokevirtual LTrade/getText()Ljava/lang/String";
        else if (tradeName.equals("Open"))
            commands += "\ninvokevirtual LTrade/getOpen()F";
        else if (tradeName.equals("Close"))
            commands += "\ninvokevirtual LTrade/getClose()F";
        return commands;
    }

    @Override
    public String visit(NullValue nullValue) {
        String commands = "";
        commands += "aconst_null";
        return commands;
    }

    @Override
    public String visit(IntValue intValue) {
        String commands = "";
        commands += "ldc " + String.valueOf(intValue.getConstant());
        return commands;
    }

    @Override
    public String visit(FloatValue floatValue) {
        String commands = "";
        commands += "ldc " + String.valueOf(floatValue.getConstant());
        return commands;
    }

    @Override
    public String visit(BoolValue boolValue) {
        String commands = "";
        commands += "ldc ";
        if (boolValue.getConstant())
            commands += "1";
        else
            commands += "0";
        return commands;
    }

    @Override
    public String visit(StringValue stringValue) {
        String commands = "";
        commands += "ldc " + stringValue.getConstant();
        return commands;
    }

    @Override
    public String visit(ExpressionStmt expressionStmt) {
        addCommand(expressionStmt.getExpression().accept(this));
        return null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        String commands = "";
        Type leftType = binaryExpression.getLeft().accept(expressionTypeChecker);
        commands += binaryExpression.getLeft().accept(this);
        commands += "\n" + binaryExpression.getRight().accept(this);
        if (operator == BinaryOperator.PLUS) {
            if (leftType instanceof FloatType)
                commands += "\nfadd";
            else
                commands += "\niadd";
        }
        else if (operator == BinaryOperator.MINUS) {
            if (leftType instanceof FloatType)
                commands += "\nfsub";
            else
                commands += "\nisub";
        }
        else if (operator == BinaryOperator.MULT) {
            if (leftType instanceof FloatType)
                commands += "\nfmul";
            else
                commands += "\nimul";
        }
        else if (operator == BinaryOperator.DIV) {
            if (leftType instanceof FloatType)
                commands += "\nfdiv";
            else
                commands += "\nidiv";
        }
        else if (operator == BinaryOperator.MOD) {
            if (leftType instanceof FloatType)
                commands += "\nfrem";
            else
                commands += "\nirem";
        }
        else if (operator == BinaryOperator.BIT_AND) {
            commands += "\niand";
        }
        else if (operator == BinaryOperator.BIT_OR) {
            commands += "\nior";
        }
        else if (operator == BinaryOperator.BIT_XOR) {
            commands += "\nixor";
        }
        else if (operator == BinaryOperator.L_SHIFT) {
            commands += "\nishl";
        }
        else if (operator == BinaryOperator.R_SHIFT) {
            commands += "\nishr";
        }
        else if((operator == BinaryOperator.GT) || (operator == BinaryOperator.LT)) {
            String trueLabel = newLabel();
            String afterLabel = newLabel();
            if (operator == BinaryOperator.GT)
                commands += "\nif_icmpgt " + trueLabel;
            else
                commands += "\nif_icmplt " + trueLabel;
            commands += "\nldc 0";
            commands += "\ngoto " + afterLabel;
            commands += "\n" + trueLabel + ":";
            commands += "\nldc 1";
            commands += "\n" + afterLabel + ":";
        }
        else if((operator == BinaryOperator.EQ) || (operator == BinaryOperator.NEQ)) {
            String trueLabel = newLabel();
            String afterLabel = newLabel();
            String cmpCommand = "if_a";
            Type type = binaryExpression.getLeft().accept(expressionTypeChecker);
            if (type instanceof IntType || type instanceof BoolType)
                cmpCommand = "if_i";
            if (operator == BinaryOperator.EQ)
                commands += "\n" + cmpCommand + "cmpeq "  + trueLabel;
            else
                commands += "\n" + cmpCommand + "cmpne "  + trueLabel;
            commands += "\nldc 0";
            commands += "\ngoto " + afterLabel;
            commands += "\n" + trueLabel + ":";
            commands += "\nldc 1";
            commands += "\n" + afterLabel + ":";
        }
        else if (operator == BinaryOperator.AND) {
            String shortCircuitLabel = newLabel();
            String trueLabel = newLabel();
            String afterLabel = newLabel();
            commands = "; logical AND\n";
            commands += binaryExpression.getLeft().accept(this);
            commands += "\nifeq " + shortCircuitLabel;
            commands += "\n" + binaryExpression.getRight().accept(this);
            commands += "\nifne " + trueLabel;
            commands += "\n" + shortCircuitLabel + ":";
            commands += "\nldc 0";
            commands += "\ngoto " + afterLabel;
            commands += "\n" + trueLabel + ":";
            commands += "\nldc 1";
            commands += "\n" + afterLabel + ":";
        }
        else if (operator == BinaryOperator.OR) {
            String trueLabel = newLabel();
            String afterLabel = newLabel();
            commands = "; logical OR\n";
            commands += binaryExpression.getLeft().accept(this);
            commands += "\nifne " + trueLabel;
            commands += "\n" + binaryExpression.getRight().accept(this);
            commands += "\nifne " + trueLabel;
            commands += "\nldc 0";
            commands += "\ngoto " + afterLabel;
            commands += "\n" + trueLabel + ":";
            commands += "\nldc 1";
            commands += "\n" + afterLabel + ":";
        }
        else if (operator == BinaryOperator.ASSIGN) {
            commands = "";
            Type firstType = binaryExpression.getLeft().accept(expressionTypeChecker);
            Type secondType = binaryExpression.getRight().accept(expressionTypeChecker);
            String secondOperandCommands = binaryExpression.getRight().accept(this);
            if (binaryExpression.getLeft() instanceof ArrayIdentifier) {
                String name = ((ArrayIdentifier) binaryExpression.getLeft()).getName();
                commands += "aload" + SlotIndex(slotOf(name));
                commands += "\n" + ((ArrayIdentifier) binaryExpression.getLeft()).getIndex().accept(this);
                commands += "\n" + secondOperandCommands;
                String castCmd = castToNonPrimitive(secondType);
                if (castCmd != null)
                    commands += "\n" + castCmd;
                commands += "\naastore";
            }
            else if (binaryExpression.getLeft() instanceof Identifier) {
                String name = ((Identifier) binaryExpression.getLeft()).getName();
                commands += secondOperandCommands;
                String castCmd = castToNonPrimitive(secondType);
                if (castCmd != null)
                    commands += "\n" + castCmd;
                commands += "\nastore" + SlotIndex(slotOf(name));
            }
        }
        else if ((operator == BinaryOperator.ADD_ASSIGN) || (operator == BinaryOperator.SUB_ASSIGN) || (operator == BinaryOperator.MUL_ASSIGN) || (operator == BinaryOperator.DIV_ASSIGN) || (operator == BinaryOperator.MOD_ASSIGN)) {
            commands = "";
            String secondOperandCommands = binaryExpression.getRight().accept(this);
            if (binaryExpression.getLeft() instanceof ArrayIdentifier) {
                String name = ((ArrayIdentifier) binaryExpression.getLeft()).getName();
                commands += "aload" + SlotIndex(slotOf(name));
                commands += "\n" + ((ArrayIdentifier) binaryExpression.getLeft()).getIndex().accept(this);
                commands += "\naload" + SlotIndex(slotOf(name));
                commands += "\n" + ((ArrayIdentifier) binaryExpression.getLeft()).getIndex().accept(this);
                commands += "\naaload";
                commands += "\n" + castToPrimitive(new IntType());
                commands += "\n" + secondOperandCommands;
                if (operator == BinaryOperator.ADD_ASSIGN)
                    commands += "\niadd";
                else if (operator == BinaryOperator.SUB_ASSIGN)
                    commands += "\nisub";
                else if (operator == BinaryOperator.MUL_ASSIGN)
                    commands += "\nimul";
                else if (operator == BinaryOperator.DIV_ASSIGN)
                    commands += "\nidiv";
                else
                    commands += "\nirem";
                String castCmd = castToNonPrimitive(new IntType());
                if (castCmd != null)
                    commands += "\n" + castCmd;
                commands += "\naastore";
            }
            else if(binaryExpression.getLeft() instanceof Identifier) {
                String name = ((Identifier) binaryExpression.getLeft()).getName();
                commands += "aload" + SlotIndex(slotOf(name));
                commands += "\n" + castToPrimitive(new IntType());
                commands += "\n" + secondOperandCommands;
                if (operator == BinaryOperator.ADD_ASSIGN)
                    commands += "\niadd";
                else if (operator == BinaryOperator.SUB_ASSIGN)
                    commands += "\nisub";
                else if (operator == BinaryOperator.MUL_ASSIGN)
                    commands += "\nimul";
                else if (operator == BinaryOperator.DIV_ASSIGN)
                    commands += "\nidiv";
                else
                    commands += "\nirem";;
                String castCmd = castToNonPrimitive(new IntType());
                if (castCmd != null)
                    commands += "\n" + castCmd;
                commands += "\nastore" + SlotIndex(slotOf(name));
            }
        }
        return commands;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        String commands = "";
        UnaryOperator operator = unaryExpression.getUnaryOperator();
        commands += unaryExpression.getOperand().accept(this);
        if(operator == UnaryOperator.MINUS) {
            commands += "\nineg";
        }
        else if(operator == UnaryOperator.NOT) {
            String trueLabel = newLabel();
            String afterLabel = newLabel();
            commands += "\nifne " + trueLabel;
            commands += "\nldc 1";
            commands += "\ngoto " + afterLabel;
            commands += "\n" + trueLabel + ":";
            commands += "\nldc 0";
            commands += "\n" + afterLabel + ":";
        }
        else if((operator == UnaryOperator.INC) || (operator == UnaryOperator.DEC)) {
            commands += "\nldc 1";
            if (operator == UnaryOperator.INC)
                commands += "\niadd";
            else
                commands += "\nisub";

            if(unaryExpression.getOperand() instanceof Identifier) {
                int slot = slotOf(((Identifier) unaryExpression.getOperand()).getName());
                commands += "\n" + castToNonPrimitive(new IntType());
                commands += "\nastore" + SlotIndex(slot);
            }
            else if(unaryExpression.getOperand() instanceof ArrayIdentifier) {
                int tmpSlot = slotOf("");
                commands += "\n" + castToNonPrimitive(new IntType());
                commands += "\nastore" + SlotIndex(tmpSlot);
                commands += "\n" + ((ArrayIdentifier) unaryExpression.getOperand()).getIndex().accept(this);
                commands += "\naload" + SlotIndex(tmpSlot);
                commands += "\n" + "invokevirtual List/setElement(ILjava/lang/Object;)V";
            }
        }
        return commands;
    }


}
