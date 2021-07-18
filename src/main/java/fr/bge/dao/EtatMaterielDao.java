package fr.bge.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import fr.bge.facilities.JpaUtils;
import fr.bge.jpa.EntityManagerSingleton;
import fr.bge.model.EtatMateriel;
import fr.bge.model.EtatMateriel_;


public class EtatMaterielDao implements CRUDable<EtatMateriel, Long> {

	private final static EtatMaterielDao INSTANCE = new EtatMaterielDao();

	private EntityManager em = EntityManagerSingleton.getInstance().getEntityManager();

	private EtatMaterielDao() {

	}

	public static EtatMaterielDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(EtatMateriel obj) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(obj);
			this.em.getTransaction().commit();
			return obj.getEtatMateriel();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public EtatMateriel get(Long id) {
		try {
			this.em.getTransaction().begin();
			EtatMateriel etatMateriel = this.em.find(EtatMateriel.class, id);
			this.em.getTransaction().commit();
			return etatMateriel;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public EtatMateriel remove(Long id) {
		try {
			this.em.getTransaction().begin();
			EtatMateriel etatMateriel = this.em.find(EtatMateriel.class, id);
			this.em.remove(etatMateriel);

			this.em.getTransaction().commit();
			return etatMateriel;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public List<EtatMateriel> select() {
		try {
			this.em.getTransaction().begin();
			CriteriaBuilder builder = this.em.getCriteriaBuilder();
			CriteriaQuery<EtatMateriel> criteriaQuery = builder.createQuery(EtatMateriel.class);
			Root<EtatMateriel> root = criteriaQuery.from(EtatMateriel.class);
			criteriaQuery.select(root);
			this.em.getTransaction().commit();
			return this.em.createQuery(criteriaQuery).getResultList();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public void update(EtatMateriel obj) {
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
		return JpaUtils.exist(EtatMateriel.class, EtatMateriel_.label, label, this.em);
	}

}
