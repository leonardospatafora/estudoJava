package exerciciosBasic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class salarioMinimo {

	public static void main(String[] args) {
		
		double salarioMinimo = 1320;
		double salarioFunc = 3686.20;
		double qtdSalario = salarioFunc / salarioMinimo;
		
		BigDecimal bd = new BigDecimal(qtdSalario);
		bd = bd.setScale(2, RoundingMode.UP);
		qtdSalario = bd.doubleValue();
		
		System.out.println(qtdSalario);
		
		int a = 20;
		
		System.out.println(a -1);
		System.out.println(a + 1);
		
	}

}
