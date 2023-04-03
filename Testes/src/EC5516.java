
public class EC5516 {

	public static void main(String[] args) {
		funcao();
	}

	private static void usadoParaChamarMetodo() {
		funcao();
		System.out.println("Quando rodar o return deverá ser impresso");
	}
	
	private static void funcao() {
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("entrei no for");
				try {
					System.out.println("segundo try");
					throw new Throwable();
				} catch (Throwable e) {
					System.out.println("segundo catch");
				}/* finally {*/
					if (i == 2) {
						System.out.println("tem que ser impresso independente de tudo");
						return;
					}
//				}
			}
		} catch (Exception e) {
			System.out.println("CATCH");
		}
		System.out.println("Não deve ser imprimido");
		
	}
}
