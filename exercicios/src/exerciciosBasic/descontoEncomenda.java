package exerciciosBasic;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class descontoEncomenda {

	public static double aplicaDesconto(double valorEncomenda, double qtdDesconto, int tipoDesconto) {
		if (tipoDesconto == 0) {
			double valorDesconto = valorEncomenda * qtdDesconto;
			double descontoPercent = valorEncomenda - valorDesconto;
			if (descontoPercent < 0) {
				System.out.println("O Desconto não pode ser aplicado Percentual!!");
			} else {
				return descontoPercent;
			}
			return 0;
		} else {
			if (qtdDesconto > valorEncomenda) {
				System.out.println("O Desconto não pode ser aplicado!!");
				return 0;
			} else {
				return valorEncomenda - qtdDesconto;
			}
		}

	}

	public static void main(String[] args) throws ParseException {
		Map<Integer, Double> encomendas = new HashMap<>();

		encomendas.put(1, 92.99);
		encomendas.put(2, 43.99);
		encomendas.put(3, 30.0);
		
		double desconto = 23;
		int tipoDesconto = 1; // 0 - percentual 1 - valor
		int chave = 3;

		switch (tipoDesconto) {
		case 0: {
			Double itemSelecionado = encomendas.get(chave);
			double percentual = desconto / 100;
			var a = aplicaDesconto(itemSelecionado, percentual, tipoDesconto);
			System.out.println(a);
			break;
		}
		case 1: {
			Double itemSelecionado = encomendas.get(chave);
			var a = aplicaDesconto(itemSelecionado, desconto, tipoDesconto);
			System.out.println(a);
			break;
		}default: System.out.println("Nenhum desconto aplicado");

		}
	}
}
