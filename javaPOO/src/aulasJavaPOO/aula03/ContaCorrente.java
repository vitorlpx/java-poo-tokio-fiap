package aulasJavaPOO.aula03;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, int numeroConta, int agencia, String senhaConta) {
		super(cliente, numeroConta, agencia, senhaConta); 
	}

	private double saldoInvestimento;
	
	@Override
	public void exibirSaldo() {
		System.out.println(this.cliente.getNomeTitular() + "Saldo: " + this.saldo);
		double saldoTotal = this.saldo + this.saldoInvestimento;
		System.out.println("Cliente: " + this.cliente.getNomeTitular());
		System.out.println("Data Abertura: " + this.dataAbertura);
		System.out.println("Saldo conta corrente: R$ " + this.saldo);
		System.out.println("Saldo investimento: R$ " + this.saldoInvestimento);
		System.out.println("Saldo total: R$ " + saldoTotal + "\n");
		
	}
	
	//Design pattern Strategy
	public void investimento(double valor, Produto produto) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			this.saldoInvestimento += produto.investir(valor);
		}
		

	}
	
	
}
