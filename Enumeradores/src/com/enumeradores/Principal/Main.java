package com.enumeradores.Principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.enumeradores.Entidades.Client;
import com.enumeradores.Entidades.Order;
import com.enumeradores.Entidades.OrderItem;
import com.enumeradores.Entidades.Product;
import com.enumeradores.Enums.OrderStatus;

public class Main {
	
	private static Scanner teclado;
	
	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		teclado = new Scanner(System.in);
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		int i = 0;
		
		Order order;
		Product product = null;
		OrderItem orderItemProduct = null;
		
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = teclado.nextLine();
		
		System.out.print("Email: ");
		String email = teclado.nextLine();
		
		System.out.println("Birth Date (DD/MM/YYYY): ");
		Date data = format.parse(teclado.nextLine());
		
		Client client = new Client(name, email, data);
		
		System.out.println("Enter Order data: \n");
		
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(teclado.nextLine());
		
		order = new Order(new Date(), status, client);
		
		System.out.println("How many items to this order: ");
		int contItems = teclado.nextInt();
		while( i < contItems) {
			System.out.print("Product Name: ");
			teclado.nextLine();
			String productName = teclado.nextLine();
			System.out.print("Product Price: ");
			Double productPrice = teclado.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = teclado.nextInt();
			
			product = new Product(productName, productPrice);
			orderItemProduct = new OrderItem(quantity, productPrice, product);
			order.addOrderItem(orderItemProduct);
			i++;
		}
		
		teclado.close();
		
		System.out.println("\nOrder Summary: ");
		System.out.println(order.toString());
	}
	
}
