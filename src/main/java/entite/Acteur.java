package entite;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "ACTEUR")
public class Acteur {

	/** Id de l'acteur */
	@Id
	@Column(name = "ID")
	private String id;
	
	/** Identite/Nom de l'acteur */
	@Column(name = "IDENTITE")
	private String identite;
	
	/** Url vers une page presentant l'acteur */
	@Column(name = "URL")
	private String url;
	
	/** Taille de l'acteur */
	@Column(name = "HEIGHT")
	private String height;
	
	/** Date de Naissance de l'acteur */
	@Column(name = "DATE_NAISSANCE")
	private String dateNaissance;
	
	@ManyToMany(mappedBy="acteurs")
	private List<Film> filmsA = new ArrayList<Film>();
	
	@ManyToMany
	@JoinTable(name = "ROLE_ACTEUR",
				uniqueConstraints = @UniqueConstraint (columnNames = { "ID_ACT", "ID_ROL" }),
				joinColumns = @JoinColumn(name= "ID_ACT" , referencedColumnName ="ID"),
				inverseJoinColumns = @JoinColumn(name= "ID_ROL", referencedColumnName = "ID"))
	private  List<Role> rolesA = new ArrayList<Role>();
	
	@ManyToOne
	@JoinColumn(name="ID_LIE")
	private Lieu naissance;

	

	/**
	 * @param id
	 * @param identite
	 * @param url
	 * @param height
	 * @param dateNaissance
	 * @param filmsA
	 * @param rolesA
	 * @param naissance
	 */
	public Acteur(String id, String identite, String url, String height, String dateNaissance, List<Film> filmsA,
			List<Role> rolesA, Lieu naissance) {
		super();
		this.id = id;
		this.identite = identite;
		this.url = url;
		this.height = height;
		this.dateNaissance = dateNaissance;
		this.filmsA = filmsA;
		this.rolesA = rolesA;
		this.naissance = naissance;
	}
	
	

	/**
	 * @param id
	 * @param identite
	 * @param url
	 * @param height
	 * @param dateNaissance
	 * @param naissance
	 */
	public Acteur(String id, String identite, String url, String height, String dateNaissance, Lieu naissance) {
		super();
		this.id = id;
		this.identite = identite;
		this.url = url;
		this.height = height;
		this.dateNaissance = dateNaissance;
		this.naissance = naissance;
	}



	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
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
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	/**
	 * @return the dateNaissance
	 */
	public String getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @return the filmsA
	 */
	public List<Film> getFilmsA() {
		return filmsA;
	}

	/**
	 * @param filmsA the filmsA to set
	 */
	public void setFilmsA(List<Film> filmsA) {
		this.filmsA = filmsA;
	}

	/**
	 * @return the rolesA
	 */
	public List<Role> getRolesA() {
		return rolesA;
	}

	/**
	 * @param rolesA the rolesA to set
	 */
	public void setRolesA(List<Role> rolesA) {
		this.rolesA = rolesA;
	}

	/**
	 * @return the naissance
	 */
	public Lieu getNaissance() {
		return naissance;
	}

	/**
	 * @param naissance the naissance to set
	 */
	public void setNaissance(Lieu naissance) {
		this.naissance = naissance;
	} 	
	
}
