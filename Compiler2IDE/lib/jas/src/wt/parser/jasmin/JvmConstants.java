
/* Constants used in JVM class files */

package wt.parser.jasmin;

import de.fub.bytecode.Constants;
import de.fub.bytecode.generic.*;

public interface JvmConstants {

    // top-level constants
    public static final int JAVA_MAGIC = -889275714;
    public static final int JAVA_VERSION = 45;
    public static final int JAVA_MINOR_VERSION = 3;

    // constant pool entry types
    public static final int CONSTANT_UTF8 = 1;
    public static final int CONSTANT_UNICODE = 2;
    public static final int CONSTANT_INTEGER = 3;
    public static final int CONSTANT_FLOAT = 4;
    public static final int CONSTANT_LONG = 5;
    public static final int CONSTANT_DOUBLE = 6;
    public static final int CONSTANT_CLASS = 7;
    public static final int CONSTANT_STRING = 8;
    public static final int CONSTANT_FIELD = 9;
    public static final int CONSTANT_METHOD = 10;
    public static final int CONSTANT_INTERFACEMETHOD = 11;
    public static final int CONSTANT_NAMEANDTYPE = 12;

    // access flags
    public static final int ACC_PUBLIC = 1;
    public static final int ACC_PRIVATE = 2;
    public static final int ACC_PROTECTED = 4;
    public static final int ACC_STATIC = 8;
    public static final int ACC_FINAL = 16;
    public static final int ACC_SYNCHRONIZED = 32;
    public static final int ACC_VOLATILE = 64;
    public static final int ACC_TRANSIENT = 128;
    public static final int ACC_NATIVE = 256;
    public static final int ACC_INTERFACE = 512;
    public static final int ACC_ABSTRACT = 1024;
    public static final int ACC_SUPER = 32;

    // types for newarray
    public static final int T_CLASS = 2;
    public static final int T_BOOLEAN = 4;
    public static final int T_CHAR = 5;
    public static final int T_FLOAT = 6;
    public static final int T_DOUBLE = 7;
    public static final int T_BYTE = 8;
    public static final int T_SHORT = 9;
    public static final int T_INT = 10;
    public static final int T_LONG = 11;

