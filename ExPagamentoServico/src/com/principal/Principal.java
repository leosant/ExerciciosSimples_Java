package com.principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.modelo.Contrato;
import com.modelo.Parcelamento;
import com.service.ContractService;
import com.service.PaypalService;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		String number = sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		Double totalValue = sc.nextDouble();
		
		Contrato contract = new Contrato(number, date, totalValue);
		
		System.out.print("Enter number of installments: ");
		int N = sc.nextInt();
		
		ContractService cs = new ContractService(new PaypalService());
		
		cs.processingContract(contract, N);
		
		System.out.println("Installments:");
		for (Parcelamento it : contract.getParcelamento()) {
			System.out.println(it.toString());
		}

		sc.close();
	}
}
