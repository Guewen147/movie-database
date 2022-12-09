package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


import entite.Genre;

public class GenreDao {

	public static Genre getGenreD(String libelle, EntityManager em) {
		TypedQuery<Genre> qGenre = em.createQuery("SELECT g FROM Genre g WHERE g.libelle = :param1",
				Genre.class);
		qGenre.setParameter("param1", libelle);
		List<Genre> genresR = qGenre.getResultList();
	
	
	if (genresR.size() == 0) {
		return null;
	} else {
		return genresR.get(0);
	}
}
	public static void selectCreate(Genre genre, EntityManager em) {
		Genre q = getGenreD(genre.getLibelle(), em);
		if (q == null) {
			em.persist(genre);
		} else {
			genre.setId(q.getId());
		}
	}
}
