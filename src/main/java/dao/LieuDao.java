package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entite.Lieu;

public class LieuDao {

	public static Lieu getLieuD(String libelle, String etatDept, String nom, EntityManager em) {
		TypedQuery<Lieu> qLieu = em.createQuery(
				"SELECT l FROM Lieu l WHERE l.libelle= :param1 AND l.complement= :param2 AND l.pays.nom = :param3",
				Lieu.class);
		qLieu.setParameter("param1", libelle);
		qLieu.setParameter("param2", etatDept);
		qLieu.setParameter("param3", nom);
		List<Lieu> lieuR = qLieu.getResultList();

		if (lieuR.size() == 0) {
			return null;
		} else {
			return lieuR.get(0);
		}
	}

	public static void selectCreate(Lieu lieu, EntityManager em) {
			Lieu q = getLieuD(lieu.getVille(), lieu.getEtatDept(), lieu.getPays().getNom(), em);
			if (q == null) {
				em.persist(lieu);
			} else {
				lieu.setId(q.getId());
			}
		}

	}
