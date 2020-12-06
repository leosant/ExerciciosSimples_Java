package com.view.principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.model.entidades.Reserva;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		Reserva res = null;
		
		try {
			System.out.println("Número do quarto: ");
			Integer numQuarto = teclado.nextInt();
			System.out.println("Check-in date (dd/MM/yyyy)");
			teclado.nextLine();
			Date checkin = format.parse(teclado.nextLine());
			System.out.println("Check-out date (dd/MM/yyyy)");
			Date checkout = format.parse(teclado.nextLine());
			
			res = new Reserva(numQuarto);
			res.atulizarDatas(checkin, checkout);
		} catch (NullPointerException e) {
			System.out.println("(IO)Exceção ocorreu null");
			
		} catch (ParseException e) {
			System.out.println("(IO)Número insuficiente");
		}
		finally {
			System.out.println("Fim");
		}
		//
		try {
			System.out.println(res.toString());
		} catch (NullPointerException e) {
			System.out.println("(Print) null");
		}
		
		
	}

}
