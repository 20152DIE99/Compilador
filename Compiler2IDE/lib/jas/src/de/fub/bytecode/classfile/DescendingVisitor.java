package de.fub.bytecode.classfile;
import java.util.Stack;

/**
 * Traverses a JavaClass with another Visitor object 'piggy-backed'
 * that is applied to all components of a JavaClass object. I.e. this
 * class supplies the traversal strategy, other classes can make use
 * of it.
 *
 * @version $Id: DescendingVisitor.java,v 1.2 2001/08/15 14:47:50 dahm Exp $
 * @author <A HREF="http://www.berlin.de/~markus.dahm/">M. Dahm</A> 
 */
public class DescendingVisitor implements Visitor {
  private JavaClass clazz;
  private Visitor   visitor;
  private Stack     stack = new Stack();

  /** @return container of current entitity, i.e., predecessor during traversal
   */
  public Object predecessor() {
    return predecessor(0);
  }

  /**
   * @param level nesting level, i.e., 0 returns the direct predecessor
   * @return container of current entitity, i.e., predecessor during traversal
   */
  public Object predecessor(int level) {
    int size = stack.size();

    if((size < 2) || (level < 0))
      return null;
    else
      return stack.elementAt(size - (level + 2)); // size - 1 == current
  }

  /** @return current object
   */
  public Object current() {
    return stack.peek();
  }

  /**
   * @param clazz Class to traverse
   * @param visitor visitor object to apply to all components
   */
  public DescendingVisitor(JavaClass clazz, Visitor visitor) {
    this.clazz   = clazz;
    this.visitor = visitor;
  }

  /**
   * Start traversal.
   */
  public void visit() { clazz.accept(this); }

  public void visitJavaClass(JavaClass clazz) {
    stack.push(clazz);
    clazz.accept(visitor);
    
		System.out.println("begin visit fields");
    Field[] fields = clazz.getFields();
    for(int i=0; i < fields.length; i++)
      fields[i].accept(this);
		
		System.out.println("begin visit methods");
    Method[] methods = clazz.getMethods();
    for(int i=0; i < methods.length; i++)
      methods[i].accept(this);
		
		System.out.println("begin visit class attributes");
    Attribute[] attributes = clazz.getAttributes();
    for(int i=0; i < attributes.length; i++)
      attributes[i].accept(this);

    clazz.getConstantPool().accept(this);
    stack.pop();
  }

  public void visitField(Field field) {
  	//if(isSyntheticField(field)) return;
    stack.push(field);
    field.accept(visitor);
    
    System.out.println("visit field: " + ConstantPool.escape(field.toString()));
    Attribute[] attributes = field.getAttributes();
    for(int i=0; i < attributes.length; i++){
    	System.out.println("field attribute: " + ConstantPool.escape(attributes[i].toString()));
        attributes[i].accept(this);
    }
    stack.pop();
  }
  
  private boolean isSyntheticField(Field field)
  {
  	Attribute[] attributes = field.getAttributes();
  	for(int i=0; i < attributes.length; i++) {
      Attribute a = attributes[i];
      if(!(a instanceof ConstantValue)) return true;
    }
    return false;
  }

  public void visitConstantValue(ConstantValue cv) {
    stack.push(cv);
    cv.accept(visitor);
    stack.pop();
  }

  public void visitMethod(Method method) {
    stack.push(method);
    method.accept(visitor);
    
    Attribute[] attributes = method.getAttributes();
    for(int i=0; i < attributes.length; i++)
      attributes[i].accept(this);

    stack.pop();
  }

  public void visitExceptionTable(ExceptionTable table) {
    stack.push(table);
    table.accept(visitor);
    stack.pop();
  }

  public void visitCode(Code code) {
    stack.push(code);
    code.accept(visitor);

    CodeException[] table = code.getExceptionTable();
    for(int i=0; i < table.length; i++)
      table[i].accept(this);

    Attribute[] attributes = code.getAttributes();
    for(int i=0; i < attributes.length; i++)
      attributes[i].accept(this);
    stack.pop();
  }

  public void visitCodeException(CodeException ce) {
    stack.push(ce);
    ce.accept(visitor);
    stack.pop();
  }

