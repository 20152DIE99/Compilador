package wt.parser.jasmin;

import de.fub.bytecode.Constants;
import java.util.Hashtable;

public class ScannerUtils {
		
	public static Hashtable dict = new Hashtable();

    public static short getOprCode(String oprName)
    {
      if(Constants.ILLEGAL_OPCODE.equals(oprName)) return Constants.UNDEFINED;
      for(short i=0; i<Constants.OPCODE_NAMES.length; i++){
          if(Constants.OPCODE_NAMES[i].equals(oprName)) return i;
      }
      return Constants.UNDEFINED;
    }
  
    public static Number convertNumObject(String str)
                throws NumberFormatException
	{
	    double x = (new Double(str)).doubleValue();
	    // see if it will fit into a float...
	    if (x <= (double)Float.MAX_VALUE && x >= Float.MIN_VALUE) {
	        // bug fix here thanks to Peter Chubb (replaced int->float)
	        return new Float((float)x);
	    } 
	    // if not, return a double 
	    return new Double(x);
	}
		
    public static Number convertIntObject(String str)
                throws NumberFormatException
	{
		long lv = convertLong(str);
		if(str.endsWith("l") ||str.endsWith("L")) return new Long(lv);
	    if(lv <= (long)Integer.MAX_VALUE && lv >= (long)Integer.MIN_VALUE) return new Integer((int)lv);
	    else return new Long(lv);
	}

    public static int convertInt(String str)
                throws NumberFormatException
	{
		return (int)convertLong(str);
	}
		
    public static long convertLong(String str)
                throws NumberFormatException
	{
		if(str.startsWith("0x") || str.startsWith("0X")){//HEX
				return Long.parseLong(str, 16);
		} 
		else if(str.startsWith("0")){//OCTAL
				return Long.parseLong(str, 8);
		}
		else {//DECIMAL
				return Long.parseLong(str, 10);
		}
	}

    //
    // Converts a string of a given radix to an int or a long
    // (uses smallest format that will hold the number)
    //
    public static Number convertInt(String str, int radix)
                throws NumberFormatException
    {
        long x = Long.parseLong(str, radix);
        if (x <= (long)Integer.MAX_VALUE && x >= (long)Integer.MIN_VALUE) {
            return new Integer((int)x);
        }
        return new Long(x);
    }

    //
    // Converts a string to a number (int, float, long, or double).
    // (uses smallest format that will hold the number)
    //
    public static Number convertNumber(String str)
                throws NumberFormatException
    {
        if (str.startsWith("0x")) {
            // base 16 integer
            return (convertInt(str.substring(2), 16));
        } else if (str.indexOf('.') != -1) {
            // make a double
            double x = (new Double(str)).doubleValue();

            // see if it will fit into a float...
            if (x <= (double)Float.MAX_VALUE && x >= Float.MIN_VALUE) {
                // bug fix here thanks to Peter Chubb (replaced int->float)
                return new Float((float)x);
            }
            // if not, return a double
            return new Double(x);
        } else {
            // assume long or int in base 10
            return (convertInt(str, 10));
        }
    }

    //
    // Maps '.' characters to '/' characters in a string
    //
    public static String convertDots(String orig_name)
    {
        return convertChars(orig_name, ".", '/');
    }

    //
    // Maps chars to toChar in a given String
    //
    public static String convertChars(String orig_name,
                                      String chars, char toChar)
    {
        StringBuffer tmp = new StringBuffer(orig_name);
        int i;
        for (i = 0; i < tmp.length(); i++) {
            if (chars.indexOf(tmp.charAt(i)) != -1) {
                tmp.setCharAt(i, toChar);
            }
        }
        return new String(tmp);
    }

    //
    // Splits a string like:
    //     "a/b/c/d(xyz)v"
    // into three strings:
    //     "a/b/c", "d", "(xyz)v"
    //
    public static String[] splitClassMethodSignature(String name)
    {
        String result[] = new String[3];
        int i, pos = 0, sigpos = 0;
        for (i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == '.' || c == '/') pos = i;
            else if (c == '(') {sigpos = i; break; }
        }
        result[0] = convertDots(name.substring(0, pos));
        result[1] = name.substring(pos + 1, sigpos);
        result[2] = convertDots(name.substring(sigpos));

        return result;
    }

    //
    // Splits a string like:
    //    "java/lang/System/out"
    // into two strings:
    //    "java/lang/System" and "out"
    //
    public static String[] splitClassField(String name)
    {
        String result[] = new String[2];
        int i, pos = -1, sigpos = 0;
        for (i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == '.' || c == '/') pos = i;
        }
        if (pos == -1) {    // no '/' in string
            result[0] = null;
            result[1] = name;
        } else {
            result[0] = convertDots(name.substring(0, pos));
            result[1] = name.substring(pos + 1);
        }

        return result;
    }

    // Splits a string like:
    //      "main(Ljava/lang/String;)V
    // into two strings:
    //      "main" and "(Ljava/lang/String;)V"
    //
    public static String[] splitMethodSignature(String name)
    {
        String result[] = new String[2];
        int i, sigpos = 0;
        for (i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == '(') {sigpos = i; break; }
        }
        result[0] = name.substring(0, sigpos);
        result[1] = convertDots(name.substring(sigpos));

        return result;
    }

	public static void main(String[] args)
	{
		System.out.println(Long.parseLong("1000L"));
	}
}
