package entite;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "LIEU")
public class Lieu {

	/** Id du lieu */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/** Ville du lieu */
	@Column(name = "VILLE")
	private String ville;
	
	
	/** Etat ou Departement du lieu */
	@Column(name = "ETAT_DEPT")
	private String etatDept;
	
	/** Pays du lieu */
	@Column(name = "PAYS")
	private Pays pays;
	
	@OneToMany(mappedBy="naissance")
	private List<Acteur> acteursN = new ArrayList<Acteur>();
	
	@ManyToMany(mappedBy="lieux")
	private List<Film> filmsL = new ArrayList<Film>();

	
	/**
	 * @param id
	 * @param ville
	 * @param etatDept
	 * @param pays
	 * @param acteursN
	 * @param filmsL
	 */
	public Lieu(int id, String ville, String etatDept, Pays pays, List<Acteur> acteursN, List<Film> filmsL) {
		super();
		this.id = id;
		this.ville = ville;
		this.etatDept = etatDept;
		this.pays = pays;
		this.acteursN = acteursN;
		this.filmsL = filmsL;
	}

	

	/**
	 * @param ville
	 * @param etatDept
	 * @param pays
	 */
	public Lieu(String ville, String etatDept, Pays pays) {
		super();
		this.ville = ville;
		this.etatDept = etatDept;
		this.pays = pays;
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
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @return the etatDept
	 */
	public String getEtatDept() {
		return etatDept;
	}

	/**
	 * @param etatDept the etatDept to set
	 */
	public void setEtatDept(String etatDept) {
		this.etatDept = etatDept;
	}

	/**
	 * @return the pays
	 */
	public Pays getPays() {
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(Pays pays) {
		this.pays = pays;
	}

	/**
	 * @return the acteursN
	 */
	public List<Acteur> getActeursN() {
		return acteursN;
	}

	/**
	 * @param acteursN the acteursN to set
	 */
	public void setActeursN(List<Acteur> acteursN) {
		this.acteursN = acteursN;
	}

	/**
	 * @return the filmsL
	 */
	public List<Film> getFilmsL() {
		return filmsL;
	}

	/**
	 * @param filmsL the filmsL to set
	 */
	public void setFilmsL(List<Film> filmsL) {
		this.filmsL = filmsL;
	}
}
