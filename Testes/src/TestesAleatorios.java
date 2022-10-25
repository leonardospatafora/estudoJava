import java.math.BigDecimal;

public class TestesAleatorios {

	private static boolean verificarDiaAbertoPdv(int numeroLoja) {
		int a = 11;
		if (a == 10) {
			a = 11;
			return false;
		}
		return true;
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
		
		BigDecimal valor = new BigDecimal("100000");
		BigDecimal valorComparador = new BigDecimal("10000");
		if (valor.compareTo(valorComparador) > 1)  {
			throw new IllegalAccessException("Funcionario com salario maior que dez mil não recebe bonus");
		}
		
		
		
}
}
