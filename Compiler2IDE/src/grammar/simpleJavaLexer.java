// Generated from /home/rafael/workspace/Compiladores/Compiler2IDE/src/grammar/simpleJava.g4 by ANTLR 4.1

   package grammar;
   import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleJavaLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TCLASS=1, TVAR=2, TMAIN=3, TRETURN=4, TPRINT=5, TREAD=6, TIF=7, TELSE=8, 
		TFOR=9, TSTEP=10, TWHILE=11, TEXIT=12, TINT=13, TFLOAT=14, TSTR=15, TBOOL=16, 
		COMMA=17, COLON=18, SCOLON=19, EQUALS=20, OB=21, CB=22, OCB=23, CCB=24, 
		BO=25, NOT=26, ADD=27, SUB=28, MUT=29, DIV=30, STR=31, BOOL=32, ID=33, 
		INT=34, FLOAT=35, WS=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'class'", "'var'", "'main'", "'return'", "'print'", "'read'", "'if'", 
		"'else'", "'for'", "'step'", "'while'", "'exit'", "'int'", "'float'", 
		"'string'", "'boolean'", "','", "':'", "';'", "'='", "'('", "')'", "'{'", 
		"'}'", "BO", "'!'", "'+'", "'-'", "'*'", "'/'", "STR", "BOOL", "ID", "INT", 
		"FLOAT", "WS"
	};
	public static final String[] ruleNames = {
		"TCLASS", "TVAR", "TMAIN", "TRETURN", "TPRINT", "TREAD", "TIF", "TELSE", 
		"TFOR", "TSTEP", "TWHILE", "TEXIT", "TINT", "TFLOAT", "TSTR", "TBOOL", 
		"COMMA", "COLON", "SCOLON", "EQUALS", "OB", "CB", "OCB", "CCB", "BO", 
		"NOT", "ADD", "SUB", "MUT", "DIV", "STR", "BOOL", "ID", "INT", "FLOAT", 
		"WS"
	};


	public simpleJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpleJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 35: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2&\u00fb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00be\n\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \7 \u00cc\n \f"+
		" \16 \u00cf\13 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00dc\n!\3\"\3\"\7"+
		"\"\u00e0\n\"\f\"\16\"\u00e3\13\"\3#\6#\u00e6\n#\r#\16#\u00e7\3$\6$\u00eb"+
		"\n$\r$\16$\u00ec\3$\3$\6$\u00f1\n$\r$\16$\u00f2\3%\6%\u00f6\n%\r%\16%"+
		"\u00f7\3%\3%\3\u00cd&\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n"+
		"\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%"+
		"\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19"+
		"\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\2\3\2\b\4\2$$\u201e\u201e\4\2$"+
		"$\u201f\u201f\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u0107"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\3K\3\2\2\2\5Q\3\2\2\2\7U\3\2\2\2\tZ\3\2\2\2\13a\3\2\2\2"+
		"\rg\3\2\2\2\17l\3\2\2\2\21o\3\2\2\2\23t\3\2\2\2\25x\3\2\2\2\27}\3\2\2"+
		"\2\31\u0083\3\2\2\2\33\u0088\3\2\2\2\35\u008c\3\2\2\2\37\u0092\3\2\2\2"+
		"!\u0099\3\2\2\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'\u00a5\3\2\2\2)\u00a7\3"+
		"\2\2\2+\u00a9\3\2\2\2-\u00ab\3\2\2\2/\u00ad\3\2\2\2\61\u00af\3\2\2\2\63"+
		"\u00bd\3\2\2\2\65\u00bf\3\2\2\2\67\u00c1\3\2\2\29\u00c3\3\2\2\2;\u00c5"+
		"\3\2\2\2=\u00c7\3\2\2\2?\u00c9\3\2\2\2A\u00db\3\2\2\2C\u00dd\3\2\2\2E"+
		"\u00e5\3\2\2\2G\u00ea\3\2\2\2I\u00f5\3\2\2\2KL\7e\2\2LM\7n\2\2MN\7c\2"+
		"\2NO\7u\2\2OP\7u\2\2P\4\3\2\2\2QR\7x\2\2RS\7c\2\2ST\7t\2\2T\6\3\2\2\2"+
		"UV\7o\2\2VW\7c\2\2WX\7k\2\2XY\7p\2\2Y\b\3\2\2\2Z[\7t\2\2[\\\7g\2\2\\]"+
		"\7v\2\2]^\7w\2\2^_\7t\2\2_`\7p\2\2`\n\3\2\2\2ab\7r\2\2bc\7t\2\2cd\7k\2"+
		"\2de\7p\2\2ef\7v\2\2f\f\3\2\2\2gh\7t\2\2hi\7g\2\2ij\7c\2\2jk\7f\2\2k\16"+
		"\3\2\2\2lm\7k\2\2mn\7h\2\2n\20\3\2\2\2op\7g\2\2pq\7n\2\2qr\7u\2\2rs\7"+
		"g\2\2s\22\3\2\2\2tu\7h\2\2uv\7q\2\2vw\7t\2\2w\24\3\2\2\2xy\7u\2\2yz\7"+
		"v\2\2z{\7g\2\2{|\7r\2\2|\26\3\2\2\2}~\7y\2\2~\177\7j\2\2\177\u0080\7k"+
		"\2\2\u0080\u0081\7n\2\2\u0081\u0082\7g\2\2\u0082\30\3\2\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7z\2\2\u0085\u0086\7k\2\2\u0086\u0087\7v\2\2\u0087"+
		"\32\3\2\2\2\u0088\u0089\7k\2\2\u0089\u008a\7p\2\2\u008a\u008b\7v\2\2\u008b"+
		"\34\3\2\2\2\u008c\u008d\7h\2\2\u008d\u008e\7n\2\2\u008e\u008f\7q\2\2\u008f"+
		"\u0090\7c\2\2\u0090\u0091\7v\2\2\u0091\36\3\2\2\2\u0092\u0093\7u\2\2\u0093"+
		"\u0094\7v\2\2\u0094\u0095\7t\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2"+
		"\u0097\u0098\7i\2\2\u0098 \3\2\2\2\u0099\u009a\7d\2\2\u009a\u009b\7q\2"+
		"\2\u009b\u009c\7q\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e\u009f"+
		"\7c\2\2\u009f\u00a0\7p\2\2\u00a0\"\3\2\2\2\u00a1\u00a2\7.\2\2\u00a2$\3"+
		"\2\2\2\u00a3\u00a4\7<\2\2\u00a4&\3\2\2\2\u00a5\u00a6\7=\2\2\u00a6(\3\2"+
		"\2\2\u00a7\u00a8\7?\2\2\u00a8*\3\2\2\2\u00a9\u00aa\7*\2\2\u00aa,\3\2\2"+
		"\2\u00ab\u00ac\7+\2\2\u00ac.\3\2\2\2\u00ad\u00ae\7}\2\2\u00ae\60\3\2\2"+
		"\2\u00af\u00b0\7\177\2\2\u00b0\62\3\2\2\2\u00b1\u00be\7@\2\2\u00b2\u00b3"+
		"\7@\2\2\u00b3\u00be\7?\2\2\u00b4\u00be\7>\2\2\u00b5\u00b6\7>\2\2\u00b6"+
		"\u00be\7?\2\2\u00b7\u00b8\7?\2\2\u00b8\u00be\7?\2\2\u00b9\u00ba\7>\2\2"+
		"\u00ba\u00be\7@\2\2\u00bb\u00bc\7#\2\2\u00bc\u00be\7?\2\2\u00bd\u00b1"+
		"\3\2\2\2\u00bd\u00b2\3\2\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd"+
		"\u00b7\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\64\3\2\2"+
		"\2\u00bf\u00c0\7#\2\2\u00c0\66\3\2\2\2\u00c1\u00c2\7-\2\2\u00c28\3\2\2"+
		"\2\u00c3\u00c4\7/\2\2\u00c4:\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6<\3\2\2\2"+
		"\u00c7\u00c8\7\61\2\2\u00c8>\3\2\2\2\u00c9\u00cd\t\2\2\2\u00ca\u00cc\13"+
		"\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\t\3"+
		"\2\2\u00d1@\3\2\2\2\u00d2\u00d3\7V\2\2\u00d3\u00d4\7T\2\2\u00d4\u00d5"+
		"\7W\2\2\u00d5\u00dc\7G\2\2\u00d6\u00d7\7H\2\2\u00d7\u00d8\7C\2\2\u00d8"+
		"\u00d9\7N\2\2\u00d9\u00da\7U\2\2\u00da\u00dc\7G\2\2\u00db\u00d2\3\2\2"+
		"\2\u00db\u00d6\3\2\2\2\u00dcB\3\2\2\2\u00dd\u00e1\t\4\2\2\u00de\u00e0"+
		"\t\5\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2D\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\t\6\2\2"+
		"\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8F\3\2\2\2\u00e9\u00eb\t\6\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f0\7\60\2\2\u00ef\u00f1\t\6\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3H\3\2\2\2"+
		"\u00f4\u00f6\t\7\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b%\2\2\u00fa"+
		"J\3\2\2\2\13\2\u00bd\u00cd\u00db\u00e1\u00e7\u00ec\u00f2\u00f7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}