package com.polimorfismo.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.polimorfismo.entidades.Produto;
import com.polimorfismo.entidades.ProdutoImportado;
import com.polimorfismo.entidades.ProdutoUsado;
import com.polimorfismo.enums.TagProduto;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner teclado = new Scanner(System.in);
		Produto p1;
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com o n�mero de produtos: ");
		int contProduto = teclado.nextInt();
		
		
		for(int i = 0; i < contProduto; i++) {
			
			System.out.println("Produto #"+(i+1)+" data: " );
			System.out.print("Comun, usado ou importado (c/n/i): ");
			TagProduto tagProduto = TagProduto.valueOf(teclado.nextLine());
			System.out.print("Nome: "); 
			teclado.nextLine();
			String name = teclado.nextLine();
			System.out.print("Pre�o: ");
			Double preco = teclado.nextDouble();
			//Transicao utilizando o polimorfismo
			if(tagProduto.equals("Comun")) {
				p1 = new Produto(name, preco, tagProduto);
			}
			else if(tagProduto.equals("Importado")) {
				System.out.print("Taxa Alfandeg�ria: ");
				Double TaxaAlfandega = teclado.nextDouble();
				p1 = new ProdutoImportado(name, preco, tagProduto, TaxaAlfandega);
			}
			else if(tagProduto.equals("Usado")){
				System.out.println("Data de frabica��o: ");
				Date dataFabricacao = format.parse(teclado.nextLine());
				p1 = new ProdutoUsado(name, preco, tagProduto, dataFabricacao);
			}
			else {
				System.out.println("Produto Inv�lido!");
				p1 = null;
			}
			
			//listEmployee.add(employee);
			
		}

	}
}
