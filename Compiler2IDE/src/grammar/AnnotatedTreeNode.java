package grammar;

public class AnnotatedTreeNode {
//	Fields
	private DataType type;
	private Object value;
	
	public AnnotatedTreeNode() {
		super();
	}
	public AnnotatedTreeNode(DataType type, Object value){
		super();
		this.type = type;
		this.value = value;
	}
	
//	Getters and Setters
	public DataType getType() {
		return type;
	}
	public void setType(DataType type) {
		this.type = type;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}	
}
