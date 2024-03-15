public class ALU {

    private int operand1 = -1;
    private int operand2 = -1;
    private String OPCODE = "";

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public void setOPCODE(String OPCODE) {
        this.OPCODE = OPCODE;
    }

    public void enableSignal(Result r) {
        if (OPCODE.equals("ADD")) {
            if (isValidate(operand1, operand2)) {
                doCalc(operand1,operand2, OPCODE, r);
            }
            else if (operand1 == -1) {
                r.setResult(65535);
                r.setStatus(1);
            }
            else if (operand2 == -1) {
                r.setResult(65535);
                r.setStatus(2);
            }
        }
        else if (OPCODE.equals("MUL")) {
            if (isValidate(operand1, operand2)) {
                doCalc(operand1,operand2, OPCODE, r);
            }
            else if (operand1 == -1) {
                r.setResult(65535);
                r.setStatus(1);
            }
            else if (operand2 == -1) {
                r.setResult(65535);
                r.setStatus(2);
            }
        }
        else if (OPCODE.equals("SUB")) {
            if (isValidate(operand1, operand2)) {
                doCalc(operand1,operand2, OPCODE, r);
            }
            else if (operand1 == -1) {
                r.setResult(65535);
                r.setStatus(1);
            }
            else if (operand2 == -1) {
                r.setResult(65535);
                r.setStatus(2);
            }
        }
        else {
            r.setResult(65535);
            r.setStatus(3);
        }
    }

    public boolean isValidate(int operand1, int operand2){
        return operand1 != -1 && operand2 != -1;
    }

    public void doCalc(int operand1, int operand2, String OPCODE, Result r){
        switch (OPCODE){
            case "ADD":
                r.setResult(operand1 + operand2);
                break;
            case "MUL":
                r.setResult(operand1 * operand2);
                break;
            case "SUB":
                r.setResult(operand1 - operand2);
                break;
            default:
                break;
        }

        r.setStatus(0);
    }
}