package fr.bge.dao;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import fr.bge.jpa.EntityManagerSingleton;
import fr.bge.model.CompteRendu;

public class CompteRenduDao implements CRUDable<CompteRendu, Long>{

	private final static CompteRenduDao INSTANCE = new CompteRenduDao();

	private EntityManager em = EntityManagerSingleton.getInstance().getEntityManager();

	private CompteRenduDao() {

	}

	public static CompteRenduDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(CompteRendu obj) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(obj);
			this.em.getTransaction().commit();
			return obj.getCompteRendu();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public CompteRendu get(Long id) {
		try {
			this.em.getTransaction().begin();
			CompteRendu compteRendu = this.em.find(CompteRendu.class, id);
			this.em.getTransaction().commit();
			return compteRendu;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public CompteRendu remove(Long id) {
		try {
			this.em.getTransaction().begin();
			CompteRendu compteRendu = this.em.find(CompteRendu.class, id);
			this.em.remove(compteRendu);

			this.em.getTransaction().commit();
			return compteRendu;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}



	}

	@Override
	public List<CompteRendu> select() {
		try {
			this.em.getTransaction().begin();
			CriteriaBuilder builder = this.em.getCriteriaBuilder();
			CriteriaQuery<CompteRendu> criteriaQuery = builder.createQuery(CompteRendu.class);
			Root<CompteRendu> root = criteriaQuery.from(CompteRendu.class);
			criteriaQuery.select(root);
			this.em.getTransaction().commit();
			return this.em.createQuery(criteriaQuery).getResultList();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public void update(CompteRendu obj) {
		try {
			this.em.getTransaction().begin();
			this.em.merge(obj);
			this.em.getTransaction().commit();

		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}

	}

}
