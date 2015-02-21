package bbejeck.nosql.lucene;

import com.carrotsearch.ant.tasks.junit4.dependencies.com.google.common.collect.Lists;
import org.apache.lucene.queries.FilterClause;
import org.apache.lucene.search.BooleanClause;

import java.util.List;

/**
 * User: Bill Bejeck
 * Date: 8/11/14
 * Time: 9:40 PM
 */
public class LuceneQueryBuilder {

    private String field;
    private String text;
    private List<String> textValues;
    private BooleanClause.Occur occur;
    private QueryType queryType;
    private FilterType filterType;


    public void setField(String field) {
        this.field = field;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setQueryType(QueryType queryType) {
        this.queryType = queryType;
    }

    public void setFilterType(FilterType filterType) {
        this.filterType = filterType;
    }

    public void setTextValues(List<String> textValues) {
        this.textValues = Lists.newArrayList(textValues);
    }

    public void setOccur(BooleanClause.Occur occur) {
        this.occur = occur;
    }

    public BooleanClause build() {
        if (occur == null) {
            occur = BooleanClause.Occur.MUST;
        }
        return new BooleanClause(queryType.query(field, text), occur);
    }

    public FilterClause buildFilter(){
        if (occur == null){
            occur = BooleanClause.Occur.MUST;
        }
       return new FilterClause(filterType.filter(field,textValues),occur);
    }
}
