package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStringsComLambda {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("basssa do código");
		palavras.add("caelum");
		
//		ordenação em ordem alfabetica
//		Collections.sort(palavras);
//		System.out.println(palavras);
		
		System.out.println("Primeiro Exemplo");
		
		palavras.sort((s1, s2) -> {
		    if (s1.length() < s2.length())
		        return -1;
		    if (s1.length() > s2.length())
		        return 1;
		    return 0;
		});
		
		System.out.println(palavras);
		
		System.out.println("");
		
		
		System.out.println("Maneira 1");
//		Interação para interfaces com apenas um método não precisamos definir o tipo
		palavras.forEach(System.out::println);
		
		System.out.println("");
		System.out.println("Maneira 2");
//		Outra maneira
		palavras.forEach(s -> System.out.println(s));
		
		System.out.println("");
		System.out.println("Maneira 3");
//		Interação for each
		palavras.forEach(System.out::println);
		
//		System.out.println("Maneira 4");
//		palavras.sort((s1, s2) -> {
//	    return Integer.compare(s1.length(), s2.length()); 
//	});
//		System.out.println(palavras);
		
		System.out.println("");
		System.out.println("Maneira 5");
		palavras.sort(Comparator.comparing(String::length));
		System.out.println(palavras);
		
		
		System.out.println("");
		System.out.println("Maneira 6");
		palavras.forEach(System.out::println);
		
	}
}
