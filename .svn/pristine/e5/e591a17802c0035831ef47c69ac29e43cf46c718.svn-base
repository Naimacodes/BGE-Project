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
import fr.bge.model.Module;
import fr.bge.model.Module_;

public class ModuleDao implements CRUDable<Module, Long> {
	private final static ModuleDao INSTANCE = new ModuleDao();

	private EntityManager em = EntityManagerSingleton.getInstance().getEntityManager();

	private ModuleDao() {
		// TODO Auto-generated constructor stub

	}

	public static ModuleDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(Module obj) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(obj);
			this.em.getTransaction().commit();
			return obj.getModule();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Module get(Long id) {
		try {
			Module module = this.em.find(Module.class, id);
			return module;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Module remove(Long id) {
		try {
			this.em.getTransaction().begin();
			Module module = this.em.find(Module.class, id);
			this.em.remove(module);
			this.em.getTransaction().commit();
			return module;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}

	}

	@Override
	public List<Module> select() {
		try {
			CriteriaBuilder builder = this.em.getCriteriaBuilder();
			CriteriaQuery<Module> criteriaQuery = builder.createQuery(Module.class);
			Root<Module> root = criteriaQuery.from(Module.class);
			criteriaQuery.select(root);
			return this.em.createQuery(criteriaQuery).getResultList();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public void update(Module obj) {
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
		return JpaUtils.exist(Module.class, Module_.label, label, this.em);
	}
}
