// Generated from /Users/bbejeck/dev/github_clones/sql-for-lucene/src/main/java/LuceneSql.g4 by ANTLR 4.5
package bbejeck.sql.antlr.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuceneSqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, AND=4, OR=5, NOT=6, DESCRIBE=7, MATCHES=8, 
		BETWEEN=9, LIKE=10, LIMIT=11, EQ=12, NE=13, GT=14, LT=15, GTE=16, LTE=17, 
		IN=18, SPLAT=19, NUMBER=20, DATE=21, FIELD=22, PATH=23, TERM=24, PHRASE=25, 
		WILD_CARD=26, MULTI_PHRASE=27, DB_QUOTE_STRING_LIT=28, COMMA=29, RPAREN=30, 
		LPAREN=31, WS=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "FROM", "WHERE", "AND", "OR", "NOT", "DESCRIBE", "MATCHES", 
		"BETWEEN", "LIKE", "LIMIT", "EQ", "NE", "GT", "LT", "GTE", "LTE", "IN", 
		"SPLAT", "DIGIT", "NUMBER", "DATE_SEP", "DATE", "FIELD", "PATH", "TERM", 
		"PHRASE", "WILD_CARD", "MULTI_PHRASE", "DB_QUOTE_STRING_LIT", "COMMA", 
		"RPAREN", "LPAREN", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'='", "'!='", "'>'", "'<'", "'>='", "'<='", null, "'*'", null, null, 
		null, null, null, null, null, null, null, "','", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "AND", "OR", "NOT", "DESCRIBE", "MATCHES", 
		"BETWEEN", "LIKE", "LIMIT", "EQ", "NE", "GT", "LT", "GTE", "LTE", "IN", 
		"SPLAT", "NUMBER", "DATE", "FIELD", "PATH", "TERM", "PHRASE", "WILD_CARD", 
		"MULTI_PHRASE", "DB_QUOTE_STRING_LIT", "COMMA", "RPAREN", "LPAREN", "WS"
	};
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LuceneSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LuceneSql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u011c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\7\26\u00a1\n\26"+
		"\f\26\16\26\u00a4\13\26\3\27\3\27\3\30\6\30\u00a9\n\30\r\30\16\30\u00aa"+
		"\3\30\5\30\u00ae\n\30\6\30\u00b0\n\30\r\30\16\30\u00b1\3\31\6\31\u00b5"+
		"\n\31\r\31\16\31\u00b6\3\31\3\31\7\31\u00bb\n\31\f\31\16\31\u00be\13\31"+
		"\3\31\7\31\u00c1\n\31\f\31\16\31\u00c4\13\31\7\31\u00c6\n\31\f\31\16\31"+
		"\u00c9\13\31\3\32\3\32\3\32\5\32\u00ce\n\32\3\32\5\32\u00d1\n\32\3\32"+
		"\6\32\u00d4\n\32\r\32\16\32\u00d5\3\32\6\32\u00d9\n\32\r\32\16\32\u00da"+
		"\3\32\3\32\3\33\3\33\7\33\u00e1\n\33\f\33\16\33\u00e4\13\33\3\33\3\33"+
		"\3\34\3\34\7\34\u00ea\n\34\f\34\16\34\u00ed\13\34\3\34\3\34\3\35\3\35"+
		"\7\35\u00f3\n\35\f\35\16\35\u00f6\13\35\3\35\3\35\3\36\3\36\6\36\u00fc"+
		"\n\36\r\36\16\36\u00fd\3\36\6\36\u0101\n\36\r\36\16\36\u0102\3\36\3\36"+
		"\3\37\3\37\7\37\u0109\n\37\f\37\16\37\u010c\13\37\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\6#\u0117\n#\r#\16#\u0118\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\2+\26-\2/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"\3\2\36\4"+
		"\2UUuu\4\2GGgg\4\2NNnn\4\2EEee\4\2VVvv\4\2HHhh\4\2TTtt\4\2QQqq\4\2OOo"+
		"o\4\2YYyy\4\2JJjj\4\2CCcc\4\2PPpp\4\2FFff\4\2KKkk\4\2DDdd\4\2MMmm\3\2"+
		"\62;\4\2//\61\61\4\2C\\c|\4\2<<aa\3\2\61\61\6\2\"\")),,AA\5\2)),,AA\4"+
		"\2\"\"))\3\2))\3\2$$\5\2\13\f\17\17\"\"\u012c\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2+\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\3G\3\2\2\2\5N\3\2\2\2\7S\3\2\2\2\tY\3\2\2\2\13]\3\2\2"+
		"\2\r`\3\2\2\2\17d\3\2\2\2\21m\3\2\2\2\23u\3\2\2\2\25}\3\2\2\2\27\u0082"+
		"\3\2\2\2\31\u0088\3\2\2\2\33\u008a\3\2\2\2\35\u008d\3\2\2\2\37\u008f\3"+
		"\2\2\2!\u0091\3\2\2\2#\u0094\3\2\2\2%\u0097\3\2\2\2\'\u009a\3\2\2\2)\u009c"+
		"\3\2\2\2+\u009e\3\2\2\2-\u00a5\3\2\2\2/\u00af\3\2\2\2\61\u00b4\3\2\2\2"+
		"\63\u00ca\3\2\2\2\65\u00de\3\2\2\2\67\u00e7\3\2\2\29\u00f0\3\2\2\2;\u00f9"+
		"\3\2\2\2=\u0106\3\2\2\2?\u010f\3\2\2\2A\u0111\3\2\2\2C\u0113\3\2\2\2E"+
		"\u0116\3\2\2\2GH\t\2\2\2HI\t\3\2\2IJ\t\4\2\2JK\t\3\2\2KL\t\5\2\2LM\t\6"+
		"\2\2M\4\3\2\2\2NO\t\7\2\2OP\t\b\2\2PQ\t\t\2\2QR\t\n\2\2R\6\3\2\2\2ST\t"+
		"\13\2\2TU\t\f\2\2UV\t\3\2\2VW\t\b\2\2WX\t\3\2\2X\b\3\2\2\2YZ\t\r\2\2Z"+
		"[\t\16\2\2[\\\t\17\2\2\\\n\3\2\2\2]^\t\t\2\2^_\t\b\2\2_\f\3\2\2\2`a\t"+
		"\16\2\2ab\t\t\2\2bc\t\6\2\2c\16\3\2\2\2de\t\17\2\2ef\t\3\2\2fg\t\2\2\2"+
		"gh\t\5\2\2hi\t\b\2\2ij\t\20\2\2jk\t\21\2\2kl\t\3\2\2l\20\3\2\2\2mn\t\n"+
		"\2\2no\t\r\2\2op\t\6\2\2pq\t\5\2\2qr\t\f\2\2rs\t\3\2\2st\t\2\2\2t\22\3"+
		"\2\2\2uv\t\21\2\2vw\t\3\2\2wx\t\6\2\2xy\t\13\2\2yz\t\3\2\2z{\t\3\2\2{"+
		"|\t\16\2\2|\24\3\2\2\2}~\t\4\2\2~\177\t\20\2\2\177\u0080\t\22\2\2\u0080"+
		"\u0081\t\3\2\2\u0081\26\3\2\2\2\u0082\u0083\t\4\2\2\u0083\u0084\t\20\2"+
		"\2\u0084\u0085\t\n\2\2\u0085\u0086\t\20\2\2\u0086\u0087\t\6\2\2\u0087"+
		"\30\3\2\2\2\u0088\u0089\7?\2\2\u0089\32\3\2\2\2\u008a\u008b\7#\2\2\u008b"+
		"\u008c\7?\2\2\u008c\34\3\2\2\2\u008d\u008e\7@\2\2\u008e\36\3\2\2\2\u008f"+
		"\u0090\7>\2\2\u0090 \3\2\2\2\u0091\u0092\7@\2\2\u0092\u0093\7?\2\2\u0093"+
		"\"\3\2\2\2\u0094\u0095\7>\2\2\u0095\u0096\7?\2\2\u0096$\3\2\2\2\u0097"+
		"\u0098\t\20\2\2\u0098\u0099\t\16\2\2\u0099&\3\2\2\2\u009a\u009b\7,\2\2"+
		"\u009b(\3\2\2\2\u009c\u009d\t\23\2\2\u009d*\3\2\2\2\u009e\u00a2\5)\25"+
		"\2\u009f\u00a1\5)\25\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3,\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\t\24\2\2\u00a6.\3\2\2\2\u00a7\u00a9\5+\26\2\u00a8\u00a7\3\2\2\2"+
		"\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad"+
		"\3\2\2\2\u00ac\u00ae\5-\27\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00a8\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\60\3\2\2\2\u00b3\u00b5\t\25\2\2\u00b4\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00c7\3\2\2\2\u00b8\u00bc\t\26\2\2\u00b9\u00bb\t\23\2\2\u00ba\u00b9\3"+
		"\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00c2\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\t\25\2\2\u00c0\u00bf\3"+
		"\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00b8\3\2\2\2\u00c6\u00c9\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\62\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\u00cd\7)\2\2\u00cb\u00cc\t\25\2\2\u00cc\u00ce\7<\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00d1\7\61"+
		"\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d8\3\2\2\2\u00d2"+
		"\u00d4\n\27\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\7\61\2\2\u00d8"+
		"\u00d3\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7)\2\2\u00dd\64\3\2\2\2\u00de\u00e2"+
		"\7)\2\2\u00df\u00e1\n\30\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00e6\7)\2\2\u00e6\66\3\2\2\2\u00e7\u00eb\7)\2\2\u00e8\u00ea"+
		"\n\31\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2"+
		"\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef"+
		"\7)\2\2\u00ef8\3\2\2\2\u00f0\u00f4\7)\2\2\u00f1\u00f3\n\32\2\2\u00f2\u00f1"+
		"\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7)\2\2\u00f8:\3\2\2\2\u00f9"+
		"\u00fb\7)\2\2\u00fa\u00fc\n\30\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u0101\n\33\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3"+
		"\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7)\2\2\u0105"+
		"<\3\2\2\2\u0106\u010a\7$\2\2\u0107\u0109\n\34\2\2\u0108\u0107\3\2\2\2"+
		"\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d"+
		"\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7$\2\2\u010e>\3\2\2\2\u010f\u0110"+
		"\7.\2\2\u0110@\3\2\2\2\u0111\u0112\7*\2\2\u0112B\3\2\2\2\u0113\u0114\7"+
		"+\2\2\u0114D\3\2\2\2\u0115\u0117\t\35\2\2\u0116\u0115\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\b#\2\2\u011bF\3\2\2\2\26\2\u00a2\u00aa\u00ad\u00b1\u00b6\u00bc"+
		"\u00c2\u00c7\u00cd\u00d0\u00d5\u00da\u00e2\u00eb\u00f4\u00fd\u0102\u010a"+
		"\u0118\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}