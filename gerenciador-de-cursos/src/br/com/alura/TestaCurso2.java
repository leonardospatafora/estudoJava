package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {

//		#Linkedlist = Ideal para adicionar/apagar elementos do começo.
//		#ArrayList = É mais performatico para encontrar elementos na lista.

		Curso javaColecoes = new Curso("Dominando as coleções", "Leonardo");

		javaColecoes.adiciona(new Aula("Trabalho ando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 24));
		javaColecoes.adiciona(new Aula("Teste de somar coleções", 5));
		
		
		System.out.println(javaColecoes);
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
//
//		Collections.sort(aulas);
//		System.out.println(aulas);
		
//		System.out.println(javaColecoes.getTotalTempo());
		
		
		

	}
}