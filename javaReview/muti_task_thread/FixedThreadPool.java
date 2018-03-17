import java.util.concurrent.*;

public class FixedThreadPool {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for(int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		exec.shutdown();

		ExecutorService exec1 = Executors.newSingleThreadExecutor();
		for (int i = 3; i < 5; i++) 
			exec1.execute(new LiftOff());
		exec1.shutdown();

	}
}