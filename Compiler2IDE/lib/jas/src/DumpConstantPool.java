
import de.fub.bytecode.classfile.ClassParser;
import de.fub.bytecode.classfile.JavaClass;
import de.fub.bytecode.classfile.Constant;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: Bill
 * Date: 2004-2-18
 * Time: 15:37:58
 * To change this template use Options | File Templates.
 */
public class DumpConstantPool {
    public static void main(String[] args) throws IOException {
        ClassParser parser    = null;
        JavaClass   java_class;
        
        parser     = new ClassParser(args[0]);
        java_class = parser.parse();
        Constant[] cp = java_class.getConstantPool().getConstantPool();
        System.out.println("Total: " + cp.length);
        for(int i=0; i<cp.length; i++){
            System.out.println("["+i+"] "+ (cp[i]==null? "null" : cp[i].toString()));
        }
    }
}

