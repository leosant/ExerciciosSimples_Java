package com.cursoTeste.Entidades;

import com.cursoTeste.Enums.*;

public class Aluno {
	
	private String nome;
	private Genero genero;
	private int id;
	
	public Aluno() {
		
	}

	public Aluno(String nome, Genero genero, int id) {
		this.nome = nome;
		this.genero = genero;
		this.id = id;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
