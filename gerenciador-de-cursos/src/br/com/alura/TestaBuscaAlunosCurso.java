package br.com.alura;

public class TestaBuscaAlunosCurso {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções", "Leonardo");

		javaColecoes.adiciona(new Aula("Trabalho ando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 24));
		javaColecoes.adiciona(new Aula("Teste de somar coleções", 5));
		
		Aluno a1 = new Aluno("Leonardo Spatafora",3333);
		Aluno a2 = new Aluno("Daniela", 2222);
		Aluno a3 = new Aluno("Leandro", 1111);
		Aluno a4 = new Aluno("Leonardo Spatafora",22);	
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println(javaColecoes.estaMatriculado(a4));
		
		
		
//		System.out.println(a1);
//		
//		Aluno n = javaColecoes.buscaMatricula(3333);
//		System.out.println("Aluno: " + n);
		
		
		
	}

}
