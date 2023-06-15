package aulasJavaPOO.aula03;

import java.text.ParseException;

public class TestConta {

	public static void main(String[] args) throws ParseException {
		
		//Objetos
		Cliente vitinho = new Cliente("Vitinho ", "123456789", "123456788", "Rua x, 145", "15/03/2006");
		//Criamos uma variável para esse objeto para conseguirmos buscar na memória. 
		Cliente camotinha = new Cliente("Camotinha ", "987654321", "987654321", "Rua y, 256", "12/07/2005");
		
		ContaCorrente contaVitinho = new ContaCorrente(vitinho, 1, 1, "teste");
		ContaCorrente contaCamotinha = new ContaCorrente(camotinha, 2, 1, "teste");
		
		Cdb cdb = new Cdb();
		Lci lci = new Lci();
		Lca lca = new Lca();
		
		
		//Simulações
		contaVitinho.depositar(7000);
		contaCamotinha.depositar(7000);
		
		contaVitinho.exibirSaldo();
		contaCamotinha.exibirSaldo();
		
		contaVitinho.sacar(150);
		contaCamotinha.sacar(300);

		contaVitinho.exibirSaldo();
		contaCamotinha.exibirSaldo();
		
		contaVitinho.investimento(400, cdb);
		contaCamotinha.investimento(5000, cdb);

		
		contaVitinho.transferir(contaCamotinha, 200);

		contaVitinho.exibirSaldo();
		contaCamotinha.exibirSaldo();
		
		//Para pegarmos um atributo privado e exibi-lo, temos que usar o get.
		System.out.println(camotinha.getNomeTitular());
		
		Conta.contador();

	}

}
