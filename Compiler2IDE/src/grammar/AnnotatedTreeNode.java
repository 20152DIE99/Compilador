package grammar;

public class AnnotatedTreeNode {
//	Fields
	private Type type;
	private Object value;
	
	public AnnotatedTreeNode() {
		super();
	}
	public AnnotatedTreeNode(Type type, Object value){
		super();
		this.type = type;
		this.value = value;
	}
	
//	Getters and Setters
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}	
}
