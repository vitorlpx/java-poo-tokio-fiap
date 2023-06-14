package aulasJavaPOO.aula03;

public class TestConta {

	public static void main(String[] args) {
		
		//Objetos
		Cliente vitinho = new Cliente("Vitinho ", "123456789", "123456788", "Rua x, 145");
		Cliente camotinha = new Cliente("Camotinha ", "987654321", "987654321", "Rua y, 256");
		
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
		
		Conta.contador();

	}

}
