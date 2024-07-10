// Generated from C:/Users/asus/Desktop/Phase 2/src/main/grammar/UTL.g4 by ANTLR 4.13.1
package parsers;

    import main.ast.node.*;
    import main.ast.node.declaration.*;
    import main.ast.node.statement.*;
    import main.ast.node.expression.*;
    import main.ast.node.expression.operators.*;
    import main.ast.node.expression.values.*;
    import main.ast.type.primitiveType.*;
    import main.ast.type.complexType.*;
    import main.ast.type.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class UTLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACES=1, SEMICOLON=2, COMMA=3, COLON=4, DOT=5, LPAREN=6, RPAREN=7, LBRACE=8, 
		RBRACE=9, LBRACK=10, RBRACK=11, PLUS=12, MINUS=13, MULT=14, DIV=15, MOD=16, 
		AND=17, OR=18, NOT=19, BIT_AND=20, BIT_OR=21, BIT_XOR=22, L_SHIFT=23, 
		R_SHIFT=24, BIT_NOT=25, LT=26, GT=27, EQ=28, NEQ=29, INC=30, DEC=31, ASSIGN=32, 
		ADD_ASSIGN=33, SUB_ASSIGN=34, MUL_ASSIGN=35, DIV_ASSIGN=36, MOD_ASSIGN=37, 
		TRY=38, THROW=39, CATCH=40, IF=41, ELSE=42, FOR=43, WHILE=44, BREAK=45, 
		CONTINUE=46, RETURN=47, MAIN=48, ONINIT=49, ONSTART=50, FLOAT=51, DOUBLE=52, 
		STRING=53, BOOL=54, VOID=55, INT=56, BUY=57, SELL=58, ASK=59, BID=60, 
		TIME=61, HIGH=62, LOW=63, DIGITS=64, VOLUME=65, TYPE=66, TEXT=67, OPEN=68, 
		CLOSE=69, TRADE=70, ORDER=71, CANDLE=72, EXCEPTION=73, REFRESH_RATE=74, 
		GET_CANDLE=75, TERMINATE=76, CONNECT=77, OBSERVE=78, PRINT=79, ID=80, 
		INT_LITERAL=81, FLOAT_LITERAL=82, STRING_LITERAL=83, COMMENT=84;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_globalVarDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_functionDeclaration = 4, RULE_mainDeclaration = 5, RULE_initDeclaration = 6, 
		RULE_startDeclaration = 7, RULE_assignStatement = 8, RULE_ifStatement = 9, 
		RULE_whileStatement = 10, RULE_forStatement = 11, RULE_tryCatchStatement = 12, 
		RULE_continueBreakStatement = 13, RULE_returnStatement = 14, RULE_throwStatement = 15, 
		RULE_functionCall = 16, RULE_methodCall = 17, RULE_expression = 18, RULE_value = 19, 
		RULE_primitiveType = 20, RULE_complexTypeId = 21, RULE_complexType = 22, 
		RULE_allType = 23, RULE_especialFunction = 24, RULE_especialVariable = 25, 
		RULE_especialMethod = 26, RULE_assign = 27, RULE_identifier = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "globalVarDeclaration", "varDeclaration", "functionDeclaration", 
			"mainDeclaration", "initDeclaration", "startDeclaration", "assignStatement", 
			"ifStatement", "whileStatement", "forStatement", "tryCatchStatement", 
			"continueBreakStatement", "returnStatement", "throwStatement", "functionCall", 
			"methodCall", "expression", "value", "primitiveType", "complexTypeId", 
			"complexType", "allType", "especialFunction", "especialVariable", "especialMethod", 
			"assign", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "';'", "','", "':'", "'.'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'&'", 
			"'|'", "'^'", "'<<'", "'>>'", "'~'", "'<'", "'>'", "'=='", "'!='", "'++'", 
			"'--'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'try'", "'throw'", 
			"'catch'", "'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", 
			"'return'", "'Main'", "'OnInit'", "'OnStart'", "'float'", "'double'", 
			"'string'", "'bool'", "'void'", "'int'", "'BUY'", "'SELL'", "'Ask'", 
			"'Bid'", "'Time'", "'High'", "'Low'", "'Digits'", "'Volume'", "'Type'", 
			"'Text'", "'Open'", "'Close'", "'Trade'", "'Order'", "'Candle'", "'Exception'", 
			"'RefreshRate'", "'GetCandle'", "'Terminate'", "'Connect'", "'Observe'", 
			"'Print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACES", "SEMICOLON", "COMMA", "COLON", "DOT", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "AND", "OR", "NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "L_SHIFT", 
			"R_SHIFT", "BIT_NOT", "LT", "GT", "EQ", "NEQ", "INC", "DEC", "ASSIGN", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"TRY", "THROW", "CATCH", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", 
			"RETURN", "MAIN", "ONINIT", "ONSTART", "FLOAT", "DOUBLE", "STRING", "BOOL", 
			"VOID", "INT", "BUY", "SELL", "ASK", "BID", "TIME", "HIGH", "LOW", "DIGITS", 
			"VOLUME", "TYPE", "TEXT", "OPEN", "CLOSE", "TRADE", "ORDER", "CANDLE", 
			"EXCEPTION", "REFRESH_RATE", "GET_CANDLE", "TERMINATE", "CONNECT", "OBSERVE", 
			"PRINT", "ID", "INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "UTL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UTLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program pro;
		public GlobalVarDeclarationContext globalVarDeclaration;
		public FunctionDeclarationContext functionDeclaration;
		public InitDeclarationContext initDeclaration;
		public StartDeclarationContext startDeclaration;
		public MainDeclarationContext mainDeclaration;
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public List<GlobalVarDeclarationContext> globalVarDeclaration() {
			return getRuleContexts(GlobalVarDeclarationContext.class);
		}
		public GlobalVarDeclarationContext globalVarDeclaration(int i) {
			return getRuleContext(GlobalVarDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(UTLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(UTLParser.SEMICOLON, i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<InitDeclarationContext> initDeclaration() {
			return getRuleContexts(InitDeclarationContext.class);
		}
		public InitDeclarationContext initDeclaration(int i) {
			return getRuleContext(InitDeclarationContext.class,i);
		}
		public List<StartDeclarationContext> startDeclaration() {
			return getRuleContexts(StartDeclarationContext.class);
		}
		public StartDeclarationContext startDeclaration(int i) {
			return getRuleContext(StartDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).pro =  new Program(); _localctx.pro.setLine(0);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(59);
						((ProgramContext)_localctx).globalVarDeclaration = globalVarDeclaration();
						setState(60);
						match(SEMICOLON);
						 _localctx.pro.addVar(((ProgramContext)_localctx).globalVarDeclaration.globalVarDecRet); 
						}
						break;
					case 2:
						{
						setState(63);
						((ProgramContext)_localctx).functionDeclaration = functionDeclaration();
						 _localctx.pro.addFunction(((ProgramContext)_localctx).functionDeclaration.funcDecRet); 
						}
						break;
					case 3:
						{
						setState(66);
						((ProgramContext)_localctx).initDeclaration = initDeclaration();
						 _localctx.pro.addInit(((ProgramContext)_localctx).initDeclaration.onInitDecRet); 
						}
						break;
					case 4:
						{
						setState(69);
						((ProgramContext)_localctx).startDeclaration = startDeclaration();
						 _localctx.pro.addStart(((ProgramContext)_localctx).startDeclaration.onStartDecRet); 
						}
						break;
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(77);
			((ProgramContext)_localctx).mainDeclaration = mainDeclaration();
			 _localctx.pro.setMain(((ProgramContext)_localctx).mainDeclaration.mainDecRet); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Statement statementRet;
		public VarDeclarationContext varDeclaration;
		public FunctionDeclarationContext functionDeclaration;
		public AssignStatementContext assignStatement;
		public ContinueBreakStatementContext continueBreakStatement;
		public ReturnStatementContext returnStatement;
		public IfStatementContext ifStatement;
		public WhileStatementContext whileStatement;
		public ForStatementContext forStatement;
		public TryCatchStatementContext tryCatchStatement;
		public ThrowStatementContext throwStatement;
		public ExpressionContext expression;
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public ContinueBreakStatementContext continueBreakStatement() {
			return getRuleContext(ContinueBreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(80);
				((StatementContext)_localctx).varDeclaration = varDeclaration();
				setState(81);
				match(SEMICOLON);
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).varDeclaration.varDecRet; _localctx.statementRet.setLine(((StatementContext)_localctx).varDeclaration.varDecRet.getLine()); 
				}
				break;
			case 2:
				{
				setState(84);
				((StatementContext)_localctx).functionDeclaration = functionDeclaration();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).functionDeclaration.funcDecRet; _localctx.statementRet.setLine(((StatementContext)_localctx).functionDeclaration.funcDecRet.getLine()); 
				}
				break;
			case 3:
				{
				setState(87);
				((StatementContext)_localctx).assignStatement = assignStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).assignStatement.assignStmtRet; _localctx.statementRet.setLine(((StatementContext)_localctx).assignStatement.assignStmtRet.getLine()); 
				}
				break;
			case 4:
				{
				setState(90);
				((StatementContext)_localctx).continueBreakStatement = continueBreakStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).continueBreakStatement.continueBreakStmtRet;
				           _localctx.statementRet.setLine(((StatementContext)_localctx).continueBreakStatement.continueBreakStmtRet.getLine()); 
				}
				break;
			case 5:
				{
				setState(93);
				((StatementContext)_localctx).returnStatement = returnStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).returnStatement.returnStmtRet; _localctx.statementRet.setLine(((StatementContext)_localctx).returnStatement.returnStmtRet.getLine()); 
				}
				break;
			case 6:
				{
				setState(96);
				((StatementContext)_localctx).ifStatement = ifStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).ifStatement.ifStmtRet; _localctx.statementRet.setLine(((StatementContext)_localctx).ifStatement.ifStmtRet.getLine()); 
				}
				break;
			case 7:
				{
				setState(99);
				((StatementContext)_localctx).whileStatement = whileStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).whileStatement.whileStmtRet; _localctx.statementRet.setLine(((StatementContext)_localctx).whileStatement.whileStmtRet.getLine()); 
				}
				break;
			case 8:
				{
				setState(102);
				((StatementContext)_localctx).forStatement = forStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).forStatement.forStmtRet; _localctx.statementRet.setLine(((StatementContext)_localctx).forStatement.forStmtRet.getLine()); 
				}
				break;
			case 9:
				{
				setState(105);
				((StatementContext)_localctx).tryCatchStatement = tryCatchStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).tryCatchStatement.tryCatchStmtRet; _localctx.statementRet.setLine(((StatementContext)_localctx).tryCatchStatement.tryCatchStmtRet.getLine()); 
				}
				break;
			case 10:
				{
				setState(108);
				((StatementContext)_localctx).throwStatement = throwStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).throwStatement.throwStmtRet; _localctx.statementRet.setLine(((StatementContext)_localctx).throwStatement.throwStmtRet.getLine()); 
				}
				break;
			case 11:
				{
				setState(111);
				((StatementContext)_localctx).expression = expression(0);
				setState(112);
				match(SEMICOLON);
				 ((StatementContext)_localctx).statementRet =  new ExpressionStmt(((StatementContext)_localctx).expression.expressionRet);
				           _localctx.statementRet.setLine(((StatementContext)_localctx).expression.expressionRet.getLine()); 
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalVarDeclarationContext extends ParserRuleContext {
		public GlobalVarDeclaration globalVarDecRet;
		public AllTypeContext allType;
		public Token literal;
		public IdentifierContext identifier;
		public EspecialVariableContext especialVariable;
		public ExpressionContext expression;
		public AllTypeContext allType() {
			return getRuleContext(AllTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EspecialVariableContext especialVariable() {
			return getRuleContext(EspecialVariableContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public GlobalVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterGlobalVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitGlobalVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitGlobalVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalVarDeclarationContext globalVarDeclaration() throws RecognitionException {
		GlobalVarDeclarationContext _localctx = new GlobalVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globalVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((GlobalVarDeclarationContext)_localctx).globalVarDecRet =  new GlobalVarDeclaration(); 
			setState(118);
			((GlobalVarDeclarationContext)_localctx).allType = allType();
			 _localctx.globalVarDecRet.setType(((GlobalVarDeclarationContext)_localctx).allType.allTypeRet); 
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(120);
				match(LBRACK);
				setState(121);
				((GlobalVarDeclarationContext)_localctx).literal = match(INT_LITERAL);
				setState(122);
				match(RBRACK);
				 _localctx.globalVarDecRet.setLength(Integer.parseInt((((GlobalVarDeclarationContext)_localctx).literal!=null?((GlobalVarDeclarationContext)_localctx).literal.getText():null))); 
				}
			}

			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(126);
				((GlobalVarDeclarationContext)_localctx).identifier = identifier();
				 _localctx.globalVarDecRet.setIdentifier(((GlobalVarDeclarationContext)_localctx).identifier.identifierRet); _localctx.globalVarDecRet.setLine(((GlobalVarDeclarationContext)_localctx).identifier.identifierRet.getLine()); 
				}
				break;
			case ASK:
			case BID:
			case TIME:
			case HIGH:
			case LOW:
			case DIGITS:
			case VOLUME:
			case TYPE:
			case TEXT:
			case OPEN:
			case CLOSE:
				{
				setState(129);
				((GlobalVarDeclarationContext)_localctx).especialVariable = especialVariable();
				 _localctx.globalVarDecRet.setIdentifier(((GlobalVarDeclarationContext)_localctx).especialVariable.especialVariableRet); _localctx.globalVarDecRet.setLine(((GlobalVarDeclarationContext)_localctx).especialVariable.especialVariableRet.getLine()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(134);
				match(ASSIGN);
				setState(135);
				((GlobalVarDeclarationContext)_localctx).expression = expression(0);
				 _localctx.globalVarDecRet.setExpression(((GlobalVarDeclarationContext)_localctx).expression.expressionRet); 
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclaration varDecRet;
		public AllTypeContext allType;
		public Token literal;
		public IdentifierContext identifier;
		public EspecialVariableContext especialVariable;
		public ExpressionContext expression;
		public AllTypeContext allType() {
			return getRuleContext(AllTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EspecialVariableContext especialVariable() {
			return getRuleContext(EspecialVariableContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((VarDeclarationContext)_localctx).varDecRet =  new VarDeclaration(); 
			setState(141);
			((VarDeclarationContext)_localctx).allType = allType();
			 _localctx.varDecRet.setType(((VarDeclarationContext)_localctx).allType.allTypeRet); 
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(143);
				match(LBRACK);
				setState(144);
				((VarDeclarationContext)_localctx).literal = match(INT_LITERAL);
				setState(145);
				match(RBRACK);
				 _localctx.varDecRet.setLength(Integer.parseInt((((VarDeclarationContext)_localctx).literal!=null?((VarDeclarationContext)_localctx).literal.getText():null))); 
				}
			}

			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(149);
				((VarDeclarationContext)_localctx).identifier = identifier();
				 _localctx.varDecRet.setIdentifier(((VarDeclarationContext)_localctx).identifier.identifierRet); _localctx.varDecRet.setLine(((VarDeclarationContext)_localctx).identifier.identifierRet.getLine()); 
				}
				break;
			case ASK:
			case BID:
			case TIME:
			case HIGH:
			case LOW:
			case DIGITS:
			case VOLUME:
			case TYPE:
			case TEXT:
			case OPEN:
			case CLOSE:
				{
				setState(152);
				((VarDeclarationContext)_localctx).especialVariable = especialVariable();
				 _localctx.varDecRet.setIdentifier(((VarDeclarationContext)_localctx).especialVariable.especialVariableRet); _localctx.varDecRet.setLine(((VarDeclarationContext)_localctx).especialVariable.especialVariableRet.getLine()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(157);
				match(ASSIGN);
				setState(158);
				((VarDeclarationContext)_localctx).expression = expression(0);
				 _localctx.varDecRet.setExpression(((VarDeclarationContext)_localctx).expression.expressionRet); 
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration funcDecRet;
		public PrimitiveTypeContext primitiveType;
		public IdentifierContext name;
		public VarDeclarationContext varDeclaration;
		public StatementContext statement;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionDeclarationContext)_localctx).funcDecRet =  new FunctionDeclaration(); 
			setState(164);
			((FunctionDeclarationContext)_localctx).primitiveType = primitiveType();
			 _localctx.funcDecRet.setReturnType(((FunctionDeclarationContext)_localctx).primitiveType.primitiveTypeRet); 
			setState(166);
			((FunctionDeclarationContext)_localctx).name = identifier();
			 _localctx.funcDecRet.setName(((FunctionDeclarationContext)_localctx).name.identifierRet); _localctx.funcDecRet.setLine(((FunctionDeclarationContext)_localctx).name.identifierRet.getLine()); 
			setState(168);
			match(LPAREN);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 7864383L) != 0)) {
				{
				setState(169);
				((FunctionDeclarationContext)_localctx).varDeclaration = varDeclaration();
				 _localctx.funcDecRet.addArg(((FunctionDeclarationContext)_localctx).varDeclaration.varDecRet); 
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(171);
					match(COMMA);
					setState(172);
					((FunctionDeclarationContext)_localctx).varDeclaration = varDeclaration();
					 _localctx.funcDecRet.addArg(((FunctionDeclarationContext)_localctx).varDeclaration.varDecRet); 
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(182);
			match(RPAREN);
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(183);
				match(THROW);
				setState(184);
				match(EXCEPTION);
				}
				break;
			}
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(187);
				match(LBRACE);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(188);
					((FunctionDeclarationContext)_localctx).statement = statement();
					 _localctx.funcDecRet.addStatement(((FunctionDeclarationContext)_localctx).statement.statementRet); 
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(197);
				((FunctionDeclarationContext)_localctx).statement = statement();
				 _localctx.funcDecRet.addStatement(((FunctionDeclarationContext)_localctx).statement.statementRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainDeclarationContext extends ParserRuleContext {
		public MainDeclaration mainDecRet;
		public Token main;
		public StatementContext statement;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode MAIN() { return getToken(UTLParser.MAIN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitMainDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitMainDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MainDeclarationContext)_localctx).mainDecRet =  new MainDeclaration(); 
			setState(203);
			match(VOID);
			setState(204);
			((MainDeclarationContext)_localctx).main = match(MAIN);
			setState(205);
			match(LPAREN);
			setState(206);
			match(RPAREN);
			 _localctx.mainDecRet.setLine(((MainDeclarationContext)_localctx).main.getLine()); 
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(208);
				match(LBRACE);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(209);
					((MainDeclarationContext)_localctx).statement = statement();
					 if (((MainDeclarationContext)_localctx).statement.statementRet instanceof VarDeclaration varDeclaration) {
					        if (varDeclaration.getType().equals("Trade")) { _localctx.mainDecRet.addActorInstantiation(varDeclaration); }
					        else { _localctx.mainDecRet.addStatement(varDeclaration); }
					    }
					    else { _localctx.mainDecRet.addStatement(((MainDeclarationContext)_localctx).statement.statementRet); } 
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(217);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(218);
				((MainDeclarationContext)_localctx).statement = statement();
				 if (((MainDeclarationContext)_localctx).statement.statementRet instanceof VarDeclaration varDeclaration) {
				      if (varDeclaration.getType().equals("Trade")) { _localctx.mainDecRet.addActorInstantiation(varDeclaration); }
				      else { _localctx.mainDecRet.addStatement(varDeclaration); }
				      }
				    else { _localctx.mainDecRet.addStatement(((MainDeclarationContext)_localctx).statement.statementRet); } 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclarationContext extends ParserRuleContext {
		public OnInitDeclaration onInitDecRet;
		public Token on;
		public IdentifierContext name;
		public StatementContext statement;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode ONINIT() { return getToken(UTLParser.ONINIT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public InitDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterInitDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitInitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitInitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclarationContext initDeclaration() throws RecognitionException {
		InitDeclarationContext _localctx = new InitDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_initDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((InitDeclarationContext)_localctx).onInitDecRet =  new OnInitDeclaration(); 
			setState(224);
			match(VOID);
			setState(225);
			((InitDeclarationContext)_localctx).on = match(ONINIT);
			setState(226);
			match(LPAREN);
			setState(227);
			match(TRADE);
			setState(228);
			((InitDeclarationContext)_localctx).name = identifier();
			 _localctx.onInitDecRet.setTradeName(((InitDeclarationContext)_localctx).name.identifierRet); _localctx.onInitDecRet.setLine(((InitDeclarationContext)_localctx).on.getLine()); 
			setState(230);
			match(RPAREN);
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(231);
				match(THROW);
				setState(232);
				match(EXCEPTION);
				}
				break;
			}
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(235);
				match(LBRACE);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(236);
					((InitDeclarationContext)_localctx).statement = statement();
					 _localctx.onInitDecRet.addStatement(((InitDeclarationContext)_localctx).statement.statementRet); 
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(245);
				((InitDeclarationContext)_localctx).statement = statement();
				 _localctx.onInitDecRet.addStatement(((InitDeclarationContext)_localctx).statement.statementRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartDeclarationContext extends ParserRuleContext {
		public OnStartDeclaration onStartDecRet;
		public Token st;
		public IdentifierContext name;
		public StatementContext statement;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode ONSTART() { return getToken(UTLParser.ONSTART, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public StartDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterStartDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitStartDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitStartDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartDeclarationContext startDeclaration() throws RecognitionException {
		StartDeclarationContext _localctx = new StartDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_startDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((StartDeclarationContext)_localctx).onStartDecRet =  new OnStartDeclaration(); 
			setState(251);
			match(VOID);
			setState(252);
			((StartDeclarationContext)_localctx).st = match(ONSTART);
			setState(253);
			match(LPAREN);
			setState(254);
			match(TRADE);
			setState(255);
			((StartDeclarationContext)_localctx).name = identifier();
			 _localctx.onStartDecRet.setTradeName(((StartDeclarationContext)_localctx).name.identifierRet); _localctx.onStartDecRet.setLine(((StartDeclarationContext)_localctx).st.getLine()); 
			setState(257);
			match(RPAREN);
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(258);
				match(THROW);
				setState(259);
				match(EXCEPTION);
				}
				break;
			}
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(262);
				match(LBRACE);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(263);
					((StartDeclarationContext)_localctx).statement = statement();
					 _localctx.onStartDecRet.addStatement(((StartDeclarationContext)_localctx).statement.statementRet); 
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(272);
				((StartDeclarationContext)_localctx).statement = statement();
				 _localctx.onStartDecRet.addStatement(((StartDeclarationContext)_localctx).statement.statementRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends ParserRuleContext {
		public AssignStmt assignStmtRet;
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((AssignStatementContext)_localctx).assignStmtRet =  new AssignStmt(); 
			setState(278);
			((AssignStatementContext)_localctx).exp1 = expression(0);
			 _localctx.assignStmtRet.setLValue(((AssignStatementContext)_localctx).exp1.expressionRet); _localctx.assignStmtRet.setLine(((AssignStatementContext)_localctx).exp1.expressionRet.getLine()); 
			setState(280);
			assign();
			setState(281);
			((AssignStatementContext)_localctx).exp2 = expression(0);
			 _localctx.assignStmtRet.setRValue(((AssignStatementContext)_localctx).exp2.expressionRet); 
			setState(283);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfElseStmt ifStmtRet;
		public Token if_;
		public ExpressionContext exp;
		public StatementContext statement;
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode IF() { return getToken(UTLParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> LBRACE() { return getTokens(UTLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(UTLParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(UTLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(UTLParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(UTLParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((IfStatementContext)_localctx).ifStmtRet =  new IfElseStmt(); 
			setState(286);
			((IfStatementContext)_localctx).if_ = match(IF);
			setState(287);
			match(LPAREN);
			setState(288);
			((IfStatementContext)_localctx).exp = expression(0);
			 _localctx.ifStmtRet.setCondition(((IfStatementContext)_localctx).exp.expressionRet); _localctx.ifStmtRet.setLine(((IfStatementContext)_localctx).if_.getLine()); 
			setState(290);
			match(RPAREN);
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(291);
				match(LBRACE);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(292);
					((IfStatementContext)_localctx).statement = statement();
					 _localctx.ifStmtRet.addThenStatement(((IfStatementContext)_localctx).statement.statementRet); 
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(300);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(301);
				((IfStatementContext)_localctx).statement = statement();
				 _localctx.ifStmtRet.addThenStatement(((IfStatementContext)_localctx).statement.statementRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(306);
				match(ELSE);
				setState(320);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(307);
					match(LBRACE);
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
						{
						{
						setState(308);
						((IfStatementContext)_localctx).statement = statement();
						 _localctx.ifStmtRet.addElseStatement(((IfStatementContext)_localctx).statement.statementRet); 
						}
						}
						setState(315);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(316);
					match(RBRACE);
					}
					break;
				case LPAREN:
				case MINUS:
				case NOT:
				case BIT_NOT:
				case INC:
				case DEC:
				case TRY:
				case THROW:
				case IF:
				case FOR:
				case WHILE:
				case BREAK:
				case CONTINUE:
				case RETURN:
				case FLOAT:
				case DOUBLE:
				case STRING:
				case BOOL:
				case VOID:
				case INT:
				case BUY:
				case SELL:
				case TRADE:
				case ORDER:
				case CANDLE:
				case EXCEPTION:
				case REFRESH_RATE:
				case GET_CANDLE:
				case TERMINATE:
				case CONNECT:
				case OBSERVE:
				case PRINT:
				case ID:
				case INT_LITERAL:
				case FLOAT_LITERAL:
				case STRING_LITERAL:
					{
					setState(317);
					((IfStatementContext)_localctx).statement = statement();
					 _localctx.ifStmtRet.addElseStatement(((IfStatementContext)_localctx).statement.statementRet); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStmt whileStmtRet;
		public Token wh;
		public ExpressionContext exp;
		public StatementContext statement;
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(UTLParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((WhileStatementContext)_localctx).whileStmtRet =  new WhileStmt(); 
			setState(325);
			((WhileStatementContext)_localctx).wh = match(WHILE);
			setState(326);
			match(LPAREN);
			setState(327);
			((WhileStatementContext)_localctx).exp = expression(0);
			 _localctx.whileStmtRet.setCondition(((WhileStatementContext)_localctx).exp.expressionRet); _localctx.whileStmtRet.setLine(((WhileStatementContext)_localctx).wh.getLine()); 
			setState(329);
			match(RPAREN);
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(330);
				match(LBRACE);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(331);
					((WhileStatementContext)_localctx).statement = statement();
					 _localctx.whileStmtRet.addBody(((WhileStatementContext)_localctx).statement.statementRet); 
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(339);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(340);
				((WhileStatementContext)_localctx).statement = statement();
				 _localctx.whileStmtRet.addBody(((WhileStatementContext)_localctx).statement.statementRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ForStmt forStmtRet;
		public Token fo;
		public StatementContext statement;
		public ExpressionContext exp;
		public ExpressionContext exp1;
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode FOR() { return getToken(UTLParser.FOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ForStatementContext)_localctx).forStmtRet =  new ForStmt(); 
			setState(346);
			((ForStatementContext)_localctx).fo = match(FOR);
			setState(347);
			match(LPAREN);
			 _localctx.forStmtRet.setLine(((ForStatementContext)_localctx).fo.getLine()); 
			setState(349);
			((ForStatementContext)_localctx).statement = statement();
			 _localctx.forStmtRet.addInit(((ForStatementContext)_localctx).statement.statementRet); 
			setState(351);
			((ForStatementContext)_localctx).exp = expression(0);
			 _localctx.forStmtRet.setCondition(((ForStatementContext)_localctx).exp.expressionRet); 
			setState(353);
			match(SEMICOLON);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345567482880064L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
				{
				setState(354);
				((ForStatementContext)_localctx).exp1 = expression(0);
				 _localctx.forStmtRet.setUpdate(((ForStatementContext)_localctx).exp1.expressionRet); 
				}
			}

			setState(359);
			match(RPAREN);
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(360);
				match(LBRACE);
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(361);
					((ForStatementContext)_localctx).statement = statement();
					 _localctx.forStmtRet.addBody(((ForStatementContext)_localctx).statement.statementRet); 
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(369);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(370);
				((ForStatementContext)_localctx).statement = statement();
				 _localctx.forStmtRet.addBody(((ForStatementContext)_localctx).statement.statementRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchStatementContext extends ParserRuleContext {
		public TryCatchStmt tryCatchStmtRet;
		public Token tr;
		public StatementContext statement;
		public IdentifierContext name;
		public TerminalNode TRY() { return getToken(UTLParser.TRY, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(UTLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(UTLParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(UTLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(UTLParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode CATCH() { return getToken(UTLParser.CATCH, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TryCatchStatementContext)_localctx).tryCatchStmtRet =  new TryCatchStmt(); 
			setState(376);
			((TryCatchStatementContext)_localctx).tr = match(TRY);
			 _localctx.tryCatchStmtRet.setLine(((TryCatchStatementContext)_localctx).tr.getLine()); 
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(378);
				match(LBRACE);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(379);
					((TryCatchStatementContext)_localctx).statement = statement();
					 _localctx.tryCatchStmtRet.addTryStatement(((TryCatchStatementContext)_localctx).statement.statementRet); 
					}
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(387);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(388);
				((TryCatchStatementContext)_localctx).statement = statement();
				 _localctx.tryCatchStmtRet.addTryStatement(((TryCatchStatementContext)_localctx).statement.statementRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(393);
				match(CATCH);
				setState(394);
				match(EXCEPTION);
				setState(395);
				((TryCatchStatementContext)_localctx).name = identifier();
				 _localctx.tryCatchStmtRet.setIdentifier(((TryCatchStatementContext)_localctx).name.identifierRet); 
				setState(410);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(397);
					match(LBRACE);
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
						{
						{
						setState(398);
						((TryCatchStatementContext)_localctx).statement = statement();
						 _localctx.tryCatchStmtRet.addCatchStatement(((TryCatchStatementContext)_localctx).statement.statementRet); 
						}
						}
						setState(405);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(406);
					match(RBRACE);
					}
					break;
				case LPAREN:
				case MINUS:
				case NOT:
				case BIT_NOT:
				case INC:
				case DEC:
				case TRY:
				case THROW:
				case IF:
				case FOR:
				case WHILE:
				case BREAK:
				case CONTINUE:
				case RETURN:
				case FLOAT:
				case DOUBLE:
				case STRING:
				case BOOL:
				case VOID:
				case INT:
				case BUY:
				case SELL:
				case TRADE:
				case ORDER:
				case CANDLE:
				case EXCEPTION:
				case REFRESH_RATE:
				case GET_CANDLE:
				case TERMINATE:
				case CONNECT:
				case OBSERVE:
				case PRINT:
				case ID:
				case INT_LITERAL:
				case FLOAT_LITERAL:
				case STRING_LITERAL:
					{
					setState(407);
					((TryCatchStatementContext)_localctx).statement = statement();
					 _localctx.tryCatchStmtRet.addCatchStatement(((TryCatchStatementContext)_localctx).statement.statementRet); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueBreakStatementContext extends ParserRuleContext {
		public ContinueBreakStmt continueBreakStmtRet;
		public Token name;
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(UTLParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(UTLParser.CONTINUE, 0); }
		public ContinueBreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueBreakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterContinueBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitContinueBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitContinueBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueBreakStatementContext continueBreakStatement() throws RecognitionException {
		ContinueBreakStatementContext _localctx = new ContinueBreakStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_continueBreakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ContinueBreakStatementContext)_localctx).continueBreakStmtRet =  new ContinueBreakStmt(); 
			setState(415);
			((ContinueBreakStatementContext)_localctx).name = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==BREAK || _la==CONTINUE) ) {
				((ContinueBreakStatementContext)_localctx).name = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 _localctx.continueBreakStmtRet.setLine(((ContinueBreakStatementContext)_localctx).name.getLine()); 
			 _localctx.continueBreakStmtRet.setToken((((ContinueBreakStatementContext)_localctx).name!=null?((ContinueBreakStatementContext)_localctx).name.getText():null)); 
			setState(418);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt returnStmtRet;
		public Token re;
		public ExpressionContext exp;
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(UTLParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ReturnStatementContext)_localctx).returnStmtRet =  new ReturnStmt(); 
			setState(421);
			((ReturnStatementContext)_localctx).re = match(RETURN);
			 _localctx.returnStmtRet.setLine(((ReturnStatementContext)_localctx).re.getLine()); 
			setState(423);
			((ReturnStatementContext)_localctx).exp = expression(0);
			 _localctx.returnStmtRet.setReturnedExpr(((ReturnStatementContext)_localctx).exp.expressionRet); 
			setState(425);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStmt throwStmtRet;
		public Token th;
		public ExpressionContext exp;
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ThrowStatementContext)_localctx).throwStmtRet =  new ThrowStmt(); 
			setState(428);
			((ThrowStatementContext)_localctx).th = match(THROW);
			 _localctx.throwStmtRet.setLine(((ThrowStatementContext)_localctx).th.getLine()); 
			setState(430);
			((ThrowStatementContext)_localctx).exp = expression(0);
			 _localctx.throwStmtRet.setReturnedExpr(((ThrowStatementContext)_localctx).exp.expressionRet); 
			setState(432);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCall functionCallRet;
		public EspecialFunctionContext especialFunction;
		public ComplexTypeIdContext complexTypeId;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public EspecialFunctionContext especialFunction() {
			return getRuleContext(EspecialFunctionContext.class,0);
		}
		public ComplexTypeIdContext complexTypeId() {
			return getRuleContext(ComplexTypeIdContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionCallContext)_localctx).functionCallRet =  new FunctionCall(); 
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
				{
				setState(435);
				((FunctionCallContext)_localctx).especialFunction = especialFunction();
				 _localctx.functionCallRet.setFunctionName(((FunctionCallContext)_localctx).especialFunction.especialFunctionRet); _localctx.functionCallRet.setLine(((FunctionCallContext)_localctx).especialFunction.especialFunctionRet.getLine()); 
				}
				break;
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
				{
				setState(438);
				((FunctionCallContext)_localctx).complexTypeId = complexTypeId();
				 _localctx.functionCallRet.setFunctionName(((FunctionCallContext)_localctx).complexTypeId.complexTypeIdRet); _localctx.functionCallRet.setLine(((FunctionCallContext)_localctx).complexTypeId.complexTypeIdRet.getLine()); 
				}
				break;
			case ID:
				{
				setState(441);
				((FunctionCallContext)_localctx).identifier = identifier();
				 _localctx.functionCallRet.setFunctionName(((FunctionCallContext)_localctx).identifier.identifierRet); _localctx.functionCallRet.setLine(((FunctionCallContext)_localctx).identifier.identifierRet.getLine()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(446);
			match(LPAREN);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345567482880064L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
				{
				setState(447);
				((FunctionCallContext)_localctx).expression = expression(0);
				 _localctx.functionCallRet.addArg(((FunctionCallContext)_localctx).expression.expressionRet); 
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(449);
					match(COMMA);
					setState(450);
					((FunctionCallContext)_localctx).expression = expression(0);
					 _localctx.functionCallRet.addArg(((FunctionCallContext)_localctx).expression.expressionRet); 
					}
					}
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(460);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public MethodCall methodCallRet;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public EspecialMethodContext especialMethod;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(UTLParser.DOT, 0); }
		public EspecialMethodContext especialMethod() {
			return getRuleContext(EspecialMethodContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MethodCallContext)_localctx).methodCallRet =  new MethodCall(); 
			setState(463);
			((MethodCallContext)_localctx).identifier = identifier();
			 _localctx.methodCallRet.setIdentifierName(((MethodCallContext)_localctx).identifier.identifierRet); _localctx.methodCallRet.setLine(((MethodCallContext)_localctx).identifier.identifierRet.getLine()); 
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(465);
				match(LBRACK);
				setState(466);
				((MethodCallContext)_localctx).expression = expression(0);
				 _localctx.methodCallRet.setInstance(((MethodCallContext)_localctx).expression.expressionRet); 
				setState(468);
				match(RBRACK);
				}
			}

			setState(472);
			match(DOT);
			setState(473);
			((MethodCallContext)_localctx).especialMethod = especialMethod();
			 _localctx.methodCallRet.setFunctionName(((MethodCallContext)_localctx).especialMethod.especialMethodRet); 
			setState(475);
			match(LPAREN);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345567482880064L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
				{
				setState(476);
				((MethodCallContext)_localctx).expression = expression(0);
				 _localctx.methodCallRet.addArg(((MethodCallContext)_localctx).expression.expressionRet); 
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(478);
					match(COMMA);
					setState(479);
					((MethodCallContext)_localctx).expression = expression(0);
					 _localctx.methodCallRet.addArg(((MethodCallContext)_localctx).expression.expressionRet); 
					}
					}
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(489);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression expressionRet;
		public ExpressionContext exp1;
		public ValueContext value;
		public ExpressionContext expression;
		public Token id;
		public FunctionCallContext functionCall;
		public MethodCallContext methodCall;
		public ExpressionContext exp2;
		public EspecialVariableContext especialVariable;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(UTLParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(UTLParser.MINUS, 0); }
		public TerminalNode BIT_NOT() { return getToken(UTLParser.BIT_NOT, 0); }
		public TerminalNode INC() { return getToken(UTLParser.INC, 0); }
		public TerminalNode DEC() { return getToken(UTLParser.DEC, 0); }
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode MULT() { return getToken(UTLParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(UTLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(UTLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(UTLParser.PLUS, 0); }
		public TerminalNode L_SHIFT() { return getToken(UTLParser.L_SHIFT, 0); }
		public TerminalNode R_SHIFT() { return getToken(UTLParser.R_SHIFT, 0); }
		public TerminalNode LT() { return getToken(UTLParser.LT, 0); }
		public TerminalNode GT() { return getToken(UTLParser.GT, 0); }
		public TerminalNode EQ() { return getToken(UTLParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(UTLParser.NEQ, 0); }
		public TerminalNode BIT_AND() { return getToken(UTLParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(UTLParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(UTLParser.BIT_XOR, 0); }
		public TerminalNode AND() { return getToken(UTLParser.AND, 0); }
		public TerminalNode OR() { return getToken(UTLParser.OR, 0); }
		public TerminalNode DOT() { return getToken(UTLParser.DOT, 0); }
		public EspecialVariableContext especialVariable() {
			return getRuleContext(EspecialVariableContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(492);
				((ExpressionContext)_localctx).value = value();
				 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).value.valueRet; _localctx.expressionRet.setLine(((ExpressionContext)_localctx).value.valueRet.getLine()); 
				}
				break;
			case 2:
				{
				UnaryOperator op;
				setState(506);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(496);
					match(NOT);
					op=UnaryOperator.NOT;
					}
					break;
				case MINUS:
					{
					setState(498);
					match(MINUS);
					op=UnaryOperator.MINUS;
					}
					break;
				case BIT_NOT:
					{
					setState(500);
					match(BIT_NOT);
					op=UnaryOperator.BIT_NOT;
					}
					break;
				case INC:
					{
					setState(502);
					match(INC);
					op=UnaryOperator.INC;
					}
					break;
				case DEC:
					{
					setState(504);
					match(DEC);
					op=UnaryOperator.DEC;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(508);
				((ExpressionContext)_localctx).exp1 = ((ExpressionContext)_localctx).expression = expression(14);
				 ((ExpressionContext)_localctx).expressionRet = new UnaryExpression(op, ((ExpressionContext)_localctx).exp1.expressionRet); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).exp1.expressionRet.getLine()); 
				}
				break;
			case 3:
				{
				setState(511);
				((ExpressionContext)_localctx).id = match(ID);
				{
				setState(512);
				match(LBRACK);
				setState(513);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(514);
				match(RBRACK);
				}
				 ((ExpressionContext)_localctx).expressionRet =  new ArrayIdentifier((((ExpressionContext)_localctx).id!=null?((ExpressionContext)_localctx).id.getText():null), ((ExpressionContext)_localctx).expression.expressionRet); 
				 _localctx.expressionRet.setLine(((ExpressionContext)_localctx).id.getLine()); 
				}
				break;
			case 4:
				{
				setState(519);
				((ExpressionContext)_localctx).id = match(ID);
				 ((ExpressionContext)_localctx).expressionRet =  new Identifier((((ExpressionContext)_localctx).id!=null?((ExpressionContext)_localctx).id.getText():null)); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).id.getLine()); 
				}
				break;
			case 5:
				{
				setState(521);
				match(LPAREN);
				setState(522);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(523);
				match(RPAREN);
				 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).expression.expressionRet; _localctx.expressionRet.setLine(((ExpressionContext)_localctx).expression.expressionRet.getLine()); 
				}
				break;
			case 6:
				{
				setState(526);
				((ExpressionContext)_localctx).functionCall = functionCall();
				 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).functionCall.functionCallRet; _localctx.expressionRet.setLine(((ExpressionContext)_localctx).functionCall.functionCallRet.getLine()); 
				}
				break;
			case 7:
				{
				setState(529);
				((ExpressionContext)_localctx).methodCall = methodCall();
				 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).methodCall.methodCallRet; _localctx.expressionRet.setLine(((ExpressionContext)_localctx).methodCall.methodCallRet.getLine()); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(630);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(628);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(534);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						BinaryOperator op;
						setState(542);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(536);
							match(MULT);
							op=BinaryOperator.MULT;
							}
							break;
						case DIV:
							{
							setState(538);
							match(DIV);
							op=BinaryOperator.DIV;
							}
							break;
						case MOD:
							{
							setState(540);
							match(MOD);
							op=BinaryOperator.MOD;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(544);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(14);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet, ((ExpressionContext)_localctx).exp2.expressionRet, op); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).exp1.expressionRet.getLine()); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(547);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						BinaryOperator op;
						setState(553);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(549);
							match(PLUS);
							op=BinaryOperator.PLUS;
							}
							break;
						case MINUS:
							{
							setState(551);
							match(MINUS);
							op=BinaryOperator.MINUS;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(555);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(13);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet, ((ExpressionContext)_localctx).exp2.expressionRet, op); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).exp1.expressionRet.getLine()); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(558);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						BinaryOperator op;
						setState(564);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case L_SHIFT:
							{
							setState(560);
							match(L_SHIFT);
							op=BinaryOperator.L_SHIFT;
							}
							break;
						case R_SHIFT:
							{
							setState(562);
							match(R_SHIFT);
							op=BinaryOperator.R_SHIFT;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(566);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(12);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet, ((ExpressionContext)_localctx).exp2.expressionRet, op); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).exp1.expressionRet.getLine()); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(569);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						BinaryOperator op;
						setState(575);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(571);
							match(LT);
							op=BinaryOperator.LT;
							}
							break;
						case GT:
							{
							setState(573);
							match(GT);
							op=BinaryOperator.GT;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(577);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(11);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet, ((ExpressionContext)_localctx).exp2.expressionRet, op); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).exp1.expressionRet.getLine()); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(580);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						BinaryOperator op;
						setState(586);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQ:
							{
							setState(582);
							match(EQ);
							op=BinaryOperator.EQ;
							}
							break;
						case NEQ:
							{
							setState(584);
							match(NEQ);
							op=BinaryOperator.NEQ;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(588);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(10);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet, ((ExpressionContext)_localctx).exp2.expressionRet, op); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).exp1.expressionRet.getLine()); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(591);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						BinaryOperator op;
						setState(599);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case BIT_AND:
							{
							setState(593);
							match(BIT_AND);
							op=BinaryOperator.BIT_AND;
							}
							break;
						case BIT_OR:
							{
							setState(595);
							match(BIT_OR);
							op=BinaryOperator.BIT_OR;
							}
							break;
						case BIT_XOR:
							{
							setState(597);
							match(BIT_XOR);
							op=BinaryOperator.BIT_XOR;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(601);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(9);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet, ((ExpressionContext)_localctx).exp2.expressionRet, op); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).exp1.expressionRet.getLine()); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(604);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(605);
						match(AND);
						setState(606);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(8);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet, ((ExpressionContext)_localctx).exp2.expressionRet, BinaryOperator.AND); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).exp1.expressionRet.getLine()); 
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(609);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(610);
						match(OR);
						setState(611);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(7);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet, ((ExpressionContext)_localctx).exp2.expressionRet, BinaryOperator.OR); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).exp1.expressionRet.getLine()); 
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(614);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(615);
						match(DOT);
						setState(616);
						((ExpressionContext)_localctx).especialVariable = especialVariable();
						 ((ExpressionContext)_localctx).expressionRet =  new VarAccess(((ExpressionContext)_localctx).exp1.expressionRet, ((ExpressionContext)_localctx).especialVariable.especialVariableRet); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).exp1.expressionRet.getLine()); 
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(619);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						UnaryOperator op;
						setState(625);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case INC:
							{
							setState(621);
							match(INC);
							op=UnaryOperator.INC;
							}
							break;
						case DEC:
							{
							setState(623);
							match(DEC);
							op=UnaryOperator.DEC;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						 ((ExpressionContext)_localctx).expressionRet = new UnaryExpression(op, ((ExpressionContext)_localctx).exp1.expressionRet); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).exp1.expressionRet.getLine()); 
						}
						break;
					}
					} 
				}
				setState(632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public Value valueRet;
		public Token in;
		public Token fl;
		public Token st;
		public Token se;
		public Token bu;
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(UTLParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(UTLParser.STRING_LITERAL, 0); }
		public TerminalNode SELL() { return getToken(UTLParser.SELL, 0); }
		public TerminalNode BUY() { return getToken(UTLParser.BUY, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		try {
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				((ValueContext)_localctx).in = match(INT_LITERAL);
				 ((ValueContext)_localctx).valueRet =  new IntValue(Integer.parseInt((((ValueContext)_localctx).in!=null?((ValueContext)_localctx).in.getText():null))); _localctx.valueRet.setLine(((ValueContext)_localctx).in.getLine()); 
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				((ValueContext)_localctx).fl = match(FLOAT_LITERAL);
				 ((ValueContext)_localctx).valueRet =  new FloatValue(Float.parseFloat((((ValueContext)_localctx).fl!=null?((ValueContext)_localctx).fl.getText():null))); _localctx.valueRet.setLine(((ValueContext)_localctx).fl.getLine()); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				((ValueContext)_localctx).st = match(STRING_LITERAL);
				 ((ValueContext)_localctx).valueRet =  new StringValue((((ValueContext)_localctx).st!=null?((ValueContext)_localctx).st.getText():null)); _localctx.valueRet.setLine(((ValueContext)_localctx).st.getLine()); 
				}
				break;
			case SELL:
				enterOuterAlt(_localctx, 4);
				{
				setState(639);
				((ValueContext)_localctx).se = match(SELL);
				 ((ValueContext)_localctx).valueRet =  new TradeValue((((ValueContext)_localctx).se!=null?((ValueContext)_localctx).se.getText():null)); _localctx.valueRet.setLine(((ValueContext)_localctx).se.getLine()); 
				}
				break;
			case BUY:
				enterOuterAlt(_localctx, 5);
				{
				setState(641);
				((ValueContext)_localctx).bu = match(BUY);
				 ((ValueContext)_localctx).valueRet =  new TradeValue((((ValueContext)_localctx).bu!=null?((ValueContext)_localctx).bu.getText():null)); _localctx.valueRet.setLine(((ValueContext)_localctx).bu.getLine()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public Type primitiveTypeRet;
		public TerminalNode FLOAT() { return getToken(UTLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(UTLParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(UTLParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(UTLParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(UTLParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primitiveType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				{
				setState(645);
				match(FLOAT);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new FloatType(); 
				}
				break;
			case DOUBLE:
				{
				setState(647);
				match(DOUBLE);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new DoubleType(); 
				}
				break;
			case INT:
				{
				setState(649);
				match(INT);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new IntType(); 
				}
				break;
			case BOOL:
				{
				setState(651);
				match(BOOL);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new BoolType(); 
				}
				break;
			case STRING:
				{
				setState(653);
				match(STRING);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new StringType(); 
				}
				break;
			case VOID:
				{
				setState(655);
				match(VOID);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new VoidType(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexTypeIdContext extends ParserRuleContext {
		public Identifier complexTypeIdRet;
		public Token id;
		public TerminalNode ORDER() { return getToken(UTLParser.ORDER, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode CANDLE() { return getToken(UTLParser.CANDLE, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public ComplexTypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexTypeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterComplexTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitComplexTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitComplexTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexTypeIdContext complexTypeId() throws RecognitionException {
		ComplexTypeIdContext _localctx = new ComplexTypeIdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_complexTypeId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			((ComplexTypeIdContext)_localctx).id = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 15L) != 0)) ) {
				((ComplexTypeIdContext)_localctx).id = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 ((ComplexTypeIdContext)_localctx).complexTypeIdRet =  new Identifier((((ComplexTypeIdContext)_localctx).id!=null?((ComplexTypeIdContext)_localctx).id.getText():null)); _localctx.complexTypeIdRet.setLine(((ComplexTypeIdContext)_localctx).id.getLine()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexTypeContext extends ParserRuleContext {
		public Type complexTypeRet;
		public TerminalNode ORDER() { return getToken(UTLParser.ORDER, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode CANDLE() { return getToken(UTLParser.CANDLE, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitComplexType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitComplexType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_complexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORDER:
				{
				setState(662);
				match(ORDER);
				 ((ComplexTypeContext)_localctx).complexTypeRet =  new OrderType(); 
				}
				break;
			case TRADE:
				{
				setState(664);
				match(TRADE);
				 ((ComplexTypeContext)_localctx).complexTypeRet =  new TradeType(); 
				}
				break;
			case CANDLE:
				{
				setState(666);
				match(CANDLE);
				 ((ComplexTypeContext)_localctx).complexTypeRet =  new CandleType(); 
				}
				break;
			case EXCEPTION:
				{
				setState(668);
				match(EXCEPTION);
				 ((ComplexTypeContext)_localctx).complexTypeRet =  new ExceptionType(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllTypeContext extends ParserRuleContext {
		public Type allTypeRet;
		public PrimitiveTypeContext primitiveType;
		public ComplexTypeContext complexType;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public AllTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAllType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAllType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAllType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllTypeContext allType() throws RecognitionException {
		AllTypeContext _localctx = new AllTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_allType);
		try {
			setState(678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				((AllTypeContext)_localctx).primitiveType = primitiveType();
				 ((AllTypeContext)_localctx).allTypeRet =  ((AllTypeContext)_localctx).primitiveType.primitiveTypeRet; 
				}
				break;
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				((AllTypeContext)_localctx).complexType = complexType();
				 ((AllTypeContext)_localctx).allTypeRet =  ((AllTypeContext)_localctx).complexType.complexTypeRet; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EspecialFunctionContext extends ParserRuleContext {
		public Identifier especialFunctionRet;
		public Token id;
		public TerminalNode REFRESH_RATE() { return getToken(UTLParser.REFRESH_RATE, 0); }
		public TerminalNode CONNECT() { return getToken(UTLParser.CONNECT, 0); }
		public TerminalNode OBSERVE() { return getToken(UTLParser.OBSERVE, 0); }
		public TerminalNode GET_CANDLE() { return getToken(UTLParser.GET_CANDLE, 0); }
		public TerminalNode TERMINATE() { return getToken(UTLParser.TERMINATE, 0); }
		public TerminalNode PRINT() { return getToken(UTLParser.PRINT, 0); }
		public EspecialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_especialFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterEspecialFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitEspecialFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitEspecialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspecialFunctionContext especialFunction() throws RecognitionException {
		EspecialFunctionContext _localctx = new EspecialFunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_especialFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			((EspecialFunctionContext)_localctx).id = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 63L) != 0)) ) {
				((EspecialFunctionContext)_localctx).id = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 ((EspecialFunctionContext)_localctx).especialFunctionRet =  new Identifier((((EspecialFunctionContext)_localctx).id!=null?((EspecialFunctionContext)_localctx).id.getText():null)); _localctx.especialFunctionRet.setLine(((EspecialFunctionContext)_localctx).id.getLine()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EspecialVariableContext extends ParserRuleContext {
		public Identifier especialVariableRet;
		public Token id;
		public TerminalNode ASK() { return getToken(UTLParser.ASK, 0); }
		public TerminalNode BID() { return getToken(UTLParser.BID, 0); }
		public TerminalNode TIME() { return getToken(UTLParser.TIME, 0); }
		public TerminalNode HIGH() { return getToken(UTLParser.HIGH, 0); }
		public TerminalNode LOW() { return getToken(UTLParser.LOW, 0); }
		public TerminalNode DIGITS() { return getToken(UTLParser.DIGITS, 0); }
		public TerminalNode VOLUME() { return getToken(UTLParser.VOLUME, 0); }
		public TerminalNode TYPE() { return getToken(UTLParser.TYPE, 0); }
		public TerminalNode TEXT() { return getToken(UTLParser.TEXT, 0); }
		public TerminalNode OPEN() { return getToken(UTLParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(UTLParser.CLOSE, 0); }
		public EspecialVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_especialVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterEspecialVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitEspecialVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitEspecialVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspecialVariableContext especialVariable() throws RecognitionException {
		EspecialVariableContext _localctx = new EspecialVariableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_especialVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			((EspecialVariableContext)_localctx).id = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 2047L) != 0)) ) {
				((EspecialVariableContext)_localctx).id = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 ((EspecialVariableContext)_localctx).especialVariableRet =  new Identifier((((EspecialVariableContext)_localctx).id!=null?((EspecialVariableContext)_localctx).id.getText():null)); _localctx.especialVariableRet.setLine(((EspecialVariableContext)_localctx).id.getLine()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EspecialMethodContext extends ParserRuleContext {
		public Identifier especialMethodRet;
		public Token id;
		public TerminalNode OPEN() { return getToken(UTLParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(UTLParser.CLOSE, 0); }
		public EspecialMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_especialMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterEspecialMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitEspecialMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitEspecialMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspecialMethodContext especialMethod() throws RecognitionException {
		EspecialMethodContext _localctx = new EspecialMethodContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_especialMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			((EspecialMethodContext)_localctx).id = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==OPEN || _la==CLOSE) ) {
				((EspecialMethodContext)_localctx).id = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 ((EspecialMethodContext)_localctx).especialMethodRet =  new Identifier((((EspecialMethodContext)_localctx).id!=null?((EspecialMethodContext)_localctx).id.getText():null)); _localctx.especialMethodRet.setLine(((EspecialMethodContext)_localctx).id.getLine()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(UTLParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(UTLParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(UTLParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(UTLParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(UTLParser.MOD_ASSIGN, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public Identifier identifierRet;
		public Token id;
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			((IdentifierContext)_localctx).id = match(ID);
			 ((IdentifierContext)_localctx).identifierRet =  new Identifier((((IdentifierContext)_localctx).id!=null?((IdentifierContext)_localctx).id.getText():null)); _localctx.identifierRet.setLine(((IdentifierContext)_localctx).id.getLine()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001T\u02b7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000I\b\u0000"+
		"\n\u0000\f\u0000L\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001t\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002}\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0085\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u008b\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u0094\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u009c\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00a2\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00b0\b\u0004"+
		"\n\u0004\f\u0004\u00b3\t\u0004\u0003\u0004\u00b5\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00ba\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u00c0\b\u0004\n\u0004\f\u0004\u00c3\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00c9\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00d5\b\u0005"+
		"\n\u0005\f\u0005\u00d8\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00de\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00ea\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00f0\b\u0006\n\u0006\f\u0006\u00f3\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00f9\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0105\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u010b\b\u0007\n\u0007"+
		"\f\u0007\u010e\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0114\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u0128\b\t\n\t\f\t\u012b\t\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u0131\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u0138\b\t\n\t\f\t\u013b\t\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u0141\b\t\u0003\t\u0143\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u014f\b\n\n"+
		"\n\f\n\u0152\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0158\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0166\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u016d\b\u000b\n\u000b\f\u000b\u0170\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0176\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u017f\b\f\n\f"+
		"\f\f\u0182\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0188\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0192"+
		"\b\f\n\f\f\f\u0195\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u019b\b"+
		"\f\u0003\f\u019d\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u01bd\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u01c6\b\u0010\n\u0010\f\u0010"+
		"\u01c9\t\u0010\u0003\u0010\u01cb\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u01d7\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u01e3\b\u0011\n\u0011\f\u0011\u01e6\t\u0011"+
		"\u0003\u0011\u01e8\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u01fb\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0215\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u021f\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u022a\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0235\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0240\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u024b\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0258\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0272\b\u0012\u0001\u0012\u0005\u0012\u0275\b\u0012\n\u0012"+
		"\f\u0012\u0278\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0284\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0292\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u029f\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u02a7\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0000\u0001$\u001d\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468\u0000\u0006\u0001\u0000-.\u0001\u0000FI\u0001\u0000"+
		"JO\u0001\u0000;E\u0001\u0000DE\u0001\u0000 %\u02fa\u0000:\u0001\u0000"+
		"\u0000\u0000\u0002s\u0001\u0000\u0000\u0000\u0004u\u0001\u0000\u0000\u0000"+
		"\u0006\u008c\u0001\u0000\u0000\u0000\b\u00a3\u0001\u0000\u0000\u0000\n"+
		"\u00ca\u0001\u0000\u0000\u0000\f\u00df\u0001\u0000\u0000\u0000\u000e\u00fa"+
		"\u0001\u0000\u0000\u0000\u0010\u0115\u0001\u0000\u0000\u0000\u0012\u011d"+
		"\u0001\u0000\u0000\u0000\u0014\u0144\u0001\u0000\u0000\u0000\u0016\u0159"+
		"\u0001\u0000\u0000\u0000\u0018\u0177\u0001\u0000\u0000\u0000\u001a\u019e"+
		"\u0001\u0000\u0000\u0000\u001c\u01a4\u0001\u0000\u0000\u0000\u001e\u01ab"+
		"\u0001\u0000\u0000\u0000 \u01b2\u0001\u0000\u0000\u0000\"\u01ce\u0001"+
		"\u0000\u0000\u0000$\u0214\u0001\u0000\u0000\u0000&\u0283\u0001\u0000\u0000"+
		"\u0000(\u0291\u0001\u0000\u0000\u0000*\u0293\u0001\u0000\u0000\u0000,"+
		"\u029e\u0001\u0000\u0000\u0000.\u02a6\u0001\u0000\u0000\u00000\u02a8\u0001"+
		"\u0000\u0000\u00002\u02ab\u0001\u0000\u0000\u00004\u02ae\u0001\u0000\u0000"+
		"\u00006\u02b1\u0001\u0000\u0000\u00008\u02b3\u0001\u0000\u0000\u0000:"+
		"J\u0006\u0000\uffff\uffff\u0000;<\u0003\u0004\u0002\u0000<=\u0005\u0002"+
		"\u0000\u0000=>\u0006\u0000\uffff\uffff\u0000>I\u0001\u0000\u0000\u0000"+
		"?@\u0003\b\u0004\u0000@A\u0006\u0000\uffff\uffff\u0000AI\u0001\u0000\u0000"+
		"\u0000BC\u0003\f\u0006\u0000CD\u0006\u0000\uffff\uffff\u0000DI\u0001\u0000"+
		"\u0000\u0000EF\u0003\u000e\u0007\u0000FG\u0006\u0000\uffff\uffff\u0000"+
		"GI\u0001\u0000\u0000\u0000H;\u0001\u0000\u0000\u0000H?\u0001\u0000\u0000"+
		"\u0000HB\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000\u0000IL\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0003\n\u0005\u0000NO\u0006"+
		"\u0000\uffff\uffff\u0000O\u0001\u0001\u0000\u0000\u0000PQ\u0003\u0006"+
		"\u0003\u0000QR\u0005\u0002\u0000\u0000RS\u0006\u0001\uffff\uffff\u0000"+
		"St\u0001\u0000\u0000\u0000TU\u0003\b\u0004\u0000UV\u0006\u0001\uffff\uffff"+
		"\u0000Vt\u0001\u0000\u0000\u0000WX\u0003\u0010\b\u0000XY\u0006\u0001\uffff"+
		"\uffff\u0000Yt\u0001\u0000\u0000\u0000Z[\u0003\u001a\r\u0000[\\\u0006"+
		"\u0001\uffff\uffff\u0000\\t\u0001\u0000\u0000\u0000]^\u0003\u001c\u000e"+
		"\u0000^_\u0006\u0001\uffff\uffff\u0000_t\u0001\u0000\u0000\u0000`a\u0003"+
		"\u0012\t\u0000ab\u0006\u0001\uffff\uffff\u0000bt\u0001\u0000\u0000\u0000"+
		"cd\u0003\u0014\n\u0000de\u0006\u0001\uffff\uffff\u0000et\u0001\u0000\u0000"+
		"\u0000fg\u0003\u0016\u000b\u0000gh\u0006\u0001\uffff\uffff\u0000ht\u0001"+
		"\u0000\u0000\u0000ij\u0003\u0018\f\u0000jk\u0006\u0001\uffff\uffff\u0000"+
		"kt\u0001\u0000\u0000\u0000lm\u0003\u001e\u000f\u0000mn\u0006\u0001\uffff"+
		"\uffff\u0000nt\u0001\u0000\u0000\u0000op\u0003$\u0012\u0000pq\u0005\u0002"+
		"\u0000\u0000qr\u0006\u0001\uffff\uffff\u0000rt\u0001\u0000\u0000\u0000"+
		"sP\u0001\u0000\u0000\u0000sT\u0001\u0000\u0000\u0000sW\u0001\u0000\u0000"+
		"\u0000sZ\u0001\u0000\u0000\u0000s]\u0001\u0000\u0000\u0000s`\u0001\u0000"+
		"\u0000\u0000sc\u0001\u0000\u0000\u0000sf\u0001\u0000\u0000\u0000si\u0001"+
		"\u0000\u0000\u0000sl\u0001\u0000\u0000\u0000so\u0001\u0000\u0000\u0000"+
		"t\u0003\u0001\u0000\u0000\u0000uv\u0006\u0002\uffff\uffff\u0000vw\u0003"+
		".\u0017\u0000w|\u0006\u0002\uffff\uffff\u0000xy\u0005\n\u0000\u0000yz"+
		"\u0005Q\u0000\u0000z{\u0005\u000b\u0000\u0000{}\u0006\u0002\uffff\uffff"+
		"\u0000|x\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0084\u0001"+
		"\u0000\u0000\u0000~\u007f\u00038\u001c\u0000\u007f\u0080\u0006\u0002\uffff"+
		"\uffff\u0000\u0080\u0085\u0001\u0000\u0000\u0000\u0081\u0082\u00032\u0019"+
		"\u0000\u0082\u0083\u0006\u0002\uffff\uffff\u0000\u0083\u0085\u0001\u0000"+
		"\u0000\u0000\u0084~\u0001\u0000\u0000\u0000\u0084\u0081\u0001\u0000\u0000"+
		"\u0000\u0085\u008a\u0001\u0000\u0000\u0000\u0086\u0087\u0005 \u0000\u0000"+
		"\u0087\u0088\u0003$\u0012\u0000\u0088\u0089\u0006\u0002\uffff\uffff\u0000"+
		"\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0086\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0005\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0006\u0003\uffff\uffff\u0000\u008d\u008e\u0003.\u0017\u0000"+
		"\u008e\u0093\u0006\u0003\uffff\uffff\u0000\u008f\u0090\u0005\n\u0000\u0000"+
		"\u0090\u0091\u0005Q\u0000\u0000\u0091\u0092\u0005\u000b\u0000\u0000\u0092"+
		"\u0094\u0006\u0003\uffff\uffff\u0000\u0093\u008f\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u009b\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u00038\u001c\u0000\u0096\u0097\u0006\u0003\uffff\uffff\u0000"+
		"\u0097\u009c\u0001\u0000\u0000\u0000\u0098\u0099\u00032\u0019\u0000\u0099"+
		"\u009a\u0006\u0003\uffff\uffff\u0000\u009a\u009c\u0001\u0000\u0000\u0000"+
		"\u009b\u0095\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000\u0000\u0000"+
		"\u009c\u00a1\u0001\u0000\u0000\u0000\u009d\u009e\u0005 \u0000\u0000\u009e"+
		"\u009f\u0003$\u0012\u0000\u009f\u00a0\u0006\u0003\uffff\uffff\u0000\u00a0"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u0007\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0006\u0004\uffff\uffff\u0000\u00a4\u00a5\u0003(\u0014\u0000\u00a5"+
		"\u00a6\u0006\u0004\uffff\uffff\u0000\u00a6\u00a7\u00038\u001c\u0000\u00a7"+
		"\u00a8\u0006\u0004\uffff\uffff\u0000\u00a8\u00b4\u0005\u0006\u0000\u0000"+
		"\u00a9\u00aa\u0003\u0006\u0003\u0000\u00aa\u00b1\u0006\u0004\uffff\uffff"+
		"\u0000\u00ab\u00ac\u0005\u0003\u0000\u0000\u00ac\u00ad\u0003\u0006\u0003"+
		"\u0000\u00ad\u00ae\u0006\u0004\uffff\uffff\u0000\u00ae\u00b0\u0001\u0000"+
		"\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b4\u00a9\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b9\u0005\u0007"+
		"\u0000\u0000\u00b7\u00b8\u0005\'\u0000\u0000\u00b8\u00ba\u0005I\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00c8\u0001\u0000\u0000\u0000\u00bb\u00c1\u0005\b\u0000\u0000"+
		"\u00bc\u00bd\u0003\u0002\u0001\u0000\u00bd\u00be\u0006\u0004\uffff\uffff"+
		"\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c9\u0005\t\u0000\u0000"+
		"\u00c5\u00c6\u0003\u0002\u0001\u0000\u00c6\u00c7\u0006\u0004\uffff\uffff"+
		"\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00bb\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9\t\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0006\u0005\uffff\uffff\u0000\u00cb\u00cc\u00057\u0000\u0000"+
		"\u00cc\u00cd\u00050\u0000\u0000\u00cd\u00ce\u0005\u0006\u0000\u0000\u00ce"+
		"\u00cf\u0005\u0007\u0000\u0000\u00cf\u00dd\u0006\u0005\uffff\uffff\u0000"+
		"\u00d0\u00d6\u0005\b\u0000\u0000\u00d1\u00d2\u0003\u0002\u0001\u0000\u00d2"+
		"\u00d3\u0006\u0005\uffff\uffff\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d9\u00de\u0005\t\u0000\u0000\u00da\u00db\u0003\u0002\u0001\u0000\u00db"+
		"\u00dc\u0006\u0005\uffff\uffff\u0000\u00dc\u00de\u0001\u0000\u0000\u0000"+
		"\u00dd\u00d0\u0001\u0000\u0000\u0000\u00dd\u00da\u0001\u0000\u0000\u0000"+
		"\u00de\u000b\u0001\u0000\u0000\u0000\u00df\u00e0\u0006\u0006\uffff\uffff"+
		"\u0000\u00e0\u00e1\u00057\u0000\u0000\u00e1\u00e2\u00051\u0000\u0000\u00e2"+
		"\u00e3\u0005\u0006\u0000\u0000\u00e3\u00e4\u0005F\u0000\u0000\u00e4\u00e5"+
		"\u00038\u001c\u0000\u00e5\u00e6\u0006\u0006\uffff\uffff\u0000\u00e6\u00e9"+
		"\u0005\u0007\u0000\u0000\u00e7\u00e8\u0005\'\u0000\u0000\u00e8\u00ea\u0005"+
		"I\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\u00f8\u0001\u0000\u0000\u0000\u00eb\u00f1\u0005\b\u0000"+
		"\u0000\u00ec\u00ed\u0003\u0002\u0001\u0000\u00ed\u00ee\u0006\u0006\uffff"+
		"\uffff\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f9\u0005\t\u0000"+
		"\u0000\u00f5\u00f6\u0003\u0002\u0001\u0000\u00f6\u00f7\u0006\u0006\uffff"+
		"\uffff\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00eb\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f5\u0001\u0000\u0000\u0000\u00f9\r\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0006\u0007\uffff\uffff\u0000\u00fb\u00fc\u00057\u0000"+
		"\u0000\u00fc\u00fd\u00052\u0000\u0000\u00fd\u00fe\u0005\u0006\u0000\u0000"+
		"\u00fe\u00ff\u0005F\u0000\u0000\u00ff\u0100\u00038\u001c\u0000\u0100\u0101"+
		"\u0006\u0007\uffff\uffff\u0000\u0101\u0104\u0005\u0007\u0000\u0000\u0102"+
		"\u0103\u0005\'\u0000\u0000\u0103\u0105\u0005I\u0000\u0000\u0104\u0102"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0113"+
		"\u0001\u0000\u0000\u0000\u0106\u010c\u0005\b\u0000\u0000\u0107\u0108\u0003"+
		"\u0002\u0001\u0000\u0108\u0109\u0006\u0007\uffff\uffff\u0000\u0109\u010b"+
		"\u0001\u0000\u0000\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010b\u010e"+
		"\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u010c"+
		"\u0001\u0000\u0000\u0000\u010f\u0114\u0005\t\u0000\u0000\u0110\u0111\u0003"+
		"\u0002\u0001\u0000\u0111\u0112\u0006\u0007\uffff\uffff\u0000\u0112\u0114"+
		"\u0001\u0000\u0000\u0000\u0113\u0106\u0001\u0000\u0000\u0000\u0113\u0110"+
		"\u0001\u0000\u0000\u0000\u0114\u000f\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0006\b\uffff\uffff\u0000\u0116\u0117\u0003$\u0012\u0000\u0117\u0118"+
		"\u0006\b\uffff\uffff\u0000\u0118\u0119\u00036\u001b\u0000\u0119\u011a"+
		"\u0003$\u0012\u0000\u011a\u011b\u0006\b\uffff\uffff\u0000\u011b\u011c"+
		"\u0005\u0002\u0000\u0000\u011c\u0011\u0001\u0000\u0000\u0000\u011d\u011e"+
		"\u0006\t\uffff\uffff\u0000\u011e\u011f\u0005)\u0000\u0000\u011f\u0120"+
		"\u0005\u0006\u0000\u0000\u0120\u0121\u0003$\u0012\u0000\u0121\u0122\u0006"+
		"\t\uffff\uffff\u0000\u0122\u0130\u0005\u0007\u0000\u0000\u0123\u0129\u0005"+
		"\b\u0000\u0000\u0124\u0125\u0003\u0002\u0001\u0000\u0125\u0126\u0006\t"+
		"\uffff\uffff\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0124\u0001"+
		"\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001"+
		"\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u0131\u0005"+
		"\t\u0000\u0000\u012d\u012e\u0003\u0002\u0001\u0000\u012e\u012f\u0006\t"+
		"\uffff\uffff\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u0123\u0001"+
		"\u0000\u0000\u0000\u0130\u012d\u0001\u0000\u0000\u0000\u0131\u0142\u0001"+
		"\u0000\u0000\u0000\u0132\u0140\u0005*\u0000\u0000\u0133\u0139\u0005\b"+
		"\u0000\u0000\u0134\u0135\u0003\u0002\u0001\u0000\u0135\u0136\u0006\t\uffff"+
		"\uffff\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u0134\u0001\u0000"+
		"\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013c\u0001\u0000"+
		"\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u0141\u0005\t\u0000"+
		"\u0000\u013d\u013e\u0003\u0002\u0001\u0000\u013e\u013f\u0006\t\uffff\uffff"+
		"\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u0133\u0001\u0000\u0000"+
		"\u0000\u0140\u013d\u0001\u0000\u0000\u0000\u0141\u0143\u0001\u0000\u0000"+
		"\u0000\u0142\u0132\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000"+
		"\u0000\u0143\u0013\u0001\u0000\u0000\u0000\u0144\u0145\u0006\n\uffff\uffff"+
		"\u0000\u0145\u0146\u0005,\u0000\u0000\u0146\u0147\u0005\u0006\u0000\u0000"+
		"\u0147\u0148\u0003$\u0012\u0000\u0148\u0149\u0006\n\uffff\uffff\u0000"+
		"\u0149\u0157\u0005\u0007\u0000\u0000\u014a\u0150\u0005\b\u0000\u0000\u014b"+
		"\u014c\u0003\u0002\u0001\u0000\u014c\u014d\u0006\n\uffff\uffff\u0000\u014d"+
		"\u014f\u0001\u0000\u0000\u0000\u014e\u014b\u0001\u0000\u0000\u0000\u014f"+
		"\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0001\u0000\u0000\u0000\u0151\u0153\u0001\u0000\u0000\u0000\u0152"+
		"\u0150\u0001\u0000\u0000\u0000\u0153\u0158\u0005\t\u0000\u0000\u0154\u0155"+
		"\u0003\u0002\u0001\u0000\u0155\u0156\u0006\n\uffff\uffff\u0000\u0156\u0158"+
		"\u0001\u0000\u0000\u0000\u0157\u014a\u0001\u0000\u0000\u0000\u0157\u0154"+
		"\u0001\u0000\u0000\u0000\u0158\u0015\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0006\u000b\uffff\uffff\u0000\u015a\u015b\u0005+\u0000\u0000\u015b\u015c"+
		"\u0005\u0006\u0000\u0000\u015c\u015d\u0006\u000b\uffff\uffff\u0000\u015d"+
		"\u015e\u0003\u0002\u0001\u0000\u015e\u015f\u0006\u000b\uffff\uffff\u0000"+
		"\u015f\u0160\u0003$\u0012\u0000\u0160\u0161\u0006\u000b\uffff\uffff\u0000"+
		"\u0161\u0165\u0005\u0002\u0000\u0000\u0162\u0163\u0003$\u0012\u0000\u0163"+
		"\u0164\u0006\u000b\uffff\uffff\u0000\u0164\u0166\u0001\u0000\u0000\u0000"+
		"\u0165\u0162\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000"+
		"\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0175\u0005\u0007\u0000\u0000"+
		"\u0168\u016e\u0005\b\u0000\u0000\u0169\u016a\u0003\u0002\u0001\u0000\u016a"+
		"\u016b\u0006\u000b\uffff\uffff\u0000\u016b\u016d\u0001\u0000\u0000\u0000"+
		"\u016c\u0169\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000"+
		"\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000"+
		"\u016f\u0171\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000"+
		"\u0171\u0176\u0005\t\u0000\u0000\u0172\u0173\u0003\u0002\u0001\u0000\u0173"+
		"\u0174\u0006\u000b\uffff\uffff\u0000\u0174\u0176\u0001\u0000\u0000\u0000"+
		"\u0175\u0168\u0001\u0000\u0000\u0000\u0175\u0172\u0001\u0000\u0000\u0000"+
		"\u0176\u0017\u0001\u0000\u0000\u0000\u0177\u0178\u0006\f\uffff\uffff\u0000"+
		"\u0178\u0179\u0005&\u0000\u0000\u0179\u0187\u0006\f\uffff\uffff\u0000"+
		"\u017a\u0180\u0005\b\u0000\u0000\u017b\u017c\u0003\u0002\u0001\u0000\u017c"+
		"\u017d\u0006\f\uffff\uffff\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e"+
		"\u017b\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180"+
		"\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181"+
		"\u0183\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183"+
		"\u0188\u0005\t\u0000\u0000\u0184\u0185\u0003\u0002\u0001\u0000\u0185\u0186"+
		"\u0006\f\uffff\uffff\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u017a"+
		"\u0001\u0000\u0000\u0000\u0187\u0184\u0001\u0000\u0000\u0000\u0188\u019c"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u0005(\u0000\u0000\u018a\u018b\u0005"+
		"I\u0000\u0000\u018b\u018c\u00038\u001c\u0000\u018c\u019a\u0006\f\uffff"+
		"\uffff\u0000\u018d\u0193\u0005\b\u0000\u0000\u018e\u018f\u0003\u0002\u0001"+
		"\u0000\u018f\u0190\u0006\f\uffff\uffff\u0000\u0190\u0192\u0001\u0000\u0000"+
		"\u0000\u0191\u018e\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000\u0000"+
		"\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000"+
		"\u0000\u0194\u0196\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000"+
		"\u0000\u0196\u019b\u0005\t\u0000\u0000\u0197\u0198\u0003\u0002\u0001\u0000"+
		"\u0198\u0199\u0006\f\uffff\uffff\u0000\u0199\u019b\u0001\u0000\u0000\u0000"+
		"\u019a\u018d\u0001\u0000\u0000\u0000\u019a\u0197\u0001\u0000\u0000\u0000"+
		"\u019b\u019d\u0001\u0000\u0000\u0000\u019c\u0189\u0001\u0000\u0000\u0000"+
		"\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u0019\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0006\r\uffff\uffff\u0000\u019f\u01a0\u0007\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0006\r\uffff\uffff\u0000\u01a1\u01a2\u0006\r\uffff\uffff"+
		"\u0000\u01a2\u01a3\u0005\u0002\u0000\u0000\u01a3\u001b\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a5\u0006\u000e\uffff\uffff\u0000\u01a5\u01a6\u0005/\u0000"+
		"\u0000\u01a6\u01a7\u0006\u000e\uffff\uffff\u0000\u01a7\u01a8\u0003$\u0012"+
		"\u0000\u01a8\u01a9\u0006\u000e\uffff\uffff\u0000\u01a9\u01aa\u0005\u0002"+
		"\u0000\u0000\u01aa\u001d\u0001\u0000\u0000\u0000\u01ab\u01ac\u0006\u000f"+
		"\uffff\uffff\u0000\u01ac\u01ad\u0005\'\u0000\u0000\u01ad\u01ae\u0006\u000f"+
		"\uffff\uffff\u0000\u01ae\u01af\u0003$\u0012\u0000\u01af\u01b0\u0006\u000f"+
		"\uffff\uffff\u0000\u01b0\u01b1\u0005\u0002\u0000\u0000\u01b1\u001f\u0001"+
		"\u0000\u0000\u0000\u01b2\u01bc\u0006\u0010\uffff\uffff\u0000\u01b3\u01b4"+
		"\u00030\u0018\u0000\u01b4\u01b5\u0006\u0010\uffff\uffff\u0000\u01b5\u01bd"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0003*\u0015\u0000\u01b7\u01b8\u0006"+
		"\u0010\uffff\uffff\u0000\u01b8\u01bd\u0001\u0000\u0000\u0000\u01b9\u01ba"+
		"\u00038\u001c\u0000\u01ba\u01bb\u0006\u0010\uffff\uffff\u0000\u01bb\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bc\u01b3\u0001\u0000\u0000\u0000\u01bc\u01b6"+
		"\u0001\u0000\u0000\u0000\u01bc\u01b9\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0001\u0000\u0000\u0000\u01be\u01ca\u0005\u0006\u0000\u0000\u01bf\u01c0"+
		"\u0003$\u0012\u0000\u01c0\u01c7\u0006\u0010\uffff\uffff\u0000\u01c1\u01c2"+
		"\u0005\u0003\u0000\u0000\u01c2\u01c3\u0003$\u0012\u0000\u01c3\u01c4\u0006"+
		"\u0010\uffff\uffff\u0000\u01c4\u01c6\u0001\u0000\u0000\u0000\u01c5\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c9\u0001\u0000\u0000\u0000\u01c7\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01cb"+
		"\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca\u01bf"+
		"\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005\u0007\u0000\u0000\u01cd!\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\u0006\u0011\uffff\uffff\u0000\u01cf\u01d0"+
		"\u00038\u001c\u0000\u01d0\u01d6\u0006\u0011\uffff\uffff\u0000\u01d1\u01d2"+
		"\u0005\n\u0000\u0000\u01d2\u01d3\u0003$\u0012\u0000\u01d3\u01d4\u0006"+
		"\u0011\uffff\uffff\u0000\u01d4\u01d5\u0005\u000b\u0000\u0000\u01d5\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d1\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0005\u0005\u0000\u0000\u01d9\u01da\u00034\u001a\u0000\u01da\u01db\u0006"+
		"\u0011\uffff\uffff\u0000\u01db\u01e7\u0005\u0006\u0000\u0000\u01dc\u01dd"+
		"\u0003$\u0012\u0000\u01dd\u01e4\u0006\u0011\uffff\uffff\u0000\u01de\u01df"+
		"\u0005\u0003\u0000\u0000\u01df\u01e0\u0003$\u0012\u0000\u01e0\u01e1\u0006"+
		"\u0011\uffff\uffff\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000\u01e2\u01de"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01dc"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005\u0007\u0000\u0000\u01ea#\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ec\u0006\u0012\uffff\uffff\u0000\u01ec\u01ed"+
		"\u0003&\u0013\u0000\u01ed\u01ee\u0006\u0012\uffff\uffff\u0000\u01ee\u0215"+
		"\u0001\u0000\u0000\u0000\u01ef\u01fa\u0006\u0012\uffff\uffff\u0000\u01f0"+
		"\u01f1\u0005\u0013\u0000\u0000\u01f1\u01fb\u0006\u0012\uffff\uffff\u0000"+
		"\u01f2\u01f3\u0005\r\u0000\u0000\u01f3\u01fb\u0006\u0012\uffff\uffff\u0000"+
		"\u01f4\u01f5\u0005\u0019\u0000\u0000\u01f5\u01fb\u0006\u0012\uffff\uffff"+
		"\u0000\u01f6\u01f7\u0005\u001e\u0000\u0000\u01f7\u01fb\u0006\u0012\uffff"+
		"\uffff\u0000\u01f8\u01f9\u0005\u001f\u0000\u0000\u01f9\u01fb\u0006\u0012"+
		"\uffff\uffff\u0000\u01fa\u01f0\u0001\u0000\u0000\u0000\u01fa\u01f2\u0001"+
		"\u0000\u0000\u0000\u01fa\u01f4\u0001\u0000\u0000\u0000\u01fa\u01f6\u0001"+
		"\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fd\u0003$\u0012\u000e\u01fd\u01fe\u0006\u0012"+
		"\uffff\uffff\u0000\u01fe\u0215\u0001\u0000\u0000\u0000\u01ff\u0200\u0005"+
		"P\u0000\u0000\u0200\u0201\u0005\n\u0000\u0000\u0201\u0202\u0003$\u0012"+
		"\u0000\u0202\u0203\u0005\u000b\u0000\u0000\u0203\u0204\u0001\u0000\u0000"+
		"\u0000\u0204\u0205\u0006\u0012\uffff\uffff\u0000\u0205\u0206\u0006\u0012"+
		"\uffff\uffff\u0000\u0206\u0215\u0001\u0000\u0000\u0000\u0207\u0208\u0005"+
		"P\u0000\u0000\u0208\u0215\u0006\u0012\uffff\uffff\u0000\u0209\u020a\u0005"+
		"\u0006\u0000\u0000\u020a\u020b\u0003$\u0012\u0000\u020b\u020c\u0005\u0007"+
		"\u0000\u0000\u020c\u020d\u0006\u0012\uffff\uffff\u0000\u020d\u0215\u0001"+
		"\u0000\u0000\u0000\u020e\u020f\u0003 \u0010\u0000\u020f\u0210\u0006\u0012"+
		"\uffff\uffff\u0000\u0210\u0215\u0001\u0000\u0000\u0000\u0211\u0212\u0003"+
		"\"\u0011\u0000\u0212\u0213\u0006\u0012\uffff\uffff\u0000\u0213\u0215\u0001"+
		"\u0000\u0000\u0000\u0214\u01eb\u0001\u0000\u0000\u0000\u0214\u01ef\u0001"+
		"\u0000\u0000\u0000\u0214\u01ff\u0001\u0000\u0000\u0000\u0214\u0207\u0001"+
		"\u0000\u0000\u0000\u0214\u0209\u0001\u0000\u0000\u0000\u0214\u020e\u0001"+
		"\u0000\u0000\u0000\u0214\u0211\u0001\u0000\u0000\u0000\u0215\u0276\u0001"+
		"\u0000\u0000\u0000\u0216\u0217\n\r\u0000\u0000\u0217\u021e\u0006\u0012"+
		"\uffff\uffff\u0000\u0218\u0219\u0005\u000e\u0000\u0000\u0219\u021f\u0006"+
		"\u0012\uffff\uffff\u0000\u021a\u021b\u0005\u000f\u0000\u0000\u021b\u021f"+
		"\u0006\u0012\uffff\uffff\u0000\u021c\u021d\u0005\u0010\u0000\u0000\u021d"+
		"\u021f\u0006\u0012\uffff\uffff\u0000\u021e\u0218\u0001\u0000\u0000\u0000"+
		"\u021e\u021a\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000"+
		"\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0003$\u0012\u000e\u0221"+
		"\u0222\u0006\u0012\uffff\uffff\u0000\u0222\u0275\u0001\u0000\u0000\u0000"+
		"\u0223\u0224\n\f\u0000\u0000\u0224\u0229\u0006\u0012\uffff\uffff\u0000"+
		"\u0225\u0226\u0005\f\u0000\u0000\u0226\u022a\u0006\u0012\uffff\uffff\u0000"+
		"\u0227\u0228\u0005\r\u0000\u0000\u0228\u022a\u0006\u0012\uffff\uffff\u0000"+
		"\u0229\u0225\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000"+
		"\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022c\u0003$\u0012\r\u022c"+
		"\u022d\u0006\u0012\uffff\uffff\u0000\u022d\u0275\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\n\u000b\u0000\u0000\u022f\u0234\u0006\u0012\uffff\uffff\u0000"+
		"\u0230\u0231\u0005\u0017\u0000\u0000\u0231\u0235\u0006\u0012\uffff\uffff"+
		"\u0000\u0232\u0233\u0005\u0018\u0000\u0000\u0233\u0235\u0006\u0012\uffff"+
		"\uffff\u0000\u0234\u0230\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000"+
		"\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0237\u0003$\u0012"+
		"\f\u0237\u0238\u0006\u0012\uffff\uffff\u0000\u0238\u0275\u0001\u0000\u0000"+
		"\u0000\u0239\u023a\n\n\u0000\u0000\u023a\u023f\u0006\u0012\uffff\uffff"+
		"\u0000\u023b\u023c\u0005\u001a\u0000\u0000\u023c\u0240\u0006\u0012\uffff"+
		"\uffff\u0000\u023d\u023e\u0005\u001b\u0000\u0000\u023e\u0240\u0006\u0012"+
		"\uffff\uffff\u0000\u023f\u023b\u0001\u0000\u0000\u0000\u023f\u023d\u0001"+
		"\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u0242\u0003"+
		"$\u0012\u000b\u0242\u0243\u0006\u0012\uffff\uffff\u0000\u0243\u0275\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\n\t\u0000\u0000\u0245\u024a\u0006\u0012"+
		"\uffff\uffff\u0000\u0246\u0247\u0005\u001c\u0000\u0000\u0247\u024b\u0006"+
		"\u0012\uffff\uffff\u0000\u0248\u0249\u0005\u001d\u0000\u0000\u0249\u024b"+
		"\u0006\u0012\uffff\uffff\u0000\u024a\u0246\u0001\u0000\u0000\u0000\u024a"+
		"\u0248\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c"+
		"\u024d\u0003$\u0012\n\u024d\u024e\u0006\u0012\uffff\uffff\u0000\u024e"+
		"\u0275\u0001\u0000\u0000\u0000\u024f\u0250\n\b\u0000\u0000\u0250\u0257"+
		"\u0006\u0012\uffff\uffff\u0000\u0251\u0252\u0005\u0014\u0000\u0000\u0252"+
		"\u0258\u0006\u0012\uffff\uffff\u0000\u0253\u0254\u0005\u0015\u0000\u0000"+
		"\u0254\u0258\u0006\u0012\uffff\uffff\u0000\u0255\u0256\u0005\u0016\u0000"+
		"\u0000\u0256\u0258\u0006\u0012\uffff\uffff\u0000\u0257\u0251\u0001\u0000"+
		"\u0000\u0000\u0257\u0253\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000"+
		"\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0003$\u0012"+
		"\t\u025a\u025b\u0006\u0012\uffff\uffff\u0000\u025b\u0275\u0001\u0000\u0000"+
		"\u0000\u025c\u025d\n\u0007\u0000\u0000\u025d\u025e\u0005\u0011\u0000\u0000"+
		"\u025e\u025f\u0003$\u0012\b\u025f\u0260\u0006\u0012\uffff\uffff\u0000"+
		"\u0260\u0275\u0001\u0000\u0000\u0000\u0261\u0262\n\u0006\u0000\u0000\u0262"+
		"\u0263\u0005\u0012\u0000\u0000\u0263\u0264\u0003$\u0012\u0007\u0264\u0265"+
		"\u0006\u0012\uffff\uffff\u0000\u0265\u0275\u0001\u0000\u0000\u0000\u0266"+
		"\u0267\n\u0010\u0000\u0000\u0267\u0268\u0005\u0005\u0000\u0000\u0268\u0269"+
		"\u00032\u0019\u0000\u0269\u026a\u0006\u0012\uffff\uffff\u0000\u026a\u0275"+
		"\u0001\u0000\u0000\u0000\u026b\u026c\n\u000f\u0000\u0000\u026c\u0271\u0006"+
		"\u0012\uffff\uffff\u0000\u026d\u026e\u0005\u001e\u0000\u0000\u026e\u0272"+
		"\u0006\u0012\uffff\uffff\u0000\u026f\u0270\u0005\u001f\u0000\u0000\u0270"+
		"\u0272\u0006\u0012\uffff\uffff\u0000\u0271\u026d\u0001\u0000\u0000\u0000"+
		"\u0271\u026f\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000"+
		"\u0273\u0275\u0006\u0012\uffff\uffff\u0000\u0274\u0216\u0001\u0000\u0000"+
		"\u0000\u0274\u0223\u0001\u0000\u0000\u0000\u0274\u022e\u0001\u0000\u0000"+
		"\u0000\u0274\u0239\u0001\u0000\u0000\u0000\u0274\u0244\u0001\u0000\u0000"+
		"\u0000\u0274\u024f\u0001\u0000\u0000\u0000\u0274\u025c\u0001\u0000\u0000"+
		"\u0000\u0274\u0261\u0001\u0000\u0000\u0000\u0274\u0266\u0001\u0000\u0000"+
		"\u0000\u0274\u026b\u0001\u0000\u0000\u0000\u0275\u0278\u0001\u0000\u0000"+
		"\u0000\u0276\u0274\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000"+
		"\u0000\u0277%\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000\u0000\u0000"+
		"\u0279\u027a\u0005Q\u0000\u0000\u027a\u0284\u0006\u0013\uffff\uffff\u0000"+
		"\u027b\u027c\u0005R\u0000\u0000\u027c\u0284\u0006\u0013\uffff\uffff\u0000"+
		"\u027d\u027e\u0005S\u0000\u0000\u027e\u0284\u0006\u0013\uffff\uffff\u0000"+
		"\u027f\u0280\u0005:\u0000\u0000\u0280\u0284\u0006\u0013\uffff\uffff\u0000"+
		"\u0281\u0282\u00059\u0000\u0000\u0282\u0284\u0006\u0013\uffff\uffff\u0000"+
		"\u0283\u0279\u0001\u0000\u0000\u0000\u0283\u027b\u0001\u0000\u0000\u0000"+
		"\u0283\u027d\u0001\u0000\u0000\u0000\u0283\u027f\u0001\u0000\u0000\u0000"+
		"\u0283\u0281\u0001\u0000\u0000\u0000\u0284\'\u0001\u0000\u0000\u0000\u0285"+
		"\u0286\u00053\u0000\u0000\u0286\u0292\u0006\u0014\uffff\uffff\u0000\u0287"+
		"\u0288\u00054\u0000\u0000\u0288\u0292\u0006\u0014\uffff\uffff\u0000\u0289"+
		"\u028a\u00058\u0000\u0000\u028a\u0292\u0006\u0014\uffff\uffff\u0000\u028b"+
		"\u028c\u00056\u0000\u0000\u028c\u0292\u0006\u0014\uffff\uffff\u0000\u028d"+
		"\u028e\u00055\u0000\u0000\u028e\u0292\u0006\u0014\uffff\uffff\u0000\u028f"+
		"\u0290\u00057\u0000\u0000\u0290\u0292\u0006\u0014\uffff\uffff\u0000\u0291"+
		"\u0285\u0001\u0000\u0000\u0000\u0291\u0287\u0001\u0000\u0000\u0000\u0291"+
		"\u0289\u0001\u0000\u0000\u0000\u0291\u028b\u0001\u0000\u0000\u0000\u0291"+
		"\u028d\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292"+
		")\u0001\u0000\u0000\u0000\u0293\u0294\u0007\u0001\u0000\u0000\u0294\u0295"+
		"\u0006\u0015\uffff\uffff\u0000\u0295+\u0001\u0000\u0000\u0000\u0296\u0297"+
		"\u0005G\u0000\u0000\u0297\u029f\u0006\u0016\uffff\uffff\u0000\u0298\u0299"+
		"\u0005F\u0000\u0000\u0299\u029f\u0006\u0016\uffff\uffff\u0000\u029a\u029b"+
		"\u0005H\u0000\u0000\u029b\u029f\u0006\u0016\uffff\uffff\u0000\u029c\u029d"+
		"\u0005I\u0000\u0000\u029d\u029f\u0006\u0016\uffff\uffff\u0000\u029e\u0296"+
		"\u0001\u0000\u0000\u0000\u029e\u0298\u0001\u0000\u0000\u0000\u029e\u029a"+
		"\u0001\u0000\u0000\u0000\u029e\u029c\u0001\u0000\u0000\u0000\u029f-\u0001"+
		"\u0000\u0000\u0000\u02a0\u02a1\u0003(\u0014\u0000\u02a1\u02a2\u0006\u0017"+
		"\uffff\uffff\u0000\u02a2\u02a7\u0001\u0000\u0000\u0000\u02a3\u02a4\u0003"+
		",\u0016\u0000\u02a4\u02a5\u0006\u0017\uffff\uffff\u0000\u02a5\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a6\u02a0\u0001\u0000\u0000\u0000\u02a6\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a7/\u0001\u0000\u0000\u0000\u02a8\u02a9\u0007\u0002"+
		"\u0000\u0000\u02a9\u02aa\u0006\u0018\uffff\uffff\u0000\u02aa1\u0001\u0000"+
		"\u0000\u0000\u02ab\u02ac\u0007\u0003\u0000\u0000\u02ac\u02ad\u0006\u0019"+
		"\uffff\uffff\u0000\u02ad3\u0001\u0000\u0000\u0000\u02ae\u02af\u0007\u0004"+
		"\u0000\u0000\u02af\u02b0\u0006\u001a\uffff\uffff\u0000\u02b05\u0001\u0000"+
		"\u0000\u0000\u02b1\u02b2\u0007\u0005\u0000\u0000\u02b27\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b4\u0005P\u0000\u0000\u02b4\u02b5\u0006\u001c\uffff\uffff"+
		"\u0000\u02b59\u0001\u0000\u0000\u0000:HJs|\u0084\u008a\u0093\u009b\u00a1"+
		"\u00b1\u00b4\u00b9\u00c1\u00c8\u00d6\u00dd\u00e9\u00f1\u00f8\u0104\u010c"+
		"\u0113\u0129\u0130\u0139\u0140\u0142\u0150\u0157\u0165\u016e\u0175\u0180"+
		"\u0187\u0193\u019a\u019c\u01bc\u01c7\u01ca\u01d6\u01e4\u01e7\u01fa\u0214"+
		"\u021e\u0229\u0234\u023f\u024a\u0257\u0271\u0274\u0276\u0283\u0291\u029e"+
		"\u02a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}