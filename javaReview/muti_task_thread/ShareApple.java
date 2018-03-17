public class ShareApple implements Runnable {
	private int appleCount = 5;
	private boolean isRun = true;
	public synchronized boolean getApple() {
		if (appleCount == 0)
			return false;
		appleCount--;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (appleCount >= 0) {
			System.out.println(Thread.currentThread() + " " + Thread.currentThread().getName()
				+ "take away a apple, left" + appleCount + " apples");
		} else {
			System.out.println(Thread.currentThread().getName() + "find is gone");
		}
		return true;
	}
	public void run() {
		while(isRun) {
			isRun = getApple();
		}
		if (appleCount <= 0) {
			System.out.println(Thread.currentThread().getName() + "dead");
			return;
		}
	}

	public static void main(String[] args) {
		ShareApple shareapple = new ShareApple();
		Thread child1 = new Thread(shareapple);
		Thread child2 = new Thread(shareapple);
		child1.setName("ming ");
		child2.setName("qiang ");
		child1.setPriority(Thread.MAX_PRIORITY);
		child1.start();
		child2.start();
	}
}