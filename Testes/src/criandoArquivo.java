import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class criandoArquivo {

	public static void main(String[] args) throws IOException {
//		FileReader fr = new FileReader("/home/leospatafora/arquivos.txt");
//		BufferedReader ler = new BufferedReader(fr);
//		
//		System.out.println(ler.readLine());
		
		FileWriter arquivo = new FileWriter("/home/leospatafora/novo.txt");
		BufferedWriter escrever = new BufferedWriter(arquivo);
		
		escrever.write("teste");
//		obrigatoriamente deve-se fechar o recurso "BufferedWriter".
		escrever.close();

}
}