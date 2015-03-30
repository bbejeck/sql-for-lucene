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

import java.util.Objects;
import java.util.function.Function;

/**
 * User: Bill Bejeck
 * Date: 3/8/15
 * Time: 11:14 PM
 */

@FunctionalInterface
public interface ThrowingFunction<T,R> extends Function<T,R> {

    @Override
    default R apply(T t){
        try{
            return applyThrows(t);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    default <V> ThrowingFunction<T, V> andThen(ThrowingFunction<? super R, ? extends V> after){
        Objects.requireNonNull(after);
        try{
             return (T t) -> after.apply(apply(t));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    default <V> ThrowingFunction<V, R> compose(ThrowingFunction<? super V, ? extends T> before) {
        Objects.requireNonNull(before);
        try {
            return (V v) -> apply(before.apply(v));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    R applyThrows(T t) throws Exception;

}
