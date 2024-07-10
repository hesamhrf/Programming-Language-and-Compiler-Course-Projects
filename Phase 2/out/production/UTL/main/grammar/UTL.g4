grammar UTL;

@header{
    import main.ast.node.*;
    import main.ast.node.declaration.*;
    import main.ast.node.statement.*;
    import main.ast.node.expression.*;
    import main.ast.node.expression.operators.*;
    import main.ast.node.expression.values.*;
    import main.ast.type.primitiveType.*;
    import main.ast.type.complexType.*;
    import main.ast.type.*;
}
// Parser rules
// do not change first rule (program) name
program returns [Program pro] : {$pro = new Program(); $pro.setLine(0);}
    ( globalVarDeclaration SEMICOLON { $pro.addVar($globalVarDeclaration.globalVarDecRet); }
    | functionDeclaration { $pro.addFunction($functionDeclaration.funcDecRet); }
    | initDeclaration { $pro.addInit($initDeclaration.onInitDecRet); }
    | startDeclaration { $pro.addStart($startDeclaration.onStartDecRet); }
    )* mainDeclaration { $pro.setMain($mainDeclaration.mainDecRet); }
    ;



statement returns [Statement statementRet] :
          ( varDeclaration SEMICOLON { $statementRet = $varDeclaration.varDecRet; $statementRet.setLine($varDeclaration.varDecRet.getLine()); }
          | functionDeclaration { $statementRet = $functionDeclaration.funcDecRet; $statementRet.setLine($functionDeclaration.funcDecRet.getLine()); }
          | assignStatement { $statementRet = $assignStatement.assignStmtRet; $statementRet.setLine($assignStatement.assignStmtRet.getLine()); }
          | continueBreakStatement { $statementRet = $continueBreakStatement.continueBreakStmtRet;
           $statementRet.setLine($continueBreakStatement.continueBreakStmtRet.getLine()); }
          | returnStatement { $statementRet = $returnStatement.returnStmtRet; $statementRet.setLine($returnStatement.returnStmtRet.getLine()); }
          | ifStatement { $statementRet = $ifStatement.ifStmtRet; $statementRet.setLine($ifStatement.ifStmtRet.getLine()); }
          | whileStatement { $statementRet = $whileStatement.whileStmtRet; $statementRet.setLine($whileStatement.whileStmtRet.getLine()); }
          | forStatement { $statementRet = $forStatement.forStmtRet; $statementRet.setLine($forStatement.forStmtRet.getLine()); }
          | tryCatchStatement { $statementRet = $tryCatchStatement.tryCatchStmtRet; $statementRet.setLine($tryCatchStatement.tryCatchStmtRet.getLine()); }
          | throwStatement { $statementRet = $throwStatement.throwStmtRet; $statementRet.setLine($throwStatement.throwStmtRet.getLine()); }
          | expression SEMICOLON { $statementRet = new ExpressionStmt($expression.expressionRet);
           $statementRet.setLine($expression.expressionRet.getLine()); }
          );

globalVarDeclaration returns [GlobalVarDeclaration globalVarDecRet] : { $globalVarDecRet = new GlobalVarDeclaration(); }
    allType { $globalVarDecRet.setType($allType.allTypeRet); }
    (LBRACK literal = INT_LITERAL RBRACK { $globalVarDecRet.setLength(Integer.parseInt($literal.text)); })?
    (identifier { $globalVarDecRet.setIdentifier($identifier.identifierRet); $globalVarDecRet.setLine($identifier.identifierRet.getLine()); }
    | especialVariable { $globalVarDecRet.setIdentifier($especialVariable.especialVariableRet); $globalVarDecRet.setLine($especialVariable.especialVariableRet.getLine()); })
    (ASSIGN expression { $globalVarDecRet.setExpression($expression.expressionRet); } )? ;

varDeclaration returns [VarDeclaration varDecRet] : { $varDecRet = new VarDeclaration(); }
    allType { $varDecRet.setType($allType.allTypeRet); }
    (LBRACK literal = INT_LITERAL RBRACK { $varDecRet.setLength(Integer.parseInt($literal.text)); })?
    (identifier { $varDecRet.setIdentifier($identifier.identifierRet); $varDecRet.setLine($identifier.identifierRet.getLine()); }
    | especialVariable { $varDecRet.setIdentifier($especialVariable.especialVariableRet); $varDecRet.setLine($especialVariable.especialVariableRet.getLine()); })
    (ASSIGN expression { $varDecRet.setExpression($expression.expressionRet); } )? ;

