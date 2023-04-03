import java.util.Objects;

public class EC5706 {

	public static void main(String[] args) {

		String numero = "1.209,00";
		numero = numero.replaceAll("[.,]", "");

		double valor = Double.parseDouble(numero) / 100.0;

		String valorFormatado = String.format("%.2f", valor);

		System.out.println(valorFormatado);

	}

}
