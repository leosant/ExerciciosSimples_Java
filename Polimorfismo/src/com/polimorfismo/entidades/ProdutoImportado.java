package com.polimorfismo.entidades;

import com.polimorfismo.enums.TagProduto;

public class ProdutoImportado extends Produto{
	
	private Double taxaAlfandega;
	
	public ProdutoImportado(String nome, double preco, TagProduto tagProduto, Double taxaAlfandega) {
		super(nome, preco, tagProduto);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	@Override
	public String precoTag() {
		return super.precoTag()+" (Taxa Alfandegária $"+getTaxaAlfandega()+")";
	}
}
