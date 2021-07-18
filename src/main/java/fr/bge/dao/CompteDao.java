package fr.bge.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import fr.bge.facilities.JpaUtils;
import fr.bge.jpa.EntityManagerSingleton;
import fr.bge.model.Compte;
import fr.bge.model.Compte_;

public class CompteDao implements CRUDable<Compte, Long> {

	private final static CompteDao INSTANCE = new CompteDao();

	private EntityManager em = EntityManagerSingleton.getInstance().getEntityManager();

	private CompteDao() {

	}

	public static CompteDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(Compte obj) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(obj);
			this.em.getTransaction().commit();
			return obj.getCompte();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Compte get(Long id) {
		try {
			this.em.getTransaction().begin();
			Compte compte = this.em.find(Compte.class, id);
			this.em.getTransaction().commit();
			return compte;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Compte remove(Long id) {
		try {
			this.em.getTransaction().begin();
			Compte compte = this.em.find(Compte.class, id);
			this.em.remove(compte);

			this.em.getTransaction().commit();
			return compte;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}

	}

	@Override
	public List<Compte> select() {
		try {
			CriteriaBuilder builder = this.em.getCriteriaBuilder();
			CriteriaQuery<Compte> criteriaQuery = builder.createQuery(Compte.class);
			return this.em.createQuery(criteriaQuery).getResultList();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public void update(Compte obj) {
		try {
			this.em.getTransaction().begin();
			this.em.merge(obj);
			this.em.getTransaction().commit();

		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}

	}

	/**
	 * Vérifier si le mail correspond à un Compte existant.
	 * 
	 * @param mail
	 * @return
	 */
	public boolean exist(String mail) {
		return JpaUtils.exist(Compte.class, Compte_.email, mail, this.em);
	}

	public Compte findByEmail(String email) {
		Compte compte;
		try {
			CriteriaBuilder builder = em.getCriteriaBuilder();

			CriteriaQuery<Compte> query = builder.createQuery(Compte.class);
			Root<Compte> root = query.from(Compte.class);

			query.where(builder.equal(root.get(Compte_.email).as(String.class), email));

			compte = em.createQuery(query).getSingleResult();

		} catch (NoResultException e) {
			// permet de ne pas envoyer une exception traversant toutes les couches
			return null;
		}
		return compte;
	}

	public boolean login(String email, String motDePasse) {
		System.out.println("Le mot de passe qu'on va vérifier dans la BDD " + motDePasse);
		try {
			CriteriaBuilder builder = em.getCriteriaBuilder();

			CriteriaQuery<Compte> query = builder.createQuery(Compte.class);
			Root<Compte> root = query.from(Compte.class);

			query.where(builder.and(builder.equal(root.get(Compte_.email).as(String.class), email),
					builder.equal(root.get(Compte_.motDePasse).as(String.class), motDePasse)));

			em.createQuery(query).getSingleResult();

		} catch (NoResultException e) {

			return false;
		}
		return true;
	}

}
