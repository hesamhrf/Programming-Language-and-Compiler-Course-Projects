grammar UTL;

// Lexer rules

//key words

FLOAT_VAL : INT_VAL '.' [0-9]+;
INT_VAL : ZERO | NON_ZERO_INT_VAL;
BOOLEAN_VAL : TRUE | FALSE;
NON_ZERO_INT_VAL : [1-9][0-9]*;
ZERO : '0';

INT : 'int';
STRING : 'string';
FOR : 'for';
WHILE : 'while';
ELSE : 'else';
IF : 'if';
CONTINUE : 'continue';
TRY : 'try';
FALSE : 'false';
TRUE : 'true';
FLOAT : 'float';
BOOL : 'bool';
ON_INIT : 'OnInit';
ON_START : 'OnStart';
THROW : 'throw';
RETURN : 'return';
CATCH : 'catch';
BREAK : 'break';
STATIC : 'static';
SHARED : 'shared';
VOID : 'void';
SCHEDULE : '@schedule';
DOUBLE : 'double';
MAIN : 'Main';
DIGITS : 'Digits';
BUY : 'BUY';
SELL : 'SELL';
BID : 'Bid';
ASK : 'Ask';
TYPE : 'Type';
VOLUME : 'Volume';
LOW : 'Low';
HIGH : 'High';
CLOSE : 'Close';
OPEN : 'Open';
TIME : 'Time';
TEXT : 'Text';
TRADE : 'Trade';
ORDER : 'Order';
CANDLE : 'Candle';
EXCEPTION : 'Exception';
REFRESH_RATE : 'RefreshRate';
GET_CANDLE : 'GetCandle';
TERMINATE : 'Terminate';
CONNECT : 'Connect';
OBSERVE : 'Observe';
PRINT : 'Print';
PRE_ORDER : 'preorder';
PARALLEL : 'parallel';


EQUALS : '==';
NOT_EQUALS : '!=';
LESS_THAN : '<';
GREATER_THAN : '>';
AND : '&&';
OR : '||';
NOT : '!';

BITWISE_NOT : '~';
BITWISE_RIGHT_SHIFT : '>>';
BITWISE_LEFT_SHIFT : '<<';
BITWISE_AND : '&';
BITWISE_OR : '|';
BITWISE_XOR : '^';


ASSIGN : '=';
ADD_ASSIGN : '+=';
SUBTRACT_ASSIGN : '-=';
MULTIPLY_ASSIGN : '*=';
DIVIDE_ASSIGN : '/=';
MODULO_ASSIGN : '%=';

INCREMENT : '++';
DECREMENT : '--';
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';
MODULO : '%';


LPAR: '(';
RPAR: ')';


LBRACKET: '[';
RBRACKET: ']';


LBRACE : '{';
RBRACE : '}';
COMMA : ',';
DOT : '.';
SEMICOLON : ';';

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

