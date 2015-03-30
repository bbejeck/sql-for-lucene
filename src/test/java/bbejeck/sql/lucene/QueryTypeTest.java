package bbejeck.sql.lucene;


import org.apache.lucene.search.Query;
import org.apache.lucene.search.RegexpQuery;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.WildcardQuery;
import org.junit.Test;

import static bbejeck.sql.lucene.QueryType.REGEXP;
import static bbejeck.sql.lucene.QueryType.WILDCARD;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import static bbejeck.sql.lucene.QueryType.TERM;

public class QueryTypeTest {

    private static final String FIELD = "foo";
    private static final String TEXT = "bar";

    @Test
    public void testTerm() {
       Query tq = TERM.query(FIELD,TEXT);
       assertThat(tq.getClass().getSimpleName(),is("TermQuery"));
       assertThat(((TermQuery)tq).getTerm().field(),is(FIELD));
       assertThat(((TermQuery)tq).getTerm().text(),is(TEXT));
    }

    @Test
    public void testRegex() {
        Query tq = REGEXP.query(FIELD,TEXT);
        assertThat(tq.getClass().getSimpleName(),is("RegexpQuery"));
        assertThat(((RegexpQuery)tq).getField(),is(FIELD));
    }

    @Test
    public void testWildCard() {
        Query tq = WILDCARD.query(FIELD,TEXT);
        assertThat(tq.getClass().getSimpleName(),is("WildcardQuery"));
        assertThat(((WildcardQuery)tq).getTerm().field(),is(FIELD));
        assertThat(((WildcardQuery)tq).getTerm().text(),is(TEXT));
    }


}