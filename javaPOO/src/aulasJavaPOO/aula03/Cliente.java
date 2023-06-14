package aulasJavaPOO.aula03;

// javabeans ()
public class Cliente {
	
	// atributos
	private String nomeTitular, cpfTitular, rgTitular, enderecoTitular;
	
	// construtor vazio
	public Cliente() {
		
	}
	
	// construtor 
	public Cliente(String nomeTitular, String cpfTitular, String rgTitular, String enderecoTitular) {

		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.rgTitular = rgTitular;
		this.enderecoTitular = enderecoTitular;
		System.out.println("Objeto cliente criado");
	}
	
	
	// getters and setters
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
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
