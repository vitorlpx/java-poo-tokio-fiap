package aulasJavaPOO.exercicios.aula01;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade"));
		
		if (idade < 16) {
			JOptionPane.showMessageDialog(null, "Você não pode votar nem embarcar na van!");
		} else if (idade >= 16 && idade < 18) {
			JOptionPane.showMessageDialog(null, "Você pode escolher se vota ou não!");
		} else {
			JOptionPane.showMessageDialog(null, "Você é obrigado a votar por lei!");
		}

	}

}
