package grammar;

import java.io.IOException;

import compileride.CompilerIDE;

public class CodeGen extends simpleJavaBaseListener {
	DefPhaseSimpleJava def;
	CompilerIDE ide;
	simpleJavaParser parser;
	
	public CodeGen(CompilerIDE ide, simpleJavaParser parser){
		this.ide = ide;
		this.parser = parser;
	}
	
	
	static public void gerador(){
		try {
			
			String string = "javac Compiler2IDE/lib/jas/TesteJasmin.java -d ./ ;"
					+ "java -cp  Compiler2IDE/lib/jas/jp.jar JasminVisitor"
					+ " TesteJasmin.class";
			Runtime.getRuntime().exec(new String[]{"bash","-c",
					string});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
