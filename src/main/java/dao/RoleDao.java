package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entite.Role;

public class RoleDao {
		
		public static Role getRoleD(String characterName, String acteur, EntityManager em) {
			TypedQuery<Role> qRole = em.createQuery("SELECT r FROM Role r JOIN r.acteurs a WHERE r.characterName = :param1 AND a.identite = :param2",
					Role.class);
			qRole.setParameter("param1", characterName);
			qRole.setParameter("param2", acteur);
			List<Role> rolesR = qRole.getResultList();
		
		
		if (rolesR.size() == 0) {
			return null;
		} else {
			return rolesR.get(0);
		}
	}
		public static void selectCreate(Role role, EntityManager em) {
			Role q = getRoleD(role.getCharacterName(), role.getActeursR().iterator().next().getIdentite(),em);
			if (q == null) {
				em.persist(role);
			} else {
				role.setId(q.getId());
			}
		}
}
