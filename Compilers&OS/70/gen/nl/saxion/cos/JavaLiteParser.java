// Generated from C:/Users/victo/OneDrive/Bureaublad/Compilers & OS/70/src\JavaLite.g4 by ANTLR 4.8
package nl.saxion.cos;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, MULTI=3, NOTOP=4, LOGIC_OP=5, EQUALS=6, COMPARATOR=7, 
		PAREN_OPEN=8, PAREN_CLOSE=9, CURLY_OPEN=10, CURLY_CLOSE=11, COMMA=12, 
		DOUBLE_QUOTE=13, TYPE=14, INT=15, BOOL=16, STRING=17, TRUE=18, FALSE=19, 
		LOOP=20, RETURN=21, IF=22, ELSE=23, PRINT=24, INPUT=25, ID=26, NUM=27, 
		LITERALTEXT=28, COMMENT=29, WS=30, OTHER=31;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_loop = 2, RULE_functionDeclaration = 3, 
		RULE_declareParameters = 4, RULE_declareParameter = 5, RULE_returnStatement = 6, 
		RULE_printStatement = 7, RULE_functionCall = 8, RULE_callParameters = 9, 
		RULE_declaration = 10, RULE_ifStatement = 11, RULE_elseStatement = 12, 
		RULE_booleanStatements = 13, RULE_booleanStatement = 14, RULE_value = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "loop", "functionDeclaration", "declareParameters", 
			"declareParameter", "returnStatement", "printStatement", "functionCall", 
			"callParameters", "declaration", "ifStatement", "elseStatement", "booleanStatements", 
			"booleanStatement", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'!'", null, "'='", null, "'('", "')'", "'{'", 
			"'}'", "','", "'\"'", null, "'int'", "'boolean'", "'string'", "'true'", 
			"'false'", "'loop'", "'return'", "'if'", "'else'", "'print'", "'input'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "MULTI", "NOTOP", "LOGIC_OP", "EQUALS", "COMPARATOR", 
			"PAREN_OPEN", "PAREN_CLOSE", "CURLY_OPEN", "CURLY_CLOSE", "COMMA", "DOUBLE_QUOTE", 
			"TYPE", "INT", "BOOL", "STRING", "TRUE", "FALSE", "LOOP", "RETURN", "IF", 
			"ELSE", "PRINT", "INPUT", "ID", "NUM", "LITERALTEXT", "COMMENT", "WS", 
			"OTHER"
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
	public String getGrammarFileName() { return "JavaLite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(34);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(32);
					statement();
					}
					break;
				case 2:
					{
					setState(33);
					functionDeclaration();
					}
					break;
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << LOOP) | (1L << IF) | (1L << PRINT) | (1L << INPUT) | (1L << ID))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				printStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				loop();
				}
				break;
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(JavaLiteParser.LOOP, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(JavaLiteParser.PAREN_OPEN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(JavaLiteParser.PAREN_CLOSE, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(JavaLiteParser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(JavaLiteParser.CURLY_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(LOOP);
			setState(46);
			match(PAREN_OPEN);
			setState(47);
			value(0);
			setState(48);
			match(PAREN_CLOSE);
			setState(49);
			match(CURLY_OPEN);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << LOOP) | (1L << IF) | (1L << PRINT) | (1L << INPUT) | (1L << ID))) != 0)) {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(CURLY_CLOSE);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaLiteParser.ID, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(JavaLiteParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(JavaLiteParser.PAREN_CLOSE, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(JavaLiteParser.CURLY_OPEN, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(JavaLiteParser.CURLY_CLOSE, 0); }
		public DeclareParametersContext declareParameters() {
			return getRuleContext(DeclareParametersContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ID);
			setState(59);
			match(PAREN_OPEN);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(60);
				declareParameters();
				}
			}

			setState(63);
			match(PAREN_CLOSE);
			setState(64);
			match(CURLY_OPEN);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << LOOP) | (1L << IF) | (1L << PRINT) | (1L << INPUT) | (1L << ID))) != 0)) {
				{
				{
				setState(65);
				statement();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			returnStatement();
			setState(72);
			match(CURLY_CLOSE);
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

	public static class DeclareParametersContext extends ParserRuleContext {
		public List<DeclareParameterContext> declareParameter() {
			return getRuleContexts(DeclareParameterContext.class);
		}
		public DeclareParameterContext declareParameter(int i) {
			return getRuleContext(DeclareParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLiteParser.COMMA, i);
		}
		public DeclareParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterDeclareParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitDeclareParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitDeclareParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareParametersContext declareParameters() throws RecognitionException {
		DeclareParametersContext _localctx = new DeclareParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declareParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			declareParameter();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75);
				match(COMMA);
				setState(76);
				declareParameter();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DeclareParameterContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(JavaLiteParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(JavaLiteParser.ID, 0); }
		public DeclareParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterDeclareParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitDeclareParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitDeclareParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareParameterContext declareParameter() throws RecognitionException {
		DeclareParameterContext _localctx = new DeclareParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declareParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(TYPE);
			setState(83);
			match(ID);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaLiteParser.RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(RETURN);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << INPUT) | (1L << ID) | (1L << NUM) | (1L << LITERALTEXT))) != 0)) {
				{
				setState(86);
				value(0);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	 
		public PrintStatementContext() { }
		public void copyFrom(PrintStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintCallContext extends PrintStatementContext {
		public TerminalNode PRINT() { return getToken(JavaLiteParser.PRINT, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(JavaLiteParser.PAREN_OPEN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(JavaLiteParser.PAREN_CLOSE, 0); }
		public PrintCallContext(PrintStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterPrintCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitPrintCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitPrintCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printStatement);
		try {
			_localctx = new PrintCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(PRINT);
			setState(90);
			match(PAREN_OPEN);
			setState(91);
			value(0);
			setState(92);
			match(PAREN_CLOSE);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CustomFunctionCallContext extends FunctionCallContext {
		public TerminalNode ID() { return getToken(JavaLiteParser.ID, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(JavaLiteParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(JavaLiteParser.PAREN_CLOSE, 0); }
		public CallParametersContext callParameters() {
			return getRuleContext(CallParametersContext.class,0);
		}
		public CustomFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterCustomFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitCustomFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitCustomFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScannerCallContext extends FunctionCallContext {
		public TerminalNode INPUT() { return getToken(JavaLiteParser.INPUT, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(JavaLiteParser.PAREN_OPEN, 0); }
		public TerminalNode TYPE() { return getToken(JavaLiteParser.TYPE, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(JavaLiteParser.PAREN_CLOSE, 0); }
		public ScannerCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterScannerCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitScannerCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitScannerCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				_localctx = new ScannerCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(INPUT);
				setState(95);
				match(PAREN_OPEN);
				setState(96);
				match(TYPE);
				setState(97);
				match(PAREN_CLOSE);
				}
				break;
			case ID:
				_localctx = new CustomFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(ID);
				setState(99);
				match(PAREN_OPEN);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << INPUT) | (1L << ID) | (1L << NUM) | (1L << LITERALTEXT))) != 0)) {
					{
					setState(100);
					callParameters();
					}
				}

				setState(103);
				match(PAREN_CLOSE);
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

	public static class CallParametersContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaLiteParser.COMMA, i);
		}
		public CallParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterCallParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitCallParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitCallParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParametersContext callParameters() throws RecognitionException {
		CallParametersContext _localctx = new CallParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_callParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			value(0);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(107);
				match(COMMA);
				setState(108);
				value(0);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaLiteParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(JavaLiteParser.EQUALS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(JavaLiteParser.TYPE, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(114);
				match(TYPE);
				}
			}

			setState(117);
			match(ID);
			setState(118);
			match(EQUALS);
			setState(119);
			value(0);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaLiteParser.IF, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(JavaLiteParser.PAREN_OPEN, 0); }
		public BooleanStatementsContext booleanStatements() {
			return getRuleContext(BooleanStatementsContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(JavaLiteParser.PAREN_CLOSE, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(JavaLiteParser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(JavaLiteParser.CURLY_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(IF);
			setState(122);
			match(PAREN_OPEN);
			setState(123);
			booleanStatements();
			setState(124);
			match(PAREN_CLOSE);
			setState(125);
			match(CURLY_OPEN);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << LOOP) | (1L << IF) | (1L << PRINT) | (1L << INPUT) | (1L << ID))) != 0)) {
				{
				{
				setState(126);
				statement();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(CURLY_CLOSE);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(133);
				elseStatement();
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(JavaLiteParser.ELSE, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(JavaLiteParser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(JavaLiteParser.CURLY_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elseStatement);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(ELSE);
				setState(137);
				match(CURLY_OPEN);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << LOOP) | (1L << IF) | (1L << PRINT) | (1L << INPUT) | (1L << ID))) != 0)) {
					{
					{
					setState(138);
					statement();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(CURLY_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(ELSE);
				setState(146);
				ifStatement();
				}
				break;
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

	public static class BooleanStatementsContext extends ParserRuleContext {
		public BooleanStatementContext left;
		public Token log_op;
		public BooleanStatementContext right;
		public List<BooleanStatementContext> booleanStatement() {
			return getRuleContexts(BooleanStatementContext.class);
		}
		public BooleanStatementContext booleanStatement(int i) {
			return getRuleContext(BooleanStatementContext.class,i);
		}
		public TerminalNode LOGIC_OP() { return getToken(JavaLiteParser.LOGIC_OP, 0); }
		public BooleanStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterBooleanStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitBooleanStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitBooleanStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanStatementsContext booleanStatements() throws RecognitionException {
		BooleanStatementsContext _localctx = new BooleanStatementsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			((BooleanStatementsContext)_localctx).left = booleanStatement();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOGIC_OP) {
				{
				setState(150);
				((BooleanStatementsContext)_localctx).log_op = match(LOGIC_OP);
				setState(151);
				((BooleanStatementsContext)_localctx).right = booleanStatement();
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

	public static class BooleanStatementContext extends ParserRuleContext {
		public BooleanStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanStatement; }
	 
		public BooleanStatementContext() { }
		public void copyFrom(BooleanStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonContext extends BooleanStatementContext {
		public ValueContext left;
		public ValueContext right;
		public TerminalNode COMPARATOR() { return getToken(JavaLiteParser.COMPARATOR, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ComparisonContext(BooleanStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanValueContext extends BooleanStatementContext {
		public TerminalNode TRUE() { return getToken(JavaLiteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JavaLiteParser.FALSE, 0); }
		public TerminalNode NOTOP() { return getToken(JavaLiteParser.NOTOP, 0); }
		public BooleanValueContext(BooleanStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDBooleanContext extends BooleanStatementContext {
		public TerminalNode ID() { return getToken(JavaLiteParser.ID, 0); }
		public TerminalNode NOTOP() { return getToken(JavaLiteParser.NOTOP, 0); }
		public IDBooleanContext(BooleanStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterIDBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitIDBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitIDBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanStatementContext booleanStatement() throws RecognitionException {
		BooleanStatementContext _localctx = new BooleanStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_booleanStatement);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				((ComparisonContext)_localctx).left = value(0);
				setState(155);
				match(COMPARATOR);
				setState(156);
				((ComparisonContext)_localctx).right = value(0);
				}
				break;
			case 2:
				_localctx = new IDBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOTOP) {
					{
					setState(158);
					match(NOTOP);
					}
				}

				setState(161);
				match(ID);
				}
				break;
			case 3:
				_localctx = new BooleanValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOTOP) {
					{
					setState(162);
					match(NOTOP);
					}
				}

				setState(165);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralContext extends ValueContext {
		public TerminalNode LITERALTEXT() { return getToken(JavaLiteParser.LITERALTEXT, 0); }
		public StringLiteralContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolLiteralContext extends ValueContext {
		public TerminalNode TRUE() { return getToken(JavaLiteParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JavaLiteParser.FALSE, 0); }
		public BoolLiteralContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyExprContext extends ValueContext {
		public ValueContext left;
		public ValueContext right;
		public TerminalNode MULTI() { return getToken(JavaLiteParser.MULTI, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public MultiplyExprContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterMultiplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitMultiplyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitMultiplyExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDLiteralContext extends ValueContext {
		public TerminalNode ID() { return getToken(JavaLiteParser.ID, 0); }
		public IDLiteralContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterIDLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitIDLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitIDLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionValueContext extends ValueContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterFunctionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitFunctionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitFunctionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralContext extends ValueContext {
		public TerminalNode NUM() { return getToken(JavaLiteParser.NUM, 0); }
		public IntLiteralContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ValueContext {
		public ValueContext left;
		public Token op;
		public ValueContext right;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(JavaLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JavaLiteParser.MINUS, 0); }
		public AddExprContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaLiteListener ) ((JavaLiteListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaLiteVisitor ) return ((JavaLiteVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		return value(0);
	}

	private ValueContext value(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueContext _localctx = new ValueContext(_ctx, _parentState);
		ValueContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_value, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(169);
				match(NUM);
				}
				break;
			case 2:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(LITERALTEXT);
				}
				break;
			case 3:
				{
				_localctx = new BoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				{
				_localctx = new FunctionValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				functionCall();
				}
				break;
			case 5:
				{
				_localctx = new IDLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExprContext(new ValueContext(_parentctx, _parentState));
						((MultiplyExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(176);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(177);
						match(MULTI);
						setState(178);
						((MultiplyExprContext)_localctx).right = value(8);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ValueContext(_parentctx, _parentState));
						((AddExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_value);
						setState(179);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(180);
						((AddExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(181);
						((AddExprContext)_localctx).right = value(7);
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return value_sempred((ValueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean value_sempred(ValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\6"+
		"\2%\n\2\r\2\16\2&\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4\66\n\4\f\4\16\49\13\4\3\4\3\4\3\5\3\5\3\5\5\5@\n\5\3\5\3\5\3\5\7"+
		"\5E\n\5\f\5\16\5H\13\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6"+
		"\3\7\3\7\3\7\3\b\3\b\5\bZ\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\nh\n\n\3\n\5\nk\n\n\3\13\3\13\3\13\7\13p\n\13\f\13\16\13s\13"+
		"\13\3\f\5\fv\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0082\n\r"+
		"\f\r\16\r\u0085\13\r\3\r\3\r\5\r\u0089\n\r\3\16\3\16\3\16\7\16\u008e\n"+
		"\16\f\16\16\16\u0091\13\16\3\16\3\16\3\16\5\16\u0096\n\16\3\17\3\17\3"+
		"\17\5\17\u009b\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00a2\n\20\3\20\3\20"+
		"\5\20\u00a6\n\20\3\20\5\20\u00a9\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u00b1\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00b9\n\21\f\21\16\21"+
		"\u00bc\13\21\3\21\2\3 \22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4"+
		"\3\2\24\25\3\2\3\4\2\u00cb\2$\3\2\2\2\4-\3\2\2\2\6/\3\2\2\2\b<\3\2\2\2"+
		"\nL\3\2\2\2\fT\3\2\2\2\16W\3\2\2\2\20[\3\2\2\2\22j\3\2\2\2\24l\3\2\2\2"+
		"\26u\3\2\2\2\30{\3\2\2\2\32\u0095\3\2\2\2\34\u0097\3\2\2\2\36\u00a8\3"+
		"\2\2\2 \u00b0\3\2\2\2\"%\5\4\3\2#%\5\b\5\2$\"\3\2\2\2$#\3\2\2\2%&\3\2"+
		"\2\2&$\3\2\2\2&\'\3\2\2\2\'\3\3\2\2\2(.\5\30\r\2).\5\20\t\2*.\5\26\f\2"+
		"+.\5\22\n\2,.\5\6\4\2-(\3\2\2\2-)\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2"+
		"\2.\5\3\2\2\2/\60\7\26\2\2\60\61\7\n\2\2\61\62\5 \21\2\62\63\7\13\2\2"+
		"\63\67\7\f\2\2\64\66\5\4\3\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\67"+
		"8\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\r\2\2;\7\3\2\2\2<=\7\34\2\2=?\7\n"+
		"\2\2>@\5\n\6\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\13\2\2BF\7\f\2\2CE\5"+
		"\4\3\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\5"+
		"\16\b\2JK\7\r\2\2K\t\3\2\2\2LQ\5\f\7\2MN\7\16\2\2NP\5\f\7\2OM\3\2\2\2"+
		"PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\13\3\2\2\2SQ\3\2\2\2TU\7\20\2\2UV\7\34"+
		"\2\2V\r\3\2\2\2WY\7\27\2\2XZ\5 \21\2YX\3\2\2\2YZ\3\2\2\2Z\17\3\2\2\2["+
		"\\\7\32\2\2\\]\7\n\2\2]^\5 \21\2^_\7\13\2\2_\21\3\2\2\2`a\7\33\2\2ab\7"+
		"\n\2\2bc\7\20\2\2ck\7\13\2\2de\7\34\2\2eg\7\n\2\2fh\5\24\13\2gf\3\2\2"+
		"\2gh\3\2\2\2hi\3\2\2\2ik\7\13\2\2j`\3\2\2\2jd\3\2\2\2k\23\3\2\2\2lq\5"+
		" \21\2mn\7\16\2\2np\5 \21\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\25"+
		"\3\2\2\2sq\3\2\2\2tv\7\20\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\34\2\2"+
		"xy\7\b\2\2yz\5 \21\2z\27\3\2\2\2{|\7\30\2\2|}\7\n\2\2}~\5\34\17\2~\177"+
		"\7\13\2\2\177\u0083\7\f\2\2\u0080\u0082\5\4\3\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0086\u0088\7\r\2\2\u0087\u0089\5\32\16\2\u0088"+
		"\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\31\3\2\2\2\u008a\u008b\7\31\2"+
		"\2\u008b\u008f\7\f\2\2\u008c\u008e\5\4\3\2\u008d\u008c\3\2\2\2\u008e\u0091"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0096\7\r\2\2\u0093\u0094\7\31\2\2\u0094\u0096\5"+
		"\30\r\2\u0095\u008a\3\2\2\2\u0095\u0093\3\2\2\2\u0096\33\3\2\2\2\u0097"+
		"\u009a\5\36\20\2\u0098\u0099\7\7\2\2\u0099\u009b\5\36\20\2\u009a\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\35\3\2\2\2\u009c\u009d\5 \21\2\u009d"+
		"\u009e\7\t\2\2\u009e\u009f\5 \21\2\u009f\u00a9\3\2\2\2\u00a0\u00a2\7\6"+
		"\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a9\7\34\2\2\u00a4\u00a6\7\6\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\t\2\2\2\u00a8\u009c\3\2\2\2\u00a8"+
		"\u00a1\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a9\37\3\2\2\2\u00aa\u00ab\b\21\1"+
		"\2\u00ab\u00b1\7\35\2\2\u00ac\u00b1\7\36\2\2\u00ad\u00b1\t\2\2\2\u00ae"+
		"\u00b1\5\22\n\2\u00af\u00b1\7\34\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ac\3"+
		"\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00ba\3\2\2\2\u00b2\u00b3\f\t\2\2\u00b3\u00b4\7\5\2\2\u00b4\u00b9\5 "+
		"\21\n\u00b5\u00b6\f\b\2\2\u00b6\u00b7\t\3\2\2\u00b7\u00b9\5 \21\t\u00b8"+
		"\u00b2\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb!\3\2\2\2\u00bc\u00ba\3\2\2\2\31$&-\67?"+
		"FQYgjqu\u0083\u0088\u008f\u0095\u009a\u00a1\u00a5\u00a8\u00b0\u00b8\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}