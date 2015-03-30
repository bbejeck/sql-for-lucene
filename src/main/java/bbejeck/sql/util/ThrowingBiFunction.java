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

import java.util.function.BiFunction;

/**
 * User: Bill Bejeck
 * Date: 3/11/15
 * Time: 11:07 PM
 */
@FunctionalInterface
public interface ThrowingBiFunction<T, U, R> extends BiFunction<T, U, R> {

    @Override
    default R apply(T t, U u) {
        try {
            return throwsApply(t, u);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    R throwsApply(T t, U u) throws Exception;
}
