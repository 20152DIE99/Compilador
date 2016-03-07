package wt.parser.jasmin;

import de.fub.bytecode.generic.InstructionHandle;
import de.fub.bytecode.generic.MethodGen;
import de.fub.bytecode.generic.LDC_W;
import de.fub.bytecode.generic.LDC;
import de.fub.bytecode.generic.InstructionList;
import de.fub.bytecode.generic.ConstantPoolGen;
import de.fub.bytecode.Constants;

/**
 * Created by IntelliJ IDEA.
 * User: Bill
 * Date: 2004-2-17
 * Time: 12:44:51
 * To change this template use Options | File Templates.
 */
// used for instructions that take a string parameter
//ldc, ldc_w
public class InstructionPattern_Str {
    
    public static InstructionHandle process(MethodGen mg, Token opcode, Token t_str)
        throws ParseException
    {
        ConstantPoolGen cp = JasminParser.cp;
        short oprCode = -1;
        if((oprCode = ScannerUtils.getOprCode(opcode.image)) == Constants.UNDEFINED){
            throw new ParseException("Not an instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        } 
        InsnInfo insn = InsnInfo.get(opcode.image);
        InstructionList il = mg.getInstructionList();
        if (insn.args.equals("constant")) {//ldc, ldc_w
            String tirmQuotation = t_str.image.substring(1, t_str.image.length()-1);
            int index = cp.addString(tirmQuotation);
            if(oprCode == Constants.LDC){
                return il.append(new LDC(index));
            }
            if(oprCode == Constants.LDC_W){
                return il.append(new LDC_W(index));
            }
        } else {
            throw new ParseException("Bad arguments for instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        }
        return null;
    }    
    
}
