package br.com.estoque;
import java.util.ArrayList;

import br.com.ferramentas.Leitor;

public class Main {

	private static Produto produto;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		produto = new Produto();
		
		char opcao = ' ';
		
		//Entrada de dados do usuário através da classe Print
		do {
			produto = Print.addProduto();
			produtos.add(produto);
			opcao = Leitor.lerCaracter("Deseja continuar adicionando produtos: S/N?");
		}while((opcao == 's') || (opcao == 'S'));
		
		//Saída para usuário
		System.out.println("\n*****************Estoque&CIA**************");
		Print.print(produtos);
	}
}
