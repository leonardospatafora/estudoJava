package exerciciosBasic;

import java.util.ArrayList;
import java.util.List;

public class mediaAritmetica {

	public static void main(String[] args) {
		
	int	a = 8;
	int	b = 7;
	int	c = 9;
	
	int d = 4;
	int e = 5;
	int f = 6;
	
	int mediaK = (a + b + c) / 3;
	int mediaG = (d + e + f) / 3;

	System.out.println(mediaK + mediaG);
		
	
	
	
		List<Integer> mediaA = new ArrayList<>();
		List<Integer> mediaB = new ArrayList<>();
		
		mediaA.add(8);
		mediaA.add(7);
		mediaA.add(9);
		
		mediaB.add(4);
		mediaB.add(5);
		mediaB.add(6);
		
		int soma = 0;
		for(int i =0; i < mediaA.size(); i++) {
			soma += mediaA.get(i);
		}
		int media1 = soma / mediaA.size();
		System.out.println("A media 1 é: " + media1);
		
		int[] soma2 = {0}; // declaração da variável soma como um array de tamanho 1
		mediaB.forEach(numero -> soma2[0] += numero); // acessando a variável soma dentro da expressão lambda

		int media2 = soma2[0] / mediaB.size();
		System.out.println("A média da lista 2 é: " + media2);
		
		int resultado = media1 + media2;
		
		System.out.println("A soma das duas médias é: " + resultado);
	}
	
	
	
	

}
