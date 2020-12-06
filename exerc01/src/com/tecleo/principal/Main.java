package com.tecleo.principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.tecleo.entidades.Departamento;
import com.tecleo.entidades.HorasContrato;
import com.tecleo.entidades.Trabalhador;
import com.tecleo.enums.WorkerLevel;

public class Main {

	private static Scanner teclado;

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		//Variaveis
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		Trabalhador trabalhador;
		HorasContrato hrContrato = new HorasContrato();
		teclado = new Scanner(System.in);
		
		System.out.println("Qual o nome do departamento: ");
		String dep = teclado.nextLine();
		
		System.out.println("Insira o trabalhador: ");
		String nome = teclado.nextLine();
		
		System.out.println("Qual o cargo do "+nome);
		String level = teclado.nextLine();
		if( level.equals("junior") || level.equals("Junior")){
			level = "JUNIOR";
		}else if(level.equals("mid level") || level.equals("Mid level") || level.equals("Mid Level") || level.equals("mid Level")
			|| level.equals("mid_level") || level.equals("Mid_level") || level.equals("Mid_Level")
			|| level.equals("mid") || level.equals("Mid")){
			level = "MID_LEVEL";
		}else {
			level = "SENIOR";
		}
		System.out.println("Salario base: ");
		Double baseSalary = teclado.nextDouble();
		
		trabalhador = new Trabalhador(nome, WorkerLevel.valueOf(level), baseSalary, new Departamento(dep));
		
		System.out.println("Quantos contratos com o funcion�rio "+nome+": ");
		int numCont = teclado.nextInt();
		
		for(int i = 0 ; i < numCont; i++) {
			System.out.println("Contrato #"+i+", Data (DD/MM/YYYY): ");
			System.out.println("Data (DD/MM/YYYY)");
			Date dataContrato = format.parse(teclado.next());
			System.out.println("Valor por hora: ");
			double valuePerHour = teclado.nextDouble();
			System.out.println("Dura��o (Horas): ");
			int hours = teclado.nextInt();
			HorasContrato contratoHours = new HorasContrato(dataContrato, valuePerHour, hours);
			trabalhador.addContract(contratoHours);
		}
		System.out.println();
		System.out.println("Entre com o m�s e ano a ser calculado: ");
		String monthAndYear = teclado.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Nome: "+trabalhador.getNome());
		System.out.println("Departamento: "+trabalhador.getDepartamento().getNome());
		System.out.println("Nível: "+trabalhador.getLevel());
		System.out.println("Total no "+monthAndYear+": "+trabalhador.totalGanho(year, month));
	}

}
