// Generated from /Users/bbejeck/workspace_intellij/nosql-jdbc-driver/src/main/java/NoSqlJDBC.g4 by ANTLR 4.x
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NoSqlJDBCParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, AND=4, OR=5, NOT=6, DESCRIBE=7, EQ=8, NE=9, 
		GT=10, LT=11, GTE=12, LTE=13, IN=14, DIGIT=15, NUMBER=16, FIELD=17, PATH=18, 
		TERM=19, PHRASE=20, WILD_CARD=21, MULTI_PHRASE=22, DB_QUOTE_STRING_LIT=23, 
		COMMA=24, RPAREN=25, LPAREN=26, WS=27;
	public static final String[] tokenNames = {
		"<INVALID>", "SELECT", "FROM", "WHERE", "AND", "OR", "NOT", "DESCRIBE", 
		"'='", "'!='", "'>'", "'<'", "'>='", "'<='", "IN", "DIGIT", "NUMBER", 
		"FIELD", "PATH", "TERM", "PHRASE", "WILD_CARD", "MULTI_PHRASE", "DB_QUOTE_STRING_LIT", 
		"','", "'('", "')'", "WS"
	};
	public static final int
		RULE_query = 0, RULE_describe_stmt = 1, RULE_select_stmt = 2, RULE_from_stmt = 3, 
		RULE_where_stmt = 4, RULE_search_condition = 5, RULE_predicate = 6, RULE_field = 7, 
		RULE_comparison_op = 8, RULE_boolean_op = 9, RULE_nested_predicate = 10, 
		RULE_value = 11, RULE_value_list = 12;
	public static final String[] ruleNames = {
		"query", "describe_stmt", "select_stmt", "from_stmt", "where_stmt", "search_condition", 
		"predicate", "field", "comparison_op", "boolean_op", "nested_predicate", 
		"value", "value_list"
	};

	@Override
	public String getGrammarFileName() { return "NoSqlJDBC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NoSqlJDBCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public From_stmtContext from_stmt() {
			return getRuleContext(From_stmtContext.class,0);
		}
		public Describe_stmtContext describe_stmt() {
			return getRuleContext(Describe_stmtContext.class,0);
		}
		public Where_stmtContext where_stmt() {
			return getRuleContext(Where_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			setState(33);
			switch (_input.LA(1)) {
			case DESCRIBE:
				enterOuterAlt(_localctx, 1);
				{
				setState(26); describe_stmt();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(27); select_stmt();
				setState(29);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(28); from_stmt();
					}
				}

				setState(31); where_stmt();
				}
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

	public static class Describe_stmtContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(NoSqlJDBCParser.PATH, 0); }
		public TerminalNode DESCRIBE() { return getToken(NoSqlJDBCParser.DESCRIBE, 0); }
		public Describe_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describe_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterDescribe_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitDescribe_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitDescribe_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Describe_stmtContext describe_stmt() throws RecognitionException {
		Describe_stmtContext _localctx = new Describe_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_describe_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); match(DESCRIBE);
			setState(36); match(PATH);
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

	public static class Select_stmtContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(NoSqlJDBCParser.COMMA); }
		public TerminalNode SELECT() { return getToken(NoSqlJDBCParser.SELECT, 0); }
		public TerminalNode FIELD(int i) {
			return getToken(NoSqlJDBCParser.FIELD, i);
		}
		public List<TerminalNode> FIELD() { return getTokens(NoSqlJDBCParser.FIELD); }
		public TerminalNode COMMA(int i) {
			return getToken(NoSqlJDBCParser.COMMA, i);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(SELECT);
			setState(39); match(FIELD);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(40); match(COMMA);
				setState(41); match(FIELD);
				}
				}
				setState(46);
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

	public static class From_stmtContext extends ParserRuleContext {
		public TerminalNode LPAREN(int i) {
			return getToken(NoSqlJDBCParser.LPAREN, i);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public TerminalNode RPAREN(int i) {
			return getToken(NoSqlJDBCParser.RPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(NoSqlJDBCParser.RPAREN); }
		public TerminalNode PATH(int i) {
			return getToken(NoSqlJDBCParser.PATH, i);
		}
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public List<TerminalNode> LPAREN() { return getTokens(NoSqlJDBCParser.LPAREN); }
		public List<TerminalNode> PATH() { return getTokens(NoSqlJDBCParser.PATH); }
		public TerminalNode FROM() { return getToken(NoSqlJDBCParser.FROM, 0); }
		public From_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterFrom_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitFrom_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitFrom_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_stmtContext from_stmt() throws RecognitionException {
		From_stmtContext _localctx = new From_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_from_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(FROM);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PATH || _la==RPAREN) {
				{
				setState(53);
				switch (_input.LA(1)) {
				case RPAREN:
					{
					setState(48); match(RPAREN);
					setState(49); query();
					setState(50); match(LPAREN);
					}
					break;
				case PATH:
					{
					setState(52); match(PATH);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(57);
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

	public static class Where_stmtContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(NoSqlJDBCParser.WHERE, 0); }
		public List<Search_conditionContext> search_condition() {
			return getRuleContexts(Search_conditionContext.class);
		}
		public Search_conditionContext search_condition(int i) {
			return getRuleContext(Search_conditionContext.class,i);
		}
		public Where_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterWhere_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitWhere_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitWhere_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_stmtContext where_stmt() throws RecognitionException {
		Where_stmtContext _localctx = new Where_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_where_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(WHERE);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59); search_condition();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << FIELD))) != 0) );
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

	public static class Search_conditionContext extends ParserRuleContext {
		public Nested_predicateContext nested_predicate(int i) {
			return getRuleContext(Nested_predicateContext.class,i);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<Nested_predicateContext> nested_predicate() {
			return getRuleContexts(Nested_predicateContext.class);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public Search_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterSearch_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitSearch_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitSearch_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_conditionContext search_condition() throws RecognitionException {
		Search_conditionContext _localctx = new Search_conditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_search_condition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64); predicate();
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(67);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(65); predicate();
						}
						break;
					case 2:
						{
						setState(66); nested_predicate();
						}
						break;
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class PredicateContext extends ParserRuleContext {
		public Boolean_opContext boolean_op() {
			return getRuleContext(Boolean_opContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Comparison_opContext comparison_op() {
			return getRuleContext(Comparison_opContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) {
				{
				setState(72); boolean_op();
				}
			}

			setState(75); field();
			setState(76); comparison_op();
			setState(77); value();
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode FIELD() { return getToken(NoSqlJDBCParser.FIELD, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(FIELD);
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

	public static class Comparison_opContext extends ParserRuleContext {
		public Comparison_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_op; }
	 
		public Comparison_opContext() { }
		public void copyFrom(Comparison_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GreaterThanEqualsContext extends Comparison_opContext {
		public TerminalNode GTE() { return getToken(NoSqlJDBCParser.GTE, 0); }
		public GreaterThanEqualsContext(Comparison_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterGreaterThanEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitGreaterThanEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitGreaterThanEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends Comparison_opContext {
		public TerminalNode LT() { return getToken(NoSqlJDBCParser.LT, 0); }
		public LessThanContext(Comparison_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualContext extends Comparison_opContext {
		public TerminalNode NE() { return getToken(NoSqlJDBCParser.NE, 0); }
		public NotEqualContext(Comparison_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanContext extends Comparison_opContext {
		public TerminalNode GT() { return getToken(NoSqlJDBCParser.GT, 0); }
		public GreaterThanContext(Comparison_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitGreaterThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsContext extends Comparison_opContext {
		public TerminalNode EQ() { return getToken(NoSqlJDBCParser.EQ, 0); }
		public EqualsContext(Comparison_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InListContext extends Comparison_opContext {
		public TerminalNode IN() { return getToken(NoSqlJDBCParser.IN, 0); }
		public InListContext(Comparison_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitInList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitInList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanEqualsContext extends Comparison_opContext {
		public TerminalNode LTE() { return getToken(NoSqlJDBCParser.LTE, 0); }
		public LessThanEqualsContext(Comparison_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterLessThanEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitLessThanEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitLessThanEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_opContext comparison_op() throws RecognitionException {
		Comparison_opContext _localctx = new Comparison_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparison_op);
		try {
			setState(88);
			switch (_input.LA(1)) {
			case EQ:
				_localctx = new EqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81); match(EQ);
				}
				break;
			case NE:
				_localctx = new NotEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82); match(NE);
				}
				break;
			case LT:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(83); match(LT);
				}
				break;
			case GT:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(84); match(GT);
				}
				break;
			case GTE:
				_localctx = new GreaterThanEqualsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(85); match(GTE);
				}
				break;
			case LTE:
				_localctx = new LessThanEqualsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(86); match(LTE);
				}
				break;
			case IN:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(87); match(IN);
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

	public static class Boolean_opContext extends ParserRuleContext {
		public Boolean_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_op; }
	 
		public Boolean_opContext() { }
		public void copyFrom(Boolean_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndNotContext extends Boolean_opContext {
		public TerminalNode AND() { return getToken(NoSqlJDBCParser.AND, 0); }
		public TerminalNode NOT() { return getToken(NoSqlJDBCParser.NOT, 0); }
		public AndNotContext(Boolean_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterAndNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitAndNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitAndNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrNotContext extends Boolean_opContext {
		public TerminalNode OR() { return getToken(NoSqlJDBCParser.OR, 0); }
		public TerminalNode NOT() { return getToken(NoSqlJDBCParser.NOT, 0); }
		public OrNotContext(Boolean_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterOrNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitOrNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitOrNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends Boolean_opContext {
		public TerminalNode OR() { return getToken(NoSqlJDBCParser.OR, 0); }
		public OrContext(Boolean_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends Boolean_opContext {
		public TerminalNode AND() { return getToken(NoSqlJDBCParser.AND, 0); }
		public AndContext(Boolean_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends Boolean_opContext {
		public TerminalNode NOT() { return getToken(NoSqlJDBCParser.NOT, 0); }
		public NotContext(Boolean_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_opContext boolean_op() throws RecognitionException {
		Boolean_opContext _localctx = new Boolean_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolean_op);
		try {
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90); match(AND);
				}
				break;
			case 2:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91); match(OR);
				}
				break;
			case 3:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92); match(NOT);
				}
				break;
			case 4:
				_localctx = new AndNotContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93); match(AND);
				setState(94); match(NOT);
				}
				break;
			case 5:
				_localctx = new OrNotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(95); match(OR);
				setState(96); match(NOT);
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

	public static class Nested_predicateContext extends ParserRuleContext {
		public Nested_predicateContext nested_predicate(int i) {
			return getRuleContext(Nested_predicateContext.class,i);
		}
		public Boolean_opContext boolean_op() {
			return getRuleContext(Boolean_opContext.class,0);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<Nested_predicateContext> nested_predicate() {
			return getRuleContexts(Nested_predicateContext.class);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public TerminalNode RPAREN() { return getToken(NoSqlJDBCParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(NoSqlJDBCParser.LPAREN, 0); }
		public Nested_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterNested_predicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitNested_predicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitNested_predicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nested_predicateContext nested_predicate() throws RecognitionException {
		Nested_predicateContext _localctx = new Nested_predicateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nested_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT))) != 0)) {
				{
				setState(99); boolean_op();
				}
			}

			setState(102); match(RPAREN);
			setState(103); predicate();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << NOT) | (1L << FIELD) | (1L << RPAREN))) != 0)) {
				{
				setState(106);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(104); predicate();
					}
					break;
				case 2:
					{
					setState(105); nested_predicate();
					}
					break;
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111); match(LPAREN);
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
	public static class MULTI_PHRASEContext extends ValueContext {
		public TerminalNode MULTI_PHRASE() { return getToken(NoSqlJDBCParser.MULTI_PHRASE, 0); }
		public MULTI_PHRASEContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterMULTI_PHRASE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitMULTI_PHRASE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitMULTI_PHRASE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ValueContext {
		public TerminalNode DIGIT() { return getToken(NoSqlJDBCParser.DIGIT, 0); }
		public TerminalNode NUMBER() { return getToken(NoSqlJDBCParser.NUMBER, 0); }
		public NumberContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueListContext extends ValueContext {
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public ValueListContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Wild_CardContext extends ValueContext {
		public TerminalNode WILD_CARD() { return getToken(NoSqlJDBCParser.WILD_CARD, 0); }
		public Wild_CardContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterWild_Card(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitWild_Card(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitWild_Card(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PhraseContext extends ValueContext {
		public TerminalNode PHRASE() { return getToken(NoSqlJDBCParser.PHRASE, 0); }
		public PhraseContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitPhrase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermContext extends ValueContext {
		public TerminalNode TERM() { return getToken(NoSqlJDBCParser.TERM, 0); }
		public TermContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(120);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113); match(NUMBER);
				}
				break;
			case DIGIT:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114); match(DIGIT);
				}
				break;
			case TERM:
				_localctx = new TermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115); match(TERM);
				}
				break;
			case PHRASE:
				_localctx = new PhraseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(116); match(PHRASE);
				}
				break;
			case WILD_CARD:
				_localctx = new Wild_CardContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(117); match(WILD_CARD);
				}
				break;
			case MULTI_PHRASE:
				_localctx = new MULTI_PHRASEContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(118); match(MULTI_PHRASE);
				}
				break;
			case RPAREN:
				_localctx = new ValueListContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(119); value_list();
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

	public static class Value_listContext extends ParserRuleContext {
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(NoSqlJDBCParser.COMMA); }
		public TerminalNode RPAREN() { return getToken(NoSqlJDBCParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(NoSqlJDBCParser.LPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(NoSqlJDBCParser.COMMA, i);
		}
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).enterValue_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NoSqlJDBCListener ) ((NoSqlJDBCListener)listener).exitValue_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NoSqlJDBCVisitor ) return ((NoSqlJDBCVisitor<? extends T>)visitor).visitValue_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(RPAREN);
			setState(123); value();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(124); match(COMMA);
				setState(125); value();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131); match(LPAREN);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\5\2 \n\2\3\2\3\2\5\2$\n\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\58\n\5\f\5\16\5;\13\5\3\6\3\6\6\6?\n\6\r\6\16\6@\3\7\3\7\3"+
		"\7\7\7F\n\7\f\7\16\7I\13\7\3\b\5\bL\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n[\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"d\n\13\3\f\5\fg\n\f\3\f\3\f\3\f\3\f\7\fm\n\f\f\f\16\fp\13\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r{\n\r\3\16\3\16\3\16\3\16\7\16\u0081\n\16"+
		"\f\16\16\16\u0084\13\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\2\2\u0097\2#\3\2\2\2\4%\3\2\2\2\6(\3\2\2\2\b\61\3\2\2\2\n<\3"+
		"\2\2\2\fB\3\2\2\2\16K\3\2\2\2\20Q\3\2\2\2\22Z\3\2\2\2\24c\3\2\2\2\26f"+
		"\3\2\2\2\30z\3\2\2\2\32|\3\2\2\2\34$\5\4\3\2\35\37\5\6\4\2\36 \5\b\5\2"+
		"\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\5\n\6\2\"$\3\2\2\2#\34\3\2\2\2"+
		"#\35\3\2\2\2$\3\3\2\2\2%&\7\t\2\2&\'\7\24\2\2\'\5\3\2\2\2()\7\3\2\2)."+
		"\7\23\2\2*+\7\32\2\2+-\7\23\2\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2"+
		"\2\2/\7\3\2\2\2\60.\3\2\2\2\619\7\4\2\2\62\63\7\33\2\2\63\64\5\2\2\2\64"+
		"\65\7\34\2\2\658\3\2\2\2\668\7\24\2\2\67\62\3\2\2\2\67\66\3\2\2\28;\3"+
		"\2\2\29\67\3\2\2\29:\3\2\2\2:\t\3\2\2\2;9\3\2\2\2<>\7\5\2\2=?\5\f\7\2"+
		">=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\13\3\2\2\2BG\5\16\b\2CF\5\16"+
		"\b\2DF\5\26\f\2EC\3\2\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\r\3"+
		"\2\2\2IG\3\2\2\2JL\5\24\13\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\5\20\t\2"+
		"NO\5\22\n\2OP\5\30\r\2P\17\3\2\2\2QR\7\23\2\2R\21\3\2\2\2S[\7\n\2\2T["+
		"\7\13\2\2U[\7\r\2\2V[\7\f\2\2W[\7\16\2\2X[\7\17\2\2Y[\7\20\2\2ZS\3\2\2"+
		"\2ZT\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\23\3\2"+
		"\2\2\\d\7\6\2\2]d\7\7\2\2^d\7\b\2\2_`\7\6\2\2`d\7\b\2\2ab\7\7\2\2bd\7"+
		"\b\2\2c\\\3\2\2\2c]\3\2\2\2c^\3\2\2\2c_\3\2\2\2ca\3\2\2\2d\25\3\2\2\2"+
		"eg\5\24\13\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\33\2\2in\5\16\b\2jm\5\16"+
		"\b\2km\5\26\f\2lj\3\2\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3"+
		"\2\2\2pn\3\2\2\2qr\7\34\2\2r\27\3\2\2\2s{\7\22\2\2t{\7\21\2\2u{\7\25\2"+
		"\2v{\7\26\2\2w{\7\27\2\2x{\7\30\2\2y{\5\32\16\2zs\3\2\2\2zt\3\2\2\2zu"+
		"\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\31\3\2\2\2|}\7\33\2"+
		"\2}\u0082\5\30\r\2~\177\7\32\2\2\177\u0081\5\30\r\2\u0080~\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\34\2\2\u0086\33\3\2\2\2\22\37#"+
		".\679@EGKZcflnz\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}