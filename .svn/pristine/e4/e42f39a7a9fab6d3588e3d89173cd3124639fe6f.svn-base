package fr.bge.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import fr.bge.jpa.EntityManagerSingleton;
import fr.bge.model.FormationModule;

public class FormationModuleDao implements CRUDable<FormationModule, Long>{

	private final static FormationModuleDao INSTANCE = new FormationModuleDao();

	private EntityManager em = EntityManagerSingleton.getInstance().getEntityManager();

	private FormationModuleDao() {

	}

	public static FormationModuleDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(FormationModule obj) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(obj);
			this.em.getTransaction().commit();
			return obj.getFormationModule();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public FormationModule get(Long id) {
		try {
			this.em.getTransaction().begin();
			FormationModule adresse = this.em.find(FormationModule.class, id);
			this.em.getTransaction().commit();
			return adresse;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public FormationModule remove(Long id) {
		try {
			this.em.getTransaction().begin();
			FormationModule adresse = this.em.find(FormationModule.class, id);
			this.em.remove(adresse);

			this.em.getTransaction().commit();
			return adresse;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}



	}

	@Override
	public List<FormationModule> select() {
		try {
			this.em.getTransaction().begin();
			CriteriaBuilder builder = this.em.getCriteriaBuilder();
			CriteriaQuery<FormationModule> criteriaQuery = builder.createQuery(FormationModule.class);
			Root<FormationModule> root = criteriaQuery.from(FormationModule.class);
			criteriaQuery.select(root);
			this.em.getTransaction().commit();
			return this.em.createQuery(criteriaQuery).getResultList();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public void update(FormationModule obj) {
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
