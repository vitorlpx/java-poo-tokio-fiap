package aulasJavaPOO.aula03;

import java.util.Date;

//Abstract não deixa criar objetos da classe.
public abstract class Conta {

	//Atributos
	protected int numeroConta, agencia;
	protected String senhaConta;
	protected Date dataAbertura;
	protected double saldo;
	protected Cliente cliente; //Composição
	private static long contador; //Variável da classe, e não do objeto.

	//Construtor
	public Conta(Cliente cliente, int numeroConta, int agencia, String senhaConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.senhaConta = senhaConta;
		this.dataAbertura = new Date(System.currentTimeMillis());
		contador++;

		System.out.println("Objeto conta criado com sucesso.");
		System.out.println("Data de abertura da conta: " + this.dataAbertura);
	}

	//Sacar
	public boolean sacar(double valor) {
		if (valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			}
		}
		return false;
	}

	//Depositar
	public void depositar(double valor) {
		this.saldo += valor;
	}

	//Transferir
	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}
	}

	//Consultar saldo
	public abstract void exibirSaldo();

	public static void contador() {
		System.out.println("Total de contas criadas: " + contador);
	}
	
}
