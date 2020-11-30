package com.employee.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.employee.entity.*;

public class Main {
	private static Scanner input;
	
	public static void main(String[] args) {
		
		//Tools
		input = new Scanner(System.in);
		
		//Init software
		Employee employee;
		ArrayList<Employee>listEmployee = new ArrayList<>(); 
		System.out.println("Enter the number of employees: ");
		int contEmployee = input.nextInt();
		
		//Struct
		for(int i = 0; i < contEmployee; i++) {
			
			System.out.println("Employ #"+(i+1)+" data: " );
			System.out.print("Outsourced(S/N): ");
			Character opOutsourced = input.next().charAt(0);
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Hours: ");
			Integer hours = input.nextInt();
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
		
		//Print
		System.out.println("\nPayments: ");
		for(Employee x : listEmployee) {
			System.out.println(x.toString());
		}
		
		
		
	}

}
