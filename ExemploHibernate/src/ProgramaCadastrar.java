import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Produto;

public class ProgramaCadastrar {
	
	private static EntityManagerFactory emf;
	
	private static EntityManager getEntityManager() {
		
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("produtos");
		}
		
		return emf.createEntityManager();
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		Produto produto4 = new Produto();
		System.out.println("Digite o nome do produto a ser inserido: ");
		produto4.setNome(teclado.nextLine());
		System.out.println("Digite a quantidade desse produto: ");
		produto4.setQuantidade(teclado.nextInt());
		
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(produto4);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
