package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entite.Acteur;

public class ActeurDao {

	public static Acteur getActeurD(String identite, EntityManager em) {
		TypedQuery<Acteur> qActeur = em.createQuery("SELECT a FROM Acteur a WHERE a.identite = :param1",
				Acteur.class);
		qActeur.setParameter("param1", identite);
		List<Acteur> acteursR = qActeur.getResultList();
		
		if (acteursR.size() == 0) {
			return null;
		} else {
			return acteursR.get(0);
		}
	}
	
	public static void selectCreate(Acteur acteur, EntityManager em) {
		Acteur q = getActeurD(acteur.getIdentite(), em);
		if (q == null) {
			em.persist(acteur);
		} else {
			acteur.setId(q.getId());
		}
	}
}
