package wt.parser.jasmin;

import de.fub.bytecode.generic.InstructionHandle;
import de.fub.bytecode.generic.MethodGen;
import de.fub.bytecode.generic.LDC2_W;
import de.fub.bytecode.generic.LDC_W;
import de.fub.bytecode.generic.LDC;
import de.fub.bytecode.generic.InstructionList;
import de.fub.bytecode.generic.ConstantPoolGen;
import de.fub.bytecode.Constants;

/**
 * Created by IntelliJ IDEA.
 * User: Bill
 * Date: 2004-2-17
 * Time: 11:41:36
 * To change this template use Options | File Templates.
 */
// used for instructions that take an number parameter
//ldc, ldc_w, ldc2_w
public class InstructionPattern_Num {
    
    public static InstructionHandle process(MethodGen mg, Token opcode, Token t_num)
        throws ParseException
    {
        ConstantPoolGen cp = JasminParser.cp;
        short oprCode = -1;
        if((oprCode = ScannerUtils.getOprCode(opcode.image)) == Constants.UNDEFINED){
            throw new ParseException("Not an instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        } 
        InsnInfo insn = InsnInfo.get(opcode.image);
        InstructionList il = mg.getInstructionList();
        Number num = ScannerUtils.convertNumObject(t_num.image);
        if (insn.args.equals("constant")) {//ldc, ldc_w
            float fnum;
            if(num instanceof Double) fnum = (float)num.doubleValue();
            else fnum = num.floatValue();
            int index = cp.addFloat(fnum);
            if(oprCode == Constants.LDC){
                return il.append(new LDC(index));
            }
            if(oprCode == Constants.LDC_W){
                return il.append(new LDC_W(index));
            }
        } 
        else if (insn.args.equals("bigconstant")) {// ldc2_w
            double dnum;
            if(num instanceof Double) dnum = num.doubleValue();
            else dnum = (double)num.floatValue();
            int index = cp.addDouble(dnum);
            return il.append(new LDC2_W(index));
        } 
        else {
            throw new ParseException("Bad arguments for instruction '" + opcode.image + "' at line " + opcode.beginLine + " column " + opcode.beginColumn);
        }
        return null;
    }
    
}
