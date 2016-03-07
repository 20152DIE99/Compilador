package wt.words;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

/**
 * Created by IntelliJ IDEA.
 * User: Bill
 * Date: 2004-2-24
 * Time: 9:21:57
 * To change this template use Options | File Templates.
 */
public class Words2Java {
    public static void main(String args[]) 
            throws IOException 
    {
        BufferedReader reader;  
        FileWriter writer = new FileWriter("wt/words/Words.java");
        writer.write("package wt.words;\n\n");
        writer.write("import java.util.Hashtable;\n\n");
        writer.write("public class Words {\n\n");
        for(int i=2; i<=32; i++){
            String ext = "" + (i<10?"0":"") + i;
            String fileName = "wt/words/" + "length" + ext + ".txt";
            reader = new BufferedReader(new FileReader(fileName));
            writer.write("\tpublic static String[] words"+ext+"={");
            String word;
            boolean first = true;
            int count = 0;
            while((word = reader.readLine()) != null){
                if(first) first = false;
                else {
                    writer.write(",");
                    if(count%5 == 0) {
                        writer.write("\n\t\t");
                    }
                }
                count++;
                if(count > 100) count = 1;
                writer.write("\""+word+"\"");
            }
            writer.write("\n\t};\n");
            reader.close();
            reader = null;
        }
        writer.write("\n\tpublic static Hashtable wordsTable = new Hashtable();\n");
        writer.write("\tstatic {\n");
        for(int i=2; i<=32; i++){
            String key = "words" + (i<10?"0":"") + i;
            writer.write("\t\twordsTable.put(\""+key+"\", Words."+key+");\n");
        }
        writer.write("\t};");
        writer.write("\n\n}");
        writer.close();
    }
}
