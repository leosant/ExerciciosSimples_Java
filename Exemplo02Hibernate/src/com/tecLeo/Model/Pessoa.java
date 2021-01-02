package com.tecLeo.Model;

import javax.persistence.*;

@Entity
public class Pessoa {
	@Id
	private Long CPF;
	private String nome;
	private Integer idade;
	
	public Pessoa(Long CPF, String nome, Integer idade) {
		setCPF(CPF);
		setNome(nome);
		setIdade(idade);
	}
	public Long getCPF() {
		return CPF;
	}
	public void setCPF(Long CPF) {
		this.CPF = CPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Pessoa [CPF= " + CPF + ", nome= " + nome + ", idade= " + idade + "]";
	}
}
