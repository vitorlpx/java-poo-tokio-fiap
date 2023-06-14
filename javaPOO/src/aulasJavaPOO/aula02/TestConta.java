package aulasJavaPOO.aula02;

public class TestConta {

	public static void main(String[] args) {
		
		
		// objetos
		Cliente vitinho = new Cliente("Vitinho", "123456789", "123456788", "Rua x, 145");
		Cliente camotinha = new Cliente("Camotinha", "987654321", "987654321", "Rua y, 256");
		
		Conta contaVitinho = new Conta(vitinho, 1, 1, "teste");
		Conta contaCamotinha = new Conta(camotinha, 2, 1, "teste");
		
		
		// simulações
		contaVitinho.depositar(700);
		contaCamotinha.depositar(700);
		
		contaVitinho.exibirSaldo();
		contaCamotinha.exibirSaldo();
		
		contaVitinho.sacar(150);
		contaCamotinha.sacar(300);

		contaVitinho.exibirSaldo();
		contaCamotinha.exibirSaldo();
		
		contaVitinho.transferir(contaCamotinha, 200);

		contaVitinho.exibirSaldo();
		contaCamotinha.exibirSaldo();

	}

}
