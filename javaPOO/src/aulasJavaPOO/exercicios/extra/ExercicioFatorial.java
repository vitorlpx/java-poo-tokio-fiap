package aulasJavaPOO.exercicios.extra;

import javax.swing.JOptionPane;

public class ExercicioFatorial {

	public static void main(String[] args) {

		float num, fat = 1, i;

		num = Float.parseFloat(JOptionPane.showInputDialog("Insira o número que você deseja fatorar: "));

		for (i = 1; i <= num; i++) {
			fat = fat * i;
		}
		
		JOptionPane.showMessageDialog(null, String.format(" O fatorial de %.0f é:  %.0f", num, fat));
		
	}

}
