package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Embeddable;

// la table Adresse sera intégrée à la table Habitant
@Embeddable
public class Adresse {
	
	// pour un Embeddable, on supprime @Id
	// car Adresse n'a plus sa propre adresse
	
	@Column(name = "CODE_POSTAL")
	private int codePostal;
	
	@Column(name = "RUE")
	private String rue;
	
	@Column(name = "VILLE")
	private String ville;

	
	@Override
	public String toString() {
		return "Adresse [codePostal=" + codePostal + ", rue=" + rue + ", ville=" + ville + "]";
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	

}
