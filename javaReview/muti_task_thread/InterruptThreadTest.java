public class InterruptThreadTest implements Runnable {
	public void run() {
		try {
			Thread.sleep(100000000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Thread t = new Thread(new InterruptThreadTest());
		t.start();
		// 接触阻塞
		t.interrupt();
	}
}