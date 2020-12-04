package com.polimorfismo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.polimorfismo.enums.TagProduto;

public class ProdutoUsado extends Produto{

	public static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	private Date dadosFabricacao;
	
	public ProdutoUsado(String nome, double preco, TagProduto tagProduto, Date dadosFabricacao) {
		super(nome, preco, tagProduto);
		this.dadosFabricacao = dadosFabricacao;
	}

	public Date getDadosFabricacao() {
		return dadosFabricacao;
	}

	public void setDadosFabricacao(Date dadosFabricacao) {
		this.dadosFabricacao = dadosFabricacao;
	}
	
	@Override
	public String precoTag() {
		return super.precoTag()+" (Data de Fabricação data: "+format.format(getDadosFabricacao())+")";
	}
}
