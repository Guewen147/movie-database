package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entite.Realisateur;

public class RealisateurDao {

	public static Realisateur getRealisateurD(String identite, EntityManager em) {
		TypedQuery<Realisateur> qRealisateur = em.createQuery("SELECT real FROM Realisateur real WHERE real.identite = :param1",
				Realisateur.class);
		qRealisateur.setParameter("param1", identite);
		List<Realisateur> realisateursR = qRealisateur.getResultList();
	
	
	if (realisateursR.size() == 0) {
		return null;
	} else {
		return realisateursR.get(0);
	}
}
	public static void selectCreate(Realisateur realisateur, EntityManager em) {
		Realisateur q = getRealisateurD(realisateur.getIdentite(), em);
		if (q == null) {
			em.persist(realisateur);
		} else {
			realisateur.setId(q.getId());
		}
	}
}
