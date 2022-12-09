

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.fasterxml.jackson.core.exc.StreamReadException;

import dao.ActeurDao;
import dao.GenreDao;
import dao.LieuDao;
import dao.PaysDao;
import dao.RealisateurDao;
import dao.RoleDao;
import entite.Acteur;
import entite.Film;
import entite.Genre;
import entite.Realisateur;
import entite.Role;
import utils.MovieDatabase;

public class Integration {

	
	/**
	 * @param args
	 * @throws IOException
	 * @throws DatabindException
	 * @throws StreamReadException
	 */
	public static void main(String[] args) throws StreamReadException, IOException {

		MovieDatabase moviedb = new MovieDatabase();

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("movie-database");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		for (Film films : moviedb.getListefilms()) {
			transaction.begin();
			
			if (films.getPaysF() != null) {
				PaysDao.selectCreate(films.getPaysF(), em);
			}
			if (films.getLieuTournage() != null) {
				PaysDao.selectCreate(films.getLieuTournage().getPays(), em);
				LieuDao.selectCreate(films.getLieuTournage(), em);
			}




			for (Genre genres : films.getGenreF()) {

				GenreDao.selectCreate(genres, em);
			}

			for (Realisateur realisateurs : films.getRealisateurs()) {


				RealisateurDao.selectCreate(realisateurs, em);
			}


			for (Acteur acteurs : films.getActeurs()) {


				PaysDao.selectCreate(acteurs.getNaissance().getPays(), em);
				LieuDao.selectCreate(acteurs.getNaissance(), em);
				ActeurDao.selectCreate(acteurs, em);

			}
			for (Role roles : films.getRolesF()) {

				for (Acteur acteurs : roles.getActeursR()) {
					if(acteurs.getNaissance()  != null) {
				    PaysDao.selectCreate(acteurs.getNaissance().getPays(), em);
					LieuDao.selectCreate(acteurs.getNaissance(), em);
					}

					ActeurDao.selectCreate(acteurs, em);
				}

				RoleDao.selectCreate(roles, em);

			}


			em.persist(films);

			transaction.commit();
		}
	}
}
