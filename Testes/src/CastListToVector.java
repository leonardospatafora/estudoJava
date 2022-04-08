import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CastListToVector {

	public static void main(String[] args) {
		
		Vector<String> linhas =  new Vector<>();
		Vector<String> linhas2 =  null;
		List<String> teste = new ArrayList<>();
		
		linhas.add("teste");
		teste.add("teste");
		
//		teste = linhas;
		linhas2 = (new Vector<String>((Vector<String>) teste));
		
		System.out.println(linhas);
		
		

		
		
//		mapaVO.add("teste");
//		
//		linhas = new Vector<>();
//		
//		linhas.add("teste");
//		
//		System.out.println(linhas);
//		System.out.println(mapaVO);
		

		
		
		
		
		
		
		
		

	}
	
	public Object teste(Vector dados){
		return null;
	}
	
	

}
