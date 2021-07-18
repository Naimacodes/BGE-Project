package fr.bge.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-07-11T11:20:26.607+0200")
@StaticMetamodel(CompteRole.class)
public class CompteRole_ {
	public static volatile SingularAttribute<CompteRole, CompteRolePK> compteRolePK;
	public static volatile SingularAttribute<CompteRole, Date> dateCreation;
	public static volatile SingularAttribute<CompteRole, Compte> compte;
	public static volatile SingularAttribute<CompteRole, Role> role;
}
