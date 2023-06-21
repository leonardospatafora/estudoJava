import java.util.Optional;

public class BooleanNulo {
	
	public static boolean teste(int a) {
		return a == 1 ? true : false;
	}
	
	public static void main(String[] args) {
		Boolean a = false;
		int i = 1;
		boolean t = Optional.ofNullable(a)
				.map(tab -> BooleanNulo.teste(i))
				.orElse(false);
		
		if (!t) {
			System.out.println(t);
		}
	}
}

