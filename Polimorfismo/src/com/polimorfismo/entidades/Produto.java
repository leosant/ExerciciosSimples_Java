package com.polimorfismo.entidades;

import com.polimorfismo.enums.TagProduto;

public class Produto {
	
	private TagProduto tagProduto;
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public TagProduto getTagProduto() {
		return tagProduto;
	}

	public void setTagProduto(TagProduto tagProduto) {
		this.tagProduto = tagProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String precoTag() {
		return getNome()+" ("+getTagProduto()+") $ "+getPreco();
	}
}