    // opcodes
    public static final int opc_try = -3;
    public static final int opc_dead = -2;
    public static final int opc_label = -1;
    public static final int opc_nop = 0;
    public static final int opc_aconst_null = 1;
    public static final int opc_iconst_m1 = 2;
    public static final int opc_iconst_0 = 3;
    public static final int opc_iconst_1 = 4;
    public static final int opc_iconst_2 = 5;
    public static final int opc_iconst_3 = 6;
    public static final int opc_iconst_4 = 7;
    public static final int opc_iconst_5 = 8;
    public static final int opc_lconst_0 = 9;
    public static final int opc_lconst_1 = 10;
    public static final int opc_fconst_0 = 11;
    public static final int opc_fconst_1 = 12;
    public static final int opc_fconst_2 = 13;
    public static final int opc_dconst_0 = 14;
    public static final int opc_dconst_1 = 15;
    public static final int opc_bipush = 16;
    public static final int opc_sipush = 17;
    public static final int opc_ldc = 18;
    public static final int opc_ldc_w = 19;
    public static final int opc_ldc2_w = 20;
    public static final int opc_iload = 21;
    public static final int opc_lload = 22;
    public static final int opc_fload = 23;
    public static final int opc_dload = 24;
    public static final int opc_aload = 25;
    public static final int opc_iload_0 = 26;
    public static final int opc_iload_1 = 27;
    public static final int opc_iload_2 = 28;
    public static final int opc_iload_3 = 29;
    public static final int opc_lload_0 = 30;
    public static final int opc_lload_1 = 31;
    public static final int opc_lload_2 = 32;
    public static final int opc_lload_3 = 33;
    public static final int opc_fload_0 = 34;
    public static final int opc_fload_1 = 35;
    public static final int opc_fload_2 = 36;
    public static final int opc_fload_3 = 37;
    public static final int opc_dload_0 = 38;
    public static final int opc_dload_1 = 39;
    public static final int opc_dload_2 = 40;
    public static final int opc_dload_3 = 41;
    public static final int opc_aload_0 = 42;
    public static final int opc_aload_1 = 43;
    public static final int opc_aload_2 = 44;
    public static final int opc_aload_3 = 45;
    public static final int opc_iaload = 46;
    public static final int opc_laload = 47;
    public static final int opc_faload = 48;
    public static final int opc_daload = 49;
    public static final int opc_aaload = 50;
    public static final int opc_baload = 51;
    public static final int opc_caload = 52;
    public static final int opc_saload = 53;
    public static final int opc_istore = 54;
    public static final int opc_lstore = 55;
    public static final int opc_fstore = 56;
    public static final int opc_dstore = 57;
    public static final int opc_astore = 58;
    public static final int opc_istore_0 = 59;
    public static final int opc_istore_1 = 60;
    public static final int opc_istore_2 = 61;
    public static final int opc_istore_3 = 62;
    public static final int opc_lstore_0 = 63;
    public static final int opc_lstore_1 = 64;
    public static final int opc_lstore_2 = 65;
    public static final int opc_lstore_3 = 66;
    public static final int opc_fstore_0 = 67;
    public static final int opc_fstore_1 = 68;
    public static final int opc_fstore_2 = 69;
    public static final int opc_fstore_3 = 70;
    public static final int opc_dstore_0 = 71;
    public static final int opc_dstore_1 = 72;
    public static final int opc_dstore_2 = 73;
    public static final int opc_dstore_3 = 74;
    public static final int opc_astore_0 = 75;
    public static final int opc_astore_1 = 76;
    public static final int opc_astore_2 = 77;
    public static final int opc_astore_3 = 78;
    public static final int opc_iastore = 79;
    public static final int opc_lastore = 80;
    public static final int opc_fastore = 81;
    public static final int opc_dastore = 82;
    public static final int opc_aastore = 83;
    public static final int opc_bastore = 84;
    public static final int opc_castore = 85;
    public static final int opc_sastore = 86;
    public static final int opc_pop = 87;
    public static final int opc_pop2 = 88;
    public static final int opc_dup = 89;
    public static final int opc_dup_x1 = 90;
    public static final int opc_dup_x2 = 91;
    public static final int opc_dup2 = 92;
    public static final int opc_dup2_x1 = 93;
    public static final int opc_dup2_x2 = 94;
    public static final int opc_swap = 95;
    public static final int opc_iadd = 96;
    public static final int opc_ladd = 97;
    public static final int opc_fadd = 98;
    public static final int opc_dadd = 99;
    public static final int opc_isub = 100;
    public static final int opc_lsub = 101;
    public static final int opc_fsub = 102;
    public static final int opc_dsub = 103;
    public static final int opc_imul = 104;
    public static final int opc_lmul = 105;
    public static final int opc_fmul = 106;
    public static final int opc_dmul = 107;
    public static final int opc_idiv = 108;
    public static final int opc_ldiv = 109;
    public static final int opc_fdiv = 110;
    public static final int opc_ddiv = 111;
    public static final int opc_irem = 112;
    public static final int opc_lrem = 113;
    public static final int opc_frem = 114;
    public static final int opc_drem = 115;
    public static final int opc_ineg = 116;
    public static final int opc_lneg = 117;
    public static final int opc_fneg = 118;
    public static final int opc_dneg = 119;
    public static final int opc_ishl = 120;
    public static final int opc_lshl = 121;
    public static final int opc_ishr = 122;
    public static final int opc_lshr = 123;
    public static final int opc_iushr = 124;
    public static final int opc_lushr = 125;
    public static final int opc_iand = 126;
    public static final int opc_land = 127;
    public static final int opc_ior = 128;
    public static final int opc_lor = 129;
    public static final int opc_ixor = 130;
    public static final int opc_lxor = 131;
    public static final int opc_iinc = 132;
    public static final int opc_i2l = 133;
    public static final int opc_i2f = 134;
    public static final int opc_i2d = 135;
    public static final int opc_l2i = 136;
    public static final int opc_l2f = 137;
    public static final int opc_l2d = 138;
    public static final int opc_f2i = 139;
    public static final int opc_f2l = 140;
    public static final int opc_f2d = 141;
    public static final int opc_d2i = 142;
    public static final int opc_d2l = 143;
    public static final int opc_d2f = 144;
    public static final int opc_i2b = 145;
    public static final int opc_i2c = 146;
    public static final int opc_i2s = 147;
    public static final int opc_lcmp = 148;
    public static final int opc_fcmpl = 149;
    public static final int opc_fcmpg = 150;
    public static final int opc_dcmpl = 151;
    public static final int opc_dcmpg = 152;
    public static final int opc_ifeq = 153;
    public static final int opc_ifne = 154;
    public static final int opc_iflt = 155;
    public static final int opc_ifge = 156;
    public static final int opc_ifgt = 157;
    public static final int opc_ifle = 158;
    public static final int opc_if_icmpeq = 159;
    public static final int opc_if_icmpne = 160;
    public static final int opc_if_icmplt = 161;
    public static final int opc_if_icmpge = 162;
    public static final int opc_if_icmpgt = 163;
    public static final int opc_if_icmple = 164;
    public static final int opc_if_acmpeq = 165;
    public static final int opc_if_acmpne = 166;
    public static final int opc_goto = 167;
    public static final int opc_jsr = 168;
    public static final int opc_ret = 169;
    public static final int opc_tableswitch = 170;
    public static final int opc_lookupswitch = 171;
    public static final int opc_ireturn = 172;
    public static final int opc_lreturn = 173;
    public static final int opc_freturn = 174;
    public static final int opc_dreturn = 175;
    public static final int opc_areturn = 176;
    public static final int opc_return = 177;
    public static final int opc_getstatic = 178;
    public static final int opc_putstatic = 179;
    public static final int opc_getfield = 180;
    public static final int opc_putfield = 181;
    public static final int opc_invokevirtual = 182;
    public static final int opc_invokespecial = 183;
    public static final int opc_invokestatic = 184;
    public static final int opc_invokeinterface = 185;
    public static final int opc_xxxunusedxxx = 186;
    public static final int opc_new = 187;
    public static final int opc_newarray = 188;
    public static final int opc_anewarray = 189;
    public static final int opc_arraylength = 190;
    public static final int opc_athrow = 191;
    public static final int opc_checkcast = 192;
    public static final int opc_instanceof = 193;
    public static final int opc_monitorenter = 194;
    public static final int opc_monitorexit = 195;
    public static final int opc_wide = 196;
    public static final int opc_multianewarray = 197;
    public static final int opc_ifnull = 198;
    public static final int opc_ifnonnull = 199;
    public static final int opc_goto_w = 200;
    public static final int opc_jsr_w = 201;
    public static final int opc_breakpoint = 202;

