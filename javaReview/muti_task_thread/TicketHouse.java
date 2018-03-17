public class TicketHouse implements Runnable {
	private int fiveCount = 1;

	public synchronized void buy() {
		String name = Thread.currentThread().getName();
		// zhangfei:20
		if (name.equals("zhangfei")) {
			if (fiveCount < 3) {
				try {
					System.out.println("5元" + fiveCount + "张飞必须等待...");
					wait();
					System.out.println("卖一张票给张飞，找零15");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else if (name.equals("guanyu")) {
			fiveCount++;
			System.out.println("卖一张票给关羽,钱正好" + "5元     " + fiveCount + "张");
		} else if (name.equals("liubei")) {
			fiveCount++;
			System.out.println("卖一张票给刘备,钱正好" + "5元     " + fiveCount + "张");
		}
		if (fiveCount == 3)
			notifyAll();
	}

	public void run() {
		buy();
	}

	public static void main(String[] args) {
		Runnable runnable = new TicketHouse();
		Thread thread1 = new Thread(runnable);
		thread1.setName("zhangfei");
		Thread thread2 = new Thread(runnable);
		thread2.setName("guanyu");
		Thread thread3 = new Thread(runnable);
		thread3.setName("liubei");

		thread1.start();
		thread2.start();
		thread3.start();
	}
}
