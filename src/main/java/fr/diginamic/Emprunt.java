package fr.diginamic;
//ID, DATE_DEBUT, DELAI, DATE_FIN, ID_CLIENT

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Emprunt {

	@Id
	private int id;
	
	// un client peut avoir plusieurs emprunts
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;
	
	// va permettre d’extraire un emprunt en fonction son id avec tous les livres associés
	@ManyToMany
	@JoinTable(name = "COMPO", 
		joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"), 
		inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))
	private List<Livre> livres = new ArrayList<Livre>();
	
	// si ManyToMany dans la classe Livre mais ici un mappedBy 
	// relation maitre exclave
	// @ManyToMany(mappedBy = "emprunts")
	// private List<Livre> livres = new ArrayList<Livre>;
	
	@Column(name = "DATE_DEBUT")
	@Temporal(value = TemporalType.DATE)
	private Date dateDebut;
	
	@Column(name = "DELAI")
	private Integer delai;
	
	@Column(name = "DATE_FIN")
	@Temporal(value = TemporalType.DATE)
	private Date dateFin;

	public Emprunt() {;
	}

	@Override
	public String toString() {
		return "Emprunt [id = " + id + ", dateDebut = " + dateDebut + ", delai = " + delai + ", dateFin = " + dateFin + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	public Integer getDelai() {
		return delai;
	}

	public void setDelai(Integer delai) {
		this.delai = delai;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}


	
	
	
	
}
