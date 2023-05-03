package exerciciosBasic;

import java.math.BigDecimal;

public class atualizaSaldo {

	public static void main(String[] args) {
		
		BigDecimal saldo = BigDecimal.valueOf(599);
		double juros = 0.01;
		BigDecimal valorAcrs = BigDecimal.valueOf(saldo.doubleValue() * juros);
		System.out.println("1% de " + saldo + " é " + valorAcrs);
		System.out.println("o valor atualizado com juros é: " + saldo.add(valorAcrs));


	}

}
