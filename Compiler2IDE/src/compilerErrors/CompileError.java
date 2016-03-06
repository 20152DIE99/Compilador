package compilerErrors;

public class CompileError {
	public static String overLoadingErr(String varID, int line){
		return String.format(
			"CompileErr.Linha-%d: Já existe uma declaração da função \"%s\" com essa assinatura.", line, varID);
	}
	
	public static String invalidTypeOperator(String op, grammar.Type type1, 
			grammar.Type type2, int line, String expr){
		if(type1 == type2){
			return String.format("CompileErr.Linha-%d: O operador \'%s\' não é "
					+ "definido para argumentos do tipo \'%s\' na expressão "
					+ "\"%s\"", line, op ,type1.toString(), expr);
		}else{
			return String.format("CompileErr.Linha-%d: O operador \'%s\' não é "
					+ "definido para argumentos dos tipos (\'%s\' e \'%s\') "
					+ "na expressão \"%s\"", line, op, type1.toString().toLowerCase(),
					type2.toString().toLowerCase(), expr);			
		}
	}

	public static String uninitializedVar(String varName, int line) {
		return String.format(
				"CompileErr.Linha-%d: A variável \"%s\" não foi inicializada",
				line, varName);
	}

	public static String typeMismatch(String tipoAttr, String tipoVar, int line) {
		return String.format(
				"CompileErr.Linha-%d: Tipos incompatíveis, não é possivel "
				+ "converter \"%s\" para \"%s\".",line, tipoAttr.toLowerCase(),
				tipoVar.toLowerCase());
	}
}
