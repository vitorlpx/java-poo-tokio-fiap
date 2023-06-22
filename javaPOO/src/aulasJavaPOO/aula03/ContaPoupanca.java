package aulasJavaPOO.aula03;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, int numeroConta, int agencia, String senhaConta) {
		super(cliente, numeroConta, agencia, senhaConta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void exibirSaldo() {	
		System.out.println("Cliente: " + this.cliente.getNomeTitular());
		System.out.println("Data Abertura: " + this.dataAbertura);
		System.out.println("Saldo conta corrente: R$ " + this.saldo);
		
	}

}
