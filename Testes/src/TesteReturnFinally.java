import java.math.BigDecimal;
import java.util.Objects;

public class TesteReturnFinally {
	
	public static boolean teste(String a) {
	Boolean retorno = false;
		
		if (a != null) {
			retorno = true;
		}
		Objects.requireNonNull(a,"teste");
		a.getBytes();
		return retorno;
	}

	
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("2.69");
		BigDecimal b = new BigDecimal("2.68");
		BigDecimal resultado = a.subtract(b);
		System.out.println(resultado);
	}
}

	



//	public static void main(String[] args) {
//		getTexto();
//		
//	}
//	
//	private static void testeMetodo(String a) {
//		try {
//			a.trim();
//		}catch (Exception e) {
//			System.out.println("Exception testeMetodo");
//		}
//	}
//	
//	public static String[] getTexto() {
//		String[] comprovante = {"teste"};
//		testeMetodo(null);
//		return comprovante;
//	}
	
	
	
	
//}