    // for backwards compatibility with 1.0
    public static final int opc_int2byte = opc_i2b;
    public static final int opc_int2char = opc_i2c;
    public static final int opc_int2short = opc_i2s;
    public static final int opc_invokenonvirtual = opc_invokespecial;

    // names of opcodes
    public static final String opcNames[] = {
        "opc_nop", "opc_aconst_null", "opc_iconst_m1", "opc_iconst_0",
        "opc_iconst_1", "opc_iconst_2", "opc_iconst_3", "opc_iconst_4",
        "opc_iconst_5", "opc_lconst_0", "opc_lconst_1", "opc_fconst_0",
        "opc_fconst_1", "opc_fconst_2", "opc_dconst_0", "opc_dconst_1",
        "opc_bipush", "opc_sipush", "opc_ldc", "opc_ldc_w", "opc_ldc2_w",
        "opc_iload", "opc_lload", "opc_fload", "opc_dload", "opc_aload",
        "opc_iload_0", "opc_iload_1", "opc_iload_2", "opc_iload_3",
        "opc_lload_0", "opc_lload_1", "opc_lload_2", "opc_lload_3",
        "opc_fload_0", "opc_fload_1", "opc_fload_2", "opc_fload_3",
        "opc_dload_0", "opc_dload_1", "opc_dload_2", "opc_dload_3",
        "opc_aload_0", "opc_aload_1", "opc_aload_2", "opc_aload_3",
        "opc_iaload", "opc_laload", "opc_faload", "opc_daload", "opc_aaload",
        "opc_baload", "opc_caload", "opc_saload", "opc_istore", "opc_lstore",
        "opc_fstore", "opc_dstore", "opc_astore", "opc_istore_0",
        "opc_istore_1", "opc_istore_2", "opc_istore_3", "opc_lstore_0",
        "opc_lstore_1", "opc_lstore_2", "opc_lstore_3", "opc_fstore_0",
        "opc_fstore_1", "opc_fstore_2", "opc_fstore_3", "opc_dstore_0",
        "opc_dstore_1", "opc_dstore_2", "opc_dstore_3", "opc_astore_0",
        "opc_astore_1", "opc_astore_2", "opc_astore_3", "opc_iastore",
        "opc_lastore", "opc_fastore", "opc_dastore", "opc_aastore",
        "opc_bastore", "opc_castore", "opc_sastore", "opc_pop", "opc_pop2",
        "opc_dup", "opc_dup_x1", "opc_dup_x2", "opc_dup2", "opc_dup2_x1",
        "opc_dup2_x2", "opc_swap", "opc_iadd", "opc_ladd", "opc_fadd",
        "opc_dadd", "opc_isub", "opc_lsub", "opc_fsub", "opc_dsub",
        "opc_imul", "opc_lmul", "opc_fmul", "opc_dmul", "opc_idiv",
        "opc_ldiv", "opc_fdiv", "opc_ddiv", "opc_irem", "opc_lrem",
        "opc_frem", "opc_drem", "opc_ineg", "opc_lneg", "opc_fneg",
        "opc_dneg", "opc_ishl", "opc_lshl", "opc_ishr", "opc_lshr",
        "opc_iushr", "opc_lushr", "opc_iand", "opc_land", "opc_ior",
        "opc_lor", "opc_ixor", "opc_lxor", "opc_iinc", "opc_i2l", "opc_i2f",
        "opc_i2d", "opc_l2i", "opc_l2f", "opc_l2d", "opc_f2i", "opc_f2l",
        "opc_f2d", "opc_d2i", "opc_d2l", "opc_d2f", "opc_i2b", "opc_i2c",
        "opc_i2s", "opc_lcmp", "opc_fcmpl", "opc_fcmpg", "opc_dcmpl",
        "opc_dcmpg", "opc_ifeq", "opc_ifne", "opc_iflt", "opc_ifge",
        "opc_ifgt", "opc_ifle", "opc_if_icmpeq", "opc_if_icmpne",
        "opc_if_icmplt", "opc_if_icmpge", "opc_if_icmpgt", "opc_if_icmple",
        "opc_if_acmpeq", "opc_if_acmpne", "opc_goto", "opc_jsr", "opc_ret",
        "opc_tableswitch", "opc_lookupswitch", "opc_ireturn", "opc_lreturn",
        "opc_freturn", "opc_dreturn", "opc_areturn", "opc_return",
        "opc_getstatic", "opc_putstatic", "opc_getfield", "opc_putfield",
        "opc_invokevirtual", "opc_invokespecial", "opc_invokestatic",
        "opc_invokeinterface", "opc_xxxunusedxxx", "opc_new", "opc_newarray",
        "opc_anewarray", "opc_arraylength", "opc_athrow", "opc_checkcast",
        "opc_instanceof", "opc_monitorenter", "opc_monitorexit", "opc_wide",
        "opc_multianewarray", "opc_ifnull", "opc_ifnonnull", "opc_goto_w",
        "opc_jsr_w", "opc_breakpoint"
    };

