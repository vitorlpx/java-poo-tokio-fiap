package aulasJavaPOO.aula02;

import java.util.Date;

public class Conta {

	// atributos
	private int numeroConta, agencia;
	private String senhaConta;
	private Date dataAbertura;
	private double saldo;
	private Cliente cliente; // composição

	// construtor
	public Conta(Cliente cliente, int numeroConta, int agencia, String senhaConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.senhaConta = senhaConta;
		this.dataAbertura = new Date(System.currentTimeMillis());
		
		System.out.println("Objeto conta criado");
		System.out.println("Data de abertura da conta: " + this.dataAbertura);
	}

	// sacar
	public boolean sacar(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	// depositar	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	// transferir	
	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor); 
		if (teste == true) {
			conta.depositar(valor);
		}
 	}
	
	// consultar saldo	
	public void exibirSaldo() {
		System.out.println(this.cliente.getNomeTitular() + "Saldo: " + this.saldo);
	}
	 
}
