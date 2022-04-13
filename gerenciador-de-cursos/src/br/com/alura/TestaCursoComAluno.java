package br.com.alura;

import java.util.List;
import java.util.Vector;

public class TestaCursoComAluno {

	public static void main(String[] args){

		Curso javaColecoes = new Curso("Dominando as coleções", "Leonardo");

		javaColecoes.adiciona(new Aula("Trabalho ando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 24));
		javaColecoes.adiciona(new Aula("Teste de somar coleções", 5));
		
		Aluno a1 = new Aluno("Leonardo Spatafora",112233);
		Aluno a2 = new Aluno("Daniela", 112233);
		Aluno a3 = new Aluno("Leandro", 112233);
		Aluno a4 = new Aluno("Leonardo Spatafora",112233);	
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});

//		System.out.println(a1 + " | Está matriculado ?");
//		System.out.println(javaColecoes.estaMatriculado(a1));
//		System.out.println("O Leonardo "+ "| Está matriculado ?");
//		
//		
		Aluno leonardo = new Aluno ("Leonardo Spatafora",11233);
//		System.out.println(javaColecoes.estaMatriculado(a1));
//		System.out.println(javaColecoes.estaMatriculado(leonardo));
//		
		System.out.println(a1.equals(a4));
		System.out.println(a1.hashCode() == leonardo.hashCode());
		

	}

}
