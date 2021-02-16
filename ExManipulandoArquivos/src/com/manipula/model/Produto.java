package com.manipula.model;

public class Produto {
	
	private String nomeProduto;
	private Double precoProduto;
	private int quantProduto;
	
	public Produto() {
		
	}

	public Produto(String nomeProduto, Double precoProduto, int quantProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.quantProduto = quantProduto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}
	
	public int getQuantProduto() {
		return quantProduto;
	}

	public void setQuantProduto(int quantProduto) {
		this.quantProduto = quantProduto;
	}
	
	@Override
	public String toString() {
		return getNomeProduto()+", "+getPrecoProduto()+", "+getQuantProduto()+"\n";
	}
}
