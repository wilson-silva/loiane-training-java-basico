package com.loiane.cursojava.aula52.labs;

public class Contato {

	private static int contador = 0;

	private int id;
	private String nome;
	private String telefone;
	private String email;

	public Contato() {
		contador ++;
		id = contador;
	}
	
	

	public Contato(String nome, String telefone, String email) {
		contador ++;
		id = contador;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}



	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		String s = "[ ";
		s += "Id: " + id;
		s += ", Nome: " + nome;
		s += ", Telefone: " + telefone;
		s += ", Email: " + email;
		s += " ]";
		return s;
	}
	
	

}
