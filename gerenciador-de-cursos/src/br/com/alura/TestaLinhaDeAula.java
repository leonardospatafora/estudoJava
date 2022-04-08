package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaLinhaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisandos os ArrayLists", 21);
		Aula a2 = new Aula("Listas de Obejtos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 16);
		
		
		ArrayList aulas = new ArrayList();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
//		#To String da classe Aula
		System.out.println(aulas);
		
//      #compareTo da classe Java implementação realizada para ordenar
		Collections.sort(aulas);
		System.out.println(aulas);
		
//		#Ordenando as aulas por tempo de duração
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
	}

}
