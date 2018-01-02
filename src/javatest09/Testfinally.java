package javatest09;

public class Testfinally {
    public static void main(String [] args) {
        int result = test();
        System.out.println(result);
    }

    private static int test() {
        int i = 0;
        try {
            i = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 10;
        }
        finally {
            System.out.println("finally...");
        }
        return i;
    }
}
