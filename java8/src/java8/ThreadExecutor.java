package java8;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadExecutor {
	
	private ScheduledExecutorService executorService;
	
	private void iniciarThreadAtualizacao() {
		try {
			ThreadLambda threadLambda = new ThreadLambda();
			executorService = Executors.newSingleThreadScheduledExecutor();
			executorService.scheduleAtFixedRate(threadLambda::run, 0, ThreadLambda.TEMPO_ESPERA, TimeUnit.MILLISECONDS);
		} catch (Exception e) {
		}
	}
	
	public static void main(String[] args) {
		ThreadExecutor a = new ThreadExecutor();
		a.iniciarThreadAtualizacao();
	}
}