functionDeclaration returns [FunctionDeclaration funcDecRet] : { $funcDecRet = new FunctionDeclaration(); }
    primitiveType { $funcDecRet.setReturnType($primitiveType.primitiveTypeRet); }
    name = identifier { $funcDecRet.setName($name.identifierRet); $funcDecRet.setLine($name.identifierRet.getLine()); }
    LPAREN (varDeclaration { $funcDecRet.addArg($varDeclaration.varDecRet); }
    (COMMA varDeclaration { $funcDecRet.addArg($varDeclaration.varDecRet); })*)?
    RPAREN (THROW EXCEPTION)? (LBRACE (statement { $funcDecRet.addStatement($statement.statementRet); })* RBRACE | statement { $funcDecRet.addStatement($statement.statementRet); });

mainDeclaration returns [MainDeclaration mainDecRet] : { $mainDecRet = new MainDeclaration(); }
    VOID main = MAIN LPAREN RPAREN { $mainDecRet.setLine($main.getLine()); }
    (LBRACE (statement { if ($statement.statementRet instanceof VarDeclaration varDeclaration) {
        if (varDeclaration.getType().equals("Trade")) { $mainDecRet.addActorInstantiation(varDeclaration); }
        else { $mainDecRet.addStatement(varDeclaration); }
    }
    else { $mainDecRet.addStatement($statement.statementRet); } })* RBRACE
    | statement { if ($statement.statementRet instanceof VarDeclaration varDeclaration) {
      if (varDeclaration.getType().equals("Trade")) { $mainDecRet.addActorInstantiation(varDeclaration); }
      else { $mainDecRet.addStatement(varDeclaration); }
      }
    else { $mainDecRet.addStatement($statement.statementRet); } });



initDeclaration returns [OnInitDeclaration onInitDecRet] : { $onInitDecRet = new OnInitDeclaration(); }
    VOID on = ONINIT LPAREN TRADE name = identifier { $onInitDecRet.setTradeName($name.identifierRet); $onInitDecRet.setLine($on.getLine()); } RPAREN (THROW EXCEPTION)?
    (LBRACE (statement { $onInitDecRet.addStatement($statement.statementRet); })* RBRACE | statement { $onInitDecRet.addStatement($statement.statementRet); });

startDeclaration returns [OnStartDeclaration onStartDecRet] : { $onStartDecRet = new OnStartDeclaration(); }
    VOID st = ONSTART LPAREN TRADE name = identifier { $onStartDecRet.setTradeName($name.identifierRet); $onStartDecRet.setLine($st.getLine()); } RPAREN (THROW EXCEPTION)?
    (LBRACE (statement { $onStartDecRet.addStatement($statement.statementRet); })* RBRACE | statement { $onStartDecRet.addStatement($statement.statementRet); });

assignStatement returns [AssignStmt assignStmtRet] : { $assignStmtRet = new AssignStmt(); }
    exp1 = expression { $assignStmtRet.setLValue($exp1.expressionRet); $assignStmtRet.setLine($exp1.expressionRet.getLine()); }
    assign exp2 = expression { $assignStmtRet.setRValue($exp2.expressionRet); }  SEMICOLON;

ifStatement returns [IfElseStmt ifStmtRet] : { $ifStmtRet = new IfElseStmt(); }
    if = IF LPAREN exp = expression { $ifStmtRet.setCondition($exp.expressionRet); $ifStmtRet.setLine($if.getLine()); } RPAREN
    (LBRACE (statement { $ifStmtRet.addThenStatement($statement.statementRet); })* RBRACE | statement { $ifStmtRet.addThenStatement($statement.statementRet); })
    (ELSE (LBRACE (statement { $ifStmtRet.addElseStatement($statement.statementRet); })* RBRACE | statement { $ifStmtRet.addElseStatement($statement.statementRet); }))?;

whileStatement returns [WhileStmt whileStmtRet] : { $whileStmtRet = new WhileStmt(); }
    wh = WHILE LPAREN exp = expression { $whileStmtRet.setCondition($exp.expressionRet); $whileStmtRet.setLine($wh.getLine()); } RPAREN
    (LBRACE (statement { $whileStmtRet.addBody($statement.statementRet); })* RBRACE | statement { $whileStmtRet.addBody($statement.statementRet); });

