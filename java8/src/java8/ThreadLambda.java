package java8;

import java.util.concurrent.ScheduledExecutorService;

public class ThreadLambda implements Runnable {

//	public ScheduledExecutorService executorService;
	public static final int TEMPO_ESPERA = 5000;

	public static void main(String[] args) {

//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("Executando um Runnable");
//			}
//
//		}).start();

//		new Thread(() -> System.out.println("Executando um Runnable Com Lambda")).start();

	}

	@Override
	public void run() {
		System.out.println("passei aqui");
	}
}
