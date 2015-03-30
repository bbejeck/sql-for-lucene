package bbejeck.sql.lucene;

import com.google.common.collect.ImmutableList;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;

import java.util.List;

/**
 * User: Bill Bejeck
 * Date: 6/12/14
 * Time: 10:00 PM
 */
public class LuceneQueryAssembler {

       private String indexPath;
       private ImmutableList<String> fields;
       private ImmutableList<Query> searchClauses;
       private Query query;

    public void setIndexPath(String indexPath) {
        this.indexPath = indexPath;
    }

    public void setFields(List<String> fields) {
        this.fields = ImmutableList.<String>builder().addAll(fields).build();
    }

    public String getIndexPath() {
        return indexPath;
    }

    public List<String> getFields() {
        return fields;
    }

    public Query getQuery() {
        return query;
    }

    public void init(){

    }

    public void finish(){

    }

    public static class Builder {
        private String indexPath;
        private List<String> fields;
        private TermQuery termQuery;

        public Builder indexPath(String indexPath) {
            this.indexPath = indexPath;
            return this;
        }

        public Builder fields(List<String> fields) {
            this.fields = new ImmutableList.Builder<String>().addAll(fields).build();
            return this;
        }

        public Builder termQuery(TermQuery termQuery) {
            this.termQuery = termQuery;
            return this;
        }



    }

}
