package br.com.alura;

import java.text.MessageFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private int tempoTotal;
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
 	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTotalTempo() {
		for(Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	@Override
	public String toString () {
		return MessageFormat.format("Curso: {0} - Instrutor: {1} - Tempo de duração: {2} minutos", 
				nome, instrutor,getTotalTempo());
	}

	public void matricula(Aluno aluno) {
		if (!this.alunos.contains(aluno)) {
			this.alunos.add(aluno);
			this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
		} else {
			throw new NullPointerException("Aluno já matriculado!" + aluno);
		}
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatricula(int matricula) {
		return matriculaParaAluno.get(matricula);
	}

}
