public class SleepThreadTest1 implements Runnable {
	public void run() {
		while(true) {
			System.out.println("after some second print once...");
			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new SleepThreadTest1());
		t1.start();
	}
}