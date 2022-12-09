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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "FILM")
public class Film {
	
	/** Id du Film */
	@Id
	@Column(name = "ID")
	private String id;
	
	/** Nom du Film */
	@Column(name = "NOM")
	private String nom;
	
	/** Url vers le Film */
	@Column(name = "URL")
	private String url;
	
	/** Synopsis du Film */
	@Column(name = "PLOT")
	private String plot;
	
	/** Langue du Film */
	@Column(name = "LANGUE")
	private String langue;
	
	/** Année de Sortie du Film */
	@Column(name = "ANNEE_SORTIE")
	private String anneeSortie;
	
	/** Genres du Film */
	@ManyToMany
	@JoinTable(name = "FILM_GENRE",
				uniqueConstraints = @UniqueConstraint (columnNames = { "ID_FIL", "ID_GEN" }),
				joinColumns = @JoinColumn(name= "ID_FIL" , referencedColumnName ="ID"),
				inverseJoinColumns = @JoinColumn(name= "ID_GEN", referencedColumnName = "ID"))
	private  List<Genre> genreF = new ArrayList<Genre>();
	
	@ManyToMany
	@JoinTable(name = "FILM_ACTEUR",
				uniqueConstraints = @UniqueConstraint (columnNames = { "ID_FIL", "ID_ACT" }),
				joinColumns = @JoinColumn(name= "ID_FIL" , referencedColumnName ="ID"),
				inverseJoinColumns = @JoinColumn(name= "ID_ACT", referencedColumnName = "ID"))
	private  List<Acteur> acteurs = new ArrayList<Acteur>();

	@ManyToOne
	@JoinColumn(name = "FILM_LIEU")
	private  Lieu lieuTournage;
	
	@ManyToMany
	@JoinTable(name = "FILM_ROLES",
				uniqueConstraints = @UniqueConstraint (columnNames = { "ID_FIL", "ID_ROL" }),
				joinColumns = @JoinColumn(name= "ID_FIL" , referencedColumnName ="ID"),
				inverseJoinColumns = @JoinColumn(name= "ID_ROL", referencedColumnName = "ID"))
	private  List<Role> rolesF = new ArrayList<Role>();
	
	@ManyToOne
	@JoinColumn(name="ID_PAY")
	private Pays paysF; 
	
	@OneToMany(mappedBy="filmDeRealisateur")
	private List<Realisateur> realisateurs = new ArrayList<Realisateur>();

	

	/**
	 * @param id
	 * @param nom
	 * @param url
	 * @param plot
	 * @param langue
	 * @param anneeSortie
	 * @param genreF
	 * @param acteurs
	 * @param lieuTournage
	 * @param rolesF
	 * @param paysF
	 * @param realisateurs
	 */
	public Film(String id, String nom, String url, String plot, String langue, String anneeSortie, List<Genre> genreF,
			List<Acteur> acteurs, Lieu lieuTournage, List<Role> rolesF, Pays paysF, List<Realisateur> realisateurs) {
		super();
		this.id = id;
		this.nom = nom;
		this.url = url;
		this.plot = plot;
		this.langue = langue;
		this.anneeSortie = anneeSortie;
		this.paysF = paysF;
		this.genreF = genreF;
		this.acteurs = acteurs;
		this.lieuTournage = lieuTournage;
		this.rolesF = rolesF;
		
		this.realisateurs = realisateurs;
	}

	public Film(String id, String nom, String url, String plot, String langue, String anneeSortie,
			Pays paysDtoToPays, Lieu lieuDtoToLieu, List<Genre> genreDtoListToGenreList,
			List<Role> roleDtoListToRoleList, List<Acteur> acteurDtoListToActeurList,
			List<Realisateur> realisateurDtoListToRealisateurList) {
		// TODO Auto-generated constructor stub
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
	 * @return the plot
	 */
	public String getPlot() {
		return plot;
	}

	/**
	 * @param plot the plot to set
	 */
	public void setPlot(String plot) {
		this.plot = plot;
	}

	/**
	 * @return the langue
	 */
	public String getLangue() {
		return langue;
	}

	/**
	 * @param langue the langue to set
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}

	/**
	 * @return the anneeSortie
	 */
	public String getAnneeSortie() {
		return anneeSortie;
	}

	/**
	 * @param anneeSortie the anneeSortie to set
	 */
	public void setAnneeSortie(String anneeSortie) {
		this.anneeSortie = anneeSortie;
	}

	/**
	 * @return the genreF
	 */
	public List<Genre> getGenreF() {
		return genreF;
	}

	/**
	 * @param genreF the genreF to set
	 */
	public void setGenreF(List<Genre> genreF) {
		this.genreF = genreF;
	}

	/**
	 * @return the acteurs
	 */
	public List<Acteur> getActeurs() {
		return acteurs;
	}

	/**
	 * @param acteurs the acteurs to set
	 */
	public void setActeurs(List<Acteur> acteurs) {
		this.acteurs = acteurs;
	}

	

	/**
	 * @return the lieuTournage
	 */
	public Lieu getLieuTournage() {
		return lieuTournage;
	}

	/**
	 * @param lieuTournage the lieuTournage to set
	 */
	public void setLieuTournage(Lieu lieuTournage) {
		this.lieuTournage = lieuTournage;
	}

	/**
	 * @return the rolesF
	 */
	public List<Role> getRolesF() {
		return rolesF;
	}

	/**
	 * @param rolesF the rolesF to set
	 */
	public void setRolesF(List<Role> rolesF) {
		this.rolesF = rolesF;
	}

	/**
	 * @return the paysF
	 */
	public Pays getPaysF() {
		return paysF;
	}

	/**
	 * @param paysF the paysF to set
	 */
	public void setPaysF(Pays paysF) {
		this.paysF = paysF;
	}

	/**
	 * @return the realisateurs
	 */
	public List<Realisateur> getRealisateurs() {
		return realisateurs;
	}

	/**
	 * @param realisateurs the realisateurs to set
	 */
	public void setRealisateurs(List<Realisateur> realisateurs) {
		this.realisateurs = realisateurs;
	}
	
}
