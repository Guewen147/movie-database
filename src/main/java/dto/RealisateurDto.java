package dto;

public class RealisateurDto {
	
	private String identite;

	private String url;

	/**
	 * @param identite
	 * @param url
	 */
	public RealisateurDto(String identite, String url) {
		super();
		this.identite = identite;
		this.url = url;
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
	
	

}
