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

package bbejeck.nosql.lucene;

import org.apache.lucene.index.Term;
import org.apache.lucene.search.*;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * User: Bill Bejeck
 * Date: 9/22/14
 * Time: 11:23 PM
 */
public enum QueryType implements LuceneQueryFunctions, LuceneAnalyzingFunctions {

    TERM {
        @Override
        Query query(String field, String value) {
            Term t = createTerm.apply(field, lettersNumbersTrimLowerCase.apply(value));
            return toQuery.apply(t, TermQuery.class);
        }
    },

    REGEXP {
        @Override
        Query query(String field, String value) {
            //TODO add analyzing for regexp
            Term t = createTerm.apply(field, value);
            return toQuery.apply(t, RegexpQuery.class);
        }
    },

    WILDCARD {
        @Override
        Query query(String field, String value) {
            String formatted = wildCardPrefixFormatter.apply(value);
            Term t = createTerm.apply(field, formatted);
            Class<? extends Query> wildCardOrPrefixClass = getWildcardOrPrefixClass.apply(formatted);
            return toQuery.apply(t, wildCardOrPrefixClass);
        }
    },

    PHRASE {
        @Override
        Query query(String field, String value) {
            return toPhraseQuery.apply(field, phraseFormatter.apply(value));
        }
    },

    MULTI_PHRASE {
        @Override
        Query query(String field, String value) {
            throw new RuntimeException("Not implemented");
        }
    },

    TERM_RANGE {
        @Override
        Query query(String field, String value) {
            String[] ranges = value.split(":");
            String lower = lettersNumbersTrimLowerCase.apply(ranges[0]);
            String upper = lettersNumbersTrimLowerCase.apply(ranges[1]);
            return TermRangeQuery.newStringRange(field, lower, upper, true, true);
        }
    },

    INTEGER_RANGE {
        @Override
        Query query(String field, String value) {
            String[] ranges = value.split(":");
            Integer lower = Integer.decode(trim.apply(ranges[0]));
            Integer upper = Integer.decode(trim.apply(ranges[1]));
            return NumericRangeQuery.newIntRange(field, lower, upper, true, true);
        }
    };

    abstract Query query(String field, String value);


    private static Function<String, String> phraseFormatter = removeMultipleSpace.andThen(lowerCase).andThen(lettersNumbersWhitespace).andThen(trim);
    private static Function<String, String> wildCardPrefixFormatter = lettersNumbersWildcard.andThen(lowerCase);
    private static Predicate<String> isPrefix = s -> s.indexOf('?') < 0 && s.endsWith("*");
    private static Function<Predicate<String>, Function<String, Class<? extends Query>>> getCorrectClass = p -> s -> p.test(s) ? PrefixQuery.class : WildcardQuery.class;
    private static Function<String,Class<? extends Query>> getWildcardOrPrefixClass = getCorrectClass.apply(isPrefix);

}
