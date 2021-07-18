package fr.bge.service;

import java.util.List;

import fr.bge.dao.CRUDable;
import fr.bge.dao.RoleDao;
import fr.bge.model.Role;

public class RoleService implements CRUDable<Role, Long> {

	private RoleDao dao = RoleDao.getInstance();

	private final static RoleService INSTANCE = new RoleService();

	private RoleService() {

	}

	public static RoleService getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(Role obj) {
		return this.dao.save(obj);
	}

	@Override
	public Role get(Long id) {
		return this.dao.get(id);
	}

	@Override
	public Role remove(Long id) {
		return this.dao.remove(id);
	}

	@Override
	public List<Role> select() {

		return this.dao.select();
	}

	@Override
	public void update(Role obj) {
		this.dao.update(obj);
	}

	public Role create(String label, Boolean isActif, String description) {
		Role role = new Role();
		role.setLabel(label);
		role.setDescription(description);
		role.setActif(isActif);
		return role;
	}

	public Role findById(Long id) {
		return this.dao.findById(id);
	}

}
