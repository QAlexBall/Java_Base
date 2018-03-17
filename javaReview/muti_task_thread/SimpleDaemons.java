import java.util.concurrent.*;

public class SimpleDaemons implements Runnable {
	public void run() {
		try {
			while(true) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + " " + this);
			}
		} catch(InterruptedException e) {
			System.out.println("sleep() interrupted");
		}
	}

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			Thread daemon = new Thread(new SimpleDaemons());
			daemon.setDaemon(false);
			daemon.start();
		}
		System.out.println("All Daemon started");
		//TimeUnit.MILLISECONDS.sleep(175);
	}
}