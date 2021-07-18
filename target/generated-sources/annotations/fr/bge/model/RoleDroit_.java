package fr.bge.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RoleDroit.class)
public abstract class RoleDroit_ {

	public static volatile SingularAttribute<RoleDroit, RoleDroitPK> roleDroitPK;
	public static volatile SingularAttribute<RoleDroit, Date> dateCreation;
	public static volatile SingularAttribute<RoleDroit, Role> role;
	public static volatile SingularAttribute<RoleDroit, Droit> droit;

	public static final String ROLE_DROIT_PK = "roleDroitPK";
	public static final String DATE_CREATION = "dateCreation";
	public static final String ROLE = "role";
	public static final String DROIT = "droit";

}

