package fr.bge.service;

import java.util.List;

import fr.bge.dao.CRUDable;
import fr.bge.dao.FormationDao;
import fr.bge.model.Formation;

public class FormationService implements CRUDable<Formation, Long> {

	private FormationDao dao = FormationDao.getInstance(); 
	
	private final static FormationService INSTANCE = new FormationService();
	
	private FormationService() {
		
	}
	
	public static FormationService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public Long save(Formation obj) {
		return this.dao.save(obj);
	}

	@Override
	public Formation get(Long id) {
		return this.dao.get(id);
	}

	@Override
	public Formation remove(Long id) {
		return this.dao.remove(id);
	}

	@Override
	public List<Formation> select() {
		return this.dao.select();
	}

	@Override
	public void update(Formation obj) {
		this.dao.update(obj);
	}

	@SuppressWarnings("static-method")
	public Formation create() {
		Formation formation = new Formation();
		return formation;
	}

	public boolean exist(String reference) {
		return this.dao.exist(reference);
	}

//	public EtatMateriel merge(Long id, String label) {
//		EtatMateriel etatMateriel = this.dao.get(id);
//		etatMateriel.setLabel(label);
//		return etatMateriel;
//	}

}
