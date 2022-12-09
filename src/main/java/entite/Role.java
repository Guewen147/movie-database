package entite;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name = "ROLE")
public class Role {
	
	/** Id du Role */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/** Nom du Role */
	@Column(name = "CHARACTER_NAME")
	private String characterName;
	
	@ManyToMany(mappedBy="roles")
	private List<Acteur> acteursR = new ArrayList<Acteur>();

	

	/**
	 * @param id
	 * @param characterName
	 * @param acteursR
	 */
	public Role(int id, String characterName, List<Acteur> acteursR) {
		super();
		this.id = id;
		this.characterName = characterName;
		this.acteursR = acteursR;
	}
	
	

	


	/**
	 * @param characterName
	 */
	public Role(String characterName) {
		super();
		this.characterName = characterName;
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
	 * @return the acteursR
	 */
	public List<Acteur> getActeursR() {
		return acteursR;
	}

	/**
	 * @param acteursR the acteursR to set
	 */
	public void setActeursR(List<Acteur> acteursR) {
		this.acteursR = acteursR;
	}

	
}
