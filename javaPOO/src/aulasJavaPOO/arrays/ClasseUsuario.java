package aulasJavaPOO.arrays;

import java.util.Date;

public class ClasseUsuario {

	//Atributos
	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String senha;
	private Date dataCadastro;
	
	public ClasseUsuario(String nome, String senha) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.dataCadastro = new Date(System.currentTimeMillis());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	

	
}
