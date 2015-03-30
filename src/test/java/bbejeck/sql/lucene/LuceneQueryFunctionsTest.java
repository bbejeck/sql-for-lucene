package bbejeck.sql.lucene;

import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.PhraseQuery;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static bbejeck.sql.lucene.LuceneQueryFunctions.*;

public class LuceneQueryFunctionsTest {


    @Test
    public void testBuildPhraseQuery() {

        String field = "testField";
        String text = "Foo Bar Baz";

        PhraseQuery pq = LuceneQueryFunctions.toPhraseQuery.apply(field,text);
        Term[] terms = pq.getTerms();
        assertThat(terms[0].field(),is(field));
        assertThat(terms[0].text(),is("Foo"));
        assertThat(terms[1].field(),is(field));
        assertThat(terms[1].text(),is("Bar"));
        assertThat(terms[2].field(),is(field));
        assertThat(terms[2].text(),is("Baz"));

    }

    @Test
    public void testBuildTermQuery() {
        String field = "testField";
        String text = "Foo Bar Baz";
        BooleanClause clause = toBooleanClause.apply(field,text).apply(QueryType.TERM).apply(BooleanClause.Occur.MUST);

    }



}