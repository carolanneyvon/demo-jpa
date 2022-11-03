package fr.diginamic;

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
	
	
	
	
}