  public void visitLineNumberTable(LineNumberTable table) {
    stack.push(table);
    table.accept(visitor);

    LineNumber[] numbers = table.getLineNumberTable();
    for(int i=0; i < numbers.length; i++)
      numbers[i].accept(this);
    stack.pop();
  }

  public void visitLineNumber(LineNumber number) {
    stack.push(number);
    number.accept(visitor);
    stack.pop();
  }

  public void visitLocalVariableTable(LocalVariableTable table) {
    stack.push(table);
    table.accept(visitor);

    LocalVariable[] vars = table.getLocalVariableTable();
    for(int i=0; i < vars.length; i++)
      vars[i].accept(this);
    stack.pop();
  }

  public void visitStackMap(StackMap table) {
    stack.push(table);
    table.accept(visitor);

    StackMapEntry[] vars = table.getStackMap();

    for(int i=0; i < vars.length; i++)
      vars[i].accept(this);
    stack.pop();
  }

  public void visitStackMapEntry(StackMapEntry var) {
    stack.push(var);
    var.accept(visitor);
    stack.pop();
  }

  public void visitLocalVariable(LocalVariable var) {
    stack.push(var);
    var.accept(visitor);
    stack.pop();
  }

  public void visitConstantPool(ConstantPool cp) {
    stack.push(cp);
    cp.accept(visitor);

    Constant[] constants = cp.getConstantPool();
    for(int i=1; i < constants.length; i++) {
      if(constants[i] != null)
	constants[i].accept(this);
    }

    stack.pop();
  }

  public void visitConstantClass(ConstantClass constant) {
    stack.push(constant);
    constant.accept(visitor);
    stack.pop();
  }

  public void visitConstantDouble(ConstantDouble constant) {
    stack.push(constant);
    constant.accept(visitor);
    stack.pop();
  }

  public void visitConstantFieldref(ConstantFieldref constant) {
    stack.push(constant);
    constant.accept(visitor);
    stack.pop();
  }

  public void visitConstantFloat(ConstantFloat constant) {
    stack.push(constant);
    constant.accept(visitor);
    stack.pop();
 }

  public void visitConstantInteger(ConstantInteger constant) {
    stack.push(constant);
    constant.accept(visitor);
    stack.pop();
  }

  public void visitConstantInterfaceMethodref(ConstantInterfaceMethodref constant) {
    stack.push(constant);
    constant.accept(visitor);
    stack.pop();
  }

  public void visitConstantLong(ConstantLong constant) {
    stack.push(constant);
    constant.accept(visitor);
    stack.pop();
  }

  public void visitConstantMethodref(ConstantMethodref constant) {
    stack.push(constant);
    constant.accept(visitor); 
    stack.pop();
  }

  public void visitConstantNameAndType(ConstantNameAndType constant) {
    stack.push(constant);
    constant.accept(visitor);
    stack.pop();
  }

  public void visitConstantString(ConstantString constant) {
    stack.push(constant);
    constant.accept(visitor);
    stack.pop();
  }

  public void visitConstantUtf8(ConstantUtf8 constant) {
    stack.push(constant);
    constant.accept(visitor);
    stack.pop();
  }

  public void visitInnerClasses(InnerClasses ic) {
    stack.push(ic);
    ic.accept(visitor);

    InnerClass[] ics = ic.getInnerClasses();
    for(int i=0; i < ics.length; i++)
      ics[i].accept(this);
    stack.pop();
  }

  public void visitInnerClass(InnerClass inner) {
    stack.push(inner);
    inner.accept(visitor);
    stack.pop();
  }

  public void visitDeprecated(Deprecated attribute) {
    stack.push(attribute);
    attribute.accept(visitor);
    stack.pop();
  }

  public void visitSourceFile(SourceFile attribute) {
    stack.push(attribute);
    attribute.accept(visitor);
    stack.pop();
  }

  public void visitSynthetic(Synthetic attribute) {
    stack.push(attribute);
    attribute.accept(visitor);
    stack.pop();
  }

  public void visitUnknown(Unknown attribute) {
    stack.push(attribute);
    attribute.accept(visitor);
    stack.pop();
 }
}
