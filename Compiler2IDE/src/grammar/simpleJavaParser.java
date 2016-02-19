// Generated from /home/rafael/Desktop/Compiladores/TestesSimpleJava/simpleJava.g4 by ANTLR 4.1
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
		RULE_prog = 0, RULE_declConst = 1, RULE_tipo = 2, RULE_declVars = 3, RULE_declFuncoes = 4, 
		RULE_params = 5, RULE_declReturn = 6, RULE_chamadaFuncoes = 7, RULE_principal = 8, 
		RULE_comandos = 9, RULE_cmdifelse = 10, RULE_cmdfor = 11, RULE_cmdwhile = 12, 
		RULE_atribuicao = 13, RULE_print = 14, RULE_read = 15, RULE_expr = 16, 
		RULE_expr2 = 17;
	public static final String[] ruleNames = {
		"prog", "declConst", "tipo", "declVars", "declFuncoes", "params", "declReturn", 
		"chamadaFuncoes", "principal", "comandos", "cmdifelse", "cmdfor", "cmdwhile", 
		"atribuicao", "print", "read", "expr", "expr2"
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
			setState(36); match(TCLASS);
			setState(37); match(ID);
			setState(38); match(SCOLON);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TVAR) | (1L << TINT) | (1L << TFLOAT) | (1L << TSTR) | (1L << TBOOL))) != 0)) {
				{
				setState(41);
				switch (_input.LA(1)) {
				case TINT:
				case TFLOAT:
				case TSTR:
				case TBOOL:
					{
					setState(39); declConst();
					}
					break;
				case TVAR:
					{
					setState(40); declVars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(46); declFuncoes();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52); principal();
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
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode BOOL() { return getToken(simpleJavaParser.BOOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(simpleJavaParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(simpleJavaParser.ID, 0); }
		public TerminalNode STR() { return getToken(simpleJavaParser.STR, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SCOLON() { return getToken(simpleJavaParser.SCOLON, 0); }
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
			setState(54); tipo();
			setState(55); match(ID);
			setState(56); match(EQUALS);
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(57); expr(0);
				}
				break;

			case 2:
				{
				setState(58); expr2();
				}
				break;

			case 3:
				{
				setState(59); match(STR);
				}
				break;

			case 4:
				{
				setState(60); match(BOOL);
				}
				break;
			}
			setState(63); match(SCOLON);
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
		enterRule(_localctx, 4, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
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
		enterRule(_localctx, 6, RULE_declVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(TVAR);
			setState(68); match(ID);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(69); match(COMMA);
				setState(70); match(ID);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76); match(COLON);
			setState(77); tipo();
			setState(78); match(SCOLON);
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
		enterRule(_localctx, 8, RULE_declFuncoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(ID);
			setState(81); match(OB);
			setState(82); params();
			setState(83); match(CB);
			setState(84); match(COLON);
			setState(85); tipo();
			setState(86); match(OCB);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TVAR) | (1L << TINT) | (1L << TFLOAT) | (1L << TSTR) | (1L << TBOOL))) != 0)) {
				{
				setState(89);
				switch (_input.LA(1)) {
				case TINT:
				case TFLOAT:
				case TSTR:
				case TBOOL:
					{
					setState(87); declConst();
					}
					break;
				case TVAR:
					{
					setState(88); declVars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(94); comandos();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100); match(CCB);
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
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TINT) | (1L << TFLOAT) | (1L << TSTR) | (1L << TBOOL))) != 0)) {
				{
				{
				setState(102); tipo();
				setState(103); match(ID);
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(105); match(COMMA);
					setState(106); tipo();
					setState(107); match(ID);
					}
					}
					setState(113);
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
		enterRule(_localctx, 12, RULE_declReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(TRETURN);
			setState(117); match(OB);
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(118); expr(0);
				}
				break;

			case 2:
				{
				setState(119); expr2();
				}
				break;

			case 3:
				{
				setState(120); chamadaFuncoes();
				}
				break;

			case 4:
				{
				setState(121); match(STR);
				}
				break;

			case 5:
				{
				setState(122); match(BOOL);
				}
				break;
			}
			setState(125); match(CB);
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
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public List<TerminalNode> BOOL() { return getTokens(simpleJavaParser.BOOL); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(simpleJavaParser.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(simpleJavaParser.ID, 0); }
		public List<TerminalNode> STR() { return getTokens(simpleJavaParser.STR); }
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public TerminalNode STR(int i) {
			return getToken(simpleJavaParser.STR, i);
		}
		public TerminalNode BOOL(int i) {
			return getToken(simpleJavaParser.BOOL, i);
		}
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
		enterRule(_localctx, 14, RULE_chamadaFuncoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(ID);
			setState(128); match(OB);
			setState(147);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB) | (1L << NOT) | (1L << STR) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(133);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(129); expr(0);
					}
					break;

				case 2:
					{
					setState(130); expr2();
					}
					break;

				case 3:
					{
					setState(131); match(STR);
					}
					break;

				case 4:
					{
					setState(132); match(BOOL);
					}
					break;
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(135); match(COMMA);
					setState(140);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(136); expr(0);
						}
						break;

					case 2:
						{
						setState(137); expr2();
						}
						break;

					case 3:
						{
						setState(138); match(STR);
						}
						break;

					case 4:
						{
						setState(139); match(BOOL);
						}
						break;
					}
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(149); match(CB);
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
		enterRule(_localctx, 16, RULE_principal);
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
		enterRule(_localctx, 18, RULE_comandos);
		try {
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
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
				setState(178); cmdifelse();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(179); cmdfor();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(180); cmdwhile();
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
		enterRule(_localctx, 20, RULE_cmdifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); match(TIF);
			setState(184); match(OB);
			setState(185); expr2();
			setState(186); match(CB);
			setState(187); match(OCB);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << ID))) != 0)) {
				{
				{
				setState(188); comandos();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194); match(CCB);
			setState(204);
			_la = _input.LA(1);
			if (_la==TELSE) {
				{
				setState(195); match(TELSE);
				setState(196); match(OCB);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << ID))) != 0)) {
					{
					{
					setState(197); comandos();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203); match(CCB);
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
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode TEXIT(int i) {
			return getToken(simpleJavaParser.TEXIT, i);
		}
		public List<TerminalNode> TEXIT() { return getTokens(simpleJavaParser.TEXIT); }
		public TerminalNode EQUALS() { return getToken(simpleJavaParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(simpleJavaParser.ID, 0); }
		public TerminalNode OCB() { return getToken(simpleJavaParser.OCB, 0); }
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TerminalNode TSTEP() { return getToken(simpleJavaParser.TSTEP, 0); }
		public TerminalNode TFOR() { return getToken(simpleJavaParser.TFOR, 0); }
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public TerminalNode CCB() { return getToken(simpleJavaParser.CCB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public TerminalNode CB() { return getToken(simpleJavaParser.CB, 0); }
		public TerminalNode COLON() { return getToken(simpleJavaParser.COLON, 0); }
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
		enterRule(_localctx, 22, RULE_cmdfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(TFOR);
			setState(207); match(OB);
			setState(208); match(ID);
			setState(209); match(EQUALS);
			setState(212);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(210); expr(0);
				}
				break;

			case 2:
				{
				setState(211); expr2();
				}
				break;
			}
			setState(214); match(COLON);
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(215); expr(0);
				}
				break;

			case 2:
				{
				setState(216); expr2();
				}
				break;
			}
			setState(224);
			_la = _input.LA(1);
			if (_la==TSTEP) {
				{
				setState(219); match(TSTEP);
				setState(222);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(220); expr(0);
					}
					break;

				case 2:
					{
					setState(221); expr2();
					}
					break;
				}
				}
			}

			setState(226); match(CB);
			setState(227); match(OCB);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << TEXIT) | (1L << ID))) != 0)) {
				{
				setState(230);
				switch (_input.LA(1)) {
				case TRETURN:
				case TPRINT:
				case TREAD:
				case TIF:
				case TFOR:
				case TWHILE:
				case ID:
					{
					setState(228); comandos();
					}
					break;
				case TEXIT:
					{
					setState(229); match(TEXIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235); match(CCB);
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
		enterRule(_localctx, 24, RULE_cmdwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); match(TWHILE);
			setState(238); match(OB);
			setState(239); expr2();
			setState(240); match(CB);
			setState(241); match(OCB);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << TEXIT) | (1L << ID))) != 0)) {
				{
				setState(244);
				switch (_input.LA(1)) {
				case TRETURN:
				case TPRINT:
				case TREAD:
				case TIF:
				case TFOR:
				case TWHILE:
				case ID:
					{
					setState(242); comandos();
					}
					break;
				case TEXIT:
					{
					setState(243); match(TEXIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249); match(CCB);
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
		public TerminalNode EQUALS() { return getToken(simpleJavaParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(simpleJavaParser.ID, 0); }
		public TerminalNode STR() { return getToken(simpleJavaParser.STR, 0); }
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
		enterRule(_localctx, 26, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); match(ID);
			setState(252); match(EQUALS);
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(253); expr(0);
				}
				break;

			case 2:
				{
				setState(254); expr2();
				}
				break;

			case 3:
				{
				setState(255); match(STR);
				}
				break;

			case 4:
				{
				setState(256); match(BOOL);
				}
				break;

			case 5:
				{
				setState(257); chamadaFuncoes();
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

	public static class PrintContext extends ParserRuleContext {
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public List<TerminalNode> BOOL() { return getTokens(simpleJavaParser.BOOL); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(simpleJavaParser.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> STR() { return getTokens(simpleJavaParser.STR); }
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public TerminalNode STR(int i) {
			return getToken(simpleJavaParser.STR, i);
		}
		public TerminalNode BOOL(int i) {
			return getToken(simpleJavaParser.BOOL, i);
		}
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
		enterRule(_localctx, 28, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); match(TPRINT);
			setState(261); match(OB);
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(262); expr(0);
				}
				break;

			case 2:
				{
				setState(263); expr2();
				}
				break;

			case 3:
				{
				setState(264); match(STR);
				}
				break;

			case 4:
				{
				setState(265); match(BOOL);
				}
				break;
			}
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(268); match(COMMA);
				setState(273);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(269); expr(0);
					}
					break;

				case 2:
					{
					setState(270); expr2();
					}
					break;

				case 3:
					{
					setState(271); match(STR);
					}
					break;

				case 4:
					{
					setState(272); match(BOOL);
					}
					break;
				}
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
		enterRule(_localctx, 30, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(TREAD);
			setState(283); match(OB);
			setState(284); match(ID);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(285); match(COMMA);
				setState(286); match(ID);
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292); match(CB);
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
		int _startState = 32;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new BracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(295); match(OB);
				setState(296); expr(0);
				setState(297); match(CB);
				}
				break;

			case 2:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299); match(INT);
				}
				break;

			case 3:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300); match(FLOAT);
				}
				break;

			case 4:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301); match(ID);
				}
				break;

			case 5:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302); chamadaFuncoes();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(311);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(305);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(306);
						_la = _input.LA(1);
						if ( !(_la==MUT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(307); expr(7);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(308);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(309);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(310); expr(6);
						}
						break;
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		enterRule(_localctx, 34, RULE_expr2);
		try {
			setState(329);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316); match(OB);
				setState(317); expr2();
				setState(318); match(CB);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320); expr(0);
				setState(321); match(BO);
				setState(322); expr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324); match(NOT);
				setState(325); expr2();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(326); match(BOOL);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(327); match(ID);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(328); chamadaFuncoes();
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
		case 16: return expr_sempred((ExprContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3&\u014e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\7\2\62\n\2"+
		"\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\6\7\6b\n\6\f"+
		"\6\16\6e\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7p\n\7\f\7\16\7s\13"+
		"\7\5\7u\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b~\n\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u0088\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\7\t\u0091\n"+
		"\t\f\t\16\t\u0094\13\t\5\t\u0096\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u009f"+
		"\n\n\f\n\16\n\u00a2\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b8\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c0\n\f\f\f\16\f\u00c3\13\f\3\f\3\f\3\f"+
		"\3\f\7\f\u00c9\n\f\f\f\16\f\u00cc\13\f\3\f\5\f\u00cf\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00d7\n\r\3\r\3\r\3\r\5\r\u00dc\n\r\3\r\3\r\3\r\5\r\u00e1"+
		"\n\r\5\r\u00e3\n\r\3\r\3\r\3\r\3\r\7\r\u00e9\n\r\f\r\16\r\u00ec\13\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00f7\n\16\f\16\16\16\u00fa"+
		"\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0105\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u010d\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0114\n\20\7\20\u0116\n\20\f\20\16\20\u0119\13\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0122\n\21\f\21\16\21\u0125\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0132\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u013a\n\22\f\22\16\22\u013d\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u014c\n\23"+
		"\3\23\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\3\2\17\22\3"+
		"\2\37 \3\2\35\36\u017d\2&\3\2\2\2\48\3\2\2\2\6C\3\2\2\2\bE\3\2\2\2\nR"+
		"\3\2\2\2\ft\3\2\2\2\16v\3\2\2\2\20\u0081\3\2\2\2\22\u0099\3\2\2\2\24\u00b7"+
		"\3\2\2\2\26\u00b9\3\2\2\2\30\u00d0\3\2\2\2\32\u00ef\3\2\2\2\34\u00fd\3"+
		"\2\2\2\36\u0106\3\2\2\2 \u011c\3\2\2\2\"\u0131\3\2\2\2$\u014b\3\2\2\2"+
		"&\'\7\3\2\2\'(\7#\2\2(-\7\25\2\2),\5\4\3\2*,\5\b\5\2+)\3\2\2\2+*\3\2\2"+
		"\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\63\3\2\2\2/-\3\2\2\2\60\62\5\n\6\2\61"+
		"\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65"+
		"\63\3\2\2\2\66\67\5\22\n\2\67\3\3\2\2\289\5\6\4\29:\7#\2\2:?\7\26\2\2"+
		";@\5\"\22\2<@\5$\23\2=@\7!\2\2>@\7\"\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2"+
		"?>\3\2\2\2@A\3\2\2\2AB\7\25\2\2B\5\3\2\2\2CD\t\2\2\2D\7\3\2\2\2EF\7\4"+
		"\2\2FK\7#\2\2GH\7\23\2\2HJ\7#\2\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2"+
		"\2\2LN\3\2\2\2MK\3\2\2\2NO\7\24\2\2OP\5\6\4\2PQ\7\25\2\2Q\t\3\2\2\2RS"+
		"\7#\2\2ST\7\27\2\2TU\5\f\7\2UV\7\30\2\2VW\7\24\2\2WX\5\6\4\2X]\7\31\2"+
		"\2Y\\\5\4\3\2Z\\\5\b\5\2[Y\3\2\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^c\3\2\2\2_]\3\2\2\2`b\5\24\13\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2c"+
		"d\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\32\2\2g\13\3\2\2\2hi\5\6\4\2ij\7#\2"+
		"\2jq\3\2\2\2kl\7\23\2\2lm\5\6\4\2mn\7#\2\2np\3\2\2\2ok\3\2\2\2ps\3\2\2"+
		"\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2th\3\2\2\2tu\3\2\2\2u\r\3\2"+
		"\2\2vw\7\6\2\2w}\7\27\2\2x~\5\"\22\2y~\5$\23\2z~\5\20\t\2{~\7!\2\2|~\7"+
		"\"\2\2}x\3\2\2\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\177\3\2\2\2"+
		"\177\u0080\7\30\2\2\u0080\17\3\2\2\2\u0081\u0082\7#\2\2\u0082\u0095\7"+
		"\27\2\2\u0083\u0088\5\"\22\2\u0084\u0088\5$\23\2\u0085\u0088\7!\2\2\u0086"+
		"\u0088\7\"\2\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0086\3\2\2\2\u0088\u0092\3\2\2\2\u0089\u008e\7\23\2\2\u008a"+
		"\u008f\5\"\22\2\u008b\u008f\5$\23\2\u008c\u008f\7!\2\2\u008d\u008f\7\""+
		"\2\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u0089\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0087\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\7\30\2\2\u0098\21\3\2\2\2\u0099\u009a\7\5\2\2\u009a\u009b"+
		"\7\27\2\2\u009b\u009c\7\30\2\2\u009c\u00a0\7\31\2\2\u009d\u009f\5\24\13"+
		"\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\32\2\2"+
		"\u00a4\23\3\2\2\2\u00a5\u00a6\5\34\17\2\u00a6\u00a7\7\25\2\2\u00a7\u00b8"+
		"\3\2\2\2\u00a8\u00a9\5\20\t\2\u00a9\u00aa\7\25\2\2\u00aa\u00b8\3\2\2\2"+
		"\u00ab\u00ac\5\16\b\2\u00ac\u00ad\7\25\2\2\u00ad\u00b8\3\2\2\2\u00ae\u00af"+
		"\5\36\20\2\u00af\u00b0\7\25\2\2\u00b0\u00b8\3\2\2\2\u00b1\u00b2\5 \21"+
		"\2\u00b2\u00b3\7\25\2\2\u00b3\u00b8\3\2\2\2\u00b4\u00b8\5\26\f\2\u00b5"+
		"\u00b8\5\30\r\2\u00b6\u00b8\5\32\16\2\u00b7\u00a5\3\2\2\2\u00b7\u00a8"+
		"\3\2\2\2\u00b7\u00ab\3\2\2\2\u00b7\u00ae\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7"+
		"\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\25\3\2\2"+
		"\2\u00b9\u00ba\7\t\2\2\u00ba\u00bb\7\27\2\2\u00bb\u00bc\5$\23\2\u00bc"+
		"\u00bd\7\30\2\2\u00bd\u00c1\7\31\2\2\u00be\u00c0\5\24\13\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00ce\7\32\2\2\u00c5\u00c6\7"+
		"\n\2\2\u00c6\u00ca\7\31\2\2\u00c7\u00c9\5\24\13\2\u00c8\u00c7\3\2\2\2"+
		"\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\7\32\2\2\u00ce\u00c5\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf\27\3\2\2\2\u00d0\u00d1\7\13\2\2\u00d1\u00d2"+
		"\7\27\2\2\u00d2\u00d3\7#\2\2\u00d3\u00d6\7\26\2\2\u00d4\u00d7\5\"\22\2"+
		"\u00d5\u00d7\5$\23\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00db\7\24\2\2\u00d9\u00dc\5\"\22\2\u00da\u00dc\5$\23\2"+
		"\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00e2\3\2\2\2\u00dd\u00e0"+
		"\7\f\2\2\u00de\u00e1\5\"\22\2\u00df\u00e1\5$\23\2\u00e0\u00de\3\2\2\2"+
		"\u00e0\u00df\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\30\2\2\u00e5\u00ea\7\31\2\2"+
		"\u00e6\u00e9\5\24\13\2\u00e7\u00e9\7\16\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\32\2\2\u00ee"+
		"\31\3\2\2\2\u00ef\u00f0\7\r\2\2\u00f0\u00f1\7\27\2\2\u00f1\u00f2\5$\23"+
		"\2\u00f2\u00f3\7\30\2\2\u00f3\u00f8\7\31\2\2\u00f4\u00f7\5\24\13\2\u00f5"+
		"\u00f7\7\16\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3"+
		"\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\7\32\2\2\u00fc\33\3\2\2\2\u00fd\u00fe\7#\2"+
		"\2\u00fe\u0104\7\26\2\2\u00ff\u0105\5\"\22\2\u0100\u0105\5$\23\2\u0101"+
		"\u0105\7!\2\2\u0102\u0105\7\"\2\2\u0103\u0105\5\20\t\2\u0104\u00ff\3\2"+
		"\2\2\u0104\u0100\3\2\2\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0103\3\2\2\2\u0105\35\3\2\2\2\u0106\u0107\7\7\2\2\u0107\u010c\7\27\2"+
		"\2\u0108\u010d\5\"\22\2\u0109\u010d\5$\23\2\u010a\u010d\7!\2\2\u010b\u010d"+
		"\7\"\2\2\u010c\u0108\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010d\u0117\3\2\2\2\u010e\u0113\7\23\2\2\u010f\u0114\5"+
		"\"\22\2\u0110\u0114\5$\23\2\u0111\u0114\7!\2\2\u0112\u0114\7\"\2\2\u0113"+
		"\u010f\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2"+
		"\2\2\u0114\u0116\3\2\2\2\u0115\u010e\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u011a\u011b\7\30\2\2\u011b\37\3\2\2\2\u011c\u011d\7\b\2\2\u011d\u011e"+
		"\7\27\2\2\u011e\u0123\7#\2\2\u011f\u0120\7\23\2\2\u0120\u0122\7#\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\30\2\2\u0127"+
		"!\3\2\2\2\u0128\u0129\b\22\1\2\u0129\u012a\7\27\2\2\u012a\u012b\5\"\22"+
		"\2\u012b\u012c\7\30\2\2\u012c\u0132\3\2\2\2\u012d\u0132\7$\2\2\u012e\u0132"+
		"\7%\2\2\u012f\u0132\7#\2\2\u0130\u0132\5\20\t\2\u0131\u0128\3\2\2\2\u0131"+
		"\u012d\3\2\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2"+
		"\2\2\u0132\u013b\3\2\2\2\u0133\u0134\6\22\2\3\u0134\u0135\t\3\2\2\u0135"+
		"\u013a\5\"\22\2\u0136\u0137\6\22\3\3\u0137\u0138\t\4\2\2\u0138\u013a\5"+
		"\"\22\2\u0139\u0133\3\2\2\2\u0139\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c#\3\2\2\2\u013d\u013b\3\2\2\2"+
		"\u013e\u013f\7\27\2\2\u013f\u0140\5$\23\2\u0140\u0141\7\30\2\2\u0141\u014c"+
		"\3\2\2\2\u0142\u0143\5\"\22\2\u0143\u0144\7\33\2\2\u0144\u0145\5\"\22"+
		"\2\u0145\u014c\3\2\2\2\u0146\u0147\7\34\2\2\u0147\u014c\5$\23\2\u0148"+
		"\u014c\7\"\2\2\u0149\u014c\7#\2\2\u014a\u014c\5\20\t\2\u014b\u013e\3\2"+
		"\2\2\u014b\u0142\3\2\2\2\u014b\u0146\3\2\2\2\u014b\u0148\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c%\3\2\2\2\'+-\63?K[]cqt}\u0087"+
		"\u008e\u0092\u0095\u00a0\u00b7\u00c1\u00ca\u00ce\u00d6\u00db\u00e0\u00e2"+
		"\u00e8\u00ea\u00f6\u00f8\u0104\u010c\u0113\u0117\u0123\u0131\u0139\u013b"+
		"\u014b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}