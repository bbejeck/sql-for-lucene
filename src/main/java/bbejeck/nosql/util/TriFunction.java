package bbejeck.nosql.util;

/**
 * User: Bill Bejeck
 * Date: 10/14/14
 * Time: 11:17 PM
 */
@FunctionalInterface
public interface TriFunction<K,V,M,T> {

     T apply(K k, V v, M m);
}
