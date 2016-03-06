package semantico.symbols;

public abstract class ValuedSymbol extends Symbol{
	protected boolean isInialized;
	protected Object value;
	
	public ValuedSymbol(String name) {
		super(name);
	}
	
	public ValuedSymbol(String name, grammar.Type tipo) {
		super(name, tipo);
	}
	
	public void initialize(Object value){
		
	}

	public boolean isInialized() {
		return isInialized;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
}
