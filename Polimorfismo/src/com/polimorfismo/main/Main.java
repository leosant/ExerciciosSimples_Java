package com.polimorfismo.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.polimorfismo.entidades.Produto;
import com.polimorfismo.entidades.ProdutoImportado;
import com.polimorfismo.entidades.ProdutoUsado;
import com.polimorfismo.enums.TagProduto;

public class Main {

	private static Scanner teclado;

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		teclado = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		ArrayList<Produto>listProdutos = new ArrayList<>();
		@SuppressWarnings("unused")
		Produto p1;
		
		
		
		System.out.println("Entre com o número de produtos: ");
		int contProduto = teclado.nextInt();
		
		
		for(int i = 0; i < contProduto; i++) {
			
			System.out.println("Produto #"+(i+1)+" data: " );
			System.out.print("Comun, usado ou importado (c/u/i): ");
			teclado.nextLine();
			Character opTag = teclado.next().charAt(0);
			System.out.print("Nome: "); 
			teclado.nextLine();
			String name = teclado.nextLine();
			System.out.print("Preço: ");
			Double preco = teclado.nextDouble();
			
			//Transicao utilizando o polimorfismo
			if(opTag.equals('c') || opTag.equals('C')) {
				TagProduto tag = TagProduto.valueOf("Comun");
				p1 = new Produto(name, preco, tag);
			}
			else if(opTag.equals('i') || opTag.equals('I')) {
				TagProduto tag = TagProduto.valueOf("Importado");
				System.out.print("Taxa Alfandegária: ");
				Double TaxaAlfandega = teclado.nextDouble();
				p1 = new ProdutoImportado(name, preco, tag, TaxaAlfandega);
			}
			else if(opTag.equals('u') || opTag.equals('U')){
				TagProduto tag = TagProduto.valueOf("Usado");
				System.out.println("Data de frabicação: (dd/mm/yyyy)");
				teclado.nextLine();
				Date data = format.parse(teclado.nextLine());
				p1 = new ProdutoUsado(name, preco, tag, data);
			}
			else {
				System.out.println("Produto Inválido!");
				p1 = null;
			}
			
			listProdutos.add(p1);	
		}
		
		teclado.close();
		
		System.out.println("\nTags Preços: ");
		for(Produto x : listProdutos) {
			System.out.println(x.precoTag());
		}

	}
}
