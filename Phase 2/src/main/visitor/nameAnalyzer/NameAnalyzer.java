package main.visitor.nameAnalyzer;

import main.ast.node.Program;
import main.ast.node.declaration.*;
import main.compileError.CompileError;
import main.compileError.name.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.itemException.ItemAlreadyExistsException;
import main.symbolTable.itemException.ItemBuiltInException;
import main.symbolTable.symbolTableItems.*;
import main.visitor.Visitor;

import java.io.Console;
import java.util.ArrayList;

public class NameAnalyzer extends Visitor<Void> {

    public ArrayList<CompileError> nameErrors = new ArrayList<>();

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.push(SymbolTable.root);

        for (GlobalVarDeclaration globalVarDeclaration : program.getVars())
            globalVarDeclaration.accept(this);
        for (FunctionDeclaration functionDeclaration : program.getFunctions()) {
            for (GlobalVarDeclaration globalVarDeclaration : program.getVars()) {
                if (functionDeclaration.getName().getName().equals(globalVarDeclaration.getIdentifier().getName())) {
                    nameErrors.add(new FunctionVariableConflict(functionDeclaration.getLine(), functionDeclaration.getName().getName()));
                }
            }
            functionDeclaration.accept(this);
        }
        for (OnInitDeclaration onInitDeclaration : program.getInits())
            onInitDeclaration.accept(this);
        for (OnStartDeclaration onStartDeclaration : program.getStarts())
            onStartDeclaration.accept(this);
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(OnInitDeclaration onInitDeclaration) {
        OnInitItem onInitItem = new OnInitItem(onInitDeclaration);

        // TODO check the onInit name is redundant or not , if it is redundant change its name and put it
        while (true) {
            try {
                SymbolTable.top.put(onInitItem);
                break;
            } catch (ItemAlreadyExistsException exp) {
                if (!onInitItem.getName().endsWith("!")) {
                    nameErrors.add(new PrimitiveFunctionRedefinition(onInitDeclaration.getLine(), onInitDeclaration.getTradeName().getName()));
                }
                onInitItem.setName(onInitItem.getName() + "!");
            } catch (Exception ignored) {}
        }
        //
        SymbolTable onInitSymbolTable = new SymbolTable(SymbolTable.top, onInitDeclaration.getTradeName().getName());
        onInitItem.setOnInitSymbolTable(onInitSymbolTable);
        // TODO push onInit symbol table
        SymbolTable.push(onInitSymbolTable);
        // TODO visit statements
        for (var stm:onInitDeclaration.getBody()) {
            if (stm instanceof VarDeclaration varDeclaration) {
                VariableItem variableItem = new VariableItem(varDeclaration);
                if (variableItem.getName().equals(onInitDeclaration.getTradeName().getName())) {
                    nameErrors.add(new VariableRedefinition(varDeclaration.getLine(), variableItem.getName()));
                }
            }
            stm.accept(this);
        }
        // TODO pop onInit symbol table
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(OnStartDeclaration onStartDeclaration) {
        // TODO
        OnStartItem onStartItem = new OnStartItem(onStartDeclaration);

        //
        while (true) {
            try {
                SymbolTable.top.put(onStartItem);
                break;
            } catch (ItemAlreadyExistsException exp) {
                if (!onStartItem.getName().endsWith("!")) {
                    nameErrors.add(new PrimitiveFunctionRedefinition(onStartDeclaration.getLine(), onStartDeclaration.getTradeName().getName()));
                }
                onStartItem.setName(onStartItem.getName() + "!");
            } catch (Exception ignored) {}
        }
        //
        SymbolTable onStartSymbolTable = new SymbolTable(SymbolTable.top, onStartDeclaration.getTradeName().getName());
        onStartItem.setOnStartSymbolTable(onStartSymbolTable);
        //
        SymbolTable.push(onStartSymbolTable);
        //
        for (var stm:onStartDeclaration.getBody()) {
            if (stm instanceof VarDeclaration varDeclaration) {
                VariableItem variableItem = new VariableItem(varDeclaration);
                if (variableItem.getName().equals(onStartDeclaration.getTradeName().getName())) {
                    nameErrors.add(new VariableRedefinition(varDeclaration.getLine(), variableItem.getName()));
                }
            }
            stm.accept(this);
        }
        //
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        // TODO
        MainItem mainItem = new MainItem(mainDeclaration);

        //
        while (true) {
            try {
                SymbolTable.top.put(mainItem);
                break;
            } catch (ItemAlreadyExistsException exp) {
                if (!mainItem.getName().endsWith("!")) {
                    nameErrors.add(new MethodRedefinition(mainDeclaration.getLine(), mainItem.getName()));
                }
                mainItem.setName(mainItem.getName() + "!");
            } catch (Exception ignored) {}
        }
        //
        SymbolTable mainSymbolTable = new SymbolTable(SymbolTable.top, mainItem.getName());
        mainItem.setMainSymbolTable(mainSymbolTable);
        //
        SymbolTable.push(mainSymbolTable);
        //
        for (var stm:mainDeclaration.getBody()) {
            stm.accept(this);
        }
        //
        for (var tradeStm:mainDeclaration.getMainTrades()) {
            tradeStm.accept(this);
        }
        //
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDeclaration) {
        // TODO
        FunctionItem functionItem = new FunctionItem(functionDeclaration);

        //
        while (true) {
            try {
                SymbolTable.top.put(functionItem);
                break;
            } catch (ItemAlreadyExistsException exp) {
                if (!functionItem.getName().endsWith("!")) {
                    nameErrors.add(new MethodRedefinition(functionDeclaration.getLine(), functionItem.getName()));
                }
                functionItem.setName(functionItem.getName() + "!");
            } catch (Exception ignored) {}
        }
        //
        SymbolTable functionSymbolTable = new SymbolTable(SymbolTable.top, functionItem.getName());
        functionItem.setHandlerSymbolTable(functionSymbolTable);
        //
        SymbolTable.push(functionSymbolTable);
        //
        for (var arg:functionDeclaration.getArgs()) {
            arg.accept(this);
        }
        for (var stm:functionDeclaration.getBody()) {
            if (stm instanceof VarDeclaration varDeclaration) {
                VariableItem variableItem = new VariableItem(varDeclaration);
                if (variableItem.getName().equals(functionItem.getName())) {
                    nameErrors.add(new FunctionVariableConflict(varDeclaration.getLine(), variableItem.getName()));
                }
            }
            stm.accept(this);
        }
        //
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        // TODO
        VariableItem variableItem = new VariableItem(varDeclaration);
        //
        while (true) {
            try {
                SymbolTable.top.put(variableItem);
                break;
            } catch (ItemAlreadyExistsException exp) {
                if (!variableItem.getName().endsWith("!")) {
                    nameErrors.add(new VariableRedefinition(varDeclaration.getLine(), variableItem.getName()));
                }
                variableItem.setName(variableItem.getName() + "!");
            } catch (ItemBuiltInException expBuiltIn) {
                if (!variableItem.getName().endsWith("!")) {
                    nameErrors.add(new IrregularDefenition(varDeclaration.getLine(), variableItem.getName()));
                }
                variableItem.setName(variableItem.getName() + "!");
            }
        }
        //
        return null;
    }

    @Override
    public Void visit(GlobalVarDeclaration globalVarDeclaration) {
        // TODO
        GlobalVariableItem globalVariableItem = new GlobalVariableItem(globalVarDeclaration);
        //
        while (true) {
            try {
                SymbolTable.top.put(globalVariableItem);
                break;
            } catch (ItemAlreadyExistsException exp) {
                if (!globalVariableItem.getName().endsWith("!")) {
                    nameErrors.add(new GlobalVariableRedefinition(globalVarDeclaration.getLine(), globalVariableItem.getName()));
                }
                globalVariableItem.setName(globalVariableItem.getName() + "!");
            } catch (ItemBuiltInException expBuiltIn) {
                if (!globalVariableItem.getName().endsWith("!")) {
                    nameErrors.add(new IrregularDefenition(globalVarDeclaration.getLine(), globalVariableItem.getName()));
                }
                globalVariableItem.setName(globalVariableItem.getName() + "!");
            }
        }
        //
        return null;
    }
}

