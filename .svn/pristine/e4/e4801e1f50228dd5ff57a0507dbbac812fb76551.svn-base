package fr.bge.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import fr.bge.jpa.EntityManagerSingleton;
import fr.bge.model.Formateur;
import fr.bge.model.Formateur_;

public class FormateurDao implements CRUDable<Formateur, Long> {

	private final static FormateurDao INSTANCE = new FormateurDao();

	private EntityManager em = EntityManagerSingleton.getInstance().getEntityManager();

	private FormateurDao() {

	}

	public static FormateurDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(Formateur obj) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(obj);
			this.em.getTransaction().commit();
			return obj.getFormateur();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Formateur get(Long id) {
		try {
			this.em.getTransaction().begin();
			Formateur formateur = this.em.find(Formateur.class, id);
			this.em.getTransaction().commit();
			return formateur;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Formateur remove(Long id) {
		try {
			this.em.getTransaction().begin();
			Formateur formateur = this.em.find(Formateur.class, id);
			this.em.remove(formateur);

			this.em.getTransaction().commit();
			return formateur;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}

	}

	@Override
	public List<Formateur> select() {
		try {
			this.em.getTransaction().begin();
			CriteriaBuilder builder = this.em.getCriteriaBuilder();
			CriteriaQuery<Formateur> criteriaQuery = builder.createQuery(Formateur.class);
			Root<Formateur> root = criteriaQuery.from(Formateur.class);
			criteriaQuery.select(root);
			this.em.getTransaction().commit();
			return this.em.createQuery(criteriaQuery).getResultList();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public void update(Formateur obj) {
		try {
			this.em.getTransaction().begin();
			this.em.merge(obj);
			this.em.getTransaction().commit();

		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}

	}

	public Formateur findById(Long id) {
		Formateur role;
		try {
			CriteriaBuilder builder = em.getCriteriaBuilder();

			CriteriaQuery<Formateur> query = builder.createQuery(Formateur.class);
			Root<Formateur> root = query.from(Formateur.class);

			query.where(builder.equal(root.get(Formateur_.formateur).as(String.class), id));

			role = em.createQuery(query).getSingleResult();

		} catch (NoResultException e) {

			return null;
		}
		return role;
	}

}

