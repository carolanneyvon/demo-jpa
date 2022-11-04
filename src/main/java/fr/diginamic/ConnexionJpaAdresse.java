package fr.diginamic;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnexionJpaAdresse {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		
		transaction.begin();

				
		Adresse adresse = new Adresse();
		adresse.setRue("Rue des étoiles");
		adresse.setCodePostal(34000);
		adresse.setVille("Lune");
		
		Habitant habitant = new Habitant();
		habitant.setNom("Soleil");
		habitant.setPrenom("Embeddable");
		habitant.setAdresse(adresse);
		em.persist(habitant);
		

		transaction.commit();
	}

}
