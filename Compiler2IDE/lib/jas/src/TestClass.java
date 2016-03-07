import de.fub.bytecode.Constants;
import de.fub.bytecode.classfile.ClassParser;
import de.fub.bytecode.classfile.JavaClass;

/**
 * Created by IntelliJ IDEA.
 * User: Bill
 * Date: 2004-2-18
 * Time: 11:46:51
 * To change this template use Options | File Templates.
 */
public class TestClass {
    static Class clazz;
    static String str;
    public static void main(String[] args) {
        clazz = TestClass.class;
        str = "abc";
    }
    
    public int m1(int p1, double p2, boolean p3, String p4)
    {
        int i1 =10;
        double d1 = 0.1;
        String str = "def";
        return 100;
    }
}
