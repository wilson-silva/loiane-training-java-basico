package com.loiane.cursojava.aula39;

public class Pessoa {

	private String nome;
	private String enderešo;
	private String telefone;
	private String cpf;
	private String telefoneCelular;
	
	protected String nomeVisibilidade;

	public Pessoa() {
		nomeVisibilidade = "teste";

	}

	public Pessoa(String nome, String enderešo, String telefone) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone;
	}
	
	

	public void setNomeVisibilidade(String nomeVisibilidade) {
		this.nomeVisibilidade = nomeVisibilidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
	

}
