// Generated from /home/rafael/workspace/Compiladores/Compiler2IDE/src/grammar/simpleJava.g4 by ANTLR 4.1

   package grammar;
   import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleJavaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TCLASS=1, TVAR=2, TMAIN=3, TRETURN=4, TPRINT=5, TREAD=6, TIF=7, TELSE=8, 
		TFOR=9, TSTEP=10, TWHILE=11, TEXIT=12, TINT=13, TFLOAT=14, TSTR=15, TBOOL=16, 
		COMMA=17, COLON=18, SCOLON=19, EQUALS=20, OB=21, CB=22, OCB=23, CCB=24, 
		BO=25, NOT=26, ADD=27, SUB=28, MUT=29, DIV=30, STR=31, BOOL=32, ID=33, 
		INT=34, FLOAT=35, WS=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'class'", "'var'", "'main'", "'return'", "'print'", "'read'", 
		"'if'", "'else'", "'for'", "'step'", "'while'", "'exit'", "'int'", "'float'", 
		"'string'", "'boolean'", "','", "':'", "';'", "'='", "'('", "')'", "'{'", 
		"'}'", "BO", "'!'", "'+'", "'-'", "'*'", "'/'", "STR", "BOOL", "ID", "INT", 
		"FLOAT", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_declConst = 1, RULE_inicVal = 2, RULE_tipo = 3, RULE_declVars = 4, 
		RULE_declFuncoes = 5, RULE_params = 6, RULE_declReturn = 7, RULE_chamadaFuncoes = 8, 
		RULE_paramCall = 9, RULE_principal = 10, RULE_comandos = 11, RULE_cmdif = 12, 
		RULE_cmdelse = 13, RULE_cmdfor = 14, RULE_cmdwhile = 15, RULE_atribuicao = 16, 
		RULE_inicAttrib = 17, RULE_print = 18, RULE_read = 19, RULE_expr = 20, 
		RULE_expr2 = 21;
	public static final String[] ruleNames = {
		"prog", "declConst", "inicVal", "tipo", "declVars", "declFuncoes", "params", 
		"declReturn", "chamadaFuncoes", "paramCall", "principal", "comandos", 
		"cmdif", "cmdelse", "cmdfor", "cmdwhile", "atribuicao", "inicAttrib", 
		"print", "read", "expr", "expr2"
	};

	@Override
	public String getGrammarFileName() { return "simpleJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	   Map<String, Float> memory = new HashMap<String, Float>();

	public simpleJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<DeclConstContext> declConst() {
			return getRuleContexts(DeclConstContext.class);
		}
		public DeclVarsContext declVars(int i) {
			return getRuleContext(DeclVarsContext.class,i);
		}
		public DeclConstContext declConst(int i) {
			return getRuleContext(DeclConstContext.class,i);
		}
		public TerminalNode ID() { return getToken(simpleJavaParser.ID, 0); }
		public TerminalNode SCOLON() { return getToken(simpleJavaParser.SCOLON, 0); }
		public DeclFuncoesContext declFuncoes(int i) {
			return getRuleContext(DeclFuncoesContext.class,i);
		}
		public List<DeclVarsContext> declVars() {
			return getRuleContexts(DeclVarsContext.class);
		}
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<DeclFuncoesContext> declFuncoes() {
			return getRuleContexts(DeclFuncoesContext.class);
		}
		public TerminalNode TCLASS() { return getToken(simpleJavaParser.TCLASS, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(TCLASS);
			setState(45); match(ID);
			setState(46); match(SCOLON);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TVAR) | (1L << TINT) | (1L << TFLOAT) | (1L << TSTR) | (1L << TBOOL))) != 0)) {
				{
				setState(49);
				switch (_input.LA(1)) {
				case TINT:
				case TFLOAT:
				case TSTR:
				case TBOOL:
					{
					setState(47); declConst();
					}
					break;
				case TVAR:
					{
					setState(48); declVars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(54); declFuncoes();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60); principal();
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

	public static class DeclConstContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(simpleJavaParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(simpleJavaParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(simpleJavaParser.SCOLON, 0); }
		public InicValContext inicVal() {
			return getRuleContext(InicValContext.class,0);
		}
		public DeclConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterDeclConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitDeclConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitDeclConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclConstContext declConst() throws RecognitionException {
		DeclConstContext _localctx = new DeclConstContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); tipo();
			setState(63); match(ID);
			setState(64); match(EQUALS);
			setState(65); inicVal();
			setState(66); match(SCOLON);
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

	public static class InicValContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(simpleJavaParser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(simpleJavaParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(simpleJavaParser.INT, 0); }
		public TerminalNode STR() { return getToken(simpleJavaParser.STR, 0); }
		public InicValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterInicVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitInicVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitInicVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicValContext inicVal() throws RecognitionException {
		InicValContext _localctx = new InicValContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inicVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STR) | (1L << BOOL) | (1L << INT) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TSTR() { return getToken(simpleJavaParser.TSTR, 0); }
		public TerminalNode TFLOAT() { return getToken(simpleJavaParser.TFLOAT, 0); }
		public TerminalNode TINT() { return getToken(simpleJavaParser.TINT, 0); }
		public TerminalNode TBOOL() { return getToken(simpleJavaParser.TBOOL, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TINT) | (1L << TFLOAT) | (1L << TSTR) | (1L << TBOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class DeclVarsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(simpleJavaParser.COMMA); }
		public List<TerminalNode> ID() { return getTokens(simpleJavaParser.ID); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(simpleJavaParser.SCOLON, 0); }
		public TerminalNode TVAR() { return getToken(simpleJavaParser.TVAR, 0); }
		public TerminalNode COLON() { return getToken(simpleJavaParser.COLON, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(simpleJavaParser.COMMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(simpleJavaParser.ID, i);
		}
		public DeclVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterDeclVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitDeclVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitDeclVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclVarsContext declVars() throws RecognitionException {
		DeclVarsContext _localctx = new DeclVarsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(TVAR);
			setState(73); match(ID);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(74); match(COMMA);
				setState(75); match(ID);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81); match(COLON);
			setState(82); tipo();
			setState(83); match(SCOLON);
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

	public static class DeclFuncoesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(simpleJavaParser.ID, 0); }
		public List<DeclVarsContext> declVars() {
			return getRuleContexts(DeclVarsContext.class);
		}
		public TerminalNode OCB() { return getToken(simpleJavaParser.OCB, 0); }
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<DeclConstContext> declConst() {
			return getRuleContexts(DeclConstContext.class);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CCB() { return getToken(simpleJavaParser.CCB, 0); }
		public DeclVarsContext declVars(int i) {
			return getRuleContext(DeclVarsContext.class,i);
		}
		public DeclConstContext declConst(int i) {
			return getRuleContext(DeclConstContext.class,i);
		}
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public TerminalNode CB() { return getToken(simpleJavaParser.CB, 0); }
		public TerminalNode COLON() { return getToken(simpleJavaParser.COLON, 0); }
		public DeclFuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declFuncoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterDeclFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitDeclFuncoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitDeclFuncoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclFuncoesContext declFuncoes() throws RecognitionException {
		DeclFuncoesContext _localctx = new DeclFuncoesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declFuncoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(ID);
			setState(86); match(OB);
			setState(87); params();
			setState(88); match(CB);
			setState(89); match(COLON);
			setState(90); tipo();
			setState(91); match(OCB);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TVAR) | (1L << TINT) | (1L << TFLOAT) | (1L << TSTR) | (1L << TBOOL))) != 0)) {
				{
				setState(94);
				switch (_input.LA(1)) {
				case TINT:
				case TFLOAT:
				case TSTR:
				case TBOOL:
					{
					setState(92); declConst();
					}
					break;
				case TVAR:
					{
					setState(93); declVars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(99); comandos();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105); match(CCB);
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

	public static class ParamsContext extends ParserRuleContext {
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(simpleJavaParser.COMMA); }
		public List<TerminalNode> ID() { return getTokens(simpleJavaParser.ID); }
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(simpleJavaParser.COMMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(simpleJavaParser.ID, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TINT) | (1L << TFLOAT) | (1L << TSTR) | (1L << TBOOL))) != 0)) {
				{
				{
				setState(107); tipo();
				setState(108); match(ID);
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(110); match(COMMA);
					setState(111); tipo();
					setState(112); match(ID);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class DeclReturnContext extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode BOOL() { return getToken(simpleJavaParser.BOOL, 0); }
		public ChamadaFuncoesContext chamadaFuncoes() {
			return getRuleContext(ChamadaFuncoesContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STR() { return getToken(simpleJavaParser.STR, 0); }
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public TerminalNode TRETURN() { return getToken(simpleJavaParser.TRETURN, 0); }
		public TerminalNode CB() { return getToken(simpleJavaParser.CB, 0); }
		public DeclReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterDeclReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitDeclReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitDeclReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclReturnContext declReturn() throws RecognitionException {
		DeclReturnContext _localctx = new DeclReturnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(TRETURN);
			setState(122); match(OB);
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(123); expr(0);
				}
				break;

			case 2:
				{
				setState(124); expr2();
				}
				break;

			case 3:
				{
				setState(125); chamadaFuncoes();
				}
				break;

			case 4:
				{
				setState(126); match(STR);
				}
				break;

			case 5:
				{
				setState(127); match(BOOL);
				}
				break;
			}
			setState(130); match(CB);
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

	public static class ChamadaFuncoesContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(simpleJavaParser.COMMA); }
		public ParamCallContext paramCall(int i) {
			return getRuleContext(ParamCallContext.class,i);
		}
		public TerminalNode ID() { return getToken(simpleJavaParser.ID, 0); }
		public List<ParamCallContext> paramCall() {
			return getRuleContexts(ParamCallContext.class);
		}
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public TerminalNode CB() { return getToken(simpleJavaParser.CB, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(simpleJavaParser.COMMA, i);
		}
		public ChamadaFuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterChamadaFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitChamadaFuncoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitChamadaFuncoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaFuncoesContext chamadaFuncoes() throws RecognitionException {
		ChamadaFuncoesContext _localctx = new ChamadaFuncoesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chamadaFuncoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(ID);
			setState(133); match(OB);
			setState(142);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB) | (1L << NOT) | (1L << SUB) | (1L << STR) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(134); paramCall();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(135); match(COMMA);
					setState(136); paramCall();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(144); match(CB);
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

	public static class ParamCallContext extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode BOOL() { return getToken(simpleJavaParser.BOOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STR() { return getToken(simpleJavaParser.STR, 0); }
		public ParamCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterParamCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitParamCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitParamCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamCallContext paramCall() throws RecognitionException {
		ParamCallContext _localctx = new ParamCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_paramCall);
		int _la;
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				_la = _input.LA(1);
				if ( !(_la==STR || _la==BOOL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); expr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148); expr2();
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

	public static class PrincipalContext extends ParserRuleContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TerminalNode CCB() { return getToken(simpleJavaParser.CCB, 0); }
		public TerminalNode TMAIN() { return getToken(simpleJavaParser.TMAIN, 0); }
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public TerminalNode OCB() { return getToken(simpleJavaParser.OCB, 0); }
		public TerminalNode CB() { return getToken(simpleJavaParser.CB, 0); }
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_principal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(TMAIN);
			setState(152); match(OB);
			setState(153); match(CB);
			setState(154); match(OCB);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(155); comandos();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161); match(CCB);
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

	public static class ComandosContext extends ParserRuleContext {
		public CmdelseContext cmdelse() {
			return getRuleContext(CmdelseContext.class,0);
		}
		public CmdifContext cmdif() {
			return getRuleContext(CmdifContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public CmdwhileContext cmdwhile() {
			return getRuleContext(CmdwhileContext.class,0);
		}
		public ChamadaFuncoesContext chamadaFuncoes() {
			return getRuleContext(ChamadaFuncoesContext.class,0);
		}
		public CmdforContext cmdfor() {
			return getRuleContext(CmdforContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(simpleJavaParser.SCOLON, 0); }
		public DeclReturnContext declReturn() {
			return getRuleContext(DeclReturnContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comandos);
		int _la;
		try {
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163); atribuicao();
				setState(164); match(SCOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166); chamadaFuncoes();
				setState(167); match(SCOLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169); declReturn();
				setState(170); match(SCOLON);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172); print();
				setState(173); match(SCOLON);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175); read();
				setState(176); match(SCOLON);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(178); cmdif();
				setState(180);
				_la = _input.LA(1);
				if (_la==TELSE) {
					{
					setState(179); cmdelse();
					}
				}

				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(182); cmdfor();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(183); cmdwhile();
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

	public static class CmdifContext extends ParserRuleContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode CCB() { return getToken(simpleJavaParser.CCB, 0); }
		public TerminalNode TIF() { return getToken(simpleJavaParser.TIF, 0); }
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public TerminalNode OCB() { return getToken(simpleJavaParser.OCB, 0); }
		public TerminalNode CB() { return getToken(simpleJavaParser.CB, 0); }
		public CmdifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterCmdif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitCmdif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitCmdif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdifContext cmdif() throws RecognitionException {
		CmdifContext _localctx = new CmdifContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(TIF);
			setState(187); match(OB);
			setState(188); expr2();
			setState(189); match(CB);
			setState(190); match(OCB);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(191); comandos();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197); match(CCB);
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

	public static class CmdelseContext extends ParserRuleContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TerminalNode CCB() { return getToken(simpleJavaParser.CCB, 0); }
		public TerminalNode TELSE() { return getToken(simpleJavaParser.TELSE, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public TerminalNode OCB() { return getToken(simpleJavaParser.OCB, 0); }
		public CmdelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterCmdelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitCmdelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitCmdelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdelseContext cmdelse() throws RecognitionException {
		CmdelseContext _localctx = new CmdelseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmdelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(TELSE);
			setState(200); match(OCB);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(201); comandos();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207); match(CCB);
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

	public static class CmdforContext extends ParserRuleContext {
		public TerminalNode TEXIT(int i) {
			return getToken(simpleJavaParser.TEXIT, i);
		}
		public List<TerminalNode> TEXIT() { return getTokens(simpleJavaParser.TEXIT); }
		public List<TerminalNode> INT() { return getTokens(simpleJavaParser.INT); }
		public TerminalNode EQUALS() { return getToken(simpleJavaParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(simpleJavaParser.ID, 0); }
		public TerminalNode INT(int i) {
			return getToken(simpleJavaParser.INT, i);
		}
		public TerminalNode OCB() { return getToken(simpleJavaParser.OCB, 0); }
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TerminalNode TFOR() { return getToken(simpleJavaParser.TFOR, 0); }
		public TerminalNode TSTEP() { return getToken(simpleJavaParser.TSTEP, 0); }
		public TerminalNode CCB() { return getToken(simpleJavaParser.CCB, 0); }
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public TerminalNode CB() { return getToken(simpleJavaParser.CB, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public TerminalNode COLON() { return getToken(simpleJavaParser.COLON, 0); }
		public TerminalNode SUB() { return getToken(simpleJavaParser.SUB, 0); }
		public CmdforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterCmdfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitCmdfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitCmdfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdforContext cmdfor() throws RecognitionException {
		CmdforContext _localctx = new CmdforContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cmdfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(TFOR);
			setState(210); match(OB);
			setState(211); match(ID);
			setState(212); match(EQUALS);
			setState(213); match(INT);
			setState(214); match(COLON);
			setState(215); match(INT);
			setState(221);
			_la = _input.LA(1);
			if (_la==TSTEP) {
				{
				setState(216); match(TSTEP);
				setState(218);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(217); match(SUB);
					}
				}

				setState(220); match(INT);
				}
			}

			setState(223); match(CB);
			setState(224); match(OCB);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << TEXIT) | (1L << ID))) != 0)) {
				{
				setState(227);
				switch (_input.LA(1)) {
				case TRETURN:
				case TPRINT:
				case TREAD:
				case TIF:
				case TFOR:
				case TWHILE:
				case ID:
					{
					setState(225); comandos();
					}
					break;
				case TEXIT:
					{
					setState(226); match(TEXIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232); match(CCB);
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

	public static class CmdwhileContext extends ParserRuleContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode CCB() { return getToken(simpleJavaParser.CCB, 0); }
		public TerminalNode TEXIT(int i) {
			return getToken(simpleJavaParser.TEXIT, i);
		}
		public List<TerminalNode> TEXIT() { return getTokens(simpleJavaParser.TEXIT); }
		public TerminalNode TWHILE() { return getToken(simpleJavaParser.TWHILE, 0); }
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public TerminalNode OCB() { return getToken(simpleJavaParser.OCB, 0); }
		public TerminalNode CB() { return getToken(simpleJavaParser.CB, 0); }
		public CmdwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterCmdwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitCmdwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitCmdwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdwhileContext cmdwhile() throws RecognitionException {
		CmdwhileContext _localctx = new CmdwhileContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); match(TWHILE);
			setState(235); match(OB);
			setState(236); expr2();
			setState(237); match(CB);
			setState(238); match(OCB);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << TEXIT) | (1L << ID))) != 0)) {
				{
				setState(241);
				switch (_input.LA(1)) {
				case TRETURN:
				case TPRINT:
				case TREAD:
				case TIF:
				case TFOR:
				case TWHILE:
				case ID:
					{
					setState(239); comandos();
					}
					break;
				case TEXIT:
					{
					setState(240); match(TEXIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246); match(CCB);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(simpleJavaParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(simpleJavaParser.ID, 0); }
		public InicAttribContext inicAttrib() {
			return getRuleContext(InicAttribContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(ID);
			setState(249); match(EQUALS);
			setState(250); inicAttrib();
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

	public static class InicAttribContext extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode BOOL() { return getToken(simpleJavaParser.BOOL, 0); }
		public ChamadaFuncoesContext chamadaFuncoes() {
			return getRuleContext(ChamadaFuncoesContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STR() { return getToken(simpleJavaParser.STR, 0); }
		public InicAttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicAttrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterInicAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitInicAttrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitInicAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicAttribContext inicAttrib() throws RecognitionException {
		InicAttribContext _localctx = new InicAttribContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inicAttrib);
		int _la;
		try {
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==STR || _la==BOOL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253); expr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254); expr2();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255); chamadaFuncoes();
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

	public static class PrintContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(simpleJavaParser.COMMA); }
		public ParamCallContext paramCall(int i) {
			return getRuleContext(ParamCallContext.class,i);
		}
		public List<ParamCallContext> paramCall() {
			return getRuleContexts(ParamCallContext.class);
		}
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public TerminalNode TPRINT() { return getToken(simpleJavaParser.TPRINT, 0); }
		public TerminalNode CB() { return getToken(simpleJavaParser.CB, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(simpleJavaParser.COMMA, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(TPRINT);
			setState(259); match(OB);
			setState(260); paramCall();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(261); match(COMMA);
				setState(262); paramCall();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268); match(CB);
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

	public static class ReadContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(simpleJavaParser.COMMA); }
		public List<TerminalNode> ID() { return getTokens(simpleJavaParser.ID); }
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public TerminalNode CB() { return getToken(simpleJavaParser.CB, 0); }
		public TerminalNode TREAD() { return getToken(simpleJavaParser.TREAD, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(simpleJavaParser.COMMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(simpleJavaParser.ID, i);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(TREAD);
			setState(271); match(OB);
			setState(272); match(ID);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(273); match(COMMA);
				setState(274); match(ID);
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280); match(CB);
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

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(simpleJavaParser.FLOAT, 0); }
		public TerminalNode SUB() { return getToken(simpleJavaParser.SUB, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(simpleJavaParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(simpleJavaParser.ADD, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public TerminalNode CB() { return getToken(simpleJavaParser.CB, 0); }
		public BracketContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitBracket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(simpleJavaParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(simpleJavaParser.INT, 0); }
		public TerminalNode SUB() { return getToken(simpleJavaParser.SUB, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExprContext {
		public ChamadaFuncoesContext chamadaFuncoes() {
			return getRuleContext(ChamadaFuncoesContext.class,0);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultDivContext extends ExprContext {
		public TerminalNode DIV() { return getToken(simpleJavaParser.DIV, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUT() { return getToken(simpleJavaParser.MUT, 0); }
		public MultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new BracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(283); match(OB);
				setState(284); expr(0);
				setState(285); match(CB);
				}
				break;

			case 2:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(287); match(SUB);
					}
				}

				setState(290); match(INT);
				}
				break;

			case 3:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(291); match(SUB);
					}
				}

				setState(294); match(FLOAT);
				}
				break;

			case 4:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295); match(ID);
				}
				break;

			case 5:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296); chamadaFuncoes();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(305);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(299);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(300);
						_la = _input.LA(1);
						if ( !(_la==MUT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(301); expr(7);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(303);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(304); expr(6);
						}
						break;
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode BOOL() { return getToken(simpleJavaParser.BOOL, 0); }
		public ChamadaFuncoesContext chamadaFuncoes() {
			return getRuleContext(ChamadaFuncoesContext.class,0);
		}
		public TerminalNode BO() { return getToken(simpleJavaParser.BO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode ID() { return getToken(simpleJavaParser.ID, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(simpleJavaParser.NOT, 0); }
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public TerminalNode CB() { return getToken(simpleJavaParser.CB, 0); }
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr2);
		try {
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310); match(OB);
				setState(311); expr2();
				setState(312); match(CB);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314); expr(0);
				setState(315); match(BO);
				setState(316); expr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318); match(NOT);
				setState(319); expr2();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(320); match(BOOL);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(321); match(ID);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(322); chamadaFuncoes();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 6 >= _localctx._p;

		case 1: return 5 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3&\u0148\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\7\2\64\n\2\f\2\16\2\67\13\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6O\n\6\f\6\16\6R"+
		"\13\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7a\n\7\f\7"+
		"\16\7d\13\7\3\7\7\7g\n\7\f\7\16\7j\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\bu\n\b\f\b\16\bx\13\b\5\bz\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0083\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f"+
		"\13\n\5\n\u0091\n\n\3\n\3\n\3\13\3\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u009f\n\f\f\f\16\f\u00a2\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b7\n\r\3\r\3\r"+
		"\5\r\u00bb\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c3\n\16\f\16\16\16"+
		"\u00c6\13\16\3\16\3\16\3\17\3\17\3\17\7\17\u00cd\n\17\f\17\16\17\u00d0"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00dd"+
		"\n\20\3\20\5\20\u00e0\n\20\3\20\3\20\3\20\3\20\7\20\u00e6\n\20\f\20\16"+
		"\20\u00e9\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f4"+
		"\n\21\f\21\16\21\u00f7\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\5\23\u0103\n\23\3\24\3\24\3\24\3\24\3\24\7\24\u010a\n\24\f\24"+
		"\16\24\u010d\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0116\n\25"+
		"\f\25\16\25\u0119\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0123"+
		"\n\26\3\26\3\26\5\26\u0127\n\26\3\26\3\26\3\26\5\26\u012c\n\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\7\26\u0134\n\26\f\26\16\26\u0137\13\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0146"+
		"\n\27\3\27\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\7\4\2"+
		"!\"$%\3\2\17\22\3\2!\"\3\2\37 \3\2\35\36\u0165\2.\3\2\2\2\4@\3\2\2\2\6"+
		"F\3\2\2\2\bH\3\2\2\2\nJ\3\2\2\2\fW\3\2\2\2\16y\3\2\2\2\20{\3\2\2\2\22"+
		"\u0086\3\2\2\2\24\u0097\3\2\2\2\26\u0099\3\2\2\2\30\u00ba\3\2\2\2\32\u00bc"+
		"\3\2\2\2\34\u00c9\3\2\2\2\36\u00d3\3\2\2\2 \u00ec\3\2\2\2\"\u00fa\3\2"+
		"\2\2$\u0102\3\2\2\2&\u0104\3\2\2\2(\u0110\3\2\2\2*\u012b\3\2\2\2,\u0145"+
		"\3\2\2\2./\7\3\2\2/\60\7#\2\2\60\65\7\25\2\2\61\64\5\4\3\2\62\64\5\n\6"+
		"\2\63\61\3\2\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\66;\3\2\2\2\67\65\3\2\2\28:\5\f\7\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;"+
		"<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\5\26\f\2?\3\3\2\2\2@A\5\b\5\2AB\7#\2\2"+
		"BC\7\26\2\2CD\5\6\4\2DE\7\25\2\2E\5\3\2\2\2FG\t\2\2\2G\7\3\2\2\2HI\t\3"+
		"\2\2I\t\3\2\2\2JK\7\4\2\2KP\7#\2\2LM\7\23\2\2MO\7#\2\2NL\3\2\2\2OR\3\2"+
		"\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\24\2\2TU\5\b\5\2UV\7"+
		"\25\2\2V\13\3\2\2\2WX\7#\2\2XY\7\27\2\2YZ\5\16\b\2Z[\7\30\2\2[\\\7\24"+
		"\2\2\\]\5\b\5\2]b\7\31\2\2^a\5\4\3\2_a\5\n\6\2`^\3\2\2\2`_\3\2\2\2ad\3"+
		"\2\2\2b`\3\2\2\2bc\3\2\2\2ch\3\2\2\2db\3\2\2\2eg\5\30\r\2fe\3\2\2\2gj"+
		"\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\32\2\2l\r\3\2\2\2"+
		"mn\5\b\5\2no\7#\2\2ov\3\2\2\2pq\7\23\2\2qr\5\b\5\2rs\7#\2\2su\3\2\2\2"+
		"tp\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2ym\3\2\2\2"+
		"yz\3\2\2\2z\17\3\2\2\2{|\7\6\2\2|\u0082\7\27\2\2}\u0083\5*\26\2~\u0083"+
		"\5,\27\2\177\u0083\5\22\n\2\u0080\u0083\7!\2\2\u0081\u0083\7\"\2\2\u0082"+
		"}\3\2\2\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\30\2\2\u0085\21\3\2\2\2\u0086"+
		"\u0087\7#\2\2\u0087\u0090\7\27\2\2\u0088\u008d\5\24\13\2\u0089\u008a\7"+
		"\23\2\2\u008a\u008c\5\24\13\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0088\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\7\30\2\2\u0093\23\3\2\2\2\u0094\u0098\t\4\2\2\u0095\u0098\5*\26"+
		"\2\u0096\u0098\5,\27\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096"+
		"\3\2\2\2\u0098\25\3\2\2\2\u0099\u009a\7\5\2\2\u009a\u009b\7\27\2\2\u009b"+
		"\u009c\7\30\2\2\u009c\u00a0\7\31\2\2\u009d\u009f\5\30\r\2\u009e\u009d"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\32\2\2\u00a4\27\3\2\2"+
		"\2\u00a5\u00a6\5\"\22\2\u00a6\u00a7\7\25\2\2\u00a7\u00bb\3\2\2\2\u00a8"+
		"\u00a9\5\22\n\2\u00a9\u00aa\7\25\2\2\u00aa\u00bb\3\2\2\2\u00ab\u00ac\5"+
		"\20\t\2\u00ac\u00ad\7\25\2\2\u00ad\u00bb\3\2\2\2\u00ae\u00af\5&\24\2\u00af"+
		"\u00b0\7\25\2\2\u00b0\u00bb\3\2\2\2\u00b1\u00b2\5(\25\2\u00b2\u00b3\7"+
		"\25\2\2\u00b3\u00bb\3\2\2\2\u00b4\u00b6\5\32\16\2\u00b5\u00b7\5\34\17"+
		"\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bb\3\2\2\2\u00b8\u00bb"+
		"\5\36\20\2\u00b9\u00bb\5 \21\2\u00ba\u00a5\3\2\2\2\u00ba\u00a8\3\2\2\2"+
		"\u00ba\u00ab\3\2\2\2\u00ba\u00ae\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b4"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\31\3\2\2\2\u00bc"+
		"\u00bd\7\t\2\2\u00bd\u00be\7\27\2\2\u00be\u00bf\5,\27\2\u00bf\u00c0\7"+
		"\30\2\2\u00c0\u00c4\7\31\2\2\u00c1\u00c3\5\30\r\2\u00c2\u00c1\3\2\2\2"+
		"\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\32\2\2\u00c8\33\3\2\2\2\u00c9"+
		"\u00ca\7\n\2\2\u00ca\u00ce\7\31\2\2\u00cb\u00cd\5\30\r\2\u00cc\u00cb\3"+
		"\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\32\2\2\u00d2\35\3\2\2"+
		"\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5\7\27\2\2\u00d5\u00d6\7#\2\2\u00d6"+
		"\u00d7\7\26\2\2\u00d7\u00d8\7$\2\2\u00d8\u00d9\7\24\2\2\u00d9\u00df\7"+
		"$\2\2\u00da\u00dc\7\f\2\2\u00db\u00dd\7\36\2\2\u00dc\u00db\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\7$\2\2\u00df\u00da\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\30\2\2\u00e2"+
		"\u00e7\7\31\2\2\u00e3\u00e6\5\30\r\2\u00e4\u00e6\7\16\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\32"+
		"\2\2\u00eb\37\3\2\2\2\u00ec\u00ed\7\r\2\2\u00ed\u00ee\7\27\2\2\u00ee\u00ef"+
		"\5,\27\2\u00ef\u00f0\7\30\2\2\u00f0\u00f5\7\31\2\2\u00f1\u00f4\5\30\r"+
		"\2\u00f2\u00f4\7\16\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7\32\2\2\u00f9!\3\2\2\2\u00fa\u00fb"+
		"\7#\2\2\u00fb\u00fc\7\26\2\2\u00fc\u00fd\5$\23\2\u00fd#\3\2\2\2\u00fe"+
		"\u0103\t\4\2\2\u00ff\u0103\5*\26\2\u0100\u0103\5,\27\2\u0101\u0103\5\22"+
		"\n\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103%\3\2\2\2\u0104\u0105\7\7\2\2\u0105\u0106\7\27\2\2"+
		"\u0106\u010b\5\24\13\2\u0107\u0108\7\23\2\2\u0108\u010a\5\24\13\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7\30\2\2\u010f"+
		"\'\3\2\2\2\u0110\u0111\7\b\2\2\u0111\u0112\7\27\2\2\u0112\u0117\7#\2\2"+
		"\u0113\u0114\7\23\2\2\u0114\u0116\7#\2\2\u0115\u0113\3\2\2\2\u0116\u0119"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011b\7\30\2\2\u011b)\3\2\2\2\u011c\u011d\b\26\1"+
		"\2\u011d\u011e\7\27\2\2\u011e\u011f\5*\26\2\u011f\u0120\7\30\2\2\u0120"+
		"\u012c\3\2\2\2\u0121\u0123\7\36\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3"+
		"\2\2\2\u0123\u0124\3\2\2\2\u0124\u012c\7$\2\2\u0125\u0127\7\36\2\2\u0126"+
		"\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012c\7%"+
		"\2\2\u0129\u012c\7#\2\2\u012a\u012c\5\22\n\2\u012b\u011c\3\2\2\2\u012b"+
		"\u0122\3\2\2\2\u012b\u0126\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2"+
		"\2\2\u012c\u0135\3\2\2\2\u012d\u012e\6\26\2\3\u012e\u012f\t\5\2\2\u012f"+
		"\u0134\5*\26\2\u0130\u0131\6\26\3\3\u0131\u0132\t\6\2\2\u0132\u0134\5"+
		"*\26\2\u0133\u012d\3\2\2\2\u0133\u0130\3\2\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136+\3\2\2\2\u0137\u0135\3\2\2\2"+
		"\u0138\u0139\7\27\2\2\u0139\u013a\5,\27\2\u013a\u013b\7\30\2\2\u013b\u0146"+
		"\3\2\2\2\u013c\u013d\5*\26\2\u013d\u013e\7\33\2\2\u013e\u013f\5*\26\2"+
		"\u013f\u0146\3\2\2\2\u0140\u0141\7\34\2\2\u0141\u0146\5,\27\2\u0142\u0146"+
		"\7\"\2\2\u0143\u0146\7#\2\2\u0144\u0146\5\22\n\2\u0145\u0138\3\2\2\2\u0145"+
		"\u013c\3\2\2\2\u0145\u0140\3\2\2\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0145\u0144\3\2\2\2\u0146-\3\2\2\2#\63\65;P`bhvy\u0082\u008d\u0090"+
		"\u0097\u00a0\u00b6\u00ba\u00c4\u00ce\u00dc\u00df\u00e5\u00e7\u00f3\u00f5"+
		"\u0102\u010b\u0117\u0122\u0126\u012b\u0133\u0135\u0145";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}