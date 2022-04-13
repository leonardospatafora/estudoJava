package br.com.alura;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario> {
	
	@Override
	public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
//		System.out.println(funcionario.getIdade() - outroFuncionario.getIdade());
		return funcionario.getIdade() - outroFuncionario.getIdade();
	}
}
