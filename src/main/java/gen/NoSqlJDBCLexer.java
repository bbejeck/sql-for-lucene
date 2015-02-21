// Generated from /Users/bbejeck/workspace_intellij/nosql-jdbc-driver/src/main/java/NoSqlJDBC.g4 by ANTLR 4.x
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NoSqlJDBCLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, AND=4, OR=5, NOT=6, DESCRIBE=7, EQ=8, NE=9, 
		GT=10, LT=11, GTE=12, LTE=13, IN=14, DIGIT=15, NUMBER=16, FIELD=17, PATH=18, 
		TERM=19, PHRASE=20, WILD_CARD=21, MULTI_PHRASE=22, DB_QUOTE_STRING_LIT=23, 
		COMMA=24, RPAREN=25, LPAREN=26, WS=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'"
	};
	public static final String[] ruleNames = {
		"SELECT", "FROM", "WHERE", "AND", "OR", "NOT", "DESCRIBE", "EQ", "NE", 
		"GT", "LT", "GTE", "LTE", "IN", "DIGIT", "NUMBER", "FIELD", "PATH", "TERM", 
		"PHRASE", "WILD_CARD", "MULTI_PHRASE", "DB_QUOTE_STRING_LIT", "COMMA", 
		"RPAREN", "LPAREN", "WS"
	};


	public NoSqlJDBCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NoSqlJDBC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00de\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\7\21v\n\21\f\21\16\21y\13\21\3\22\6\22|\n\22\r\22\16\22}\3\22"+
		"\3\22\7\22\u0082\n\22\f\22\16\22\u0085\13\22\3\22\7\22\u0088\n\22\f\22"+
		"\16\22\u008b\13\22\7\22\u008d\n\22\f\22\16\22\u0090\13\22\3\23\3\23\5"+
		"\23\u0094\n\23\3\23\3\23\6\23\u0098\n\23\r\23\16\23\u0099\3\23\6\23\u009d"+
		"\n\23\r\23\16\23\u009e\3\24\3\24\7\24\u00a3\n\24\f\24\16\24\u00a6\13\24"+
		"\3\24\3\24\3\25\3\25\7\25\u00ac\n\25\f\25\16\25\u00af\13\25\3\25\3\25"+
		"\3\26\3\26\7\26\u00b5\n\26\f\26\16\26\u00b8\13\26\3\26\3\26\3\27\3\27"+
		"\6\27\u00be\n\27\r\27\16\27\u00bf\3\27\6\27\u00c3\n\27\r\27\16\27\u00c4"+
		"\3\27\3\27\3\30\3\30\7\30\u00cb\n\30\f\30\16\30\u00ce\13\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u00d9\n\34\r\34\16\34\u00da\3"+
		"\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\35\3\2\34\4\2UUuu\4\2GGgg\4\2NNnn\4\2EEee\4\2VVvv\4\2HHhh\4\2T"+
		"Ttt\4\2QQqq\4\2OOoo\4\2YYyy\4\2JJjj\4\2CCcc\4\2PPpp\4\2FFff\4\2KKkk\4"+
		"\2DDdd\3\2\62;\4\2C\\c|\4\2<<aa\3\2\61\61\6\2\"\")),,AA\5\2)),,AA\4\2"+
		"\"\"))\3\2))\3\2$$\5\2\13\f\17\17\"\"\u00ec\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5@\3\2\2\2\7E\3\2\2\2\tK\3\2\2"+
		"\2\13O\3\2\2\2\rR\3\2\2\2\17V\3\2\2\2\21_\3\2\2\2\23a\3\2\2\2\25d\3\2"+
		"\2\2\27f\3\2\2\2\31h\3\2\2\2\33k\3\2\2\2\35n\3\2\2\2\37q\3\2\2\2!s\3\2"+
		"\2\2#{\3\2\2\2%\u0093\3\2\2\2\'\u00a0\3\2\2\2)\u00a9\3\2\2\2+\u00b2\3"+
		"\2\2\2-\u00bb\3\2\2\2/\u00c8\3\2\2\2\61\u00d1\3\2\2\2\63\u00d3\3\2\2\2"+
		"\65\u00d5\3\2\2\2\67\u00d8\3\2\2\29:\t\2\2\2:;\t\3\2\2;<\t\4\2\2<=\t\3"+
		"\2\2=>\t\5\2\2>?\t\6\2\2?\4\3\2\2\2@A\t\7\2\2AB\t\b\2\2BC\t\t\2\2CD\t"+
		"\n\2\2D\6\3\2\2\2EF\t\13\2\2FG\t\f\2\2GH\t\3\2\2HI\t\b\2\2IJ\t\3\2\2J"+
		"\b\3\2\2\2KL\t\r\2\2LM\t\16\2\2MN\t\17\2\2N\n\3\2\2\2OP\t\t\2\2PQ\t\b"+
		"\2\2Q\f\3\2\2\2RS\t\16\2\2ST\t\t\2\2TU\t\6\2\2U\16\3\2\2\2VW\t\17\2\2"+
		"WX\t\3\2\2XY\t\2\2\2YZ\t\5\2\2Z[\t\b\2\2[\\\t\20\2\2\\]\t\21\2\2]^\t\3"+
		"\2\2^\20\3\2\2\2_`\7?\2\2`\22\3\2\2\2ab\7#\2\2bc\7?\2\2c\24\3\2\2\2de"+
		"\7@\2\2e\26\3\2\2\2fg\7>\2\2g\30\3\2\2\2hi\7@\2\2ij\7?\2\2j\32\3\2\2\2"+
		"kl\7>\2\2lm\7?\2\2m\34\3\2\2\2no\t\20\2\2op\t\16\2\2p\36\3\2\2\2qr\t\22"+
		"\2\2r \3\2\2\2sw\5\37\20\2tv\5\37\20\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2w"+
		"x\3\2\2\2x\"\3\2\2\2yw\3\2\2\2z|\t\23\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2"+
		"\2}~\3\2\2\2~\u008e\3\2\2\2\177\u0083\t\24\2\2\u0080\u0082\t\22\2\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0089\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\t\23\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c\177\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f$\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\t\23\2\2\u0092\u0094\7<\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u009c\7\61\2\2\u0096"+
		"\u0098\n\25\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3"+
		"\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7\61\2\2\u009c"+
		"\u0097\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f&\3\2\2\2\u00a0\u00a4\7)\2\2\u00a1\u00a3\n\26\2\2\u00a2\u00a1"+
		"\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7)\2\2\u00a8(\3\2\2\2\u00a9"+
		"\u00ad\7)\2\2\u00aa\u00ac\n\27\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b1\7)\2\2\u00b1*\3\2\2\2\u00b2\u00b6\7)\2\2\u00b3"+
		"\u00b5\n\30\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00ba\7)\2\2\u00ba,\3\2\2\2\u00bb\u00bd\7)\2\2\u00bc\u00be\n\26\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00c3\n\31\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c7\7)\2\2\u00c7.\3\2\2\2\u00c8\u00cc\7$\2\2\u00c9\u00cb"+
		"\n\32\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0"+
		"\7$\2\2\u00d0\60\3\2\2\2\u00d1\u00d2\7.\2\2\u00d2\62\3\2\2\2\u00d3\u00d4"+
		"\7*\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\7+\2\2\u00d6\66\3\2\2\2\u00d7\u00d9"+
		"\t\33\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\34\2\2\u00dd8\3"+
		"\2\2\2\22\2w}\u0083\u0089\u008e\u0093\u0099\u009e\u00a4\u00ad\u00b6\u00bf"+
		"\u00c4\u00cc\u00da\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}