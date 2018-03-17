public class ThreadTest {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1(10);
		Thread1 t2 = new Thread1(10);
		Thread2 t3 = new Thread2(10);
		Thread t = new Thread(t3, "t3");
		t.run();
		t2.start();
		t1.start();
	}
}