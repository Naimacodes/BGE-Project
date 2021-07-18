package fr.bge.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-07-11T17:31:32.269+0200")
@StaticMetamodel(MaterielStagiaire.class)
public class MaterielStagiaire_ {
	public static volatile SingularAttribute<MaterielStagiaire, MaterielStagiairePK> materielStagiairePK;
	public static volatile SingularAttribute<MaterielStagiaire, BigDecimal> caution;
	public static volatile SingularAttribute<MaterielStagiaire, Boolean> cautionRendue;
	public static volatile SingularAttribute<MaterielStagiaire, String> commentairePret;
	public static volatile SingularAttribute<MaterielStagiaire, String> commentaireRestitution;
	public static volatile SingularAttribute<MaterielStagiaire, Date> datePret;
	public static volatile SingularAttribute<MaterielStagiaire, Date> dateRestitution;
	public static volatile SingularAttribute<MaterielStagiaire, Materiel> materiel;
	public static volatile SingularAttribute<MaterielStagiaire, Stagiaire> stagiaire;
}
