
public class InterruptException {

	public void teste() {

		try {
			teste1();
			System.out.println("teste");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void teste1() throws Exception {

		try {
			String a = null;
			a.getBytes();
		} catch (Exception e) {
			throw new Exception();
		}

	}

	public static void main(String[] args) throws Exception {
		Thread myThread = new Thread(() -> {
			try {
				for (int i = 0; i < 1000; i++) {
					System.out.println("Contagem: " + i);
					Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				System.out.println("Thread interrompida");
			}
		});

		myThread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		myThread.interrupt();
	}

}
