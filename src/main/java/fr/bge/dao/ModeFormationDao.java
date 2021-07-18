package fr.bge.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import fr.bge.facilities.JpaUtils;
import fr.bge.jpa.EntityManagerSingleton;
import fr.bge.model.ModeFormation;
import fr.bge.model.ModeFormation_;

public class ModeFormationDao implements CRUDable<ModeFormation, Long>{

	private final static ModeFormationDao INSTANCE = new ModeFormationDao();

	private EntityManager em = EntityManagerSingleton.getInstance().getEntityManager();

	private ModeFormationDao() {

	}

	public static ModeFormationDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(ModeFormation obj) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(obj);
			this.em.getTransaction().commit();
			return obj.getModeFormation();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public ModeFormation get(Long id) {
		try {
			this.em.getTransaction().begin();
			ModeFormation modeFormation = this.em.find(ModeFormation.class, id);
			this.em.getTransaction().commit();
			return modeFormation;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public ModeFormation remove(Long id) {
		try {
			this.em.getTransaction().begin();
			ModeFormation modeFormation = this.em.find(ModeFormation.class, id);
			this.em.remove(modeFormation);

			this.em.getTransaction().commit();
			return modeFormation;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}



	}

	@Override
	public List<ModeFormation> select() {
		try {
			this.em.getTransaction().begin();
			CriteriaBuilder builder = this.em.getCriteriaBuilder();
			CriteriaQuery<ModeFormation> criteriaQuery = builder.createQuery(ModeFormation.class);
			Root<ModeFormation> root = criteriaQuery.from(ModeFormation.class);
			criteriaQuery.select(root);
			this.em.getTransaction().commit();
			return this.em.createQuery(criteriaQuery).getResultList();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public void update(ModeFormation obj) {
		try {
			this.em.getTransaction().begin();
			this.em.merge(obj);
			this.em.getTransaction().commit();

		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}

	}

	public boolean exist(String label) {
		return JpaUtils.exist(ModeFormation.class, ModeFormation_.label, label, this.em);
	}

}
