package de.fub.bytecode.classfile;

import  de.fub.bytecode.Constants;
import  java.io.*;

/**
 * This class represents the constant pool, i.e., a table of constants.
 * It may contain null references, due to the JVM specification that skips
 * an entry after an 8-byte constant (double, long) entry.
 *
 * @version $Id: ConstantPool.java,v 1.6 2001/08/08 14:01:11 dahm Exp $
 * @see     Constant
 * @author <A HREF="http://www.berlin.de/~markus.dahm/">M. Dahm</A>
 */
public class ConstantPool implements Cloneable, Node {
  private int        constant_pool_count;
  private Constant[] constant_pool;

  /**
   * @param constant_pool Array of constants
   */
  public ConstantPool(Constant[] constant_pool)
  {
    setConstantPool(constant_pool);
  }

  /**
   * Read constants from given file stream.
   *
   * @param file Input stream
   * @throw IOException
   * @throw ClassFormatError
   */
  ConstantPool(DataInputStream file) throws IOException, ClassFormatError
  {
    byte tag;

    constant_pool_count = file.readUnsignedShort();
    constant_pool       = new Constant[constant_pool_count];

    /* constant_pool[0] is unused by the compiler and may be used freely
     * by the implementation.
     */
    for(int i=1; i < constant_pool_count; i++) {
      constant_pool[i] = Constant.readConstant(file);
	  
      /* Quote from the JVM specification:
       * "All eight byte constants take up two spots in the constant pool.
       * If this is the n'th byte in the constant pool, then the next item
       * will be numbered n+2"
       * 
       * Thus we have to increment the index counter.
       */
      tag = constant_pool[i].getTag();
      if((tag == Constants.CONSTANT_Double) || (tag == Constants.CONSTANT_Long))
	i++;
    }
  }

  /**
   * Called by objects that are traversing the nodes of the tree implicitely
   * defined by the contents of a Java class. I.e., the hierarchy of methods,
   * fields, attributes, etc. spawns a tree of objects.
   *
   * @param v Visitor object
   */
  public void accept(Visitor v) {
    v.visitConstantPool(this);
  }    

  /**
   * Resolve constant to a string representation.
   *
   * @param  constant Constant to be printed
   * @return String representation
   */
  public String constantToString(Constant c)
       throws ClassFormatError  
  {
    String   str;
    int      i;
    byte     tag = c.getTag();

    switch(tag) {
    case Constants.CONSTANT_Class: 
      i   = ((ConstantClass)c).getNameIndex();
      c   = getConstant(i, Constants.CONSTANT_Utf8);
      //str = Utility.compactClassName(((ConstantUtf8)c).getBytes(), false);
      str = ((ConstantUtf8)c).getBytes();
      break;

    case Constants.CONSTANT_String:
      i   = ((ConstantString)c).getStringIndex();
      c   = getConstant(i, Constants.CONSTANT_Utf8);
      str = "\"" + escape(((ConstantUtf8)c).getBytes()) + "\"";
      break;

    case Constants.CONSTANT_Utf8:    str = ((ConstantUtf8)c).getBytes();         break;
    case Constants.CONSTANT_Double:  str = "" + ((ConstantDouble)c).getBytes();  break;
    case Constants.CONSTANT_Float:   str = "" + ((ConstantFloat)c).getBytes();   break;
    case Constants.CONSTANT_Long:    str = "" + ((ConstantLong)c).getBytes();    break;
    case Constants.CONSTANT_Integer: str = "" + ((ConstantInteger)c).getBytes(); break;

    case Constants.CONSTANT_NameAndType:
      str = (constantToString(((ConstantNameAndType)c).getNameIndex(),
			      Constants.CONSTANT_Utf8) + " " +
	     constantToString(((ConstantNameAndType)c).getSignatureIndex(),
			      Constants.CONSTANT_Utf8));
      break;

    case Constants.CONSTANT_InterfaceMethodref: case Constants.CONSTANT_Methodref:
    case Constants.CONSTANT_Fieldref:
      str = (constantToString(((ConstantCP)c).getClassIndex(),
			      Constants.CONSTANT_Class) + "/" + 
	     constantToString(((ConstantCP)c).getNameAndTypeIndex(),
			      Constants.CONSTANT_NameAndType));	     
      break;

    default: // Never reached
      throw new RuntimeException("Unknown constant type " + tag);
    }
	
    return str;
  }    

