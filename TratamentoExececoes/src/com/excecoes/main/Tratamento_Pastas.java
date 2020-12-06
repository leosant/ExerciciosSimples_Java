package com.excecoes.main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tratamento_Pastas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\LeoUser\\Documents\\Teste_Desenvolvimento\\Textos\\teste.txt");
		
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				
			}
		}
	}

}
