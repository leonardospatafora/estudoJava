package br.com.exercicio.gtp;

import java.lang.reflect.Constructor;

public class ExecutaReflection {
	
	public static void main(String[] args) {
		
//		BUSCA O NOME DOS METODOS
//		Pessoa pessoa = new Pessoa("Leonardo", 26, "Dev");
//		Class<?> classe = pessoa.getClass();
//		Method[] metodos = classe.getDeclaredMethods();
//		
//		for (Method metodo : metodos) {
//            System.out.println("Nome do método: " + metodo.getName());
//            System.out.println("Tipo de retorno: " + metodo.getReturnType().getSimpleName());
//            System.out.println("-----");
//        }
		
		   try {
	            Class<?> classe = PessoaExtend.class;
	            Constructor<?> constructor = classe.getConstructor(String.class, int.class, String.class);
	            Object instancia = constructor.newInstance("João", 25, "DEV");
	            Pessoa pessoa = (Pessoa) instancia;

	            System.out.println("Nome: " + pessoa.getPessoa());
	            System.out.println("Idade: " + pessoa.getIdade());
	            System.out.println("Profissao: " + pessoa.getProfissao() );
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
		
	}

}
