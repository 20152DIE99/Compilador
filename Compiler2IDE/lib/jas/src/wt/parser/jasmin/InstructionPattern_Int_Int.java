package wt.parser.jasmin;

import de.fub.bytecode.generic.MethodGen;
import de.fub.bytecode.generic.IINC;
import de.fub.bytecode.generic.InstructionList;
import de.fub.bytecode.generic.InstructionHandle;
import de.fub.bytecode.Constants;

/**
 * Created by IntelliJ IDEA.
 * User: Bill
 * Date: 2004-2-17
 * Time: 10:44:37
 * To change this template use Options | File Templates.
 */
// used for iinc
public class InstructionPattern_Int_Int {
    
    public static InstructionHandle process(MethodGen mg, Token opcode, Token t_int1, Token t_int2)
        throws ParseException
    {
        if(ScannerUtils.getOprCode(opcode.image) == Constants.UNDEFINED){
            throw new ParseException("Not an instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        } 
        if (opcode.image.equals("iinc")) {
            InstructionList il = mg.getInstructionList();
            return il.append(new IINC(ScannerUtils.convertInt(t_int1.image), ScannerUtils.convertInt(t_int2.image)));
        } else {
            throw new ParseException("Bad arguments for instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        }
    }
}
