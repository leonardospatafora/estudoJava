package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {

    public static void main(String[] args) {

//        Collection<Integer> numeros = new HashSet<Integer>();
        Collection<Integer> numeros = new ArrayList<Integer>();
//         Map numeros = new TreeMap<>();
        
        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }
        
        System.out.println(numeros.size());

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }

}