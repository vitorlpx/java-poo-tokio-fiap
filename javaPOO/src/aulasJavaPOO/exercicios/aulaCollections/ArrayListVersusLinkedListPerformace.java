package aulasJavaPOO.exercicios.aulaCollections;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListVersusLinkedListPerformace {

	public static void main(String[] args) {

		Collection <Integer> lista = new ArrayList<Integer>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i <= 50000; i ++) {
			lista.add(i);
			System.out.println(i);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoGasto = fim - inicio;
		
		System.out.println("Tempo: " + tempoGasto);
		
	}

}
