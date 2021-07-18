package fr.bge.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import fr.bge.jpa.EntityManagerSingleton;
import fr.bge.model.TypeMateriel;

public class TypeMaterielDao implements CRUDable<TypeMateriel, Long>{

	private final static TypeMaterielDao INSTANCE = new TypeMaterielDao();

	private EntityManager em = EntityManagerSingleton.getInstance().getEntityManager();

	private TypeMaterielDao() {

	}

	public static TypeMaterielDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(TypeMateriel obj) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(obj);
			this.em.getTransaction().commit();
			return obj.getTypeMateriel();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public TypeMateriel get(Long id) {
		try {
			this.em.getTransaction().begin();
			TypeMateriel typeMateriel = this.em.find(TypeMateriel.class, id);
			this.em.getTransaction().commit();
			return typeMateriel;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public TypeMateriel remove(Long id) {
		try {
			this.em.getTransaction().begin();
			TypeMateriel typeMateriel = this.em.find(TypeMateriel.class, id);
			this.em.remove(typeMateriel);

			this.em.getTransaction().commit();
			return typeMateriel;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}



	}

	@Override
	public List<TypeMateriel> select() {
		try {
			this.em.getTransaction().begin();
			CriteriaBuilder builder = this.em.getCriteriaBuilder();
			CriteriaQuery<TypeMateriel> criteriaQuery = builder.createQuery(TypeMateriel.class);
			Root<TypeMateriel> root = criteriaQuery.from(TypeMateriel.class);
			criteriaQuery.select(root);
			this.em.getTransaction().commit();
			return this.em.createQuery(criteriaQuery).getResultList();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public void update(TypeMateriel obj) {
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
		// TODO Auto-generated method stub
		return false;
	}

}