  public static final String escape(String str) {
    int          len = str.length();
    StringBuffer buf = new StringBuffer(len + 5);
    char[]       ch  = str.toCharArray();

    for(int i=0; i < len; i++) {
	  if(ch[i]=='\n'||ch[i]=='\r'||ch[i]=='\t'||ch[i]=='\b'||ch[i]=='"'||ch[i]=='\\'){
		  switch(ch[i]) {
			  case '\n' : buf.append("\\n"); break;
			  case '\r' : buf.append("\\r"); break;
			  case '\t' : buf.append("\\t"); break;
			  case '\b' : buf.append("\\b"); break;
			  case '"'  : buf.append("\\\""); break;
			  case '\\'  : buf.append("\\\\"); break;
		  }
	  }
	  else {
		  if (ch[i] >= 0 && ch[i] < 0x20) {
			  buf.append("\\" + toOctStr(ch[i]));
		  } else if (ch[i] > 0x7E && ch[i] <= 0xFF) {
			  buf.append("\\" + toOctStr(ch[i]));
		  } else if (ch[i] > 0xFF) {
			  buf.append("\\u" + to4Hex(ch[i]));
		  } else {
			  buf.append(ch[i]);
		  }
	  }
	  /*if(ch[i]< 32 || ch[i] > 126){
		  buf.append("\\u"+to4Hex(ch[i]));
	  }
	  else buf.append(ch[i]);*/
    }

    return buf.toString();
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
	
  private static String to4Hex(char c)
  {
	  String hex = Integer.toHexString(c);
	  int len = 4 - hex.length();
	  StringBuffer buf = new StringBuffer(4);
	  for(; len > 0; len--) buf.append("0");
	  buf.append(hex);
	  return buf.toString();
  }


  /**
   * Retrieve constant at `index' from constant pool and resolve it to
   * a string representation.
   *
   * @param  index of constant in constant pool
   * @param  tag expected type
   * @return String representation
   */
  public String constantToString(int index, byte tag) 
       throws ClassFormatError
  {
    Constant c = getConstant(index, tag);
    return constantToString(c);
  }

  /** 
   * Dump constant pool to file stream in binary format.
   *
   * @param file Output file stream
   * @throw IOException
   */
  public void dump(DataOutputStream file) throws IOException
  {
    file.writeShort(constant_pool_count);

    for(int i=1; i < constant_pool_count; i++)
      if(constant_pool[i] != null)
	constant_pool[i].dump(file);
  }

  /**
   * Get constant from constant pool.
   *
   * @param  index Index in constant pool
   * @return Constant value
   * @see    Constant
   */
  public Constant getConstant(int index) {
    if (index >= constant_pool.length || index < 0)
      throw new ClassFormatError("Invalid constant pool reference: " +
				 index + ". Constant pool size is: " +
				 constant_pool.length);
    return constant_pool[index];
  }

  /**
   * Get constant from constant pool and check whether it has the
   * expected type.
   *
   * @param  index Index in constant pool
   * @param  tag Tag of expected constant, i.e., its type
   * @return Constant value
   * @see    Constant
   * @throw  ClassFormatError
   */
  public Constant getConstant(int index, byte tag)
       throws ClassFormatError
  {
    Constant c;

    c = getConstant(index);

    if(c == null)
      throw new ClassFormatError("Constant pool at index " + index + " is null.");

    if(c.getTag() == tag)
      return c;
    else
      throw new ClassFormatError("Expected class `" + Constants.CONSTANT_NAMES[tag] + 
				 "' at index " + index + " and got " + c);
  }

  /**
   * @return Array of constants.
   * @see    Constant
   */
  public Constant[] getConstantPool() { return constant_pool;  }    
  /**
   * Get string from constant pool and bypass the indirection of 
   * `ConstantClass' and `ConstantString' objects. I.e. these classes have
   * an index field that points to another entry of the constant pool of
   * type `ConstantUtf8' which contains the real data.
   *
   * @param  index Index in constant pool
   * @param  tag Tag of expected constant, either ConstantClass or ConstantString
   * @return Contents of string reference
   * @see    ConstantClass
   * @see    ConstantString
   * @throw  ClassFormatError
   */
  public String getConstantString(int index, byte tag) 
       throws ClassFormatError
  {
    Constant c;
    int    i;
    String   s;

    c = getConstant(index, tag);

    /* This switch() is not that elegant, since the two classes have the
     * same contents, they just differ in the name of the index
     * field variable.
     * But we want to stick to the JVM naming conventions closely though
     * we could have solved these more elegantly by using the same
     * variable name or by subclassing.
     */
    switch(tag) {
    case Constants.CONSTANT_Class:  i = ((ConstantClass)c).getNameIndex();    break;
    case Constants.CONSTANT_String: i = ((ConstantString)c).getStringIndex(); break;
    default:
      throw new RuntimeException("getConstantString called with illegal tag " + tag);
    }

    // Finally get the string from the constant pool
    c = getConstant(i, Constants.CONSTANT_Utf8);
    return ((ConstantUtf8)c).getBytes();
  }    
  /**
   * @return Length of constant pool.
   */
  public int getLength()
  {
    return constant_pool_count;
  }    

  /**
   * @param constant Constant to set
   */
  public void setConstant(int index, Constant constant) {
    constant_pool[index] = constant;
  }    

  /**
   * @param constant_pool
   */
  public void setConstantPool(Constant[] constant_pool) {
    this.constant_pool = constant_pool;
    constant_pool_count = (constant_pool == null)? 0 : constant_pool.length;
  }    
  /**
   * @return String representation.
   */
  public String toString() {
    StringBuffer buf = new StringBuffer();

    for(int i=1; i < constant_pool_count; i++)
      buf.append(i + ")" + constant_pool[i] + "\n");

    return buf.toString();
  }

  /**
   * @return deep copy of this constant pool
   */
  public ConstantPool copy() {
    ConstantPool c = null;

    try {
      c = (ConstantPool)clone();
    } catch(CloneNotSupportedException e) {}

    c.constant_pool = new Constant[constant_pool_count];

    for(int i=1; i < constant_pool_count; i++) {
      if(constant_pool[i] != null)
	c.constant_pool[i] = constant_pool[i].copy();
    }

    return c;
  }
}
