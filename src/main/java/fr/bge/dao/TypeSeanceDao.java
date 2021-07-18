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
import fr.bge.model.TypeSeance;


public class TypeSeanceDao implements CRUDable<TypeSeance, Long>{

	private final static TypeSeanceDao INSTANCE = new TypeSeanceDao();

	private EntityManager em = EntityManagerSingleton.getInstance().getEntityManager();

	private TypeSeanceDao() {

	}

	public static TypeSeanceDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(TypeSeance obj) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(obj);
			this.em.getTransaction().commit();
			return obj.getTypeSeance();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public TypeSeance get(Long id) {
		try {
			this.em.getTransaction().begin();
			TypeSeance typeSeance = this.em.find(TypeSeance.class, id);
			this.em.getTransaction().commit();
			return typeSeance;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public TypeSeance remove(Long id) {
		try {
			this.em.getTransaction().begin();
			TypeSeance typeSeance = this.em.find(TypeSeance.class, id);
			this.em.remove(typeSeance);

			this.em.getTransaction().commit();
			return typeSeance;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}



	}

	@Override
	public List<TypeSeance> select() {
		try {
			this.em.getTransaction().begin();
			CriteriaBuilder builder = this.em.getCriteriaBuilder();
			CriteriaQuery<TypeSeance> criteriaQuery = builder.createQuery(TypeSeance.class);
			Root<TypeSeance> root = criteriaQuery.from(TypeSeance.class);
			criteriaQuery.select(root);
			this.em.getTransaction().commit();
			return this.em.createQuery(criteriaQuery).getResultList();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public void update(TypeSeance obj) {
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
		return false;
	}
	
}
