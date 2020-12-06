package com.excecoes.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//A intenção desse projeto é pode causa erros, e trata-los
		
		Scanner teclado = new Scanner(System.in);
		Integer[] num = null;
		
		try {
			for(int i = 0; i < 1; i++) {
				System.out.println("Digite o nome desejado: ");
				num[i] = teclado.nextInt();
			}
		} catch (Exception e) {
			System.out.println("Parei por causa de ponto nulo");
		}
		try {
			for(int i = 0; i < 1; i++) {
				System.out.println("\n"+num[i]);
			}
		} catch (Exception e) {
			System.out.println("Ponto de NullPointerException");
		}
		
		System.out.println("Fim");
	}

}
