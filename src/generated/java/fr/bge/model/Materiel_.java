package fr.bge.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-07-11T10:53:52.140+0200")
@StaticMetamodel(Materiel.class)
public class Materiel_ {
	public static volatile SingularAttribute<Materiel, Long> materiel;
	public static volatile SingularAttribute<Materiel, String> designation;
	public static volatile SingularAttribute<Materiel, String> reference;
	public static volatile SingularAttribute<Materiel, TypeMateriel> typeMateriel;
	public static volatile SingularAttribute<Materiel, EtatMateriel> etatMateriel;
}
