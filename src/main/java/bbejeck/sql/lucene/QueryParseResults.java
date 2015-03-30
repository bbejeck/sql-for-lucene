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

package bbejeck.sql.lucene;

import com.google.common.base.CharMatcher;
import com.google.common.collect.Sets;
import org.apache.lucene.queries.BooleanFilter;
import org.apache.lucene.queries.FilterClause;
import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.MatchAllDocsQuery;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/**
 * User: Bill Bejeck
 * Date: 2/18/15
 * Time: 10:38 PM
 */
public class QueryParseResults {

    private String indexPath;
    private Set<String> selectFields = new HashSet<>();
    private BooleanQuery booleanQuery;
    private BooleanFilter booleanFilter;
    private int limit;


    private QueryParseResults(Builder builder) {
        indexPath = builder.indexPath;
        selectFields = builder.selectFields;
        booleanQuery = builder.booleanQuery;
        booleanFilter = builder.booleanFilter;
        limit = builder.limit;
    }

    public String getIndexPath() {
        return indexPath;
    }

    public Set<String> getSelectFields() {
        return selectFields;
    }

    public BooleanQuery getBooleanQuery() {
        return booleanQuery;
    }

    public BooleanFilter getBooleanFilter() {
        return booleanFilter;
    }

    public int getLimit() {
        return limit;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(QueryParseResults copy) {
        Builder builder = new Builder();
        builder.indexPath = copy.indexPath;
        builder.selectFields = copy.selectFields;
        builder.booleanQuery = copy.booleanQuery;
        builder.booleanFilter = copy.booleanFilter;
        builder.limit = copy.limit;
        return builder;
    }


    public static final class Builder implements LuceneQueryFunctions {
        private String indexPath;
        private Set<String> selectFields = new HashSet<>();
        private List<FilterClause> filterClausedList;
        private BooleanQuery booleanQuery;
        private BooleanFilter booleanFilter;
        private int limit;
        private CharMatcher singleQuoteMatcher = CharMatcher.is('\'');

        private Builder() {
        }

        public Builder withIndexPath(String indexPath) {
            if (indexPath != null) {
              this.indexPath = singleQuoteMatcher.removeFrom(indexPath);
            }
            return this;
        }

        public Builder withSelectFields(Set<String> selectFields) {
            this.selectFields = Sets.newHashSet(selectFields);
            return this;
        }

        public Builder withBooleanQuery(BooleanQuery booleanQuery) {
            this.booleanQuery = booleanQuery;
            return this;
        }

        public Builder withBooleanFilter(BooleanFilter booleanFilter) {
            this.booleanFilter = booleanFilter;
            return this;
        }

        public Builder withLimit(int limit) {
            this.limit = limit;
            return this;
        }

        public QueryParseResults build() {
            if(isSingleMustNotQuery.test(booleanQuery)){
                BooleanClause extractedClause = extractBooleanClause.apply(booleanQuery);
                List<BooleanClause> booleanClauseList = Arrays.asList(toMustBooleanClause.apply(new MatchAllDocsQuery()), extractedClause);
                booleanQuery = toBooleanQuery.apply(booleanClauseList);
            }
            return new QueryParseResults(this);
        }

        public Builder withFilterClausesList(List<FilterClause> filterClausesList) {
            this.filterClausedList = filterClausesList;
            return this;
        }

        public Builder withBooleanClausesList(List<BooleanClause> booleanClausesList) {
            this.booleanQuery = toBooleanQuery.apply(booleanClausesList);
            return this;
        }

        private Predicate<BooleanQuery> isSingleMustNotQuery = bq -> bq.clauses().size()==1 && bq.getClauses()[0].getOccur() == BooleanClause.Occur.MUST_NOT;
    }
}
