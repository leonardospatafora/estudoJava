package exerciciosBasic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexToMatchSonar {

	public static void main(String[] args) {
//	    String input = "#05/12/2023#";
//        String patternString = "^#(\\d+)/(\\d+)/(\\d+)#$*";
//        Pattern pattern = Pattern.compile(patternString);
//        Matcher matcher = pattern.matcher(input);
//
//        if (matcher.find()) {
//            String day = matcher.group(1);
//            String month = matcher.group(2);
//            String year = matcher.group(3);
//
//            System.out.println("Day: " + day);
//            System.out.println("Month: " + month);
//            System.out.println("Year: " + year);
//        }
		
		StringBuilder strWrite = new StringBuilder();
		strWrite.append("1"); // Situacao  numerico(1) - O campo situacao com o numero 1 (Hum) consulta com sucesso
		strWrite.append("EMPRESA                       "); // Empresa Alfa(30)
		strWrite.append("Nome                          ");// Nome Alfa(30)
		strWrite.append("0000020000"); // Valor Numerico 10
		strWrite.append("20071008"); // Vencimento(yyyymmdd) Numerico(8)
		strWrite.append("0000002759"); // Valor Juros Numerico(10)
		strWrite.append("0000022759"); // Valor Total Numerico(10)
		strWrite.append("0000000100"); // Codigo Convenio Alfa(10)
		strWrite.append("000000000001001"); // Codigo Conveniado Alfa (15)
		System.out.println(strWrite);
		
		  String buffer = "#20/12/2023#2000";
	            Pattern pattern = Pattern.compile("^#(\\d+)/(\\d+)/(\\d+)#");
	            Matcher matcher = pattern.matcher(buffer);
	        	StringBuilder strBuf = new StringBuilder();
	        	if (matcher.find()) {
	        		strBuf.append(matcher.group(1));
	        		strBuf.append(matcher.group(2));
	        		strBuf.append(matcher.group(3));
	        	}
	        	System.out.println(strBuf);
	}

	
}
