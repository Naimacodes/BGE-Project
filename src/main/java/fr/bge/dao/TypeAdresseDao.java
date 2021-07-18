package fr.bge.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import fr.bge.facilities.JpaUtils;
import fr.bge.jpa.EntityManagerSingleton;
import fr.bge.model.TypeAdresse;
import fr.bge.model.TypeAdresse_;

public class TypeAdresseDao implements CRUDable<TypeAdresse, Long> {

	private final static TypeAdresseDao INSTANCE = new TypeAdresseDao();

	private EntityManager em = EntityManagerSingleton.getInstance().getEntityManager();

	private TypeAdresseDao() {

	}

	public static TypeAdresseDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(TypeAdresse obj) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(obj);
			this.em.getTransaction().commit();
			return obj.getTypeAdresse();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public TypeAdresse get(Long id) {
		try {
			this.em.getTransaction().begin();
			TypeAdresse typeAdresse = this.em.find(TypeAdresse.class, id);
			this.em.getTransaction().commit();
			return typeAdresse;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public TypeAdresse remove(Long id) {
		try {
			this.em.getTransaction().begin();
			TypeAdresse typeAdresse = this.em.find(TypeAdresse.class, id);
			this.em.remove(typeAdresse);

			this.em.getTransaction().commit();
			return typeAdresse;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public List<TypeAdresse> select() {
		try {
			this.em.getTransaction().begin();
			CriteriaBuilder builder = this.em.getCriteriaBuilder();
			CriteriaQuery<TypeAdresse> criteriaQuery = builder.createQuery(TypeAdresse.class);
			Root<TypeAdresse> root = criteriaQuery.from(TypeAdresse.class);
			criteriaQuery.select(root);
			this.em.getTransaction().commit();
			return this.em.createQuery(criteriaQuery).getResultList();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public void update(TypeAdresse obj) {
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
		return JpaUtils.exist(TypeAdresse.class, TypeAdresse_.label, label, this.em);
	}

}
