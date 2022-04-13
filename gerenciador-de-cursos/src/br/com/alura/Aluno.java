package br.com.alura;

import java.text.MessageFormat;
import java.util.Objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


public class Aluno {
	
	private String nome;
	private int  numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo.");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
		return MessageFormat.format("Nome do aluno: {0} Número da Matricula: {1}",nome, numeroMatricula);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(numeroMatricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return numeroMatricula == other.numeroMatricula;
	}

}
	
