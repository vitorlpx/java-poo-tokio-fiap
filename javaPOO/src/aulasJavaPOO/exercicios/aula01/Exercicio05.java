package aulasJavaPOO.exercicios.aula01;

public class Exercicio05 {

	public static void main(String[] args) {

		double i, max = 100;
		
		for (i = 0; i <= max; i++) {
			
			if (i >= 50 & i <= 75) {
				
				continue;
				
			} else {
				
				System.out.printf("\n%.0f", i);
				
			}
			
		}

	}

}
