package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Livre {

	@Id
	private Integer id;
	
	@Column(name="TITRE", length = 255, nullable = false, unique = false)
	private String titre;
	
	@Column(name="AUTEUR", length = 50, nullable = false, unique = false)
	private String auteur;
	
	/** Constructeur sans argument */
	public Livre() {
	}

	@Override
	public String toString() {
		return "Livre [id = " + id + ", titre = " + titre + ", auteur = " + auteur + "]";
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
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/** Setter
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/** Getter
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/** Setter
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	

}
