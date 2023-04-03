import java.math.BigDecimal;

public class TestesAleatorios {

	private static boolean verificarDiaAbertoPdv(int numeroLoja) {
		boolean valida = false;
		if (numeroLoja == 1) {
			System.out.println("true");
			valida = true;
		}
		return valida;
	}

	public static void main(String[] args) throws IllegalAccessException {
//		if(verificarDiaAbertoPdv(0)) {
//			System.out.println("retornou true");
//		}else {
//			System.out.println("retornou false");
//		}
		
//		boolean a = true;
//		
//		if (a) {
//			System.out.println("entrou no if");
//		}else {
//			System.out.println("não entrou no if");
//		}
		
//		boolean conc = true;
//		
//		
//		if (!conc) {
//			// file input stream relatorio compilado (.jasper)
//			String rel = "ARQ_REL_LOG_OP_CONC";
//			System.out.println("primeiro if");
//		} else if (!conc) {
//			String rel = "ARQ_REL_LOG_OP_PDV";
//			System.out.println("segundo if");
//		} else {
//			String rel = "";
//			System.out.println("andou aqui");
//		}
		
//		BigDecimal valor = new BigDecimal("100000");
//		BigDecimal valorComparador = new BigDecimal("10000");
//		if (valor.compareTo(valorComparador) > 1)  {
//			throw new IllegalAccessException("Funcionario com salario maior que dez mil não recebe bonus");
//		}
		
//	    int number=10;   
//	       // Expressão Switch   
//	       switch(number){   
//	          //Declarações case   
//	          case 10: System.out.println("10");   
//	             break;   
//	          case 20: System.out.println("20");   
//	             break;   
//	          case 30: System.out.println("30");   
//	             break;   
//	           //Declaração default case   
//	           default:System.out.println("Not in 10, 20 or 30");   
//	      }   
		
		
		verificarDiaAbertoPdv(1);
		
}
}
