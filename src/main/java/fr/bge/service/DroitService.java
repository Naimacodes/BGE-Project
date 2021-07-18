package fr.bge.service;

import java.util.List;

import fr.bge.dao.CRUDable;
import fr.bge.dao.DroitDao;
import fr.bge.model.Droit;

public class DroitService implements CRUDable<Droit, Long> {

	private DroitDao dao = DroitDao.getInstance();

	private final static DroitService INSTANCE = new DroitService();

	private DroitService() {

	}

	public static DroitService getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(Droit obj) {
		return this.dao.save(obj);
	}

	@Override
	public Droit get(Long id) {
		return this.dao.get(id);
	}

	@Override
	public Droit remove(Long id) {
		return this.dao.remove(id);
	}

	@Override
	public List<Droit> select() {

		return this.dao.select();
	}

	@Override
	public void update(Droit obj) {
		this.dao.update(obj);
	}

	public Droit create(String label, Boolean isActif, String description) {
		Droit droit = new Droit();
		droit.setLabel(label);
		droit.setDescription(description);
		droit.setActif(isActif);
		return droit;
	}

	public Droit findById(Long id) {
		return this.dao.findById(id);
	}

}
