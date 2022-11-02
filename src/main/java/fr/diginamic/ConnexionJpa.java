package fr.diginamic;

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
		nvRegion.setId(3);
		nvRegion.setNom("Auvergne Rhône-Alpes");
		em.persist(nvRegion);

		transaction.commit();
	}

}
