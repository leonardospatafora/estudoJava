package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunos {

	public static void main(String[] args) {
		
		
//		Set - os elementos não tem index, não é possivel utilizar o get para acessa-los
//		é muito mais performatico para realizar consultas/alterações de um determinado elemento
//		não aceita elementos repetidos
		
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Leonardo");
		alunos.add("Luis ");
		alunos.add("Sergio ");
		alunos.add("Renan ");
		alunos.add("Renan");
		alunos.add("Renan");
		alunos.add("Renan");
		alunos.add("Leandro ");
		alunos.add("Leandro ");
		alunos.add("Leandro ");
		alunos.add("Renan ");
		
//		System.out.println(alunos);
		
//		for (String aluno : alunos) {
//			System.out.println(aluno);
		System.out.println(alunos);
		
//		#ConcurrentModificationException - Tentando excluir um item numa interação
		alunos.forEach(aluno -> {
			if("Renan ".equals(aluno)) {
				alunos.remove(aluno);
			}
		});
			System.out.println(alunos);
			
			System.out.println(alunos.size());
			
			
//		}
	}

}
