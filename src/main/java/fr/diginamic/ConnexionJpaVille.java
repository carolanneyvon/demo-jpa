package fr.diginamic;


import java.util.Calendar;
import java.util.Locale.Category;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnexionJpaVille {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		
		transaction.begin();

		Calendar cal = Calendar.getInstance();
		cal.set(2015, 5, 18);
		
		Ville ville = new Ville();
		ville.setNom("Montpellier");
		ville.setCodePostal(34000);
		ville.setDernierRecensement(cal.getTime());
		ville.setCategorie(Category.GRANDE);
		em.persist(ville);

		transaction.commit();
	}

}
