public class SleepThreadTest extends Thread {
	public void run() {
		while(true) {
			System.out.println("after some second print once...");
			try {
				sleep(3000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		SleepThreadTest t1 = new SleepThreadTest();
		t1.start();
	}
}