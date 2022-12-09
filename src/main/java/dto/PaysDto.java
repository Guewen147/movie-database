package dto;

public class PaysDto {

	private String nom;
	
	private String url;

	/**
	 * @param nom
	 * @param url
	 */
	public PaysDto(String nom, String url) {
		super();
		this.nom = nom;
		this.url = url;
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
	
	
}
