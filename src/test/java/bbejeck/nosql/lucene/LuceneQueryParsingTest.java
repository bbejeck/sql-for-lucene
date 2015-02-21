package bbejeck.nosql.lucene;

import org.apache.lucene.index.Term;
import org.apache.lucene.queries.FilterClause;
import org.apache.lucene.queries.TermsFilter;
import org.apache.lucene.search.*;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

/**
 * User: Bill Bejeck
 * Date: 10/9/14
 * Time: 11:12 PM
 */
public class LuceneQueryParsingTest {

    private AntlrFunctionsStub antlr = new AntlrFunctionsStub();

    @Test
    public void test_parse_term_and_phrase_query() {
        String query = "Select name,address from /path/to/index/ where first_name='Beth' and last_name='Bejeck' or type='Big   Cutie '";
        BooleanQuery booleanQuery = parseQuery(query);
        BooleanClause[] clauses = booleanQuery.getClauses();
        assertThat(clauses.length, is(3));
        assertThat(clauses[0].getOccur(), is(BooleanClause.Occur.MUST));
        assertThat(clauses[1].getOccur(), is(BooleanClause.Occur.MUST));
        assertThat(clauses[2].getOccur(), is(BooleanClause.Occur.SHOULD));

        TermQuery termQuery = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery.getTerm().field(), is("first_name"));
        assertThat(termQuery.getTerm().text(), is("beth"));

        termQuery = (TermQuery) clauses[1].getQuery();
        assertThat(termQuery.getTerm().field(), is("last_name"));
        assertThat(termQuery.getTerm().text(), is("bejeck"));

        assertThat(clauses[2].getQuery().getClass().isAssignableFrom(PhraseQuery.class), is(true));
        assertThat(clauses[2].getOccur(), is(BooleanClause.Occur.SHOULD));
        PhraseQuery phraseQuery = (PhraseQuery) clauses[2].getQuery();
        assertArrayEquals(phraseQuery.getTerms(), new Term[]{new Term("type", "big"), new Term("type", "cutie")});
    }

    @Test
    public void test_parse_term_correctly() {
        String query = "select foo from /path/index/ where foo='Na,ME'";
        BooleanQuery bq = parseQuery(query);
        BooleanClause[] clauses = bq.getClauses();
        TermQuery termQuery = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery.getTerm().field(), is("foo"));
        assertThat(termQuery.getTerm().text(), is("name"));

    }

    @Test
    public void test_parse_regex_query() {
        String query = "Select foo from /path/index/ where foo matches('[Bb].*[hH]?')";
        BooleanQuery bq = parseQuery(query);
        BooleanClause[] clauses = bq.getClauses();
        RegexpQuery regexpQuery = (RegexpQuery) clauses[0].getQuery();
        assertThat(regexpQuery.getField(), is("foo"));
//        assertThat(regexpQuery.getTerm().text(),is("name"));
    }

    @Test
    public void test_parse_between_query() {
        String query = "Select foo from /path/index/ where foo between 'Beth' and 'Elizabeth'";
        BooleanQuery bq = parseQuery(query);
        BooleanClause[] clauses = bq.getClauses();
        TermRangeQuery termRangeQuery = (TermRangeQuery) clauses[0].getQuery();
        assertThat(termRangeQuery.getField(), is("foo"));
        assertThat(new String(termRangeQuery.getLowerTerm().bytes).trim(), is("beth"));
        assertThat(new String(termRangeQuery.getUpperTerm().bytes).trim(), is("elizabeth"));
    }

    @Test
    public void test_parse_between_integer_query() {
        String query = "Select foo from /path/index/ where age between 33 and 48";
        BooleanQuery bq = parseQuery(query);
        BooleanClause[] clauses = bq.getClauses();
        NumericRangeQuery numericRangeQuery = (NumericRangeQuery) clauses[0].getQuery();
        assertThat(numericRangeQuery.getField(), is("age"));
        assertThat(numericRangeQuery.getMin().intValue(), is(33));
        assertThat(numericRangeQuery.getMax().intValue(), is(48));
    }

    @Test
    public void test_parse_like_wildcard_query() {
        String query = "select foo from /path/index/ where name like 'B?t?'";
        BooleanQuery bq = parseQuery(query);
        BooleanClause[] clauses = bq.getClauses();
        WildcardQuery wildcardQuery = (WildcardQuery) clauses[0].getQuery();
        assertThat(wildcardQuery.getField(), is("name"));
        assertThat(wildcardQuery.getTerm().text(), is("b?t?"));
    }

    @Test
    public void test_parse_like_wildcard_query_with_asteric() {
        String query = "select foo from /path/index/ where name like 'B*th'";
        BooleanQuery bq = parseQuery(query);
        BooleanClause[] clauses = bq.getClauses();
        WildcardQuery wildcardQuery = (WildcardQuery) clauses[0].getQuery();
        assertThat(wildcardQuery.getField(), is("name"));
        assertThat(wildcardQuery.getTerm().text(), is("b*th"));
    }

    @Test
    public void test_parse_like_prefix_query() {
        String query = "select foo from /path/index/ where name like 'Bet*'";
        BooleanQuery bq = parseQuery(query);
        BooleanClause[] clauses = bq.getClauses();
        PrefixQuery prefixQuery = (PrefixQuery) clauses[0].getQuery();
        assertThat(prefixQuery.getField(), is("name"));
        assertThat(prefixQuery.getPrefix().text(), is("bet*"));
    }


    @Test
    public void test_parse_in_listquery() throws Exception {
        String query = "select foo from /path/index/ where name='Beth' and score in (0, 50, 55)";
        QueryContainer qc = parseQueryAndFilter(query);
        BooleanClause[] clauses = qc.booleanQuery.getClauses();
        TermQuery termQuery = (TermQuery) clauses[0].getQuery();
        assertThat(termQuery.getTerm().field(), is("name"));
        assertThat(termQuery.getTerm().text(), is("beth"));

        List<FilterClause> filtersList = qc.booleanFilter.clauses();
        FilterClause filterClause = filtersList.get(0);
        assertThat(filterClause.getOccur(),is(BooleanClause.Occur.MUST));
        TermsFilter termsFilter = (TermsFilter) filtersList.get(0).getFilter();

        TermsFilter expected = new TermsFilter(new Term("score","70"),new Term("score","50"),new Term("score","55"));
        assertThat(termsFilter,is(expected));
    }



    private BooleanQuery parseQuery(String luceneQuery) {
        return antlr.doParseLuceneQuery(luceneQuery).booleanQuery;
    }

    private QueryContainer parseQueryAndFilter(String luceneQuery){
        return antlr.doParseLuceneQuery(luceneQuery);
    }


}
