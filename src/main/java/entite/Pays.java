package entite;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "PAYS")
public class Pays {

	/** ID du Pays */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/** Nom du Pays */
	@Column(name = "NOM")
	private String nom;
	
	/** Url du Pays */
	@Column(name = "URL")
	private String url;
	
	@OneToMany(mappedBy="paysF")
	private List<Film> filmsP = new ArrayList<Film>();

	
	

	/**
	 * @param id
	 * @param nom
	 * @param url
	 * @param filmsP
	 */
	public Pays(int id, String nom, String url, List<Film> filmsP) {
		this.nom = nom;
		this.url = url;
		this.filmsP = filmsP;
	}

	
	/**
	 * @param nom
	 * @param url
	 */
	public Pays(String nom, String url) {
		super();
		this.nom = nom;
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
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
	 * @return the filmsP
	 */
	public List<Film> getFilmsP() {
		return filmsP;
	}

	/**
	 * @param filmsP the filmsP to set
	 */
	public void setFilmsP(List<Film> filmsP) {
		this.filmsP = filmsP;
	}	
	
}
