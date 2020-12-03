package com.polimorfismo.main;

import java.util.Scanner;

import com.polimorfismo.entidades.Produto;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Produto p1;
		
		System.out.println("Entre com o número de produtos: ");
		int contProduto = teclado.nextInt();
		
		
		for(int i = 0; i < contProduto; i++) {
			
			System.out.println("Employ #"+(i+1)+" data: " );
			System.out.print("Comun, usado ou importado (c/n/i): ");
			String tagProduto = teclado.nextLine();
			System.out.print("Nome: "); 
			teclado.nextLine();
			String name = teclado.nextLine();
			System.out.print("Preço: ");
			Double preco = teclado.nextDouble();
			
			
			System.out.print("Value per Hours: ");
			Double valuePerHours = input.nextDouble();
			
			if(opOutsourced.equals('s')) {
				System.out.print("Additional charge: ");
				Double addCharge = input.nextDouble();
				employee = new OutsourcedEmployee(name, hours, valuePerHours, addCharge);
			}else if(opOutsourced.equals('n')) {
				employee = new Employee(name, hours, valuePerHours);
			}else {
				employee = null;
			}
			
			listEmployee.add(employee);
			
		}

	}
}
