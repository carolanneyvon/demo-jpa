package fr.diginamic;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name="region")

public class Region {

	@Id
	private Integer id;
	
	@Column(name = "NOM", length = 20, nullable = true, unique = false)
	private String nom;
	
	@OneToMany(mappedBy = "region")
	private List<Ville> villes = new ArrayList<Ville>();
	
	/** Constructeur sans argument */
	public Region() {
	}

//	/**
//	 * @param id
//	 * @param nom
//	 */
//	public Region(Integer id, String nom) {
//		this.id = id;
//		this.nom = nom;
//	}



	@Override
	public String toString() {
		return "Region [id=" + id + ", nom=" + nom + "]";
	}


	/** Getter
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
