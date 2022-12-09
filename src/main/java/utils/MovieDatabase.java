package utils;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entite.Film;

import com.fasterxml.jackson.core.exc.StreamReadException;




public class MovieDatabase {

	private List<Film> Listefilms = new ArrayList<Film>();

	/**
	 * Constructeur
	 * @param films
	 * @throws IOException 
	 * @throws DatabindException 
	 * @throws StreamReadException 
	 */
	public MovieDatabase() throws StreamReadException, IOException {
		this.Listefilms = Reader.movieDatabaseGenerate();
	}

	public List<Film> getListefilms() {
		return Listefilms;
	}

	public void setListefilms(List<Film> listefilms) {
		Listefilms = listefilms;
	}
}
