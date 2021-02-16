package com.manipula.view;

import java.io.BufferedWriter;
import java.io.FileWriter;
import com.manipula.model.Produto;

public class Principal {

	public static void main(String[] args) {

		Produto[] nPro = new Produto[4];
		
		nPro[0] = new Produto("TV LED", 1290.99, 1);
		//
		nPro[1] = new Produto("Video Game Chair", 350.50, 3);
		//
		nPro[2] = new Produto("Iphone X", 900.00, 2);
		//
		nPro[3] = new Produto("Samsung Galaxy 9", 850.00, 2);		
		
		String path = "C:\\Users\\LeoUser\\Documents\\git-repository\\Projetos_Desenvolvimentos\\Desktop\\eclipse_exercicios\\Nelio_Alves_Udemy\\ExerciciosSimples_Java\\ExManipulandoArquivos\\";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path + "temp.csv"))) {
			for(Produto produto : nPro) {
				bw.write(produto.toString());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//Operation
		for(Produto p : nPro) {
			p.setPrecoProduto(p.getPrecoProduto()*p.getQuantProduto());
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path + "sumary.csv"))){
			for(Produto produto2 : nPro) {
				bw.write(produto2.toString());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Criado com sucesso!");
	}
}