forStatement returns [ForStmt forStmtRet] : { $forStmtRet = new ForStmt(); }
    fo = FOR LPAREN { $forStmtRet.setLine($fo.getLine()); }
    statement { $forStmtRet.addInit($statement.statementRet); }
    exp = expression { $forStmtRet.setCondition($exp.expressionRet); } SEMICOLON
    (exp1 = expression { $forStmtRet.setUpdate($exp1.expressionRet); })? RPAREN
    (LBRACE (statement { $forStmtRet.addBody($statement.statementRet); })* RBRACE | statement { $forStmtRet.addBody($statement.statementRet); });

tryCatchStatement returns [TryCatchStmt tryCatchStmtRet] : { $tryCatchStmtRet = new TryCatchStmt(); }
    tr = TRY { $tryCatchStmtRet.setLine($tr.getLine()); }
    (LBRACE (statement { $tryCatchStmtRet.addTryStatement($statement.statementRet); })* RBRACE | statement { $tryCatchStmtRet.addTryStatement($statement.statementRet); })
    (CATCH EXCEPTION name = identifier { $tryCatchStmtRet.setIdentifier($name.identifierRet); }
    (LBRACE (statement { $tryCatchStmtRet.addCatchStatement($statement.statementRet); })* RBRACE | statement { $tryCatchStmtRet.addCatchStatement($statement.statementRet); }))?;

continueBreakStatement returns [ContinueBreakStmt continueBreakStmtRet] : { $continueBreakStmtRet = new ContinueBreakStmt(); }
    name = (BREAK | CONTINUE) { $continueBreakStmtRet.setLine($name.getLine()); }
    { $continueBreakStmtRet.setToken($name.text); } SEMICOLON;

returnStatement returns [ReturnStmt returnStmtRet] : { $returnStmtRet = new ReturnStmt(); }
    re = RETURN { $returnStmtRet.setLine($re.getLine()); }
    exp = expression { $returnStmtRet.setReturnedExpr($exp.expressionRet); } SEMICOLON;

throwStatement returns [ThrowStmt throwStmtRet] : { $throwStmtRet = new ThrowStmt(); }
    th = THROW { $throwStmtRet.setLine($th.getLine()); }
    exp = expression { $throwStmtRet.setReturnedExpr($exp.expressionRet); } SEMICOLON;

functionCall returns [FunctionCall functionCallRet] : { $functionCallRet = new FunctionCall(); }
    (especialFunction { $functionCallRet.setFunctionName($especialFunction.especialFunctionRet); $functionCallRet.setLine($especialFunction.especialFunctionRet.getLine()); }
    | complexTypeId { $functionCallRet.setFunctionName($complexTypeId.complexTypeIdRet); $functionCallRet.setLine($complexTypeId.complexTypeIdRet.getLine()); }
    | identifier { $functionCallRet.setFunctionName($identifier.identifierRet); $functionCallRet.setLine($identifier.identifierRet.getLine()); })
    LPAREN (expression { $functionCallRet.addArg($expression.expressionRet); } (COMMA expression { $functionCallRet.addArg($expression.expressionRet); })*)? RPAREN;

methodCall returns [MethodCall methodCallRet] : { $methodCallRet = new MethodCall(); }
    identifier { $methodCallRet.setIdentifierName($identifier.identifierRet); $methodCallRet.setLine($identifier.identifierRet.getLine()); }
    (LBRACK expression { $methodCallRet.setInstance($expression.expressionRet); } RBRACK)?
    DOT especialMethod { $methodCallRet.setFunctionName($especialMethod.especialMethodRet); }
    LPAREN (expression { $methodCallRet.addArg($expression.expressionRet); } (COMMA expression { $methodCallRet.addArg($expression.expressionRet); } )*)? RPAREN;

