import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ALUTest {
    @Test
    void name(){
        ALU alu = new ALU();
        Result result = new Result();

        alu.setOPCODE("ADD");
        alu.setOperand1(1);
        alu.setOperand2(2);
        alu.enableSignal(result);

        assertEquals(3, result.getResult());
        assertEquals(0, result.getStatus());
    }

    @Test
    void test2(){
        ALU alu = new ALU();
        Result result = new Result();

        alu.setOPCODE("MUL");
        alu.setOperand1(1);
        alu.setOperand2(2);
        alu.enableSignal(result);

        assertEquals(3, result.getResult());
        assertEquals(0, result.getStatus());
    }

    @Test
    void test3(){
        ALU alu = new ALU();
        Result result = new Result();

        alu.setOPCODE("SUB");
        alu.setOperand1(5);
        alu.setOperand2(2);
        alu.enableSignal(result);

        assertEquals(3, result.getResult());
        assertEquals(0, result.getStatus());
    }
    @Test
    void test4(){
        ALU alu = new ALU();
        Result result = new Result();

        alu.setOPCODE("SUB");
        alu.setOperand1(-1);
        alu.setOperand2(2);
        alu.enableSignal(result);

        assertEquals(65535, result.getResult());
        assertEquals(1, result.getStatus());
    }
    @Test
    void test5(){
        ALU alu = new ALU();
        Result result = new Result();

        alu.setOPCODE("SUASDFB");
        alu.setOperand1(-1);
        alu.setOperand2(2);
        alu.enableSignal(result);

        assertEquals(65535, result.getResult());
        assertEquals(3, result.getStatus());
    }


    @Test
    void setOperand1() {
    }

    @Test
    void setOperand2() {
    }

    @Test
    void setOPCODE() {
    }

    @Test
    void enableSignal() {
    }

    @Test
    void main() {
    }
}