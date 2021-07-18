package fr.bge.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import fr.bge.jpa.EntityManagerSingleton;
import fr.bge.model.Droit;
import fr.bge.model.Droit_;

public class DroitDao implements CRUDable<Droit, Long> {

	private final static DroitDao INSTANCE = new DroitDao();

	private EntityManager em = EntityManagerSingleton.getInstance().getEntityManager();

	private DroitDao() {

	}

	public static DroitDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(Droit obj) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(obj);
			this.em.getTransaction().commit();
			return obj.getDroit();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Droit get(Long id) {
		try {
			this.em.getTransaction().begin();
			Droit droit = this.em.find(Droit.class, id);
			this.em.getTransaction().commit();
			return droit;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Droit remove(Long id) {
		try {
			this.em.getTransaction().begin();
			Droit droit = this.em.find(Droit.class, id);
			this.em.remove(droit);
			this.em.getTransaction().commit();
			return droit;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}

	}

	@Override
	public List<Droit> select() {
		try {
//			this.em.getTransaction().begin();
			CriteriaBuilder builder = this.em.getCriteriaBuilder();
			CriteriaQuery<Droit> criteriaQuery = builder.createQuery(Droit.class);
			Root<Droit> root = criteriaQuery.from(Droit.class);
			criteriaQuery.select(root);
			
			List<Droit> droits = this.em.createQuery(criteriaQuery).getResultList();
//			this.em.getTransaction().commit();
			return droits;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public void update(Droit obj) {
		try {
			this.em.getTransaction().begin();
			this.em.merge(obj);
			this.em.getTransaction().commit();

		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}

	}

	public Droit findById(Long id) {
		Droit droit;
		try {
			CriteriaBuilder builder = em.getCriteriaBuilder();

			CriteriaQuery<Droit> query = builder.createQuery(Droit.class);
			Root<Droit> root = query.from(Droit.class);

			query.where(builder.equal(root.get(Droit_.droit).as(String.class), id));

			droit = em.createQuery(query).getSingleResult();

		} catch (NoResultException e) {

			return null;
		}
		return droit;
	}

}