    // and their lengths
    static int opcLengths[] = {
        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 3, 3, 2, 2,
        2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1,
        1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3,
        3, 3, 3, 3, 3, 3, 3, 3, 2, 99, 99, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3,
        3, 5, 0, 3, 2, 3, 1, 1, 3, 3, 1, 1, 0, 4, 3, 3, 5, 5, 1
    };

    /** 
     * Predefined instruction objects
     * These instructions have no parameters.
     */
    public static final Instruction           NOP          = new NOP();
    public static final Instruction           ACONST_NULL  = new ACONST_NULL();
    public static final Instruction           ICONST_M1    = new ICONST(-1);
    public static final Instruction           ICONST_0     = new ICONST(0);
    public static final Instruction           ICONST_1     = new ICONST(1);
    public static final Instruction           ICONST_2     = new ICONST(2);
    public static final Instruction           ICONST_3     = new ICONST(3);
    public static final Instruction           ICONST_4     = new ICONST(4);
    public static final Instruction           ICONST_5     = new ICONST(5);
    public static final Instruction           LCONST_0     = new LCONST(0);
    public static final Instruction           LCONST_1     = new LCONST(1);
    public static final Instruction           FCONST_0     = new FCONST(0);
    public static final Instruction           FCONST_1     = new FCONST(1);
    public static final Instruction           FCONST_2     = new FCONST(2);
    public static final Instruction           DCONST_0     = new DCONST(0);
    public static final Instruction           DCONST_1     = new DCONST(1);
    public static final LocalVariableInstruction ILOAD_0 = new ILOAD(0);
    public static final LocalVariableInstruction ILOAD_1 = new ILOAD(1);
    public static final LocalVariableInstruction ILOAD_2 = new ILOAD(2);
    public static final LocalVariableInstruction ILOAD_3 = new ILOAD(3);
    public static final LocalVariableInstruction LLOAD_0 = new LLOAD(0);
    public static final LocalVariableInstruction LLOAD_1 = new LLOAD(1);
    public static final LocalVariableInstruction LLOAD_2 = new LLOAD(2);
    public static final LocalVariableInstruction LLOAD_3 = new LLOAD(3);
    public static final LocalVariableInstruction FLOAD_0 = new FLOAD(0);
    public static final LocalVariableInstruction FLOAD_1 = new FLOAD(1);
    public static final LocalVariableInstruction FLOAD_2 = new FLOAD(2);
    public static final LocalVariableInstruction FLOAD_3 = new FLOAD(3);
    public static final LocalVariableInstruction DLOAD_0 = new DLOAD(0);
    public static final LocalVariableInstruction DLOAD_1 = new DLOAD(1);
    public static final LocalVariableInstruction DLOAD_2 = new DLOAD(2);
    public static final LocalVariableInstruction DLOAD_3 = new DLOAD(3);
    public static final LocalVariableInstruction THIS    = new ALOAD(0);
    public static final LocalVariableInstruction ALOAD_0 = THIS;
    public static final LocalVariableInstruction ALOAD_1 = new ALOAD(1);
    public static final LocalVariableInstruction ALOAD_2 = new ALOAD(2);
    public static final LocalVariableInstruction ALOAD_3 = new ALOAD(3);
    public static final ArrayInstruction      IALOAD       = new IALOAD();
    public static final ArrayInstruction      LALOAD       = new LALOAD();
    public static final ArrayInstruction      FALOAD       = new FALOAD();
    public static final ArrayInstruction      DALOAD       = new DALOAD();
    public static final ArrayInstruction      AALOAD       = new AALOAD();
    public static final ArrayInstruction      BALOAD       = new BALOAD();
    public static final ArrayInstruction      CALOAD       = new CALOAD();
    public static final ArrayInstruction      SALOAD       = new SALOAD();
    public static final LocalVariableInstruction ISTORE_0 = new ISTORE(0);
    public static final LocalVariableInstruction ISTORE_1 = new ISTORE(1);
    public static final LocalVariableInstruction ISTORE_2 = new ISTORE(2);
    public static final LocalVariableInstruction ISTORE_3 = new ISTORE(3);
    public static final LocalVariableInstruction LSTORE_0 = new ISTORE(0);
    public static final LocalVariableInstruction LSTORE_1 = new ISTORE(1);
    public static final LocalVariableInstruction LSTORE_2 = new ISTORE(2);
    public static final LocalVariableInstruction LSTORE_3 = new ISTORE(3);
    public static final LocalVariableInstruction FSTORE_0 = new FSTORE(0);
    public static final LocalVariableInstruction FSTORE_1 = new FSTORE(1);
    public static final LocalVariableInstruction FSTORE_2 = new FSTORE(2);
    public static final LocalVariableInstruction FSTORE_3 = new FSTORE(3);
    public static final LocalVariableInstruction DSTORE_0 = new DSTORE(0);
    public static final LocalVariableInstruction DSTORE_1 = new DSTORE(1);
    public static final LocalVariableInstruction DSTORE_2 = new DSTORE(2);
    public static final LocalVariableInstruction DSTORE_3 = new DSTORE(3);
    public static final LocalVariableInstruction ASTORE_0 = new ASTORE(0);
    public static final LocalVariableInstruction ASTORE_1 = new ASTORE(1);
    public static final LocalVariableInstruction ASTORE_2 = new ASTORE(2);
    public static final LocalVariableInstruction ASTORE_3 = new ASTORE(3);
    public static final ArrayInstruction      IASTORE      = new IASTORE();
    public static final ArrayInstruction      LASTORE      = new LASTORE();
    public static final ArrayInstruction      FASTORE      = new FASTORE();
    public static final ArrayInstruction      DASTORE      = new DASTORE();
    public static final ArrayInstruction      AASTORE      = new AASTORE();
    public static final ArrayInstruction      BASTORE      = new BASTORE();
    public static final ArrayInstruction      CASTORE      = new CASTORE();
    public static final ArrayInstruction      SASTORE      = new SASTORE();
    public static final StackInstruction      POP          = new POP();
    public static final StackInstruction      POP2         = new POP2();
    public static final StackInstruction      DUP          = new DUP();
    public static final StackInstruction      DUP_X1       = new DUP_X1();
    public static final StackInstruction      DUP_X2       = new DUP_X2();
    public static final StackInstruction      DUP2         = new DUP2();
    public static final StackInstruction      DUP2_X1      = new DUP2_X1();
    public static final StackInstruction      DUP2_X2      = new DUP2_X2();
    public static final StackInstruction      SWAP         = new SWAP();
    public static final ArithmeticInstruction IADD         = new IADD();
    public static final ArithmeticInstruction LADD         = new LADD();
    public static final ArithmeticInstruction FADD         = new FADD();
    public static final ArithmeticInstruction DADD         = new DADD();
    public static final ArithmeticInstruction ISUB         = new ISUB();
    public static final ArithmeticInstruction LSUB         = new LSUB();
    public static final ArithmeticInstruction FSUB         = new FSUB();
    public static final ArithmeticInstruction DSUB         = new DSUB();
    public static final ArithmeticInstruction IMUL         = new IMUL();
    public static final ArithmeticInstruction LMUL         = new LMUL();
    public static final ArithmeticInstruction FMUL         = new FMUL();
    public static final ArithmeticInstruction DMUL         = new DMUL();
    public static final ArithmeticInstruction IDIV         = new IDIV();
    public static final ArithmeticInstruction LDIV         = new LDIV();
    public static final ArithmeticInstruction FDIV         = new FDIV();
    public static final ArithmeticInstruction DDIV         = new DDIV();
    public static final ArithmeticInstruction IREM         = new IREM();
    public static final ArithmeticInstruction LREM         = new LREM();
    public static final ArithmeticInstruction FREM         = new FREM();
    public static final ArithmeticInstruction DREM         = new DREM();
    public static final ArithmeticInstruction INEG         = new INEG();
    public static final ArithmeticInstruction LNEG         = new LNEG();
    public static final ArithmeticInstruction FNEG         = new FNEG();
    public static final ArithmeticInstruction DNEG         = new DNEG();
    public static final ArithmeticInstruction ISHL         = new ISHL();
    public static final ArithmeticInstruction LSHL         = new LSHL();
    public static final ArithmeticInstruction ISHR         = new ISHR();
    public static final ArithmeticInstruction LSHR         = new LSHR();
    public static final ArithmeticInstruction IUSHR        = new IUSHR();
    public static final ArithmeticInstruction LUSHR        = new LUSHR();
    public static final ArithmeticInstruction IAND         = new IAND();
    public static final ArithmeticInstruction LAND         = new LAND();
    public static final ArithmeticInstruction IOR          = new IOR();
    public static final ArithmeticInstruction LOR          = new LOR();
    public static final ArithmeticInstruction IXOR         = new IXOR();
    public static final ArithmeticInstruction LXOR         = new LXOR();
    public static final ConversionInstruction I2L          = new I2L();
    public static final ConversionInstruction I2F          = new I2F();
    public static final ConversionInstruction I2D          = new I2D();
    public static final ConversionInstruction L2I          = new L2I();
    public static final ConversionInstruction L2F          = new L2F();
    public static final ConversionInstruction L2D          = new L2D();
    public static final ConversionInstruction F2I          = new F2I();
    public static final ConversionInstruction F2L          = new F2L();
    public static final ConversionInstruction F2D          = new F2D();
    public static final ConversionInstruction D2I          = new D2I();
    public static final ConversionInstruction D2L          = new D2L();
    public static final ConversionInstruction D2F          = new D2F();
    public static final ConversionInstruction I2B          = new I2B();
    public static final ConversionInstruction I2C          = new I2C();
    public static final ConversionInstruction I2S          = new I2S();
    public static final Instruction           LCMP         = new LCMP();
    public static final Instruction           FCMPL        = new FCMPL();
    public static final Instruction           FCMPG        = new FCMPG();
    public static final Instruction           DCMPL        = new DCMPL();
    public static final Instruction           DCMPG        = new DCMPG();
    public static final ReturnInstruction     IRETURN      = new IRETURN();
    public static final ReturnInstruction     LRETURN      = new LRETURN();
    public static final ReturnInstruction     FRETURN      = new FRETURN();
    public static final ReturnInstruction     DRETURN      = new DRETURN();
    public static final ReturnInstruction     ARETURN      = new ARETURN();
    public static final ReturnInstruction     RETURN       = new RETURN();
    public static final Instruction           ARRAYLENGTH  = new ARRAYLENGTH();
    public static final Instruction           ATHROW       = new ATHROW();
    public static final Instruction           MONITORENTER = new MONITORENTER();
    public static final Instruction           MONITOREXIT  = new MONITOREXIT();
    public static final Instruction BREAKPOINT = new BREAKPOINT();    