expression returns [Expression expressionRet] :
   value { $expressionRet = $value.valueRet; $expressionRet.setLine($value.valueRet.getLine()); }
   | exp1 = expression DOT especialVariable { $expressionRet = new VarAccess($exp1.expressionRet, $especialVariable.especialVariableRet); $expressionRet.setLine($exp1.expressionRet.getLine()); }
   | exp1 = expression {UnaryOperator op;} (INC {op=UnaryOperator.INC;} | DEC {op=UnaryOperator.DEC;}) { $expressionRet=new UnaryExpression(op, $exp1.expressionRet); $expressionRet.setLine($exp1.expressionRet.getLine()); }
   | {UnaryOperator op;} (NOT {op=UnaryOperator.NOT;} | MINUS {op=UnaryOperator.MINUS;} | BIT_NOT {op=UnaryOperator.BIT_NOT;} | INC {op=UnaryOperator.INC;} | DEC {op=UnaryOperator.DEC;}) exp1 = expression { $expressionRet=new UnaryExpression(op, $exp1.expressionRet); $expressionRet.setLine($exp1.expressionRet.getLine()); }
   | exp1 = expression {BinaryOperator op;} (MULT {op=BinaryOperator.MULT;} | DIV {op=BinaryOperator.DIV;} | MOD {op=BinaryOperator.MOD;}) exp2 = expression { $expressionRet=new BinaryExpression($exp1.expressionRet, $exp2.expressionRet, op); $expressionRet.setLine($exp1.expressionRet.getLine()); }
   | exp1 = expression {BinaryOperator op;} (PLUS {op=BinaryOperator.PLUS;} | MINUS {op=BinaryOperator.MINUS;}) exp2 = expression { $expressionRet=new BinaryExpression($exp1.expressionRet, $exp2.expressionRet, op); $expressionRet.setLine($exp1.expressionRet.getLine()); }
   | exp1 = expression {BinaryOperator op;} (L_SHIFT {op=BinaryOperator.L_SHIFT;} | R_SHIFT {op=BinaryOperator.R_SHIFT;}) exp2 = expression { $expressionRet=new BinaryExpression($exp1.expressionRet, $exp2.expressionRet, op); $expressionRet.setLine($exp1.expressionRet.getLine()); }
   | exp1 = expression {BinaryOperator op;} (LT {op=BinaryOperator.LT;} | GT {op=BinaryOperator.GT;}) exp2 = expression { $expressionRet=new BinaryExpression($exp1.expressionRet, $exp2.expressionRet, op); $expressionRet.setLine($exp1.expressionRet.getLine()); }
   | exp1 = expression {BinaryOperator op;} (EQ {op=BinaryOperator.EQ;} | NEQ {op=BinaryOperator.NEQ;}) exp2 = expression { $expressionRet=new BinaryExpression($exp1.expressionRet, $exp2.expressionRet, op); $expressionRet.setLine($exp1.expressionRet.getLine()); }
   | exp1 = expression {BinaryOperator op;} (BIT_AND {op=BinaryOperator.BIT_AND;} | BIT_OR {op=BinaryOperator.BIT_OR;} | BIT_XOR {op=BinaryOperator.BIT_XOR;})  exp2 = expression { $expressionRet=new BinaryExpression($exp1.expressionRet, $exp2.expressionRet, op); $expressionRet.setLine($exp1.expressionRet.getLine()); }
   | exp1 = expression AND exp2 = expression { $expressionRet=new BinaryExpression($exp1.expressionRet, $exp2.expressionRet, BinaryOperator.AND); $expressionRet.setLine($exp1.expressionRet.getLine()); }
   | exp1 = expression OR exp2 = expression { $expressionRet=new BinaryExpression($exp1.expressionRet, $exp2.expressionRet, BinaryOperator.OR); $expressionRet.setLine($exp1.expressionRet.getLine()); }
   | id = ID (LBRACK expression RBRACK) { $expressionRet = new ArrayIdentifier($id.text, $expression.expressionRet); } { $expressionRet.setLine($id.getLine()); }
   | id = ID { $expressionRet = new Identifier($id.text); $expressionRet.setLine($id.getLine()); }
   | LPAREN expression RPAREN { $expressionRet = $expression.expressionRet; $expressionRet.setLine($expression.expressionRet.getLine()); }
   | functionCall { $expressionRet = $functionCall.functionCallRet; $expressionRet.setLine($functionCall.functionCallRet.getLine()); }
   | methodCall { $expressionRet = $methodCall.methodCallRet; $expressionRet.setLine($methodCall.methodCallRet.getLine()); };


value returns [Value valueRet] :
    in = INT_LITERAL { $valueRet = new IntValue(Integer.parseInt($in.text)); $valueRet.setLine($in.getLine()); }
    | fl = FLOAT_LITERAL { $valueRet = new FloatValue(Float.parseFloat($fl.text)); $valueRet.setLine($fl.getLine()); }
    | st = STRING_LITERAL { $valueRet = new StringValue($st.text); $valueRet.setLine($st.getLine()); }
    | se = SELL { $valueRet = new TradeValue($se.text); $valueRet.setLine($se.getLine()); }
    | bu = BUY { $valueRet = new TradeValue($bu.text); $valueRet.setLine($bu.getLine()); };

