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
		
		Produto produto1 = new Produto();
		produto1.setNome("Computador");
		produto1.setQuantidade(1);
		
		Produto produto2 = new Produto();
		produto2.setNome("Laptop");
		produto2.setQuantidade(2);
		
		Produto produto3 = new Produto();
		produto3.setNome("Celular");
		produto3.setQuantidade(5);
		
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(produto1);
		em.persist(produto2);
		em.persist(produto3);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
