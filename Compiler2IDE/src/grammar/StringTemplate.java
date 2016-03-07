package grammar;

import java.io.File;
import java.io.IOException;

import org.stringtemplate.v4.*;

public class StringTemplate {
	
	File file = null;
	String filename;
	STGroup group;
	STErrorListener stel = null;
	StringBuilder sb;
	ST st;
	
	public StringTemplate() {
		super();
		filename = "placeholder";
		group = new STGroupDir("src/templates");
		st = group.getInstanceOf("classe");
		sb = new StringBuilder();
	}
	
	public void generateCode() {
		st.add("conteudo", sb.toString());
		try {
			file = new File("src/templates/"+filename);
			Boolean bool = file.createNewFile();
			System.out.println("File created: "+bool);
			st.write(file, stel);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void classe(String nome) {
		st.add("nome", nome);
		filename = nome+".java";
	}
	
	public void fecha(){
		ST st = group.getInstanceOf("fecha");
		sb.append(st.render());
	}
	
	public void declVar(String tipo, String vars){
		ST st = group.getInstanceOf("declVar");
		st.add("tipo", tipo);
		st.add("vars", vars);
		sb.append(st.render());
	}
	
	public void declConst(String tipo, String var, String valor){
		ST st = group.getInstanceOf("declConst");
		st.add("tipo", tipo);
		st.add("var", var);
		st.add("valor", valor);
		sb.append(st.render());
	}
	
	public void mainF(){
		ST st = group.getInstanceOf("main");
		sb.append(st.render());
	}
	
	public void forInicio(String inicio, String fim){
		ST st = group.getInstanceOf("forInicio");
		st.add("inicio", inicio);
		st.add("fim", fim);
		st.add("op", "<");
		sb.append(st.render());
	}
	
	public void forFinal(String incremento){
		ST st = group.getInstanceOf("forFinal");
		st.add("incremento", incremento);
		sb.append(st.render());
	}
	
	public void print(String var){
		ST st = group.getInstanceOf("print");
		st.add("var", var);
		sb.append(st.render());
	}

}
