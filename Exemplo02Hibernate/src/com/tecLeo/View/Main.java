package com.tecLeo.View;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tecLeo.Model.Pessoa;

public class Main {
	
	public static Long CPF;
	public static String nome;
	public static Integer idade;
	
	private static Scanner input;
	
	private static EntityManagerFactory emf;
	
	private static EntityManager getEntityManager() {
		if(emf == null ) {
			emf = Persistence.createEntityManagerFactory("cadastroPessoa");
		}
		return emf.createEntityManager();
	}

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Digite o CPF da pessoa: ");
		CPF = input.nextLong();
		
		System.out.println("Digite o nome da pessoa: ");
		input.nextLine();
		nome = input.nextLine();
		
		System.out.println("Digite a idade de "+nome+": ");
		idade = input.nextInt();
		
		Pessoa pessoa = new Pessoa(CPF, nome, idade);
		
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		
		System.out.println("\n***********Recuperando dados do Banco de dados: ***************\n");
		List<Pessoa> pessoas = em.createQuery("select p from Pessoa p", Pessoa.class).getResultList();
		System.out.println(pessoas);
		
		em.close();
		emf.close();
	}

}
