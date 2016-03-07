package de.fub.bytecode.classfile;

import  de.fub.bytecode.Constants;
import  java.io.*;

/**
 * This class represents colection of local variables in a
 * method. This attribute is contained in the <em>Code</em> attribute.
 *
 * @version $Id: LocalVariableTable.java,v 1.5 2001/07/25 10:24:34 dahm Exp $
 * @author  <A HREF="http://www.berlin.de/~markus.dahm/">M. Dahm</A>
 * @see     Code
 * @see LocalVariable
 */
public class LocalVariableTable extends Attribute {
  private int             local_variable_table_length; // Table of local
  private LocalVariable[] local_variable_table;        // variables

  /**
   * Initialize from another object. Note that both objects use the same
   * references (shallow copy). Use copy() for a physical copy.
   */
  public LocalVariableTable(LocalVariableTable c) {
    this(c.getNameIndex(), c.getLength(), c.getLocalVariableTable(),
	 c.getConstantPool());
  }

  /**
   * @param name_index Index in constant pool to `LocalVariableTable'
   * @param length Content length in bytes
   * @param local_variable_table Table of local variables
   * @param constant_pool Array of constants
   */
  public LocalVariableTable(int name_index, int length,
			    LocalVariable[] local_variable_table,
			    ConstantPool    constant_pool)
  {
    super(Constants.ATTR_LOCAL_VARIABLE_TABLE, name_index, length, constant_pool);
    setLocalVariableTable(local_variable_table);
  }    

  /**
   * Construct object from file stream.
   * @param name_index Index in constant pool
   * @param length Content length in bytes
   * @param file Input stream
   * @param constant_pool Array of constants
   * @throw IOException
   */
  LocalVariableTable(int name_index, int length, DataInputStream file,
		     ConstantPool constant_pool) throws IOException
  {
    this(name_index, length, (LocalVariable[])null, constant_pool);

    local_variable_table_length = (file.readUnsignedShort());
    local_variable_table = new LocalVariable[local_variable_table_length];

    for(int i=0; i < local_variable_table_length; i++)
      local_variable_table[i] = new LocalVariable(file, constant_pool);
  }

  /**
   * Called by objects that are traversing the nodes of the tree implicitely
   * defined by the contents of a Java class. I.e., the hierarchy of methods,
   * fields, attributes, etc. spawns a tree of objects.
   *
   * @param v Visitor object
   */
  public void accept(Visitor v) {
    v.visitLocalVariableTable(this);
  }

  /**
   * Dump local variable table attribute to file stream in binary format.
   *
   * @param file Output file stream
   * @throw IOException
   */ 
  public final void dump(DataOutputStream file) throws IOException
  {
    super.dump(file);
    file.writeShort(local_variable_table_length);
    for(int i=0; i < local_variable_table_length; i++)
      local_variable_table[i].dump(file);
  }

  /**
   * @return Array of local variables of method.
   */  
  public final LocalVariable[] getLocalVariableTable() {
    return local_variable_table;
  }    

  /** @return first matching variable using index
   */
  public final LocalVariable getLocalVariable(int index) {
    for(int i=0; i < local_variable_table_length; i++)
      if(local_variable_table[i].getIndex() == index)
	return local_variable_table[i];

    return null;
  }

  public final void setLocalVariableTable(LocalVariable[] local_variable_table)
  {
    this.local_variable_table = local_variable_table;
    local_variable_table_length = (local_variable_table == null)? 0 :
      local_variable_table.length;
  }

  /**
   * @return String representation.
   */ 
  public final String toString() {
    StringBuffer buf = new StringBuffer("");

    for(int i=0; i < local_variable_table_length; i++) {
      buf.append(local_variable_table[i].toString());

      if(i < local_variable_table_length - 1)
	buf.append('\n');
    }

    return buf.toString();
  }

  /**
   * @return deep copy of this attribute
   */
  public Attribute copy(ConstantPool constant_pool) {
    LocalVariableTable c = (LocalVariableTable)clone();

    c.local_variable_table = new LocalVariable[local_variable_table_length];
    for(int i=0; i < local_variable_table_length; i++)
      c.local_variable_table[i] = local_variable_table[i].copy();

    c.constant_pool = constant_pool;
    return c;
  }

  public final int getTableLength() { return local_variable_table_length; }
}
