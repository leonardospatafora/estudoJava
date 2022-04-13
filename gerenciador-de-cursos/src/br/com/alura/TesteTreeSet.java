package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSet {

	public static void main(String args[]) {

		Funcionario f1 = new Funcionario("Barney", 36);
		Funcionario f2 = new Funcionario("Jonatan", 37);
		Funcionario f3 = new Funcionario("Guaraciara", 12);

//		Map func = new TreeMap<>();
//		
//		func.put("s", 1);
//		func.put("t",1);
//		func.put("t",1);
		
		
		
		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);

		Iterator<Funcionario> iterador = funcionarios.iterator();

		while (iterador.hasNext()) {
			System.out.println(iterador.next().getNome());
		}
	}
}
