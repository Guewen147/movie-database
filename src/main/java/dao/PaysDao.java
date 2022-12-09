package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entite.Pays;

public class PaysDao {

	public static Pays getPaysD(String nom, EntityManager em) {
		TypedQuery<Pays> qPays = em.createQuery("SELECT p FROM Pays p WHERE p.nom = :param1", Pays.class);
		qPays.setParameter("param1", nom);
		List<Pays> paysR = qPays.getResultList();

		if (paysR.size() == 0) {
			return null;
		} else {
			return paysR.get(0);
		}
	}
	
	public static void selectCreate(Pays pays, EntityManager em) {
		Pays q = getPaysD(pays.getNom(), em);
		if (q == null) {
			em.persist(pays);
		} else {
			pays.setId(q.getId());
		}
	}
}
