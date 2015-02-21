package bbejeck.nosql.util;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * User: Bill Bejeck
 * Date: 10/12/14
 * Time: 10:40 PM
 */
public class Collectors {
    private static final BinaryOperator noopCombiner = (l,r)->{throw new RuntimeException("Parallel execution not supported");};

    @SuppressWarnings("unchecked")
    public static<T, R> Collector<T,R,R> of(Supplier<R> container,BiConsumer<R,T> accumulator){
        return Collector.of(container,accumulator, noopCombiner);
    }
}