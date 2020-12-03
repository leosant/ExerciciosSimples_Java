package com.polimorfismo.entidades;

import com.polimorfismo.enums.TagProduto;

public class Produto {
	
	private TagProduto tagProduto;
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco, TagProduto tagProduto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.tagProduto = tagProduto;
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
