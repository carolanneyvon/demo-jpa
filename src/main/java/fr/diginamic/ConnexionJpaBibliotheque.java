package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnexionJpaBibliotheque {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();

		// TP 02
		Livre livre = em.find(Livre.class, 1);
		if (livre != null) {
			System.out.println("Livre associé à l'id :\n" + livre);
		}
		
		// liste des emprunts associé au livre
		// for (Emprunt emp: livre.getEmprunts()){
		// System.out.println(emp);
		//}
		
		// TP 03
		// extrait un emprunt en fonction son id avec les livres associés
		Emprunt emprunt = em.find(Emprunt.class, 1);
		if (emprunt != null) {
			System.out.println("Liste des livres d'un emprunt donné :\n" + emprunt.getLivres());
		}
		
		// TP 03
		// requête qui permet d’extraire tous les emprunts d’un client donné
		Client client = em.find(Client.class, 1);
		if (client != null) {
			System.out.println("Liste des emprunts d'un client donné :\n" + client.getEmprunts());
		}

	}

}
