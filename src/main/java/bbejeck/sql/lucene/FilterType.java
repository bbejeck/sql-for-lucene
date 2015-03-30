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

import org.apache.lucene.index.Term;
import org.apache.lucene.queries.TermsFilter;
import org.apache.lucene.search.Filter;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * User: Bill Bejeck
 * Date: 2/17/15
 * Time: 9:51 PM
 */
public enum FilterType implements LuceneQueryFunctions,LuceneAnalyzingFunctions {

    TERMS_FILTER {
        @Override
        Filter filter(String field, Collection<String> filterValues) {
            List<Term> filterTerms = filterValues.stream().map(createFilterTerm.apply(field)).collect(Collectors.toList());
            return new TermsFilter(filterTerms);
        }
    },

    TERM_RANGE_FILTER{
        @Override
        Filter filter(String field, Collection<String> filterValues) {
            throw new RuntimeException("Not Implemented");
        }
    },

    NUMERIC_RANGE_FILTER{
        @Override
        Filter filter(String field, Collection<String> filterValues) {
            throw new RuntimeException("Not Implemented");
        }
    },

    QUERY_FILTER{
        @Override
        Filter filter(String field, Collection<String> filterValues) {
            throw new RuntimeException("Not Implemented");
        }
    };

   abstract Filter filter(String field,Collection<String> filterValues);

    Function<String,Function<String,Term>>  createFilterTerm = f -> lettersNumbersTrimLowerCase.andThen(termFunction.apply(f));

}
