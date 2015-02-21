package bbejeck.nosql.asm;

/**
 * User: Bill Bejeck
 * Date: 5/13/14
 * Time: 9:14 PM
 */
public class SimpleClassLoader extends ClassLoader {


    public SimpleClassLoader(ClassLoader parent) {
        super(parent);
    }


    public Class<?> defineClass(String name, byte[] bytes){
        return defineClass(name,bytes,0,bytes.length);
    }
}
