package basic.java.practice;

public final class BitwiseOperations {

    
    public static final void bitwiseOperation() {
       int var = 5;
       System.out.println("Our local var is: " + var);
       
       // left shift operation
       System.out.println("Bitwise operation: Left shift by 2: " + Integer.toString(5 << 2));
       // right shift operation - unsigned
       System.out.println("Bitwise operation: Right shift by 2(Unsigned): " + Integer.toString(5 >> 2));
       // right shift operation - signed
       System.out.println("Bitwise operation: Right shift by 2(Signed): " + Integer.toString(5 >>> 2));
       // right shift operation - signed
       System.out.println("Bitwise operation: Exculsive OR(XOR) by 2: " + Integer.toString(5 ^ 2));
       
    }
}
