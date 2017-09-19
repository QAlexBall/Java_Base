package unit07;

public class C extends B {
    void m1() {
        System.out.println("C's m1, ");
    }
    void m2() {
        System.out.println("C's m2, ");
    }
    public static void main(String [] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A c1 = new C();
        B c2 = new C();
        a.m1();
        b.m1();
        c.m1();
        c1.m1();
        c2.m1();
        System.out.println("\n");
        a.m2();
        b.m2();
        c.m2();
        c1.m2();
        c2.m2();
    }
}
