package compilerErrors;

public class CompileError {
	public static String overLoadingErr(String varID, int line){
		return String.format(
			"CompileErr.Linha-%d: Já existe uma declaração da função \"%s\" com essa assinatura.", line, varID);
	}
}
