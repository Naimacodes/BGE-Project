package fr.bge.service;

import java.util.List;

import fr.bge.dao.CRUDable;
import fr.bge.dao.ModeFormationDao;
import fr.bge.model.ModeFormation;

public class ModeFormationService implements CRUDable<ModeFormation, Long> {

	private ModeFormationDao dao = ModeFormationDao.getInstance(); 
	
	private final static ModeFormationService INSTANCE = new ModeFormationService();
	
	private ModeFormationService() {
		
	}
	
	public static ModeFormationService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public Long save(ModeFormation obj) {
		return this.dao.save(obj);
	}

	@Override
	public ModeFormation get(Long id) {
		return this.dao.get(id);
	}

	@Override
	public ModeFormation remove(Long id) {
		return this.dao.remove(id);
	}

	@Override
	public List<ModeFormation> select() {
		return this.dao.select();
	}

	@Override
	public void update(ModeFormation obj) {
		this.dao.update(obj);
	}

	public ModeFormation create(String label, Boolean isActif, String description, String labelCourt) {
		// TODO Auto-generated method stub
		 ModeFormation modeFormation = new ModeFormation();
		 modeFormation.setActif(isActif);
		 modeFormation.setDescription(description);
		 modeFormation.setLabel(label);
		 modeFormation.setLabelCourt(labelCourt);		 
		return modeFormation;
	}
	
	public boolean exist(String label) {
		return this.dao.exist(label);
	}

	public ModeFormation merge(Long id, String label, String labelCourt, String description, Boolean actif) {
		ModeFormation modeFormation = this.dao.get(id);
		modeFormation.setLabel(label);
		modeFormation.setLabelCourt(labelCourt);
		modeFormation.setDescription(description);
		modeFormation.setActif(actif);
		return modeFormation;
	}

}
