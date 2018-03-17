class Mythread2 extends Thread {
	Mythread2(String s) {
		super(s);
	}
	public void run() {
		for (int i = 1; i < 1000; i++) {
			System.out.println(getName() + ": " + i);
			if(i % 10 == 0)
				for(int j = 0; j < 1000; j++)
					yield();
		}
	}
}

public class YieldThreadTest {
	public static void main(String[] args) {
		Mythread2 t1 = new Mythread2("t1");
		Mythread2 t2 = new Mythread2("t2");
		t1.start();
		t2.start();
		System.out.println("hello yield");
	}
}