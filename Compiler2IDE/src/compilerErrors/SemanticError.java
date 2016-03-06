package compilerErrors;

public class SemanticError {
	public static String varRedeclaration(String varID, int line){
		return String.format(
			"SemanticErr.Linha-%d: Redeclaração da variável \"%s\".", line, varID);
	}
	
	public static String invalidType(String textType,int line){
		return String.format(
			"SemanticErr.Linha-%d: A expressão \"%s\" não é um tipo válido.\n"
			+ "\tTipos esperados: 'int', 'float', 'string' ou 'boolean'.", 
			line,textType); 
	}
	
	public static String varUnknown(String varID, int line){
		return String.format(
			"SemanticErr.Linha-%d: A variável \"%s\" não foi declarada.", line, varID);
	}
	
	public static String typeMismatch(int line){
		return String.format("SemanticErr.Linha-%d: Tipos incompatíveis.",line);
	}

	public static String constRedeClaretion(String idName, int line) {
		return String.format(
				"SemanticErr.Linha-%d: Redeclaração da constante \"%s\".", line, idName);
	}
	public static String errorREADIO(String symbID, int line){
		return String.format(
			"SemanticErr.Linha-%d: Não é possivel fazer leitura para este ID\"%s\".", line,symbID);
	}
	public static String errorREADIOConstante(String symbID, int line){
		return String.format(
			"SemanticErr.Linha-%d: Não é possivel fazer uma leitura para constante\"%s\".", line,symbID);
	}
	public static String logicError(String symbID, int line){
		return String.format(
			"LogicErr.Linha-%d: Condição para loop \"%s\".", line,symbID);
	}
	
}
