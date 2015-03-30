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

import org.apache.lucene.search.BooleanClause;
import org.apache.lucene.search.BooleanQuery;

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
    private List<BooleanClause> booleanClauses;

    public void setBooleanClauses(List<BooleanClause> booleanClauses) {
        this.booleanClauses = booleanClauses;
    }

    private BooleanClause.Occur occur;
    private QueryType queryType;

    public void setField(String field) {
        this.field = field;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setQueryType(QueryType queryType) {
        this.queryType = queryType;
    }

    public void setTextValues(List<String> textValues) {
        this.textValues = textValues;
    }

    public void setOccur(BooleanClause.Occur occur) {
        this.occur = occur;
    }

    public BooleanClause build() {
        if (occur == null) {
            occur = BooleanClause.Occur.MUST;
        }

        if (booleanClauses == null || booleanClauses.isEmpty()) {
            return new BooleanClause(queryType.query(field, text), occur);
        }

        BooleanQuery booleanQuery = LuceneQueryFunctions.toBooleanQuery.apply(booleanClauses);
        return new BooleanClause(booleanQuery, occur);
    }

}
