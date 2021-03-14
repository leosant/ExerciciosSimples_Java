package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Contract;
import Entities.Installment;
import Service.ContractService;
import Service.PaypalService;
import Service.PicPay;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter contract data ");
		System.out.print("Enter number: ");
		int numberCo = input.nextInt();
		System.out.println("Enter date contract: ");
		Date date = sdf.parse(input.next());	
		System.out.println("Contract total value: ");
		double totalValue = input.nextDouble();
		
		Contract contractOne = new Contract(numberCo, date, totalValue);
		Contract contractTwo = new Contract(numberCo, date, totalValue);
		
		ContractService cs1 = new ContractService(new PaypalService());
		ContractService cs2 = new ContractService(new PicPay());
		
		System.out.println("Enter number installments");
		int installments = input.nextInt();
		
		cs1.processContract(contractOne, installments);
		cs2.processContract(contractTwo, installments);
		
		System.out.println("Instalments: ");
		System.out.println("Paypal: ");
		for (Installment itOne : contractOne.getInstallment()) {
			System.out.println(itOne.toString()+"\n");
		}
		System.out.println("PicPay: ");
		for (Installment itTwo : contractTwo.getInstallment()) {
			System.out.println(itTwo.toString()+"\n");
		}
	}

}
