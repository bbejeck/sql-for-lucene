/*
 * *
 *
 *
 * Copyright 2015 Bill Bejeck
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

// Generated from /Users/bbejeck/workspace_intellij/nosql-jdbc-driver/src/main/java/LuceneSql.g4 by ANTLR 4.5
package bbejeck.nosql.antlr.generated;
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
		BETWEEN=9, LIKE=10, MEMORY=11, EQ=12, NE=13, GT=14, LT=15, GTE=16, LTE=17, 
		IN=18, NUMBER=19, DATE=20, FIELD=21, PATH=22, TERM=23, PHRASE=24, WILD_CARD=25, 
		MULTI_PHRASE=26, DB_QUOTE_STRING_LIT=27, COMMA=28, RPAREN=29, LPAREN=30, 
		WS=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "FROM", "WHERE", "AND", "OR", "NOT", "DESCRIBE", "MATCHES", 
		"BETWEEN", "LIKE", "MEMORY", "EQ", "NE", "GT", "LT", "GTE", "LTE", "IN", 
		"DIGIT", "NUMBER", "DATE_SEP", "DATE", "FIELD", "PATH", "TERM", "PHRASE", 
		"WILD_CARD", "MULTI_PHRASE", "DB_QUOTE_STRING_LIT", "COMMA", "RPAREN", 
		"LPAREN", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'='", "'!='", "'>'", "'<'", "'>='", "'<='", null, null, null, null, null, 
		null, null, null, null, null, "','", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "AND", "OR", "NOT", "DESCRIBE", "MATCHES", 
		"BETWEEN", "LIKE", "MEMORY", "EQ", "NE", "GT", "LT", "GTE", "LTE", "IN", 
		"NUMBER", "DATE", "FIELD", "PATH", "TERM", "PHRASE", "WILD_CARD", "MULTI_PHRASE", 
		"DB_QUOTE_STRING_LIT", "COMMA", "RPAREN", "LPAREN", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\7\25\u009e\n\25\f\25\16\25\u00a1"+
		"\13\25\3\26\3\26\3\27\6\27\u00a6\n\27\r\27\16\27\u00a7\3\27\5\27\u00ab"+
		"\n\27\6\27\u00ad\n\27\r\27\16\27\u00ae\3\30\6\30\u00b2\n\30\r\30\16\30"+
		"\u00b3\3\30\3\30\7\30\u00b8\n\30\f\30\16\30\u00bb\13\30\3\30\7\30\u00be"+
		"\n\30\f\30\16\30\u00c1\13\30\7\30\u00c3\n\30\f\30\16\30\u00c6\13\30\3"+
		"\31\3\31\5\31\u00ca\n\31\3\31\3\31\6\31\u00ce\n\31\r\31\16\31\u00cf\3"+
		"\31\6\31\u00d3\n\31\r\31\16\31\u00d4\3\32\3\32\7\32\u00d9\n\32\f\32\16"+
		"\32\u00dc\13\32\3\32\3\32\3\33\3\33\7\33\u00e2\n\33\f\33\16\33\u00e5\13"+
		"\33\3\33\3\33\3\34\3\34\7\34\u00eb\n\34\f\34\16\34\u00ee\13\34\3\34\3"+
		"\34\3\35\3\35\6\35\u00f4\n\35\r\35\16\35\u00f5\3\35\6\35\u00f9\n\35\r"+
		"\35\16\35\u00fa\3\35\3\35\3\36\3\36\7\36\u0101\n\36\f\36\16\36\u0104\13"+
		"\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\6\"\u010f\n\"\r\"\16\"\u0110\3"+
		"\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\2)\25+\2-\26/\27\61\30\63\31\65\32\67\33"+
		"9\34;\35=\36?\37A C!\3\2\37\4\2UUuu\4\2GGgg\4\2NNnn\4\2EEee\4\2VVvv\4"+
		"\2HHhh\4\2TTtt\4\2QQqq\4\2OOoo\4\2YYyy\4\2JJjj\4\2CCcc\4\2PPpp\4\2FFf"+
		"f\4\2KKkk\4\2DDdd\4\2MMmm\4\2[[{{\3\2\62;\4\2//\61\61\4\2C\\c|\4\2<<a"+
		"a\3\2\61\61\6\2\"\")),,AA\5\2)),,AA\4\2\"\"))\3\2))\3\2$$\5\2\13\f\17"+
		"\17\"\"\u0123\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5L\3\2\2\2\7Q\3\2\2\2"+
		"\tW\3\2\2\2\13[\3\2\2\2\r^\3\2\2\2\17b\3\2\2\2\21k\3\2\2\2\23s\3\2\2\2"+
		"\25{\3\2\2\2\27\u0080\3\2\2\2\31\u0087\3\2\2\2\33\u0089\3\2\2\2\35\u008c"+
		"\3\2\2\2\37\u008e\3\2\2\2!\u0090\3\2\2\2#\u0093\3\2\2\2%\u0096\3\2\2\2"+
		"\'\u0099\3\2\2\2)\u009b\3\2\2\2+\u00a2\3\2\2\2-\u00ac\3\2\2\2/\u00b1\3"+
		"\2\2\2\61\u00c9\3\2\2\2\63\u00d6\3\2\2\2\65\u00df\3\2\2\2\67\u00e8\3\2"+
		"\2\29\u00f1\3\2\2\2;\u00fe\3\2\2\2=\u0107\3\2\2\2?\u0109\3\2\2\2A\u010b"+
		"\3\2\2\2C\u010e\3\2\2\2EF\t\2\2\2FG\t\3\2\2GH\t\4\2\2HI\t\3\2\2IJ\t\5"+
		"\2\2JK\t\6\2\2K\4\3\2\2\2LM\t\7\2\2MN\t\b\2\2NO\t\t\2\2OP\t\n\2\2P\6\3"+
		"\2\2\2QR\t\13\2\2RS\t\f\2\2ST\t\3\2\2TU\t\b\2\2UV\t\3\2\2V\b\3\2\2\2W"+
		"X\t\r\2\2XY\t\16\2\2YZ\t\17\2\2Z\n\3\2\2\2[\\\t\t\2\2\\]\t\b\2\2]\f\3"+
		"\2\2\2^_\t\16\2\2_`\t\t\2\2`a\t\6\2\2a\16\3\2\2\2bc\t\17\2\2cd\t\3\2\2"+
		"de\t\2\2\2ef\t\5\2\2fg\t\b\2\2gh\t\20\2\2hi\t\21\2\2ij\t\3\2\2j\20\3\2"+
		"\2\2kl\t\n\2\2lm\t\r\2\2mn\t\6\2\2no\t\5\2\2op\t\f\2\2pq\t\3\2\2qr\t\2"+
		"\2\2r\22\3\2\2\2st\t\21\2\2tu\t\3\2\2uv\t\6\2\2vw\t\13\2\2wx\t\3\2\2x"+
		"y\t\3\2\2yz\t\16\2\2z\24\3\2\2\2{|\t\4\2\2|}\t\20\2\2}~\t\22\2\2~\177"+
		"\t\3\2\2\177\26\3\2\2\2\u0080\u0081\t\n\2\2\u0081\u0082\t\3\2\2\u0082"+
		"\u0083\t\n\2\2\u0083\u0084\t\t\2\2\u0084\u0085\t\b\2\2\u0085\u0086\t\23"+
		"\2\2\u0086\30\3\2\2\2\u0087\u0088\7?\2\2\u0088\32\3\2\2\2\u0089\u008a"+
		"\7#\2\2\u008a\u008b\7?\2\2\u008b\34\3\2\2\2\u008c\u008d\7@\2\2\u008d\36"+
		"\3\2\2\2\u008e\u008f\7>\2\2\u008f \3\2\2\2\u0090\u0091\7@\2\2\u0091\u0092"+
		"\7?\2\2\u0092\"\3\2\2\2\u0093\u0094\7>\2\2\u0094\u0095\7?\2\2\u0095$\3"+
		"\2\2\2\u0096\u0097\t\20\2\2\u0097\u0098\t\16\2\2\u0098&\3\2\2\2\u0099"+
		"\u009a\t\24\2\2\u009a(\3\2\2\2\u009b\u009f\5\'\24\2\u009c\u009e\5\'\24"+
		"\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0*\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\t\25\2\2\u00a3"+
		",\3\2\2\2\u00a4\u00a6\5)\25\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2"+
		"\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00ab"+
		"\5+\26\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00a5\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af.\3\2\2\2\u00b0\u00b2\t\26\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00c4\3\2\2\2\u00b5"+
		"\u00b9\t\27\2\2\u00b6\u00b8\t\24\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bf\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00be\t\26\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3"+
		"\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00b5\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\60\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8"+
		"\t\26\2\2\u00c8\u00ca\7<\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00d2\7\61\2\2\u00cc\u00ce\n\30\2\2\u00cd\u00cc\3"+
		"\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d3\7\61\2\2\u00d2\u00cd\3\2\2\2\u00d3\u00d4\3"+
		"\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\62\3\2\2\2\u00d6"+
		"\u00da\7)\2\2\u00d7\u00d9\n\31\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\7)\2\2\u00de\64\3\2\2\2\u00df\u00e3\7)\2\2"+
		"\u00e0\u00e2\n\32\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\7)\2\2\u00e7\66\3\2\2\2\u00e8\u00ec\7)\2\2\u00e9\u00eb\n\33\2\2"+
		"\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7)\2\2\u00f0"+
		"8\3\2\2\2\u00f1\u00f3\7)\2\2\u00f2\u00f4\n\31\2\2\u00f3\u00f2\3\2\2\2"+
		"\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8"+
		"\3\2\2\2\u00f7\u00f9\n\34\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2"+
		"\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd"+
		"\7)\2\2\u00fd:\3\2\2\2\u00fe\u0102\7$\2\2\u00ff\u0101\n\35\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7$\2\2\u0106<\3\2\2\2\u0107"+
		"\u0108\7.\2\2\u0108>\3\2\2\2\u0109\u010a\7*\2\2\u010a@\3\2\2\2\u010b\u010c"+
		"\7+\2\2\u010cB\3\2\2\2\u010d\u010f\t\36\2\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\b\"\2\2\u0113D\3\2\2\2\25\2\u009f\u00a7\u00aa\u00ae\u00b3"+
		"\u00b9\u00bf\u00c4\u00c9\u00cf\u00d4\u00da\u00e3\u00ec\u00f5\u00fa\u0102"+
		"\u0110\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}