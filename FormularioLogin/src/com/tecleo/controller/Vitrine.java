package com.tecleo.controller;

import java.util.ArrayList;
import java.util.List;

import com.tecleo.model.Produto;

public class Vitrine {
	
private static List<Produto> produtos = new ArrayList<Produto>();
	
	public void addProdutors(Produto... ps) {
		for(Produto p : ps) {
			produtos.add(p);
		}
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
}
