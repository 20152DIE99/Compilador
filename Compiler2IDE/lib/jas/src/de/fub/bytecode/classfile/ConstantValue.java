package de.fub.bytecode.classfile;

import  de.fub.bytecode.Constants;
import  java.io.*;

/**
 * This class is derived from <em>Attribute</em> and represents a constant 
 * value, i.e., a default value for initializing a class field.
 * This class is instantiated by the <em>Attribute.readAttribute()</em> method.
 *
 * @version $Id: ConstantValue.java,v 1.3 2001/05/09 09:26:57 dahm Exp $
 * @author  <A HREF="http://www.berlin.de/~markus.dahm/">M. Dahm</A>
 * @see     Attribute
 */
public final class ConstantValue extends Attribute {
  private int constantvalue_index;

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use clone() for a physical copy.
   */
  public ConstantValue(ConstantValue c) {
    this(c.getNameIndex(), c.getLength(), c.getConstantValueIndex(),
	 c.getConstantPool());
  }

  /**
   * Construct object from file stream.
   * @param name_index Name index in constant pool
   * @param length Content length in bytes
   * @param file Input stream
   * @param constant_pool Array of constants
   * @throws IOException
   */
  ConstantValue(int name_index, int length, DataInputStream file,
		ConstantPool constant_pool) throws IOException
  {
    this(name_index, length, (int)file.readUnsignedShort(), constant_pool);
  }    

  /**
   * @param name_index Name index in constant pool
   * @param length Content length in bytes
   * @param constantvalue_index Index in constant pool
   * @param constant_pool Array of constants
   */  
  public ConstantValue(int name_index, int length, 
		       int constantvalue_index,
		       ConstantPool constant_pool)
  {
    super(Constants.ATTR_CONSTANT_VALUE, name_index, length, constant_pool);
    this.constantvalue_index = constantvalue_index;
  }    

  /**
   * Called by objects that are traversing the nodes of the tree implicitely
   * defined by the contents of a Java class. I.e., the hierarchy of methods,
   * fields, attributes, etc. spawns a tree of objects.
   *
   * @param v Visitor object
   */
  public void accept(Visitor v) {
    v.visitConstantValue(this);
  }    
  /**
   * Dump constant value attribute to file stream on binary format.
   *
   * @param file Output file stream
   * @throws IOException
   */ 
  public final void dump(DataOutputStream file) throws IOException
  {
    super.dump(file);
    file.writeShort(constantvalue_index);
  }    
  /**
   * @return Index in constant pool of constant value.
   */  
  public final int getConstantValueIndex() { return constantvalue_index; }    

  /**
   * @param constantvalue_index
   */
  public final void setConstantValueIndex(int constantvalue_index) {
    this.constantvalue_index = constantvalue_index;
  }    

  /**
   * @return String representation of constant value.
   */ 
  public final String toString() throws InternalError
  {
    Constant c = constant_pool.getConstant(constantvalue_index);
	
    String   buf;
    int    i;

    // Print constant to string depending on its type
    switch(c.getTag()) {
    case Constants.CONSTANT_Long:    buf = "" + ((ConstantLong)c).getBytes();     break;
    case Constants.CONSTANT_Float:   buf = "" + ((ConstantFloat)c).getBytes();   break;
    case Constants.CONSTANT_Double:  buf = "" + ((ConstantDouble)c).getBytes();  break;
    case Constants.CONSTANT_Integer: buf = "" + ((ConstantInteger)c).getBytes(); break;
    case Constants.CONSTANT_String:  
      i   = ((ConstantString)c).getStringIndex();
      c   = constant_pool.getConstant(i, Constants.CONSTANT_Utf8);
      buf = "\"" + convertString(((ConstantUtf8)c).getBytes()) + "\"";
      break;
    default: throw new InternalError("Type of ConstValue invalid: " + c);
    }
    return buf;
  }

  /**
   * Escape all occurences of newline chars '\n', quotes \", etc.
   */
  private static final String convertString(String label) 
  {
	  return addEscapes(label);
  }

	private static String addEscapes(String s)
	{
		if (s == null) return s;
		if (s.equals("")) return s;
		char[] cArray = s.toCharArray();
		StringBuffer ret = new StringBuffer();
		for (int i = 0; i < cArray.length; i++) {
			char c = cArray[i];

			switch (c) {
				case '\n' :
					ret.append("\\n");
					break;
				case '\r' :
					ret.append("\\r");
					break;
				case '\t' :
					ret.append("\\t");
					break;
				case '\b' :
					ret.append("\\b");
					break;
				case '\f' :
					ret.append("\\f");
					break;
				case '"'  :
					ret.append("\\\"");
					break;
				case '\\'  :
					ret.append("\\\\");
					break;
				default:
					if (c >= 0 && c < 0x20) {
						ret.append("\\" + toOctStr(c));
					} else if (c > 0x7E && c <= 0xFF) {
						ret.append("\\" + toOctStr(c));
					} else if (c > 0xFF) {
						ret.append("\\u" + toHexStr(c, 4));
					} else {
						ret.append(c);
					}
			}

		}
		return ret.toString();
	}

	private static String toHexStr(int value, int length)
	{
		char hexDigits[] = {
				'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F'
		};
		StringBuffer buffer = new StringBuffer(length);
		int shift = length - 1 << 2;
		for (int i = -1; ++i < length;) {
			buffer.append(hexDigits[value >> shift & 0xf]);
			value <<= 4;
		}
		return buffer.toString();
	}

	private static String toOctStr(char c)
	{
		String ret = "";
		int v = c;
		int a = v / 8;
		int b = v % 8;
		ret = "" + b;
		if (a < 8) {
			return "0" + a + ret;
		}
		v = a;
		a = v / 8;
		b = v % 8;
		return "" + a + b + ret;
	}
	
  /**
   * @return deep copy of this attribute
   */
  public Attribute copy(ConstantPool constant_pool) {
    ConstantValue c = (ConstantValue)clone();
    c.constant_pool = constant_pool;
    return c;
  }
}
