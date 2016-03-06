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
		RULE_paramCall = 9, RULE_principal = 10, RULE_comandos = 11, RULE_cmdifelse = 12, 
		RULE_cmdfor = 13, RULE_cmdwhile = 14, RULE_atribuicao = 15, RULE_inicAttrib = 16, 
		RULE_print = 17, RULE_read = 18, RULE_expr = 19, RULE_expr2 = 20;
	public static final String[] ruleNames = {
		"prog", "declConst", "inicVal", "tipo", "declVars", "declFuncoes", "params", 
		"declReturn", "chamadaFuncoes", "paramCall", "principal", "comandos", 
		"cmdifelse", "cmdfor", "cmdwhile", "atribuicao", "inicAttrib", "print", 
		"read", "expr", "expr2"
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
			setState(42); match(TCLASS);
			setState(43); match(ID);
			setState(44); match(SCOLON);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TVAR) | (1L << TINT) | (1L << TFLOAT) | (1L << TSTR) | (1L << TBOOL))) != 0)) {
				{
				setState(47);
				switch (_input.LA(1)) {
				case TINT:
				case TFLOAT:
				case TSTR:
				case TBOOL:
					{
					setState(45); declConst();
					}
					break;
				case TVAR:
					{
					setState(46); declVars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(52); declFuncoes();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58); principal();
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
			setState(60); tipo();
			setState(61); match(ID);
			setState(62); match(EQUALS);
			setState(63); inicVal();
			setState(64); match(SCOLON);
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
			setState(66);
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
			setState(68);
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
			setState(70); match(TVAR);
			setState(71); match(ID);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(72); match(COMMA);
				setState(73); match(ID);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79); match(COLON);
			setState(80); tipo();
			setState(81); match(SCOLON);
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
			setState(83); match(ID);
			setState(84); match(OB);
			setState(85); params();
			setState(86); match(CB);
			setState(87); match(COLON);
			setState(88); tipo();
			setState(89); match(OCB);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TVAR) | (1L << TINT) | (1L << TFLOAT) | (1L << TSTR) | (1L << TBOOL))) != 0)) {
				{
				setState(92);
				switch (_input.LA(1)) {
				case TINT:
				case TFLOAT:
				case TSTR:
				case TBOOL:
					{
					setState(90); declConst();
					}
					break;
				case TVAR:
					{
					setState(91); declVars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(97); comandos();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103); match(CCB);
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
			setState(117);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TINT) | (1L << TFLOAT) | (1L << TSTR) | (1L << TBOOL))) != 0)) {
				{
				{
				setState(105); tipo();
				setState(106); match(ID);
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(108); match(COMMA);
					setState(109); tipo();
					setState(110); match(ID);
					}
					}
					setState(116);
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
			setState(119); match(TRETURN);
			setState(120); match(OB);
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(121); expr(0);
				}
				break;

			case 2:
				{
				setState(122); expr2();
				}
				break;

			case 3:
				{
				setState(123); chamadaFuncoes();
				}
				break;

			case 4:
				{
				setState(124); match(STR);
				}
				break;

			case 5:
				{
				setState(125); match(BOOL);
				}
				break;
			}
			setState(128); match(CB);
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
			setState(130); match(ID);
			setState(131); match(OB);
			setState(140);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB) | (1L << NOT) | (1L << SUB) | (1L << STR) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(132); paramCall();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(133); match(COMMA);
					setState(134); paramCall();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(142); match(CB);
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
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
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
				setState(145); expr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); expr2();
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
			setState(149); match(TMAIN);
			setState(150); match(OB);
			setState(151); match(CB);
			setState(152); match(OCB);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(153); comandos();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159); match(CCB);
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
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public CmdifelseContext cmdifelse() {
			return getRuleContext(CmdifelseContext.class,0);
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
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161); atribuicao();
				setState(162); match(SCOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164); chamadaFuncoes();
				setState(165); match(SCOLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167); declReturn();
				setState(168); match(SCOLON);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170); print();
				setState(171); match(SCOLON);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173); read();
				setState(174); match(SCOLON);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(176); cmdifelse();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(177); cmdfor();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(178); cmdwhile();
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

	public static class CmdifelseContext extends ParserRuleContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public List<TerminalNode> CCB() { return getTokens(simpleJavaParser.CCB); }
		public TerminalNode TIF() { return getToken(simpleJavaParser.TIF, 0); }
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public TerminalNode TELSE() { return getToken(simpleJavaParser.TELSE, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public List<TerminalNode> OCB() { return getTokens(simpleJavaParser.OCB); }
		public TerminalNode CB() { return getToken(simpleJavaParser.CB, 0); }
		public TerminalNode CCB(int i) {
			return getToken(simpleJavaParser.CCB, i);
		}
		public TerminalNode OCB(int i) {
			return getToken(simpleJavaParser.OCB, i);
		}
		public CmdifelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterCmdifelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitCmdifelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitCmdifelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdifelseContext cmdifelse() throws RecognitionException {
		CmdifelseContext _localctx = new CmdifelseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(TIF);
			setState(182); match(OB);
			setState(183); expr2();
			setState(184); match(CB);
			setState(185); match(OCB);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(186); comandos();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192); match(CCB);
			setState(202);
			_la = _input.LA(1);
			if (_la==TELSE) {
				{
				setState(193); match(TELSE);
				setState(194); match(OCB);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(195); comandos();
					}
					}
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201); match(CCB);
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
		enterRule(_localctx, 26, RULE_cmdfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(TFOR);
			setState(205); match(OB);
			setState(206); match(ID);
			setState(207); match(EQUALS);
			setState(208); match(INT);
			setState(209); match(COLON);
			setState(210); match(INT);
			setState(216);
			_la = _input.LA(1);
			if (_la==TSTEP) {
				{
				setState(211); match(TSTEP);
				setState(213);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(212); match(SUB);
					}
				}

				setState(215); match(INT);
				}
			}

			setState(218); match(CB);
			setState(219); match(OCB);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << TEXIT) | (1L << ID))) != 0)) {
				{
				setState(222);
				switch (_input.LA(1)) {
				case TRETURN:
				case TPRINT:
				case TREAD:
				case TIF:
				case TFOR:
				case TWHILE:
				case ID:
					{
					setState(220); comandos();
					}
					break;
				case TEXIT:
					{
					setState(221); match(TEXIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227); match(CCB);
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
		enterRule(_localctx, 28, RULE_cmdwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); match(TWHILE);
			setState(230); match(OB);
			setState(231); expr2();
			setState(232); match(CB);
			setState(233); match(OCB);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << TEXIT) | (1L << ID))) != 0)) {
				{
				setState(236);
				switch (_input.LA(1)) {
				case TRETURN:
				case TPRINT:
				case TREAD:
				case TIF:
				case TFOR:
				case TWHILE:
				case ID:
					{
					setState(234); comandos();
					}
					break;
				case TEXIT:
					{
					setState(235); match(TEXIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241); match(CCB);
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
		enterRule(_localctx, 30, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(ID);
			setState(244); match(EQUALS);
			setState(245); inicAttrib();
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
		enterRule(_localctx, 32, RULE_inicAttrib);
		int _la;
		try {
			setState(251);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
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
				setState(248); expr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249); expr2();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250); chamadaFuncoes();
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
		enterRule(_localctx, 34, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); match(TPRINT);
			setState(254); match(OB);
			setState(255); paramCall();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(256); match(COMMA);
				setState(257); paramCall();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263); match(CB);
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
		enterRule(_localctx, 36, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); match(TREAD);
			setState(266); match(OB);
			setState(267); match(ID);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(268); match(COMMA);
				setState(269); match(ID);
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275); match(CB);
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
		int _startState = 38;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new BracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(278); match(OB);
				setState(279); expr(0);
				setState(280); match(CB);
				}
				break;

			case 2:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(282); match(SUB);
					}
				}

				setState(285); match(INT);
				}
				break;

			case 3:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(286); match(SUB);
					}
				}

				setState(289); match(FLOAT);
				}
				break;

			case 4:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290); match(ID);
				}
				break;

			case 5:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291); chamadaFuncoes();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(300);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(294);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(295);
						_la = _input.LA(1);
						if ( !(_la==MUT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(296); expr(7);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(297);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(298);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(299); expr(6);
						}
						break;
					}
					} 
				}
				setState(304);
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
		enterRule(_localctx, 40, RULE_expr2);
		try {
			setState(318);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305); match(OB);
				setState(306); expr2();
				setState(307); match(CB);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309); expr(0);
				setState(310); match(BO);
				setState(311); expr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313); match(NOT);
				setState(314); expr2();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(315); match(BOOL);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(316); match(ID);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(317); chamadaFuncoes();
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
		case 19: return expr_sempred((ExprContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3&\u0143\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\7\2\62\n"+
		"\2\f\2\16\2\65\13\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7_\n\7\f\7\16\7b\13"+
		"\7\3\7\7\7e\n\7\f\7\16\7h\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"s\n\b\f\b\16\bv\13\b\5\bx\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u008a\n\n\f\n\16\n\u008d\13\n\5\n\u008f"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\5\13\u0096\n\13\3\f\3\f\3\f\3\f\3\f\7\f\u009d"+
		"\n\f\f\f\16\f\u00a0\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\7\16\u00be\n\16\f\16\16\16\u00c1\13\16\3\16\3\16\3\16\3\16\7"+
		"\16\u00c7\n\16\f\16\16\16\u00ca\13\16\3\16\5\16\u00cd\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d8\n\17\3\17\5\17\u00db\n\17"+
		"\3\17\3\17\3\17\3\17\7\17\u00e1\n\17\f\17\16\17\u00e4\13\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00ef\n\20\f\20\16\20\u00f2\13"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00fe\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u0105\n\23\f\23\16\23\u0108\13\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u0111\n\24\f\24\16\24\u0114\13\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u011e\n\25\3\25\3\25\5\25"+
		"\u0122\n\25\3\25\3\25\3\25\5\25\u0127\n\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\7\25\u012f\n\25\f\25\16\25\u0132\13\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0141\n\26\3\26\2\27\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\7\4\2!\"$%\3\2\17\22\3\2!\""+
		"\3\2\37 \3\2\35\36\u0161\2,\3\2\2\2\4>\3\2\2\2\6D\3\2\2\2\bF\3\2\2\2\n"+
		"H\3\2\2\2\fU\3\2\2\2\16w\3\2\2\2\20y\3\2\2\2\22\u0084\3\2\2\2\24\u0095"+
		"\3\2\2\2\26\u0097\3\2\2\2\30\u00b5\3\2\2\2\32\u00b7\3\2\2\2\34\u00ce\3"+
		"\2\2\2\36\u00e7\3\2\2\2 \u00f5\3\2\2\2\"\u00fd\3\2\2\2$\u00ff\3\2\2\2"+
		"&\u010b\3\2\2\2(\u0126\3\2\2\2*\u0140\3\2\2\2,-\7\3\2\2-.\7#\2\2.\63\7"+
		"\25\2\2/\62\5\4\3\2\60\62\5\n\6\2\61/\3\2\2\2\61\60\3\2\2\2\62\65\3\2"+
		"\2\2\63\61\3\2\2\2\63\64\3\2\2\2\649\3\2\2\2\65\63\3\2\2\2\668\5\f\7\2"+
		"\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\5"+
		"\26\f\2=\3\3\2\2\2>?\5\b\5\2?@\7#\2\2@A\7\26\2\2AB\5\6\4\2BC\7\25\2\2"+
		"C\5\3\2\2\2DE\t\2\2\2E\7\3\2\2\2FG\t\3\2\2G\t\3\2\2\2HI\7\4\2\2IN\7#\2"+
		"\2JK\7\23\2\2KM\7#\2\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2"+
		"\2PN\3\2\2\2QR\7\24\2\2RS\5\b\5\2ST\7\25\2\2T\13\3\2\2\2UV\7#\2\2VW\7"+
		"\27\2\2WX\5\16\b\2XY\7\30\2\2YZ\7\24\2\2Z[\5\b\5\2[`\7\31\2\2\\_\5\4\3"+
		"\2]_\5\n\6\2^\\\3\2\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2af\3\2"+
		"\2\2b`\3\2\2\2ce\5\30\r\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3"+
		"\2\2\2hf\3\2\2\2ij\7\32\2\2j\r\3\2\2\2kl\5\b\5\2lm\7#\2\2mt\3\2\2\2no"+
		"\7\23\2\2op\5\b\5\2pq\7#\2\2qs\3\2\2\2rn\3\2\2\2sv\3\2\2\2tr\3\2\2\2t"+
		"u\3\2\2\2ux\3\2\2\2vt\3\2\2\2wk\3\2\2\2wx\3\2\2\2x\17\3\2\2\2yz\7\6\2"+
		"\2z\u0080\7\27\2\2{\u0081\5(\25\2|\u0081\5*\26\2}\u0081\5\22\n\2~\u0081"+
		"\7!\2\2\177\u0081\7\"\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0080}\3\2\2\2"+
		"\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\30"+
		"\2\2\u0083\21\3\2\2\2\u0084\u0085\7#\2\2\u0085\u008e\7\27\2\2\u0086\u008b"+
		"\5\24\13\2\u0087\u0088\7\23\2\2\u0088\u008a\5\24\13\2\u0089\u0087\3\2"+
		"\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\30\2\2\u0091\23\3\2\2\2\u0092\u0096"+
		"\t\4\2\2\u0093\u0096\5(\25\2\u0094\u0096\5*\26\2\u0095\u0092\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\25\3\2\2\2\u0097\u0098\7\5\2"+
		"\2\u0098\u0099\7\27\2\2\u0099\u009a\7\30\2\2\u009a\u009e\7\31\2\2\u009b"+
		"\u009d\5\30\r\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a2\7\32\2\2\u00a2\27\3\2\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\7\25"+
		"\2\2\u00a5\u00b6\3\2\2\2\u00a6\u00a7\5\22\n\2\u00a7\u00a8\7\25\2\2\u00a8"+
		"\u00b6\3\2\2\2\u00a9\u00aa\5\20\t\2\u00aa\u00ab\7\25\2\2\u00ab\u00b6\3"+
		"\2\2\2\u00ac\u00ad\5$\23\2\u00ad\u00ae\7\25\2\2\u00ae\u00b6\3\2\2\2\u00af"+
		"\u00b0\5&\24\2\u00b0\u00b1\7\25\2\2\u00b1\u00b6\3\2\2\2\u00b2\u00b6\5"+
		"\32\16\2\u00b3\u00b6\5\34\17\2\u00b4\u00b6\5\36\20\2\u00b5\u00a3\3\2\2"+
		"\2\u00b5\u00a6\3\2\2\2\u00b5\u00a9\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00af"+
		"\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\31\3\2\2\2\u00b7\u00b8\7\t\2\2\u00b8\u00b9\7\27\2\2\u00b9\u00ba\5*\26"+
		"\2\u00ba\u00bb\7\30\2\2\u00bb\u00bf\7\31\2\2\u00bc\u00be\5\30\r\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00cc\7\32\2\2\u00c3"+
		"\u00c4\7\n\2\2\u00c4\u00c8\7\31\2\2\u00c5\u00c7\5\30\r\2\u00c6\u00c5\3"+
		"\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\7\32\2\2\u00cc\u00c3\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\33\3\2\2\2\u00ce\u00cf\7\13\2\2\u00cf"+
		"\u00d0\7\27\2\2\u00d0\u00d1\7#\2\2\u00d1\u00d2\7\26\2\2\u00d2\u00d3\7"+
		"$\2\2\u00d3\u00d4\7\24\2\2\u00d4\u00da\7$\2\2\u00d5\u00d7\7\f\2\2\u00d6"+
		"\u00d8\7\36\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3"+
		"\2\2\2\u00d9\u00db\7$\2\2\u00da\u00d5\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\7\30\2\2\u00dd\u00e2\7\31\2\2\u00de\u00e1\5"+
		"\30\r\2\u00df\u00e1\7\16\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\32\2\2\u00e6\35\3\2\2\2\u00e7\u00e8"+
		"\7\r\2\2\u00e8\u00e9\7\27\2\2\u00e9\u00ea\5*\26\2\u00ea\u00eb\7\30\2\2"+
		"\u00eb\u00f0\7\31\2\2\u00ec\u00ef\5\30\r\2\u00ed\u00ef\7\16\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\7\32\2\2\u00f4\37\3\2\2\2\u00f5\u00f6\7#\2\2\u00f6\u00f7\7\26\2"+
		"\2\u00f7\u00f8\5\"\22\2\u00f8!\3\2\2\2\u00f9\u00fe\t\4\2\2\u00fa\u00fe"+
		"\5(\25\2\u00fb\u00fe\5*\26\2\u00fc\u00fe\5\22\n\2\u00fd\u00f9\3\2\2\2"+
		"\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe#\3"+
		"\2\2\2\u00ff\u0100\7\7\2\2\u0100\u0101\7\27\2\2\u0101\u0106\5\24\13\2"+
		"\u0102\u0103\7\23\2\2\u0103\u0105\5\24\13\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2"+
		"\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7\30\2\2\u010a%\3\2\2\2\u010b\u010c"+
		"\7\b\2\2\u010c\u010d\7\27\2\2\u010d\u0112\7#\2\2\u010e\u010f\7\23\2\2"+
		"\u010f\u0111\7#\2\2\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0116\7\30\2\2\u0116\'\3\2\2\2\u0117\u0118\b\25\1\2\u0118\u0119\7\27"+
		"\2\2\u0119\u011a\5(\25\2\u011a\u011b\7\30\2\2\u011b\u0127\3\2\2\2\u011c"+
		"\u011e\7\36\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3"+
		"\2\2\2\u011f\u0127\7$\2\2\u0120\u0122\7\36\2\2\u0121\u0120\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0127\7%\2\2\u0124\u0127\7#\2"+
		"\2\u0125\u0127\5\22\n\2\u0126\u0117\3\2\2\2\u0126\u011d\3\2\2\2\u0126"+
		"\u0121\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u0130\3\2"+
		"\2\2\u0128\u0129\6\25\2\3\u0129\u012a\t\5\2\2\u012a\u012f\5(\25\2\u012b"+
		"\u012c\6\25\3\3\u012c\u012d\t\6\2\2\u012d\u012f\5(\25\2\u012e\u0128\3"+
		"\2\2\2\u012e\u012b\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131)\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7\27\2\2"+
		"\u0134\u0135\5*\26\2\u0135\u0136\7\30\2\2\u0136\u0141\3\2\2\2\u0137\u0138"+
		"\5(\25\2\u0138\u0139\7\33\2\2\u0139\u013a\5(\25\2\u013a\u0141\3\2\2\2"+
		"\u013b\u013c\7\34\2\2\u013c\u0141\5*\26\2\u013d\u0141\7\"\2\2\u013e\u0141"+
		"\7#\2\2\u013f\u0141\5\22\n\2\u0140\u0133\3\2\2\2\u0140\u0137\3\2\2\2\u0140"+
		"\u013b\3\2\2\2\u0140\u013d\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2"+
		"\2\2\u0141+\3\2\2\2#\61\639N^`ftw\u0080\u008b\u008e\u0095\u009e\u00b5"+
		"\u00bf\u00c8\u00cc\u00d7\u00da\u00e0\u00e2\u00ee\u00f0\u00fd\u0106\u0112"+
		"\u011d\u0121\u0126\u012e\u0130\u0140";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}