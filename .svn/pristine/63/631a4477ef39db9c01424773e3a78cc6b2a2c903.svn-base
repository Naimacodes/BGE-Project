package fr.bge.service;

import java.util.List;

import fr.bge.dao.CRUDable;
import fr.bge.dao.TypeSeanceDao;
import fr.bge.model.TypeSeance;

public class TypeSeanceService implements CRUDable<TypeSeance, Long> {

	private TypeSeanceDao dao = TypeSeanceDao.getInstance(); 
	
	private final static TypeSeanceService INSTANCE = new TypeSeanceService();
	
	private TypeSeanceService() {
		
	}
	
	public static TypeSeanceService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public Long save(TypeSeance obj) {
		return this.dao.save(obj);
	}

	@Override
	public TypeSeance get(Long id) {
		return this.dao.get(id);
	}

	@Override
	public TypeSeance remove(Long id) {
		return this.dao.remove(id);
	}

	@Override
	public List<TypeSeance> select() {
		return this.dao.select();
	}

	@Override
	public void update(TypeSeance obj) {
		this.dao.update(obj);
	}
		
	@SuppressWarnings("static-method")
	public TypeSeance create(String libelle, Boolean isActif, String description,String libelleCourt) {
		// TODO Auto-generated method stub
		TypeSeance typeseance = new TypeSeance();
		typeseance.setActif(isActif.booleanValue());
		typeseance.setDescription(description);
		typeseance.setLibelle(libelle);
		typeseance.setLibelleCourt(libelleCourt);
		 
		return typeseance;
	}
	
	public boolean exist(String label) {
		return this.dao.exist(label);
	}

	public TypeSeance merge(Long id, String libelle, String libelleCourt, String description, Boolean actif) {
		TypeSeance typeSeance = this.dao.get(id);
		typeSeance.setLibelle(libelle);
		typeSeance.setLibelleCourt(libelleCourt);
		typeSeance.setDescription(description);
		typeSeance.setActif(actif);
		return typeSeance;
	}

	
	

}
