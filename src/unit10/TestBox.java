package unit10;

public class TestBox {
    Integer i = 9;
    int j;

    public static void main(String [] args) { 
        TestBox t = new TestBox();
        t.go();
    }

    private void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}
