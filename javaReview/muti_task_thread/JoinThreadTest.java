public class JoinThreadTest implements Runnable {
	private int no;
	public JoinThreadTest(int no) {
		this.no = no;
	}

	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(no);
		}
	}

	public static void main(String[] args) {
		Thread t = new Thread(new JoinThreadTest(1));
		t.start();
		try {
			t.join(); // Suspend the main thread
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i <= 50; i++) {
			System.out.println("i'm the thread's boss...");
		}
		System.out.println("project ending...");
	}
}