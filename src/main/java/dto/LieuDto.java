package dto;

public class LieuDto {

	private String ville;
	
	private String etatDept;
	
	private PaysDto pays;

	/**
	 * @param ville
	 * @param etatDept
	 * @param pays
	 */
	public LieuDto(String ville, String etatDept, PaysDto pays) {
		super();
		this.ville = ville;
		this.etatDept = etatDept;
		this.pays = pays;
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
	public PaysDto getPays() {
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(PaysDto pays) {
		this.pays = pays;
	}
	
	
}
