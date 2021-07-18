package fr.bge.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ModeFormation.class)
public abstract class ModeFormation_ {

	public static volatile SingularAttribute<ModeFormation, Long> modeFormation;
	public static volatile SingularAttribute<ModeFormation, String> labelCourt;
	public static volatile SingularAttribute<ModeFormation, String> description;
	public static volatile SingularAttribute<ModeFormation, Boolean> actif;
	public static volatile SingularAttribute<ModeFormation, String> label;

	public static final String MODE_FORMATION = "modeFormation";
	public static final String LABEL_COURT = "labelCourt";
	public static final String DESCRIPTION = "description";
	public static final String ACTIF = "actif";
	public static final String LABEL = "label";

}

