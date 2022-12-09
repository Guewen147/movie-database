package entite;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "REALISATEUR")
public class Realisateur {

	/** ID du realisateur */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/** Identite/Nom du Réalisateur */
	@Column(name = "IDENTITE")
	private String identite;
	
	/** Url vers une page presentant le réalisateur */
	@Column(name = "URL")
	private String url;
	
	@ManyToOne
	@JoinColumn(name="ID_FIL")
	private Film filmDeRéalisateur;

	

	
	/**
	 * @param id
	 * @param identite
	 * @param url
	 * @param filmDeRéalisateur
	 */
	public Realisateur(int id, String identite, String url, Film filmDeRéalisateur) {
		super();
		this.id = id;
		this.identite = identite;
		this.url = url;
		this.filmDeRéalisateur = filmDeRéalisateur;
	}
	
	

	/**
	 * @param identite
	 * @param url
	 */
	public Realisateur(String identite, String url) {
		super();
		this.identite = identite;
		this.url = url;
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the identite
	 */
	public String getIdentite() {
		return identite;
	}

	/**
	 * @param identite the identite to set
	 */
	public void setIdentite(String identite) {
		this.identite = identite;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the filmDeRéalisateur
	 */
	public Film getFilmDeRéalisateur() {
		return filmDeRéalisateur;
	}

	/**
	 * @param filmDeRéalisateur the filmDeRéalisateur to set
	 */
	public void setFilmDeRéalisateur(Film filmDeRéalisateur) {
		this.filmDeRéalisateur = filmDeRéalisateur;
	} 
	
	
}
