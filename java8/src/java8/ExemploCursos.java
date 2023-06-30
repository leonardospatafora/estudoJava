package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploCursos {
	
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();	
		cursos.add(new Curso("Phyon", 45));
		cursos.add(new Curso("C#", 150));
		cursos.add(new Curso("Java", 113));
		cursos.add(new Curso("React", 55));
		
		 cursos.sort(Comparator.comparing(Curso::getAlunos));
//		cursos.forEach(c -> System.out.println("Cursos disponiveis: " + c.getNome()));
		
		cursos.stream()
		.filter(c -> c.getAlunos() > 50)
		.forEach(c -> 
		System.out.println("Nome do Curso: " + c.getNome() + " Número de alunos desse curso é: " + c.getAlunos()));
		
		int sum = cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.mapToInt(Curso::getAlunos)
				.sum();
//		System.out.println(sum);
		
		Optional<Curso> optionalCurso = cursos.stream()
				.filter(c -> c.getAlunos() > 1)
				.findAny();
//		Pegar o elemento que achar na lista 
		Curso curso = optionalCurso.orElse(null);
		System.out.println(curso.getNome());

		
//		FILTRO COM MAP = CHAVE VALOR EXEMPLO: NOME C# TEM 150 ALUNOS
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toMap(
				c -> c.getNome(), 
				c -> c.getAlunos()))
		.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
		
//		MEDIA DE UMA LISTA
		cursos.stream()
	    .mapToInt(c -> c.getAlunos())
	    .average();
		System.out.println(	cursos.stream()
	    .mapToInt(c -> c.getAlunos())
	    .average());
		
	}
	
	
	

}
