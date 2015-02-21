package bbejeck.nosql.asm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * User: Bill Bejeck
 * Date: 5/12/14
 * Time: 11:42 PM
 */
public class AsmGenerator {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String className = reader.readLine();
        while(!className.equalsIgnoreCase("q")){
            org.objectweb.asm.util.ASMifier.main(new String[]{className});
            className  = reader.readLine();
        }
    }
}