STRING_VAL: '"' ~["]* '"';

WHITE_SPACE: [ \t]+ -> skip;

NEW_LINE: ('\r' '\n'? | '\n') -> skip;

LINE_COMMENT: '//' ~ [\r\n]* -> skip;

BLOCK_COMMENT: '/*' .*? '*/' -> skip;



// Parser rules
program: (on_init_start_func | function | external_init_var | static_init_var)* main;

external_init_var: (SHARED)? (init_var | init_arr);

main: (primitives | VOID) MAIN LPAR RPAR LBRACE (body)* RBRACE;

on_init_start_func: VOID (ON_INIT | ON_START) LPAR TRADE IDENTIFIER RPAR (THROW EXCEPTION)? LBRACE (body)* RBRACE;

function: (primitives | VOID)
    name = IDENTIFIER {System.out.println("MethodDec:" + $name.text);}
    LPAR
    function_args?
    RPAR
    (THROW EXCEPTION)?
    LBRACE
    (body)*
    RBRACE;
function_args: (primitives IDENTIFIER)(COMMA primitives IDENTIFIER)* | VOID;

body: body_general_blocks | body_general_calls | body_general_instructions | body_general_ends | body_return;
body_general_ends: ({System.out.println("Control:break");} BREAK | {System.out.println("Control:continue");} CONTINUE) SEMICOLON;
body_return: RETURN (experssion)? SEMICOLON;
body_general_blocks: if_else_block | try_catch_block | for | while;
body_general_instructions: init_var
    | init_arr
    | static_init_var
    | schedule_init;
body_general_calls: print_call | function_call | body_experssion | throw_execption;

static_init_var: STATIC (init_var | init_arr);

if_else_block: if (else)?;
if: {System.out.println("Conditional:if");} IF LPAR experssion RPAR body_scope;
else: {System.out.println("Conditional:else");} ELSE body_scope;
while: {System.out.println("Loop:while");} WHILE LPAR experssion RPAR body_scope;
for: {System.out.println("Loop:for");} FOR LPAR (init_var | (experssion SEMICOLON)) experssion SEMICOLON experssion RPAR body_scope;
try_catch_block: try (try_catch)?;
try: TRY body_scope;
try_catch: CATCH EXCEPTION IDENTIFIER body_scope;
body_scope: LBRACE (body)* RBRACE | body;

print_call: {System.out.println("Built-in:print");} PRINT LPAR experssion RPAR SEMICOLON;
function_call: {System.out.println("FunctionCall");} function_names LPAR (experssion)? RPAR SEMICOLON;

schedule_init: {System.out.println("ConcurrencyControl:Schedule");} SCHEDULE trade_exp SEMICOLON;
trade_exp: trade_id schedule_rule trade_id;
schedule_rule: PARALLEL | PRE_ORDER;
trade_id : LPAR trade_exp RPAR | IDENTIFIER;

experssion: exp1 | exp1 COMMA experssion;
exp1: exp2 exp1prim;
exp1prim: (assign_types exp2 {System.out.println("Operator:" + $assign_types.text);} exp1prim)?;
exp2: exp3 | exp3 OR exp2 {System.out.println("Operator:||");};
exp3: exp4 | exp4 AND exp3 {System.out.println("Operator:&&");};
exp4: exp5 exp4prim;
exp4prim: (bitwise_name = (BITWISE_AND | BITWISE_OR | BITWISE_XOR) exp5 {System.out.println("Operator:" + $bitwise_name.text);} exp4prim)?;
exp5: exp6 exp5prim;
exp5prim: (equals_name = (NOT_EQUALS | EQUALS)  exp6 {System.out.println("Operator:" + $equals_name.text);} exp5prim)?;
exp6: exp7 exp6prim;
exp6prim: (than_name = (LESS_THAN | GREATER_THAN) exp7 {System.out.println("Operator:" + $than_name.text);} exp6prim)?;
exp7: exp8 exp7prim;
exp7prim: (shift_name = (BITWISE_RIGHT_SHIFT | BITWISE_LEFT_SHIFT) exp8 {System.out.println("Operator:" + $shift_name.text);} exp7prim)?;
exp8: exp9 exp8prim;
exp8prim: (pm_name = (PLUS | MINUS) exp9 {System.out.println("Operator:" + $pm_name.text);} exp8prim)?;
exp9: exp10 exp9prim;
exp9prim: (dmd_name = (DIVIDE | MULTIPLY | MODULO) exp10 {System.out.println("Operator:" + $dmd_name.text);} exp9prim)?;
exp10: exp11 | bmndi = (BITWISE_NOT | MINUS | NOT | DECREMENT | INCREMENT) exp10 {System.out.println("Operator:" + $bmndi.text);};
exp11: exp12 exp11prim;
exp11prim: (id_name = (INCREMENT | DECREMENT) exp11prim {System.out.println("Operator:" + $id_name.text);})?;
exp12: exp13 | LBRACKET experssion RBRACKET;
exp13: exp14 | exp14 DOT exp13;
exp14: exp15 | LPAR experssion RPAR;
exp15: primitives_vals | order_type | class_attributes | execption_constructor | assign_function | IDENTIFIER | (IDENTIFIER | CANDLE) arr_index;

body_experssion: assign_var | assign_arr | execption_constructor SEMICOLON | class_member | unary;
class_member: (IDENTIFIER | execption_constructor) (arr_index)? DOT experssion SEMICOLON;
assign_var: IDENTIFIER (assign_experssion)? SEMICOLON;
assign_arr: IDENTIFIER arr_index (assign_experssion)? SEMICOLON;
assign_experssion: assign_types experssion {System.out.println("Operator:" + $assign_types.text);};
unary: inc_dec_p IDENTIFIER (arr_index)? (inc_dec_a)*  SEMICOLON;
inc_dec_a: inc_dec_name = (INCREMENT | DECREMENT) {System.out.println("Operator:" + $inc_dec_name.text);};
inc_dec_p : (ip = (INCREMENT | DECREMENT) inc_dec_p {System.out.println("Operator:" + $ip.text);})?;

init_var: types var_name = IDENTIFIER {System.out.println("VarDec:" + $var_name.text);} (assign_init_experssion)? SEMICOLON;
init_arr: types LBRACKET experssion RBRACKET arr_name = IDENTIFIER {System.out.println("ArrayDec:" + $arr_name.text + ":" + $experssion.text);} (assign_init_experssion)? SEMICOLON;
assign_init_experssion: ASSIGN experssion {System.out.println("Operator:=");};

arr_index: LBRACKET experssion RBRACKET;

assign_types: ASSIGN | ADD_ASSIGN | SUBTRACT_ASSIGN | MODULO_ASSIGN | MULTIPLY_ASSIGN | DIVIDE_ASSIGN;

throw_execption: THROW (execption_constructor | IDENTIFIER) SEMICOLON;
execption_constructor: EXCEPTION LPAR error_type = INT_VAL  {System.out.println("ErrorControl:" + $error_type.text);} COMMA STRING_VAL RPAR;

assign_function: function_names LPAR (experssion)? RPAR;

function_names: IDENTIFIER | OBSERVE | CONNECT | TERMINATE | GET_CANDLE | ORDER | REFRESH_RATE;

types: primitives | utl_types;
primitives: arr_primitives | STRING;
utl_types: TRADE | ORDER | CANDLE | EXCEPTION;
arr_primitives: INT | FLOAT | BOOL | DOUBLE;
primitives_vals: INT_VAL | FLOAT_VAL | BOOLEAN_VAL | STRING_VAL;

order_type: BUY | SELL;

class_attributes: (trade_attributes | candle_attributes | execption_attributes) (LPAR RPAR)?;
trade_attributes: ASK | BID | DIGITS;
candle_attributes: TIME | OPEN | CLOSE | HIGH | LOW | VOLUME;
execption_attributes:  TYPE | TEXT;