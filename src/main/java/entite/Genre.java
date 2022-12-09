package entite;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GENRE")
public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "LIBELLE")
	private String libelle;
	
	@ManyToMany(mappedBy = "genres")
	private List<Film> filmG = new ArrayList<Film>();

	
	/**
	 * @param id
	 * @param libelle
	 * @param filmG
	 */
	public Genre(int id, String libelle, List<Film> filmG) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.filmG = filmG;
	}
	
	

	/**
	 * @param libelle
	 */
	public Genre(String libelle) {
		super();
		this.libelle = libelle;
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
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the filmG
	 */
	public List<Film> getFilmG() {
		return filmG;
	}

	/**
	 * @param filmG the filmG to set
	 */
	public void setFilmG(List<Film> filmG) {
		this.filmG = filmG;
	}
	
	
	

}
