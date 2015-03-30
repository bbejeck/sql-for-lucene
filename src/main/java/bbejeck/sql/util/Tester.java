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

package bbejeck.sql.util;

import java.util.function.Predicate;

/**
 * User: Bill Bejeck
 * Date: 3/12/15
 * Time: 8:25 AM
 */
public class Tester {

    public static void main(String[] args) {


        Predicate<String> matchesPhrase = s -> s.matches("([A-Za-z0-9]+\\s[A-Za-z0-9]+)+");
        Predicate<String> notPhrase = matchesPhrase.negate();

        String s = "foo bar";
        System.out.println(matchesPhrase.test(s));
    }
}
