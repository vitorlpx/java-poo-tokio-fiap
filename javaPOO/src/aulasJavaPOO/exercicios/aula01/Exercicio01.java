package aulasJavaPOO.exercicios.aula01;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {

		double valorDoacao, valorInvestimento;
		
		valorDoacao = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor que será doado: "));
		
		if (valorDoacao >= 1000) {
			
			valorInvestimento = (valorDoacao * 0.15);
			JOptionPane.showMessageDialog(null, "O valor doado foi: R$" + valorDoacao 
					+ "\nO valor que deverá ser investido é de 15%: R$" + valorInvestimento);
			
			} else {
				
			valorInvestimento = (valorDoacao * 0.05);	
			JOptionPane.showMessageDialog(null, "O valor doado foi: R$" + valorDoacao 
					+ "\nO valor que deverá ser investido é de 5%: R$" + valorInvestimento);
			
			}

	}

}
