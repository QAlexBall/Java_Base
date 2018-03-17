public class Thread2 implements Runnable {
	private int max;
	public Thread2(int max) {
		this.max = max;
	}

	public void run() {
		for (int i =  0;  i  <  max;   i++)   {
			System.out.println(
				Thread.currentThread().getName() + ":" + i);
		}
	}
}