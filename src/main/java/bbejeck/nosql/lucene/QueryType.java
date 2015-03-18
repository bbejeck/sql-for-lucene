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

import com.google.common.base.Splitter;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.*;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * User: Bill Bejeck
 * Date: 9/22/14
 * Time: 11:23 PM
 */
public enum QueryType implements LuceneQueryFunctions, LuceneAnalyzingFunctions {

    TERM {
        @Override
        Query query(String field, String value) {

            if(value.matches("\\d+")){
                return INTEGER_RANGE.query(field,value+":"+value);
            }

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

    BOOLEAN_OR_LIST {
        @Override
        Query query(String field, String value) {
            Function<String, Term> toTerm = termFunction.apply(field);
            List<BooleanClause> booleanClauseList = toStreamFromDelimitedValue.apply(value).map(lettersNumbersTrimLowerCase)
                    .map(toTerm)
                    .map(toTermQuery)
                    .map(toOrBooleanClause)
                    .collect(Collectors.toList());
            return toBooleanQuery.apply(booleanClauseList);
        }
    },

    BOOLEAN_PHRASE_LIST {
        @Override
        Query query(String field, String value) {
            List<String> phraseValues = toStreamFromDelimitedValue.apply(value).filter(matchesPhrase).collect(Collectors.toList());
            List<String> termValues = toStreamFromDelimitedValue.apply(value).filter(notPhrase).collect(Collectors.toList());

            List<BooleanClause> phraseQueries = phraseValues.stream().map(p -> toPhraseQuery.apply(field, phraseFormatter.apply(p)))
                    .map(toOrBooleanClause)
                    .collect(Collectors.toList());
            Function<String, Term> toTerm = termFunction.apply(field);

            List<BooleanClause> termQueries = termValues.stream().map(lettersNumbersTrimLowerCase)
                    .map(toTerm)
                    .map(toTermQuery)
                    .map(toOrBooleanClause)
                    .collect(Collectors.toList());
            phraseQueries.addAll(termQueries);
            return toBooleanQuery.apply(phraseQueries);
        }
    },

    TERM_RANGE {
        @Override
        Query query(String field, String value) {
            List<String> terms = toStreamFromDelimitedValue.apply(value).map(lettersNumbersTrimLowerCase).collect(Collectors.toList());
            String lower = terms.get(0);
            String upper = terms.get(1);
            return TermRangeQuery.newStringRange(field, lower, upper, true, true);
        }
    },

    INTEGER_RANGE {
        @Override
        Query query(String field, String value) {
            List<Integer> terms = toStreamFromDelimitedValue.apply(value).map(lettersNumbersTrimLowerCase).map(Integer::decode).collect(Collectors.toList());
            Integer lower = terms.get(0);
            Integer upper = terms.get(1);
            return NumericRangeQuery.newIntRange(field, lower, upper, true, true);
        }


    },

    TERM_RANGE_UNBOUNDED {
        @Override
        Query query(String field, String value) {
            List<String> terms = toStreamFromDelimitedValue.apply(value).map(lettersNumbersTrimLowerCase).collect(Collectors.toList());
            String lower = (terms.get(0).equals(UNBOUNDED)) ? null : terms.get(0);
            String upper = (terms.get(1).equals(UNBOUNDED)) ? null : terms.get(1);
            boolean included = Boolean.valueOf(terms.get(2));
            boolean includeUpper = lower == null && included;
            boolean includeLower = upper == null && included;
            return TermRangeQuery.newStringRange(field, lower, upper, includeLower, includeUpper);
        }
    },

    INTEGER_RANGE_UNBOUNDED {
        @Override
        Query query(String field, String value) {
            List<String> terms = toStreamFromDelimitedValue.apply(value).map(lettersNumbersTrimLowerCase).collect(Collectors.toList());
            Integer lower = (terms.get(0).equals(UNBOUNDED)) ? null : Integer.decode(terms.get(0));
            Integer upper = (terms.get(1).equals(UNBOUNDED)) ? null : Integer.decode(terms.get(1));
            boolean included = Boolean.valueOf(terms.get(2));
            boolean includeUpper = lower == null && included;
            boolean includeLower = upper == null && included;
            return NumericRangeQuery.newIntRange(field, lower, upper, includeLower, includeUpper);
        }
    };


    abstract Query query(String field, String value);

    private static Function<String, Function<String, Stream<String>>> setDelimiter = d -> s -> Splitter.on(d).splitToList(s).stream();
    private static Function<String, Stream<String>> toStreamFromDelimitedValue = setDelimiter.apply(":");
    private static Function<String, String> phraseFormatter = removeMultipleSpace.andThen(lowerCase).andThen(lettersNumbersWhitespace).andThen(trim);
    private static Function<String, String> wildCardPrefixFormatter = lettersNumbersWildcard.andThen(lowerCase);
    private static Predicate<String> isPrefix = s -> s.indexOf('?') < 0 && s.endsWith("*");
    private static Function<Predicate<String>, Function<String, Class<? extends Query>>> getCorrectClass = p -> s -> p.test(s) ? PrefixQuery.class : WildcardQuery.class;
    private static Function<String, Class<? extends Query>> getWildcardOrPrefixClass = getCorrectClass.apply(isPrefix);
    private static Predicate<String> matchesPhrase = s -> s.matches("(['A-Za-z0-9]+\\s['A-Za-z0-9]+)+");
    private static Predicate<String> notPhrase = matchesPhrase.negate();
    public static final String UNBOUNDED = "unbounded";


}
