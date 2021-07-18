package fr.bge.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Adresse.class)
public abstract class Adresse_ {

	public static volatile SingularAttribute<Adresse, String> ville;
	public static volatile SingularAttribute<Adresse, String> libelle1;
	public static volatile SingularAttribute<Adresse, String> libelle2;
	public static volatile SingularAttribute<Adresse, Long> adresse;
	public static volatile SingularAttribute<Adresse, String> codePostal;
	public static volatile SingularAttribute<Adresse, TypeAdresse> typeAdresse;

	public static final String VILLE = "ville";
	public static final String LIBELLE1 = "libelle1";
	public static final String LIBELLE2 = "libelle2";
	public static final String ADRESSE = "adresse";
	public static final String CODE_POSTAL = "codePostal";
	public static final String TYPE_ADRESSE = "typeAdresse";

}

