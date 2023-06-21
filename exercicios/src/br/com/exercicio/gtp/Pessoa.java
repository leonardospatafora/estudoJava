package br.com.exercicio.gtp;

import java.util.List;

public class Pessoa {
	
    String nome;
	int idade;
	String profissao;
	List<Pessoa> cadPessoas;
	
	protected Pessoa(String pessoa, int idade, String profissao) {
		this.nome = pessoa;
		this.idade = idade;
		this.profissao = profissao;
	}
	
	
	public String getPessoa() {
		return nome;
	}
	
	
	public void setPessoa(String pessoa) {
		this.nome = pessoa;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	@Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Profissão: " + profissao;
    }
	
	
}
