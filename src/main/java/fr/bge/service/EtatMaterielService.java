package fr.bge.service;

import java.util.List;

import fr.bge.dao.CRUDable;
import fr.bge.dao.EtatMaterielDao;
import fr.bge.model.EtatMateriel;

public class EtatMaterielService implements CRUDable<EtatMateriel, Long> {

	private EtatMaterielDao dao = EtatMaterielDao.getInstance(); 
	
	private final static EtatMaterielService INSTANCE = new EtatMaterielService();
	
	private EtatMaterielService() {
		
	}
	
	public static EtatMaterielService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public Long save(EtatMateriel obj) {
		return this.dao.save(obj);
	}

	@Override
	public EtatMateriel get(Long id) {
		return this.dao.get(id);
	}

	@Override
	public EtatMateriel remove(Long id) {
		return this.dao.remove(id);
	}

	@Override
	public List<EtatMateriel> select() {
		return this.dao.select();
	}

	@Override
	public void update(EtatMateriel obj) {
		this.dao.update(obj);
	}

	@SuppressWarnings("static-method")
	public EtatMateriel create(String label) {
		EtatMateriel etat = new EtatMateriel();
		etat.setLabel(label);
		return etat;
	}

	public boolean exist(String label) {
		return this.dao.exist(label);
	}

	public EtatMateriel merge(Long id, String label) {
		EtatMateriel etatMateriel = this.dao.get(id);
		etatMateriel.setLabel(label);
		return etatMateriel;
	}

}
