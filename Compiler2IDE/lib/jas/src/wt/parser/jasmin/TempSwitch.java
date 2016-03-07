package wt.parser.jasmin;

import de.fub.bytecode.generic.InstructionHandle;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Bill
 * Date: 2004-2-17
 * Time: 15:09:33
 * To change this template use Options | File Templates.
 */
public class TempSwitch {
    static final int TABLESWITCH = 1;
    static final int LOOKUPSWITCH = 2;
    InstructionHandle ih = null;
    int type = 0;
    ArrayList match = new ArrayList(); //array of Integer
    ArrayList targets = new ArrayList(); //array of label name
    String defaultTarget = null; //label name
}
