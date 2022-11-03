package fr.diginamic;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		Region region = em.find(Region.class, 1);
		if (region != null) {
			System.out.println(region);
		}

		transaction.begin();

		// avec le constructeur avec arguments
		// Region nvRegion = new Region(3, "Auvergne Rhône-Alpes");
		Region nvRegion = new Region();
		nvRegion.setId(1);
		nvRegion.setNom("Occitanie");
		em.persist(nvRegion);
		
		
		Calendar cal = Calendar.getInstance();
		cal.set(2015, 5, 18);
		
		Ville ville = new Ville();
		ville.setNom("Montpellier");
		ville.setCodePostal(34000);
		ville.setDernierRecensement(cal.getTime());
		ville.setCategorie(Categorie.GRANDE);
		ville.setRegion(nvRegion);
		em.persist(ville);
		
		Habitant habitant = new Habitant();
		habitant.setNom("Dupond");
		habitant.setPrenom("ManyToMany");
		em.persist(habitant);
		
		ville.getHabitants().add(habitant);

		transaction.commit();
	}

}
