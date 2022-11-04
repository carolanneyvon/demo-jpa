package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// ID, NOM et PRENOM

@Entity
@Table
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column (name = "NOM")
	private String nom;
	
	@Column (name = "PRENOM")
	private String prenom;

	// un client peut avoir plusieurs emprunts
	// mappedBy est le nom de l'attribut qui ce trouve dans Emprunt dans le ManyToOne
	@OneToMany(mappedBy = "client")
	private List<Emprunt> emprunts = new ArrayList<Emprunt>();
	
	public Client() {
	}

	@Override
	public String toString() {
		return "Client [id = " + id + ", nom = " + nom + ", prenom = " + prenom + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Emprunt> getEmprunts() {
		return emprunts;
	}

	public void setEmprunts(List<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}
	
	
	
	
}
