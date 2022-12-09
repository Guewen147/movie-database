package dto;

public class RoleDto {

	private String characterName;
	
	private ActeurDto acteur;


	/**
	 * @param characterName
	 * @param acteur
	 */
	public RoleDto(String characterName, ActeurDto acteur) {
		super();
		this.characterName = characterName;
		this.acteur = acteur;
	}

	/**
	 * @return the characterName
	 */
	public String getCharacterName() {
		return characterName;
	}

	/**
	 * @param characterName the characterName to set
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	/**
	 * @return the acteur
	 */
	public ActeurDto getActeur() {
		return acteur;
	}

	/**
	 * @param acteur the acteur to set
	 */
	public void setActeur(ActeurDto acteur) {
		this.acteur = acteur;
	}

	
	
	
	
}
