import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.io.IOUtils;

public class criandoArquivo {

	public static void main(String[] args) {
//		FileReader fr = new FileReader("/home/leospatafora/arquivos.txt");
//		BufferedReader ler = new BufferedReader(fr);
//		
//		System.out.println(ler.readLine());
		
//		FileWriter arquivo = new FileWriter("/home/leospatafora/novo.txt");
//		BufferedWriter escrever = new BufferedWriter(arquivo);
		
//		escrever.write("teste");
//		obrigatoriamente deve-se fechar o recurso "BufferedWriter".
//		escrever.close();
		
//		 PrintWriter printWriter = new PrintWriter("/home/leospatafora/novo.txt", "cp1252");
//         printWriter.println("Test PrintWriter Line 1 ");
//         printWriter.println("Test PrintWriter Line 2 ");
//         printWriter.println("Test PrintWriter Line 3");
//         printWriter.close();
		
		
		
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/usr/socin/novo.txt")));) {
			out.println("teste");
			out.println("teste");
			out.println("teste");
			out.println("teste");
			out.println("teste");
		}catch (IOException e) {
			System.out.println("Não rolou");
		}
         
		
		
		
		
		
		

}
}