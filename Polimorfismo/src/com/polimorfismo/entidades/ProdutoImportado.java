package com.polimorfismo.entidades;

public class ProdutoImportado extends Produto{
	
	private Double taxaAlfandega;
	
	public ProdutoImportado(String nome, double preco, Double taxaAlfandega) {
		super(nome, preco);
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