primitiveType returns [Type primitiveTypeRet] :
    (FLOAT { $primitiveTypeRet = new FloatType(); }
    | DOUBLE { $primitiveTypeRet = new DoubleType(); }
    | INT { $primitiveTypeRet = new IntType(); }
    | BOOL { $primitiveTypeRet = new BoolType(); }
    | STRING { $primitiveTypeRet = new StringType(); }
    | VOID { $primitiveTypeRet = new VoidType(); });

complexTypeId returns [Identifier complexTypeIdRet] :
    id = (ORDER | TRADE | CANDLE | EXCEPTION)
    { $complexTypeIdRet = new Identifier($id.text); $complexTypeIdRet.setLine($id.getLine()); };

complexType returns [Type complexTypeRet] :
    (ORDER { $complexTypeRet = new OrderType(); }
    | TRADE { $complexTypeRet = new TradeType(); }
    | CANDLE { $complexTypeRet = new CandleType(); }
    | EXCEPTION { $complexTypeRet = new ExceptionType(); });

allType returns [Type allTypeRet] :
    primitiveType { $allTypeRet = $primitiveType.primitiveTypeRet; }
    | complexType { $allTypeRet = $complexType.complexTypeRet; };

especialFunction returns [Identifier especialFunctionRet] :
    id = (REFRESH_RATE | CONNECT | OBSERVE | GET_CANDLE | TERMINATE | PRINT)
    { $especialFunctionRet = new Identifier($id.text); $especialFunctionRet.setLine($id.getLine()); };

especialVariable returns [Identifier especialVariableRet] :
    id = (ASK | BID | TIME | HIGH | LOW | DIGITS | VOLUME | TYPE | TEXT | OPEN | CLOSE)
    { $especialVariableRet = new Identifier($id.text); $especialVariableRet.setLine($id.getLine()); };

especialMethod returns [Identifier especialMethodRet] :
    id = (OPEN | CLOSE)
    { $especialMethodRet = new Identifier($id.text); $especialMethodRet.setLine($id.getLine()); };

assign: ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN;

identifier returns [Identifier identifierRet]: id = ID { $identifierRet = new Identifier($id.text); $identifierRet.setLine($id.getLine()); };

// Lexer rules
SPACES : [ \t\r\n]+ -> skip;
SEMICOLON : ';';
COMMA : ',';
COLON : ':';
DOT: '.';
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';

PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';

AND : '&&';
OR: '||';
NOT: '!';

BIT_AND : '&';
BIT_OR : '|';
BIT_XOR : '^';
L_SHIFT : '<<';
R_SHIFT : '>>';
BIT_NOT : '~';

LT : '<';
GT : '>';
EQ : '==';
NEQ : '!=';

INC : '++';
DEC : '--';

ASSIGN : '=';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';

TRY : 'try';
THROW : 'throw';
CATCH : 'catch';
IF : 'if';
ELSE : 'else';
FOR: 'for';
WHILE : 'while';
BREAK : 'break';
CONTINUE : 'continue';
RETURN : 'return';

MAIN : 'Main';
ONINIT : 'OnInit';
ONSTART : 'OnStart';

FLOAT : 'float';
DOUBLE : 'double';
STRING: 'string';
BOOL: 'bool';
VOID: 'void';
INT : 'int';

BUY : 'BUY';
SELL : 'SELL';

ASK : 'Ask';
BID : 'Bid';
TIME : 'Time';
HIGH : 'High';
LOW : 'Low';
DIGITS : 'Digits';
VOLUME : 'Volume';
TYPE: 'Type';
TEXT: 'Text';
OPEN : 'Open';
CLOSE : 'Close';

TRADE: 'Trade';
ORDER: 'Order';
CANDLE: 'Candle';
EXCEPTION: 'Exception';

REFRESH_RATE : 'RefreshRate';
GET_CANDLE : 'GetCandle';
TERMINATE : 'Terminate';
CONNECT : 'Connect';
OBSERVE : 'Observe';
PRINT : 'Print';

ID : [a-zA-Z_][a-zA-Z_0-9]*;

INT_LITERAL : [1-9][0-9]* | '0';
FLOAT_LITERAL : [0-9]* '.' [0-9]+;
STRING_LITERAL : '"' (~["])* '"';

COMMENT: (('//' ~('\r'|'\n')*) | ('/*' .*? '*/')) -> skip;