package fr.bge.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import fr.bge.jpa.EntityManagerSingleton;
import fr.bge.model.Adresse;

public class AdresseDao implements CRUDable<Adresse, Long>{

	private final static AdresseDao INSTANCE = new AdresseDao();

	private EntityManager em = EntityManagerSingleton.getInstance().getEntityManager();

	private AdresseDao() {

	}

	public static AdresseDao getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(Adresse obj) {
		try {
			this.em.getTransaction().begin();
			this.em.persist(obj);
			this.em.getTransaction().commit();
			return obj.getAdresse();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Adresse get(Long id) {
		try {
			this.em.getTransaction().begin();
			Adresse adresse = this.em.find(Adresse.class, id);
			this.em.getTransaction().commit();
			return adresse;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Adresse remove(Long id) {
		try {
			this.em.getTransaction().begin();
			Adresse adresse = this.em.find(Adresse.class, id);
			this.em.remove(adresse);

			this.em.getTransaction().commit();
			return adresse;
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}



	}

	@Override
	public List<Adresse> select() {
		try {
			this.em.getTransaction().begin();
			CriteriaBuilder builder = this.em.getCriteriaBuilder();
			CriteriaQuery<Adresse> criteriaQuery = builder.createQuery(Adresse.class);
			Root<Adresse> root = criteriaQuery.from(Adresse.class);
			criteriaQuery.select(root);
			this.em.getTransaction().commit();
			return this.em.createQuery(criteriaQuery).getResultList();
		} catch (Throwable e) {
			this.em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public void update(Adresse obj) {
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
