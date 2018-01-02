package javatest09;

class EcDef extends Exception {
    public EcDef() {
    }

    public EcDef(String mesg) {
        super(mesg);
    }
}

public class EcmDef {
    public static void main(String [] args) throws ArrayIndexOutOfBoundsException, ArithmeticException{
        try {
            int divisor = Integer.parseInt(args[0]);
            int dividend = Integer.parseInt(args[1]);
            ecm(divisor, dividend);
        } catch (EcDef e) {
            System.out.println("In Error EcDef!");
        }
    }

    public static void ecm(int divisor, int dividend) throws EcDef{
        if(divisor <= 0 || dividend <= 0) {
            System.out.println("parameters error!");
        } else {
            System.out.println("the result is: " + divisor/dividend);
        }
    }
}
