package fr.diginamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ville")
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOM", length = 20, nullable = false, unique = false)
	private String nom;

	@Column(name = "CODE_POSTAL", length = 6, nullable = false, unique = false)
	private int codePostal;

	@Column(name = "DERNIER_RECENSEMENT", nullable = true, unique = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dernierRecensement;

	@Column(name = "CATEGORIE", nullable = true, unique = false)
	@Enumerated(value = EnumType.STRING)
	private Categorie categorie;

	@ManyToOne()
	@JoinColumn(name = "REGION_ID")
	private Region region;

	@ManyToMany
	@JoinTable(name = "LIEN_VILLE_HABITANT", 
		joinColumns = @JoinColumn(name = "ID_VILLE", referencedColumnName = "ID"), 
		inverseJoinColumns = @JoinColumn(name = "IH_HABITANT", referencedColumnName = "ID"))
	private List<Habitant> habitants = new ArrayList<Habitant>();

	/** Constructeur sans argument */
	public Ville() {
	}

	@Override
	public String toString() {
		return "Ville [id=" + id + ", nom=" + nom + ", codePostal=" + codePostal + ", dernierRecensement="
				+ dernierRecensement + ", categorie=" + categorie + "]";
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * Setter
	 * 
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Getter
	 * 
	 * @return the dernierRecensement
	 */
	public Date getDernierRecensement() {
		return dernierRecensement;
	}

	/**
	 * Setter
	 * 
	 * @param dernierRecensement the dernierRecensement to set
	 */
	public void setDernierRecensement(Date dernierRecensement) {
		this.dernierRecensement = dernierRecensement;
	}

	/**
	 * Getter
	 * 
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * Setter
	 * 
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	/**
	 * Getter
	 * 
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}

	/**
	 * Setter
	 * 
	 * @param region the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
	}

	public List<Habitant> getHabitants() {
		return habitants;
	}

	public void setHabitants(List<Habitant> habitants) {
		this.habitants = habitants;
	}

}
