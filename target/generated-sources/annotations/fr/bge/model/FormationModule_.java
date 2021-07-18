package fr.bge.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FormationModule.class)
public abstract class FormationModule_ {

	public static volatile SingularAttribute<FormationModule, Formateur> formateur;
	public static volatile SingularAttribute<FormationModule, Module> module;
	public static volatile SingularAttribute<FormationModule, Long> formationModule;
	public static volatile SingularAttribute<FormationModule, Formation> formation;

	public static final String FORMATEUR = "formateur";
	public static final String MODULE = "module";
	public static final String FORMATION_MODULE = "formationModule";
	public static final String FORMATION = "formation";

}

