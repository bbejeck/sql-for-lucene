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

import java.util.function.Function;

import static com.google.common.base.CharMatcher.JAVA_LETTER_OR_DIGIT;
import static com.google.common.base.CharMatcher.WHITESPACE;

/**
 * User: Bill Bejeck
 * Date: 2/17/15
 * Time: 10:03 PM
 */
public interface LuceneAnalyzingFunctions {

     Function<String, String> removeMultipleSpace = s -> s.replaceAll("\\s+", " ");
     Function<String, String> lettersNumbersWhitespace = s -> s.replaceAll("[^a-zA-Z0-9\\s]", "");
     Function<String, String> lettersNumbersWildcard = s -> s.replaceAll("[^a-zA-Z0-9*?]", "");
     Function<String, String> removeWhitespace = WHITESPACE::removeFrom;
     Function<String, String> trim = String::trim;
     Function<String, String> lettersNumbers = JAVA_LETTER_OR_DIGIT::retainFrom;
     Function<String, String> lowerCase = String::toLowerCase;
     Function<String, String> lettersNumbersLowercase = lettersNumbers.andThen(lowerCase);
     Function<String, String> lettersNumbersTrimLowerCase = lettersNumbersLowercase.andThen(removeWhitespace);
}
