package com.tecleo.entidades;

public class Departamento {
	
	private String nome;
	
	public Departamento() {	
	}
	
	public Departamento(String nome) {
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