    /** Get object via its opcode, for immutable instructions like
     * branch instructions entries are set to null.
     */
    public static final Instruction[] INSTRUCTIONS = new Instruction[256];
  
    /** Interfaces may have no static initializers, so we simulate this
     * with an inner class.
     */
    static final Clinit bla = new Clinit();

    static class Clinit {
      Clinit() {
        INSTRUCTIONS[Constants.NOP] = NOP;
        INSTRUCTIONS[Constants.ACONST_NULL] = ACONST_NULL;
        INSTRUCTIONS[Constants.ICONST_M1] = ICONST_M1;
        INSTRUCTIONS[Constants.ICONST_0] = ICONST_0;
        INSTRUCTIONS[Constants.ICONST_1] = ICONST_1;
        INSTRUCTIONS[Constants.ICONST_2] = ICONST_2;
        INSTRUCTIONS[Constants.ICONST_3] = ICONST_3;
        INSTRUCTIONS[Constants.ICONST_4] = ICONST_4;
        INSTRUCTIONS[Constants.ICONST_5] = ICONST_5;
        INSTRUCTIONS[Constants.LCONST_0] = LCONST_0;
        INSTRUCTIONS[Constants.LCONST_1] = LCONST_1;
        INSTRUCTIONS[Constants.FCONST_0] = FCONST_0;
        INSTRUCTIONS[Constants.FCONST_1] = FCONST_1;
        INSTRUCTIONS[Constants.FCONST_2] = FCONST_2;
        INSTRUCTIONS[Constants.DCONST_0] = DCONST_0;
        INSTRUCTIONS[Constants.DCONST_1] = DCONST_1;
        INSTRUCTIONS[Constants.IALOAD] = IALOAD;
        INSTRUCTIONS[Constants.LALOAD] = LALOAD;
        INSTRUCTIONS[Constants.FALOAD] = FALOAD;
        INSTRUCTIONS[Constants.DALOAD] = DALOAD;
        INSTRUCTIONS[Constants.AALOAD] = AALOAD;
        INSTRUCTIONS[Constants.BALOAD] = BALOAD;
        INSTRUCTIONS[Constants.CALOAD] = CALOAD;
        INSTRUCTIONS[Constants.SALOAD] = SALOAD;
        INSTRUCTIONS[Constants.IASTORE] = IASTORE;
        INSTRUCTIONS[Constants.LASTORE] = LASTORE;
        INSTRUCTIONS[Constants.FASTORE] = FASTORE;
        INSTRUCTIONS[Constants.DASTORE] = DASTORE;
        INSTRUCTIONS[Constants.AASTORE] = AASTORE;
        INSTRUCTIONS[Constants.BASTORE] = BASTORE;
        INSTRUCTIONS[Constants.CASTORE] = CASTORE;
        INSTRUCTIONS[Constants.SASTORE] = SASTORE;
        INSTRUCTIONS[Constants.POP] = POP;
        INSTRUCTIONS[Constants.POP2] = POP2;
        INSTRUCTIONS[Constants.DUP] = DUP;
        INSTRUCTIONS[Constants.DUP_X1] = DUP_X1;
        INSTRUCTIONS[Constants.DUP_X2] = DUP_X2;
        INSTRUCTIONS[Constants.DUP2] = DUP2;
        INSTRUCTIONS[Constants.DUP2_X1] = DUP2_X1;
        INSTRUCTIONS[Constants.DUP2_X2] = DUP2_X2;
        INSTRUCTIONS[Constants.SWAP] = SWAP;
        INSTRUCTIONS[Constants.IADD] = IADD;
        INSTRUCTIONS[Constants.LADD] = LADD;
        INSTRUCTIONS[Constants.FADD] = FADD;
        INSTRUCTIONS[Constants.DADD] = DADD;
        INSTRUCTIONS[Constants.ISUB] = ISUB;
        INSTRUCTIONS[Constants.LSUB] = LSUB;
        INSTRUCTIONS[Constants.FSUB] = FSUB;
        INSTRUCTIONS[Constants.DSUB] = DSUB;
        INSTRUCTIONS[Constants.IMUL] = IMUL;
        INSTRUCTIONS[Constants.LMUL] = LMUL;
        INSTRUCTIONS[Constants.FMUL] = FMUL;
        INSTRUCTIONS[Constants.DMUL] = DMUL;
        INSTRUCTIONS[Constants.IDIV] = IDIV;
        INSTRUCTIONS[Constants.LDIV] = LDIV;
        INSTRUCTIONS[Constants.FDIV] = FDIV;
        INSTRUCTIONS[Constants.DDIV] = DDIV;
        INSTRUCTIONS[Constants.IREM] = IREM;
        INSTRUCTIONS[Constants.LREM] = LREM;
        INSTRUCTIONS[Constants.FREM] = FREM;
        INSTRUCTIONS[Constants.DREM] = DREM;
        INSTRUCTIONS[Constants.INEG] = INEG;
        INSTRUCTIONS[Constants.LNEG] = LNEG;
        INSTRUCTIONS[Constants.FNEG] = FNEG;
        INSTRUCTIONS[Constants.DNEG] = DNEG;
        INSTRUCTIONS[Constants.ISHL] = ISHL;
        INSTRUCTIONS[Constants.LSHL] = LSHL;
        INSTRUCTIONS[Constants.ISHR] = ISHR;
        INSTRUCTIONS[Constants.LSHR] = LSHR;
        INSTRUCTIONS[Constants.IUSHR] = IUSHR;
        INSTRUCTIONS[Constants.LUSHR] = LUSHR;
        INSTRUCTIONS[Constants.IAND] = IAND;
        INSTRUCTIONS[Constants.LAND] = LAND;
        INSTRUCTIONS[Constants.IOR] = IOR;
        INSTRUCTIONS[Constants.LOR] = LOR;
        INSTRUCTIONS[Constants.IXOR] = IXOR;
        INSTRUCTIONS[Constants.LXOR] = LXOR;
        INSTRUCTIONS[Constants.I2L] = I2L;
        INSTRUCTIONS[Constants.I2F] = I2F;
        INSTRUCTIONS[Constants.I2D] = I2D;
        INSTRUCTIONS[Constants.L2I] = L2I;
        INSTRUCTIONS[Constants.L2F] = L2F;
        INSTRUCTIONS[Constants.L2D] = L2D;
        INSTRUCTIONS[Constants.F2I] = F2I;
        INSTRUCTIONS[Constants.F2L] = F2L;
        INSTRUCTIONS[Constants.F2D] = F2D;
        INSTRUCTIONS[Constants.D2I] = D2I;
        INSTRUCTIONS[Constants.D2L] = D2L;
        INSTRUCTIONS[Constants.D2F] = D2F;
        INSTRUCTIONS[Constants.I2B] = I2B;
        INSTRUCTIONS[Constants.I2C] = I2C;
        INSTRUCTIONS[Constants.I2S] = I2S;
        INSTRUCTIONS[Constants.LCMP] = LCMP;
        INSTRUCTIONS[Constants.FCMPL] = FCMPL;
        INSTRUCTIONS[Constants.FCMPG] = FCMPG;
        INSTRUCTIONS[Constants.DCMPL] = DCMPL;
        INSTRUCTIONS[Constants.DCMPG] = DCMPG;
        INSTRUCTIONS[Constants.IRETURN] = IRETURN;
        INSTRUCTIONS[Constants.LRETURN] = LRETURN;
        INSTRUCTIONS[Constants.FRETURN] = FRETURN;
        INSTRUCTIONS[Constants.DRETURN] = DRETURN;
        INSTRUCTIONS[Constants.ARETURN] = ARETURN;
        INSTRUCTIONS[Constants.RETURN] = RETURN;
        INSTRUCTIONS[Constants.ARRAYLENGTH] = ARRAYLENGTH;
        INSTRUCTIONS[Constants.ATHROW] = ATHROW;
        INSTRUCTIONS[Constants.MONITORENTER] = MONITORENTER;
        INSTRUCTIONS[Constants.MONITOREXIT] = MONITOREXIT;
        INSTRUCTIONS[Constants.ILOAD_0]= ILOAD_0;
        INSTRUCTIONS[Constants.ILOAD_1] = ILOAD_1;
        INSTRUCTIONS[Constants.ILOAD_2] = ILOAD_2;
        INSTRUCTIONS[Constants.ILOAD_3] = ILOAD_3;
        INSTRUCTIONS[Constants.LLOAD_0] = LLOAD_0;
        INSTRUCTIONS[Constants.LLOAD_1] = LLOAD_1;
        INSTRUCTIONS[Constants.LLOAD_2] = LLOAD_2;
        INSTRUCTIONS[Constants.LLOAD_3] = LLOAD_3;
        INSTRUCTIONS[Constants.FLOAD_0] = FLOAD_0;
        INSTRUCTIONS[Constants.FLOAD_1] = FLOAD_1;
        INSTRUCTIONS[Constants.FLOAD_2] = FLOAD_2;
        INSTRUCTIONS[Constants.FLOAD_3] = FLOAD_3;
        INSTRUCTIONS[Constants.DLOAD_0] = DLOAD_0;
        INSTRUCTIONS[Constants.DLOAD_1] = DLOAD_1;
        INSTRUCTIONS[Constants.DLOAD_2] = DLOAD_2;
        INSTRUCTIONS[Constants.DLOAD_3] = DLOAD_3;
        INSTRUCTIONS[Constants.ALOAD_0] = THIS;
        INSTRUCTIONS[Constants.ALOAD_1] = ALOAD_1;
        INSTRUCTIONS[Constants.ALOAD_2] = ALOAD_2;
        INSTRUCTIONS[Constants.ALOAD_3] = ALOAD_3;
        INSTRUCTIONS[Constants.ISTORE_0] = ISTORE_0;
        INSTRUCTIONS[Constants.ISTORE_1] = ISTORE_1;
        INSTRUCTIONS[Constants.ISTORE_2] = ISTORE_2;
        INSTRUCTIONS[Constants.ISTORE_3] = ISTORE_3;
        INSTRUCTIONS[Constants.LSTORE_0] = LSTORE_0;
        INSTRUCTIONS[Constants.LSTORE_1] = LSTORE_1;
        INSTRUCTIONS[Constants.LSTORE_2] = LSTORE_2;
        INSTRUCTIONS[Constants.LSTORE_3] = LSTORE_3;
        INSTRUCTIONS[Constants.FSTORE_0] = FSTORE_0;
        INSTRUCTIONS[Constants.FSTORE_1] = FSTORE_1;
        INSTRUCTIONS[Constants.FSTORE_2] = FSTORE_2;
        INSTRUCTIONS[Constants.FSTORE_3] = FSTORE_3;
        INSTRUCTIONS[Constants.DSTORE_0] = DSTORE_0;
        INSTRUCTIONS[Constants.DSTORE_1] = DSTORE_1;
        INSTRUCTIONS[Constants.DSTORE_2] = DSTORE_2;
        INSTRUCTIONS[Constants.DSTORE_3] = DSTORE_3;
        INSTRUCTIONS[Constants.ASTORE_0] = ASTORE_0;
        INSTRUCTIONS[Constants.ASTORE_1] = ASTORE_1;
        INSTRUCTIONS[Constants.ASTORE_2] = ASTORE_2;
        INSTRUCTIONS[Constants.ASTORE_3] = ASTORE_3;
        INSTRUCTIONS[Constants.BREAKPOINT] = BREAKPOINT;    
      }
    }
}
