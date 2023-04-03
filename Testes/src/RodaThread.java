import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class RodaThread {
	private static void run() throws InterruptedException {
		Thread.sleep(1);
		System.out.println("Running: " + new java.util.Date());
	}

	public static void main(String[] args) {
		ScheduledExecutorService executorService;
		executorService = Executors.newSingleThreadScheduledExecutor();
		executorService.scheduleAtFixedRate(() -> {
			try {
				run();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}, 0, 5, TimeUnit.SECONDS);
		
	
		
//		executorService.shutdown();
		
	}
}
