import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
//
//		int a = 8;
//		int total;
//		
//		
//		if(a % 2 ==0) {
//			System.out.println("é par!!");
//		}else {
//			System.out.println("é impar");
//		}

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//		System.out.println(numbers);

		List<Integer> twoEvenSquares = numbers.stream().filter(n -> {
			System.out.println("filtering " + n);
			return n % 2 == 0;
		}).map(n -> {
			System.out.println("mapping " + n);
			return n * n;
		}).limit(2).toList();

	}

}
