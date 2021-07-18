

package fr.bge.service;

import java.util.List;

import fr.bge.dao.CRUDable;
import fr.bge.dao.FormationModuleDao;
import fr.bge.model.FormationModule;

public class FormationModuleService implements CRUDable<FormationModule, Long> {

	private FormationModuleDao dao = FormationModuleDao.getInstance(); 
	
	private final static FormationModuleService INSTANCE = new FormationModuleService();
	
	private FormationModuleService() {
		
	}
	
	public static FormationModuleService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public Long save(FormationModule obj) {
		return this.dao.save(obj);
	}

	@Override
	public FormationModule get(Long id) {
		return this.dao.get(id);
	}

	@Override
	public FormationModule remove(Long id) {
		return this.dao.remove(id);
	}

	@Override
	public List<FormationModule> select() {
		return this.dao.select();
	}

	@Override
	public void update(FormationModule obj) {
		this.dao.update(obj);
	}

	@SuppressWarnings("static-method")
	public FormationModule create() {
		FormationModule formation = new FormationModule();
		return formation;
	}



//	public EtatMateriel merge(Long id, String label) {
//		EtatMateriel etatMateriel = this.dao.get(id);
//		etatMateriel.setLabel(label);
//		return etatMateriel;
//	}

}
