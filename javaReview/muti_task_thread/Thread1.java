public class Thread1 extends Thread {
	private int max;
	public Thread1(int max) {
		this.max = max;
	}
	public void run() {
		for (int i =  0;  i  <  max;   i++)   {
			System.out.println(
				Thread.currentThread().getName() + ":" + i);
		}
	}
}	
