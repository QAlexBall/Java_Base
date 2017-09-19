/*
Author: QAlexBall
Date: 2017/9/19
Content: ScaryExceptions extends Exception and how to use try catch and finally.
 */

package unit11;

class ScaryException extends Exception {

    public ScaryException() {
        super();
    }

    public ScaryException(String message) {
        super(message);
    }

    public ScaryException(String message, Throwable cause ) {
        super(message, cause);
    }

    public ScaryException(Throwable cause) {
        super(cause);
    }
}

public class TestExceptions {

    public static void main(String[] args) {

        String test ="yes";
        try {
            System.out.println("start try......");
            doRisky(test);
            System.out.println("end try......");
        } catch (ScaryException se) {
            System.out.println("scary exception");
        } finally {
            System.out.println("finally......");
        }

        System.out.println("end of main.");

    }
    static void doRisky(String test) throws ScaryException {

        System.out.println("start risky......");

        if ("yes".equals(test)) {

            throw new ScaryException();

        }

        System.out.println("end risky......");
        return;
    }
}