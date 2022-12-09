package dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class FilmDto {

	private String id;
	
	private String nom;
	
	private String url;
	
	private String plot;
	
	private String langue;
	
	private String anneeSortie;
	
	private PaysDto pays;
	
	private LieuDto lieuTournage;
	
	private List<GenreDto> genres = new ArrayList<GenreDto>();
	
	private List<RoleDto> roles = new ArrayList<RoleDto>();
	
	@JsonProperty("castingPrincipal")
	private List<ActeurDto> acteurs = new ArrayList<ActeurDto>();
	
	private List<RealisateurDto> realisateurs = new ArrayList<RealisateurDto>();

	/**
	 * Constructeur
	 * @param id
	 * @param nom
	 * @param url
	 * @param plot
	 * @param langue
	 * @param anneeSortie
	 * @param genres
	 * @param acteurs
	 * @param lieuTournage
	 * @param roles
	 * @param pays
	 * @param realisateurs
	 */
	public FilmDto(String id, String nom, String url, String plot, String langue, String anneeSortie,
			List<GenreDto> genres, List<ActeurDto> acteurs, LieuDto lieuTournage, List<RoleDto> roles, PaysDto pays,
			List<RealisateurDto> realisateurs) {
		super();
		this.id = id;
		this.nom = nom;
		this.url = url;
		this.plot = plot;
		this.langue = langue;
		this.anneeSortie = anneeSortie;
		this.genres = genres;
		this.acteurs = acteurs;
		this.lieuTournage = lieuTournage;
		this.roles = roles;
		this.pays = pays;
		this.realisateurs = realisateurs;
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
	 * @return the genres
	 */
	public List<GenreDto> getGenres() {
		return genres;
	}

	/**
	 * @param genres the genres to set
	 */
	public void setGenres(List<GenreDto> genres) {
		this.genres = genres;
	}

	/**
	 * @return the acteurs
	 */
	public List<ActeurDto> getActeurs() {
		return acteurs;
	}

	/**
	 * @param acteurs the acteurs to set
	 */
	public void setActeurs(List<ActeurDto> acteurs) {
		this.acteurs = acteurs;
	}

	/**
	 * @return the lieuTournage
	 */
	public LieuDto getLieuTournage() {
		return lieuTournage;
	}

	/**
	 * @param lieuTournage the lieuTournage to set
	 */
	public void setLieuTournage(LieuDto lieuTournage) {
		this.lieuTournage = lieuTournage;
	}

	/**
	 * @return the roles
	 */
	public List<RoleDto> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<RoleDto> roles) {
		this.roles = roles;
	}

	/**
	 * @return the pays
	 */
	public PaysDto getPays() {
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(PaysDto pays) {
		this.pays = pays;
	}

	/**
	 * @return the realisateurs
	 */
	public List<RealisateurDto> getRealisateurs() {
		return realisateurs;
	}

	/**
	 * @param realisateurs the realisateurs to set
	 */
	public void setRealisateurs(List<RealisateurDto> realisateurs) {
		this.realisateurs = realisateurs;
	}
	
	
	
}
