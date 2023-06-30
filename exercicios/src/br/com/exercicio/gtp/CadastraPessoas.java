package br.com.exercicio.gtp;

import java.util.ArrayList;
import java.util.List;

public class CadastraPessoas {
	
	public static void main(String[] args) {
		Pessoa leonardo = new Pessoa("Leonardo", 26, "Analista de desenvolvimento");
		Pessoa luis = new Pessoa("luis", 54, "Encanador");
		Pessoa leandro = new Pessoa("leandro", 22, "representante");
		
		List<Pessoa> cadastroPessoa = new ArrayList<>();
		cadastroPessoa.add(leandro);
		cadastroPessoa.add(leonardo);
		cadastroPessoa.add(luis);
		
		for (Pessoa pessoa : cadastroPessoa) {
		    System.out.println(pessoa);
		}
		
	}

}
