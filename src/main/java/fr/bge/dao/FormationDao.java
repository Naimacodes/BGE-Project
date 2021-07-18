package fr.bge.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import fr.bge.facilities.JpaUtils;
import fr.bge.jpa.EntityManagerSingleton;
import fr.bge.model.Formation;
import fr.bge.model.Formation_;


public class FormationDao implements CRUDable<Formation, Long> {

	private final static FormationDao INSTANCE = new FormationDao();

	private EntityManager em = EntityManagerSingleton.getInstance().getEntityManager();

	private FormationDao() {

	}

	public static FormationDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(Formation obj) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(obj);
			this.em.getTransaction().commit();
			return obj.getFormation();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Formation get(Long id) {
		try {
			this.em.getTransaction().begin();
			Formation obj = this.em.find(Formation.class, id);
			this.em.getTransaction().commit();
			return obj;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Formation remove(Long id) {
		try {
			this.em.getTransaction().begin();
			Formation obj = this.em.find(Formation.class, id);
			this.em.remove(obj);
			this.em.getTransaction().commit();
			return obj;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public List<Formation> select() {
		try {
			this.em.getTransaction().begin();
			CriteriaBuilder builder = this.em.getCriteriaBuilder();
			CriteriaQuery<Formation> criteriaQuery = builder.createQuery(Formation.class);
			Root<Formation> root = criteriaQuery.from(Formation.class);
			criteriaQuery.select(root);
			this.em.getTransaction().commit();
			return this.em.createQuery(criteriaQuery).getResultList();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public void update(Formation obj) {
		try {
			this.em.getTransaction().begin();
			this.em.merge(obj);
			this.em.getTransaction().commit();

		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}

	}

	public boolean exist(String reference) {
		return JpaUtils.exist(Formation.class, Formation_.reference, reference, this.em);
	}

}
