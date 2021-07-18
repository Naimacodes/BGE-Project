package fr.bge.facilities;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.SingularAttribute;

public class JpaUtils {

    public static <T, V> boolean exist(Class<T> t, SingularAttribute<T, V> attribute, V v, EntityManager em) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Long> query = builder.createQuery(Long.class);
        Root<T> root = query.from(t);
        query.select(builder.count(root));
        query.where(builder.equal(root.get(attribute), v));
        return em.createQuery(query).getSingleResult().longValue() > 0L;
    }
    
}
