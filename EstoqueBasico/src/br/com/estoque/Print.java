package br.com.estoque;
import java.util.ArrayList;

import br.com.ferramentas.Leitor;

public class Print {
	
	public static Produto addProduto() {
		
		String nome = Leitor.lerString("Nome do produto: ");
		Double preco = Leitor.lerDoubles("Preço do produto: ");
		int quantidade = Leitor.lerInt("Digite a quantidade de produtos: ");
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		
		return produto;
	}
	
	public static void print(ArrayList<Produto> produto) {
		for(Produto auxProduto : produto) {
			print(auxProduto);
		}
	}
	
	public static void print(Produto produto) {
		System.out.println("\nNome do produto: "+ produto.getpNome());
		System.out.println("Preço do produto: "+ produto.getPrecoProduto());
		System.out.println("Quantidade adicionados no estoque: "+ produto.getQuantidadeProduto());
		System.out.println("Total: "+ produto.getpNome() +" -> R$"+ produto.totalEstoque());
	}
}
