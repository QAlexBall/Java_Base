public class DeadThreadTest implements Runnable {
	public void run() {
		for (int i = 0; i <= 3; i++) {
			System.out.println("Threading...");
		}
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new DeadThreadTest());
		System.out.println("not runing thread " + (thread.isAlive() ? "alive" : "dead"));
		thread.start();
		System.out.println("running thread " + (thread.isAlive() ? "alive" : "dead"));
		try {
			thread.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("ending thread " + (thread.isAlive() ? "alive" : "dead"));
	}
}