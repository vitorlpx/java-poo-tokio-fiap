package aulasJavaPOO.aula03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Javabeans - Modelo de criação (somente construtor, get and sett e objetos).
public class Cliente {
	
	//Atributos
	private String nomeTitular, cpfTitular, rgTitular, enderecoTitular;
	
	//Final serve para criar uma variável em constante.
	private final Date dataNasc;

	
	//Construtor - é um método de inicialização do objeto (new).
	public Cliente(String nomeTitular, String cpfTitular, String rgTitular, String enderecoTitular, String dataNasc) throws ParseException { 
		                                                                      //throws ParseExecption basicamente "passa" o erro pra frente.

		//this se refere ao atributo.  
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.rgTitular = rgTitular;
		this.enderecoTitular = enderecoTitular;
		System.out.println("Cliente criado.");
		
		//Criação e formatação de um objeto date.
		SimpleDateFormat formato = new SimpleDateFormat("DD/MM/YYYY"); 
		this.dataNasc = formato.parse(dataNasc); //parse faz conversão de tipos. - aqui fez no tipo date.
	}
	
	
	// Estamos usando getters (ler) and setters (escrever) parar acessar as variáveis que são privadas (encapsuladas).
	
	public String getNomeTitular() { //Estamos "pegando" como string porque declaramos lá em cima como string.
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) { //Quando escrevemos um método, sempre utilizamos void, significando que estamos retornando void.
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public String getRgTitular() {
		return rgTitular;
	}

	public void setRgTitular(String rgTitular) {
		this.rgTitular = rgTitular;
	}

	public String getEnderecoTitular() {
		return enderecoTitular;
	}

	public void setEnderecoTitular(String enderecoTitular) {
		this.enderecoTitular = enderecoTitular;
	}
	
	
	
}
