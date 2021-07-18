package fr.bge.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TypeMateriel.class)
public abstract class TypeMateriel_ {

	public static volatile SingularAttribute<TypeMateriel, Long> typeMateriel;
	public static volatile SingularAttribute<TypeMateriel, String> label;
	public static volatile SingularAttribute<TypeMateriel, BigDecimal> montantCaution;

	public static final String TYPE_MATERIEL = "typeMateriel";
	public static final String LABEL = "label";
	public static final String MONTANT_CAUTION = "montantCaution";

}

