package grammar;
// Generated from /Users/laercioag/Documents/Grammars/simpleJava/simpleJava.g4 by ANTLR 4.1

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
		RULE_declReturn = 5, RULE_chamadaFuncoes = 6, RULE_principal = 7, RULE_comandos = 8, 
		RULE_cmdifelse = 9, RULE_cmdfor = 10, RULE_cmdwhile = 11, RULE_atribuicao = 12, 
		RULE_print = 13, RULE_read = 14, RULE_expr = 15, RULE_expr2 = 16;
	public static final String[] ruleNames = {
		"prog", "declConst", "tipo", "declVars", "declFuncoes", "declReturn", 
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
			setState(34); match(TCLASS);
			setState(35); match(ID);
			setState(36); match(SCOLON);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TVAR) | (1L << TINT) | (1L << TFLOAT) | (1L << TSTR) | (1L << TBOOL))) != 0)) {
				{
				setState(39);
				switch (_input.LA(1)) {
				case TINT:
				case TFLOAT:
				case TSTR:
				case TBOOL:
					{
					setState(37); declConst();
					}
					break;
				case TVAR:
					{
					setState(38); declVars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(44); declFuncoes();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50); principal();
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
			setState(52); tipo();
			setState(53); match(ID);
			setState(54); match(EQUALS);
			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(55); expr(0);
				}
				break;

			case 2:
				{
				setState(56); expr2();
				}
				break;

			case 3:
				{
				setState(57); match(STR);
				}
				break;

			case 4:
				{
				setState(58); match(BOOL);
				}
				break;
			}
			setState(61); match(SCOLON);
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
			setState(63);
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
			setState(65); match(TVAR);
			setState(66); match(ID);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(67); match(COMMA);
				setState(68); match(ID);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74); match(COLON);
			setState(75); tipo();
			setState(76); match(SCOLON);
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
		public List<TerminalNode> ID() { return getTokens(simpleJavaParser.ID); }
		public List<DeclVarsContext> declVars() {
			return getRuleContexts(DeclVarsContext.class);
		}
		public TerminalNode OCB() { return getToken(simpleJavaParser.OCB, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(simpleJavaParser.COMMA, i);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<DeclConstContext> declConst() {
			return getRuleContexts(DeclConstContext.class);
		}
		public DeclVarsContext declVars(int i) {
			return getRuleContext(DeclVarsContext.class,i);
		}
		public TerminalNode CCB() { return getToken(simpleJavaParser.CCB, 0); }
		public DeclConstContext declConst(int i) {
			return getRuleContext(DeclConstContext.class,i);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(simpleJavaParser.COMMA); }
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public TerminalNode CB() { return getToken(simpleJavaParser.CB, 0); }
		public TerminalNode COLON() { return getToken(simpleJavaParser.COLON, 0); }
		public TerminalNode ID(int i) {
			return getToken(simpleJavaParser.ID, i);
		}
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
			setState(78); match(ID);
			setState(79); match(OB);
			setState(92);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TINT) | (1L << TFLOAT) | (1L << TSTR) | (1L << TBOOL))) != 0)) {
				{
				{
				setState(80); tipo();
				setState(81); match(ID);
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(83); match(COMMA);
					setState(84); tipo();
					setState(85); match(ID);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(94); match(CB);
			setState(95); match(COLON);
			setState(96); tipo();
			setState(97); match(OCB);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TVAR) | (1L << TINT) | (1L << TFLOAT) | (1L << TSTR) | (1L << TBOOL))) != 0)) {
				{
				setState(100);
				switch (_input.LA(1)) {
				case TINT:
				case TFLOAT:
				case TSTR:
				case TBOOL:
					{
					setState(98); declConst();
					}
					break;
				case TVAR:
					{
					setState(99); declVars();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << OB) | (1L << NOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(105); comandos();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111); match(CCB);
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
		enterRule(_localctx, 10, RULE_declReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(TRETURN);
			setState(114); match(OB);
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(115); expr(0);
				}
				break;

			case 2:
				{
				setState(116); expr2();
				}
				break;

			case 3:
				{
				setState(117); chamadaFuncoes();
				}
				break;

			case 4:
				{
				setState(118); match(STR);
				}
				break;

			case 5:
				{
				setState(119); match(BOOL);
				}
				break;
			}
			setState(122); match(CB);
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
		enterRule(_localctx, 12, RULE_chamadaFuncoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(ID);
			setState(125); match(OB);
			setState(144);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB) | (1L << NOT) | (1L << STR) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(130);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(126); expr(0);
					}
					break;

				case 2:
					{
					setState(127); expr2();
					}
					break;

				case 3:
					{
					setState(128); match(STR);
					}
					break;

				case 4:
					{
					setState(129); match(BOOL);
					}
					break;
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(132); match(COMMA);
					setState(137);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(133); expr(0);
						}
						break;

					case 2:
						{
						setState(134); expr2();
						}
						break;

					case 3:
						{
						setState(135); match(STR);
						}
						break;

					case 4:
						{
						setState(136); match(BOOL);
						}
						break;
					}
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(146); match(CB);
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
		enterRule(_localctx, 14, RULE_principal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(TMAIN);
			setState(149); match(OB);
			setState(150); match(CB);
			setState(151); match(OCB);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << OB) | (1L << NOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(152); comandos();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158); match(CCB);
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
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 16, RULE_comandos);
		try {
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); atribuicao();
				setState(161); match(SCOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163); chamadaFuncoes();
				setState(164); match(SCOLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166); declReturn();
				setState(167); match(SCOLON);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169); print();
				setState(170); match(SCOLON);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172); read();
				setState(173); match(SCOLON);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(175); cmdifelse();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(176); cmdfor();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(177); cmdwhile();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(178); expr(0);
				setState(179); match(SCOLON);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(181); expr2();
				setState(182); match(SCOLON);
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
		enterRule(_localctx, 18, RULE_cmdifelse);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << OB) | (1L << NOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
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
			setState(207);
			_la = _input.LA(1);
			if (_la==TELSE) {
				{
				setState(198); match(TELSE);
				setState(199); match(OCB);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << OB) | (1L << NOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(200); comandos();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206); match(CCB);
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
		enterRule(_localctx, 20, RULE_cmdfor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(TFOR);
			setState(210); match(OB);
			setState(211); match(ID);
			setState(212); match(EQUALS);
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(213); expr(0);
				}
				break;

			case 2:
				{
				setState(214); expr2();
				}
				break;
			}
			setState(217); match(COLON);
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(218); expr(0);
				}
				break;

			case 2:
				{
				setState(219); expr2();
				}
				break;
			}
			setState(227);
			_la = _input.LA(1);
			if (_la==TSTEP) {
				{
				setState(222); match(TSTEP);
				setState(225);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(223); expr(0);
					}
					break;

				case 2:
					{
					setState(224); expr2();
					}
					break;
				}
				}
			}

			setState(229); match(CB);
			setState(230); match(OCB);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << TEXIT) | (1L << OB) | (1L << NOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(233);
				switch (_input.LA(1)) {
				case TRETURN:
				case TPRINT:
				case TREAD:
				case TIF:
				case TFOR:
				case TWHILE:
				case OB:
				case NOT:
				case BOOL:
				case ID:
				case INT:
				case FLOAT:
					{
					setState(231); comandos();
					}
					break;
				case TEXIT:
					{
					setState(232); match(TEXIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238); match(CCB);
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
		enterRule(_localctx, 22, RULE_cmdwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); match(TWHILE);
			setState(241); match(OB);
			setState(242); expr2();
			setState(243); match(CB);
			setState(244); match(OCB);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRETURN) | (1L << TPRINT) | (1L << TREAD) | (1L << TIF) | (1L << TFOR) | (1L << TWHILE) | (1L << TEXIT) | (1L << OB) | (1L << NOT) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				setState(247);
				switch (_input.LA(1)) {
				case TRETURN:
				case TPRINT:
				case TREAD:
				case TIF:
				case TFOR:
				case TWHILE:
				case OB:
				case NOT:
				case BOOL:
				case ID:
				case INT:
				case FLOAT:
					{
					setState(245); comandos();
					}
					break;
				case TEXIT:
					{
					setState(246); match(TEXIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252); match(CCB);
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
		enterRule(_localctx, 24, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(ID);
			setState(255); match(EQUALS);
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(256); expr(0);
				}
				break;

			case 2:
				{
				setState(257); expr2();
				}
				break;

			case 3:
				{
				setState(258); match(STR);
				}
				break;

			case 4:
				{
				setState(259); match(BOOL);
				}
				break;

			case 5:
				{
				setState(260); chamadaFuncoes();
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
		enterRule(_localctx, 26, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(TPRINT);
			setState(264); match(OB);
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(265); expr(0);
				}
				break;

			case 2:
				{
				setState(266); expr2();
				}
				break;

			case 3:
				{
				setState(267); match(STR);
				}
				break;

			case 4:
				{
				setState(268); match(BOOL);
				}
				break;
			}
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(271); match(COMMA);
				setState(276);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(272); expr(0);
					}
					break;

				case 2:
					{
					setState(273); expr2();
					}
					break;

				case 3:
					{
					setState(274); match(STR);
					}
					break;

				case 4:
					{
					setState(275); match(BOOL);
					}
					break;
				}
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283); match(CB);
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
		enterRule(_localctx, 28, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(TREAD);
			setState(286); match(OB);
			setState(287); match(ID);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(288); match(COMMA);
				setState(289); match(ID);
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295); match(CB);
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
		public TerminalNode DIV() { return getToken(simpleJavaParser.DIV, 0); }
		public ChamadaFuncoesContext chamadaFuncoes() {
			return getRuleContext(ChamadaFuncoesContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(simpleJavaParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(simpleJavaParser.INT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode ID() { return getToken(simpleJavaParser.ID, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUT() { return getToken(simpleJavaParser.MUT, 0); }
		public TerminalNode OB() { return getToken(simpleJavaParser.OB, 0); }
		public TerminalNode CB() { return getToken(simpleJavaParser.CB, 0); }
		public TerminalNode SUB() { return getToken(simpleJavaParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(simpleJavaParser.ADD, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleJavaListener ) ((simpleJavaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleJavaVisitor ) return ((simpleJavaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(298); match(OB);
				setState(299); expr(0);
				setState(300); match(CB);
				}
				break;

			case 2:
				{
				setState(302); match(INT);
				}
				break;

			case 3:
				{
				setState(303); match(FLOAT);
				}
				break;

			case 4:
				{
				setState(304); match(ID);
				}
				break;

			case 5:
				{
				setState(305); chamadaFuncoes();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(314);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(308);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(309);
						_la = _input.LA(1);
						if ( !(_la==MUT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(310); expr(7);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(311);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(312);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(313); expr(6);
						}
						break;
					}
					} 
				}
				setState(318);
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
		enterRule(_localctx, 32, RULE_expr2);
		try {
			setState(332);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319); match(OB);
				setState(320); expr2();
				setState(321); match(CB);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323); expr(0);
				setState(324); match(BO);
				setState(325); expr(0);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327); match(NOT);
				setState(328); expr2();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329); match(BOOL);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(330); match(ID);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(331); chamadaFuncoes();
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
		case 15: return expr_sempred((ExprContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3&\u0151\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\7\2\60\n\2\f\2\16\2\63"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\5\6_\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6g\n\6\f\6\16\6j\13\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7{\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0085\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u008c\n\b\7\b\u008e\n\b\f\b\16\b\u0091"+
		"\13\b\5\b\u0093\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\t\u009c\n\t\f\t\16\t"+
		"\u009f\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bb\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00c3\n\13\f\13\16\13\u00c6\13\13\3\13\3\13"+
		"\3\13\3\13\7\13\u00cc\n\13\f\13\16\13\u00cf\13\13\3\13\5\13\u00d2\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00da\n\f\3\f\3\f\3\f\5\f\u00df\n\f\3\f\3"+
		"\f\3\f\5\f\u00e4\n\f\5\f\u00e6\n\f\3\f\3\f\3\f\3\f\7\f\u00ec\n\f\f\f\16"+
		"\f\u00ef\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fa\n\r\f\r\16"+
		"\r\u00fd\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0108\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0110\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0117\n\17\7\17\u0119\n\17\f\17\16\17\u011c\13\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u0125\n\20\f\20\16\20\u0128\13\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0135\n\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u013d\n\21\f\21\16\21\u0140\13\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014f"+
		"\n\22\3\22\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2\17\22"+
		"\3\2\37 \3\2\35\36\u0183\2$\3\2\2\2\4\66\3\2\2\2\6A\3\2\2\2\bC\3\2\2\2"+
		"\nP\3\2\2\2\fs\3\2\2\2\16~\3\2\2\2\20\u0096\3\2\2\2\22\u00ba\3\2\2\2\24"+
		"\u00bc\3\2\2\2\26\u00d3\3\2\2\2\30\u00f2\3\2\2\2\32\u0100\3\2\2\2\34\u0109"+
		"\3\2\2\2\36\u011f\3\2\2\2 \u0134\3\2\2\2\"\u014e\3\2\2\2$%\7\3\2\2%&\7"+
		"#\2\2&+\7\25\2\2\'*\5\4\3\2(*\5\b\5\2)\'\3\2\2\2)(\3\2\2\2*-\3\2\2\2+"+
		")\3\2\2\2+,\3\2\2\2,\61\3\2\2\2-+\3\2\2\2.\60\5\n\6\2/.\3\2\2\2\60\63"+
		"\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\5"+
		"\20\t\2\65\3\3\2\2\2\66\67\5\6\4\2\678\7#\2\28=\7\26\2\29>\5 \21\2:>\5"+
		"\"\22\2;>\7!\2\2<>\7\"\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>?\3"+
		"\2\2\2?@\7\25\2\2@\5\3\2\2\2AB\t\2\2\2B\7\3\2\2\2CD\7\4\2\2DI\7#\2\2E"+
		"F\7\23\2\2FH\7#\2\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2"+
		"KI\3\2\2\2LM\7\24\2\2MN\5\6\4\2NO\7\25\2\2O\t\3\2\2\2PQ\7#\2\2Q^\7\27"+
		"\2\2RS\5\6\4\2ST\7#\2\2T[\3\2\2\2UV\7\23\2\2VW\5\6\4\2WX\7#\2\2XZ\3\2"+
		"\2\2YU\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^R\3"+
		"\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\30\2\2ab\7\24\2\2bc\5\6\4\2ch\7\31\2\2"+
		"dg\5\4\3\2eg\5\b\5\2fd\3\2\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2"+
		"in\3\2\2\2jh\3\2\2\2km\5\22\n\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2"+
		"\2oq\3\2\2\2pn\3\2\2\2qr\7\32\2\2r\13\3\2\2\2st\7\6\2\2tz\7\27\2\2u{\5"+
		" \21\2v{\5\"\22\2w{\5\16\b\2x{\7!\2\2y{\7\"\2\2zu\3\2\2\2zv\3\2\2\2zw"+
		"\3\2\2\2zx\3\2\2\2zy\3\2\2\2{|\3\2\2\2|}\7\30\2\2}\r\3\2\2\2~\177\7#\2"+
		"\2\177\u0092\7\27\2\2\u0080\u0085\5 \21\2\u0081\u0085\5\"\22\2\u0082\u0085"+
		"\7!\2\2\u0083\u0085\7\"\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u008f\3\2\2\2\u0086\u008b\7\23"+
		"\2\2\u0087\u008c\5 \21\2\u0088\u008c\5\"\22\2\u0089\u008c\7!\2\2\u008a"+
		"\u008c\7\"\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008a\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u0086\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092\u0084\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\7\30\2\2\u0095\17\3\2\2\2\u0096\u0097\7\5\2"+
		"\2\u0097\u0098\7\27\2\2\u0098\u0099\7\30\2\2\u0099\u009d\7\31\2\2\u009a"+
		"\u009c\5\22\n\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a1\7\32\2\2\u00a1\21\3\2\2\2\u00a2\u00a3\5\32\16\2\u00a3\u00a4\7\25"+
		"\2\2\u00a4\u00bb\3\2\2\2\u00a5\u00a6\5\16\b\2\u00a6\u00a7\7\25\2\2\u00a7"+
		"\u00bb\3\2\2\2\u00a8\u00a9\5\f\7\2\u00a9\u00aa\7\25\2\2\u00aa\u00bb\3"+
		"\2\2\2\u00ab\u00ac\5\34\17\2\u00ac\u00ad\7\25\2\2\u00ad\u00bb\3\2\2\2"+
		"\u00ae\u00af\5\36\20\2\u00af\u00b0\7\25\2\2\u00b0\u00bb\3\2\2\2\u00b1"+
		"\u00bb\5\24\13\2\u00b2\u00bb\5\26\f\2\u00b3\u00bb\5\30\r\2\u00b4\u00b5"+
		"\5 \21\2\u00b5\u00b6\7\25\2\2\u00b6\u00bb\3\2\2\2\u00b7\u00b8\5\"\22\2"+
		"\u00b8\u00b9\7\25\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00a2\3\2\2\2\u00ba\u00a5"+
		"\3\2\2\2\u00ba\u00a8\3\2\2\2\u00ba\u00ab\3\2\2\2\u00ba\u00ae\3\2\2\2\u00ba"+
		"\u00b1\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b3\3\2\2\2\u00ba\u00b4\3\2"+
		"\2\2\u00ba\u00b7\3\2\2\2\u00bb\23\3\2\2\2\u00bc\u00bd\7\t\2\2\u00bd\u00be"+
		"\7\27\2\2\u00be\u00bf\5\"\22\2\u00bf\u00c0\7\30\2\2\u00c0\u00c4\7\31\2"+
		"\2\u00c1\u00c3\5\22\n\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00d1\7\32\2\2\u00c8\u00c9\7\n\2\2\u00c9\u00cd\7\31\2\2\u00ca"+
		"\u00cc\5\22\n\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3"+
		"\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d2\7\32\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\25\3\2\2"+
		"\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5\7\27\2\2\u00d5\u00d6\7#\2\2\u00d6"+
		"\u00d9\7\26\2\2\u00d7\u00da\5 \21\2\u00d8\u00da\5\"\22\2\u00d9\u00d7\3"+
		"\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de\7\24\2\2\u00dc"+
		"\u00df\5 \21\2\u00dd\u00df\5\"\22\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3"+
		"\2\2\2\u00df\u00e5\3\2\2\2\u00e0\u00e3\7\f\2\2\u00e1\u00e4\5 \21\2\u00e2"+
		"\u00e4\5\"\22\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e6\3"+
		"\2\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\7\30\2\2\u00e8\u00ed\7\31\2\2\u00e9\u00ec\5\22\n\2\u00ea\u00ec"+
		"\7\16\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00f0\u00f1\7\32\2\2\u00f1\27\3\2\2\2\u00f2\u00f3\7\r\2\2\u00f3"+
		"\u00f4\7\27\2\2\u00f4\u00f5\5\"\22\2\u00f5\u00f6\7\30\2\2\u00f6\u00fb"+
		"\7\31\2\2\u00f7\u00fa\5\22\n\2\u00f8\u00fa\7\16\2\2\u00f9\u00f7\3\2\2"+
		"\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7\32\2\2"+
		"\u00ff\31\3\2\2\2\u0100\u0101\7#\2\2\u0101\u0107\7\26\2\2\u0102\u0108"+
		"\5 \21\2\u0103\u0108\5\"\22\2\u0104\u0108\7!\2\2\u0105\u0108\7\"\2\2\u0106"+
		"\u0108\5\16\b\2\u0107\u0102\3\2\2\2\u0107\u0103\3\2\2\2\u0107\u0104\3"+
		"\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108\33\3\2\2\2\u0109"+
		"\u010a\7\7\2\2\u010a\u010f\7\27\2\2\u010b\u0110\5 \21\2\u010c\u0110\5"+
		"\"\22\2\u010d\u0110\7!\2\2\u010e\u0110\7\"\2\2\u010f\u010b\3\2\2\2\u010f"+
		"\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u011a\3\2"+
		"\2\2\u0111\u0116\7\23\2\2\u0112\u0117\5 \21\2\u0113\u0117\5\"\22\2\u0114"+
		"\u0117\7!\2\2\u0115\u0117\7\"\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0111\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7\30\2\2\u011e"+
		"\35\3\2\2\2\u011f\u0120\7\b\2\2\u0120\u0121\7\27\2\2\u0121\u0126\7#\2"+
		"\2\u0122\u0123\7\23\2\2\u0123\u0125\7#\2\2\u0124\u0122\3\2\2\2\u0125\u0128"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012a\7\30\2\2\u012a\37\3\2\2\2\u012b\u012c\b\21"+
		"\1\2\u012c\u012d\7\27\2\2\u012d\u012e\5 \21\2\u012e\u012f\7\30\2\2\u012f"+
		"\u0135\3\2\2\2\u0130\u0135\7$\2\2\u0131\u0135\7%\2\2\u0132\u0135\7#\2"+
		"\2\u0133\u0135\5\16\b\2\u0134\u012b\3\2\2\2\u0134\u0130\3\2\2\2\u0134"+
		"\u0131\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u013e\3\2"+
		"\2\2\u0136\u0137\6\21\2\3\u0137\u0138\t\3\2\2\u0138\u013d\5 \21\2\u0139"+
		"\u013a\6\21\3\3\u013a\u013b\t\4\2\2\u013b\u013d\5 \21\2\u013c\u0136\3"+
		"\2\2\2\u013c\u0139\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f!\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\27\2\2"+
		"\u0142\u0143\5\"\22\2\u0143\u0144\7\30\2\2\u0144\u014f\3\2\2\2\u0145\u0146"+
		"\5 \21\2\u0146\u0147\7\33\2\2\u0147\u0148\5 \21\2\u0148\u014f\3\2\2\2"+
		"\u0149\u014a\7\34\2\2\u014a\u014f\5\"\22\2\u014b\u014f\7\"\2\2\u014c\u014f"+
		"\7#\2\2\u014d\u014f\5\16\b\2\u014e\u0141\3\2\2\2\u014e\u0145\3\2\2\2\u014e"+
		"\u0149\3\2\2\2\u014e\u014b\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2"+
		"\2\2\u014f#\3\2\2\2\')+\61=I[^fhnz\u0084\u008b\u008f\u0092\u009d\u00ba"+
		"\u00c4\u00cd\u00d1\u00d9\u00de\u00e3\u00e5\u00eb\u00ed\u00f9\u00fb\u0107"+
		"\u010f\u0116\u011a\u0126\u0134\u013c\u013e\u014e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}