package fr.bge.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import fr.bge.jpa.EntityManagerSingleton;
import fr.bge.model.Role;
import fr.bge.model.Role_;

public class RoleDao implements CRUDable<Role, Long> {

	private final static RoleDao INSTANCE = new RoleDao();

	private EntityManager em = EntityManagerSingleton.getInstance().getEntityManager();

	private RoleDao() {

	}

	public static RoleDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(Role obj) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(obj);
			this.em.getTransaction().commit();
			return obj.getRole();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Role get(Long id) {
		try {
			this.em.getTransaction().begin();
			Role role = this.em.find(Role.class, id);
			this.em.getTransaction().commit();
			return role;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Role remove(Long id) {
		try {
			this.em.getTransaction().begin();
			Role role = this.em.find(Role.class, id);
			this.em.remove(role);

			this.em.getTransaction().commit();
			return role;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}

	}

	@Override
	public List<Role> select() {
		try {
			this.em.getTransaction().begin();
			CriteriaBuilder builder = this.em.getCriteriaBuilder();
			CriteriaQuery<Role> criteriaQuery = builder.createQuery(Role.class);
			Root<Role> root = criteriaQuery.from(Role.class);
			criteriaQuery.select(root);
			this.em.getTransaction().commit();
			return this.em.createQuery(criteriaQuery).getResultList();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public void update(Role obj) {
		try {
			this.em.getTransaction().begin();
			this.em.merge(obj);
			this.em.getTransaction().commit();

		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}

	}

	public Role findById(Long id) {
		Role role;
		try {
			CriteriaBuilder builder = em.getCriteriaBuilder();

			CriteriaQuery<Role> query = builder.createQuery(Role.class);
			Root<Role> root = query.from(Role.class);

			query.where(builder.equal(root.get(Role_.role).as(String.class), id));

			role = em.createQuery(query).getSingleResult();

		} catch (NoResultException e) {

			return null;
		}
		return role;
	}

}
