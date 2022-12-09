package dto;

import java.util.ArrayList;
import java.util.List;

public class ActeurDto {

	private String id;
	
	private String identite;
	
	private String dateNaissance;
	
	private LieuDto lieuNaissance;
	
	private String url;
	
	private String heigth;
	
	private List<RoleDto> roles =  new ArrayList<RoleDto>();

	

	/**
	 * @param id
	 * @param identite
	 * @param dateNaissance
	 * @param lieuNaissance
	 * @param url
	 * @param heigth
	 * @param roles
	 */
	public ActeurDto(String id, String identite, String dateNaissance, LieuDto lieuNaissance, String url, String heigth,
			List<RoleDto> roles) {
		super();
		this.id = id;
		this.identite = identite;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.url = url;
		this.heigth = heigth;
		this.roles = roles;
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
	 * @return the lieuNaissance
	 */
	public LieuDto getLieuNaissance() {
		return lieuNaissance;
	}

	/**
	 * @param lieuNaissance the lieuNaissance to set
	 */
	public void setLieuNaissance(LieuDto lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
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
	 * @return the heigth
	 */
	public String getHeigth() {
		return heigth;
	}

	/**
	 * @param heigth the heigth to set
	 */
	public void setHeigth(String heigth) {
		this.heigth = heigth;
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

	
	
	
	
}
