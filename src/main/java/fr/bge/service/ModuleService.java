package fr.bge.service;

import java.util.List;

import fr.bge.dao.CRUDable;
import fr.bge.dao.ModuleDao;
import fr.bge.model.Module;

public class ModuleService implements CRUDable<Module, Long> {

	private ModuleDao dao = ModuleDao.getInstance();

	private final static ModuleService INSTANCE = new ModuleService();

	private ModuleService() {

	}

	public static ModuleService getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(Module obj) {
		return this.dao.save(obj);
	}

	@Override
	public Module get(Long id) {
		return this.dao.get(id);
	}

	@Override
	public Module remove(Long id) {
		return this.dao.remove(id);
	}

	@Override
	public List<Module> select() {
		return this.dao.select();
	}

	@Override
	public void update(Module obj) {
		this.dao.update(obj);
	}

	@SuppressWarnings("static-method")
	public Module create(String label) {
		Module module = new Module();
		module.setLabel(label);
		return module;
	}

	public Module merge(Long id, String label) {
		Module module = this.dao.get(id);
		module.setLabel(label);
		return module;
	}

	public boolean exist(String label) {
		return this.dao.exist(label);
	}

}
