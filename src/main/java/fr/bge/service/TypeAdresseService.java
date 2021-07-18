package fr.bge.service;

import java.util.List;

import fr.bge.dao.CRUDable;
import fr.bge.dao.TypeAdresseDao;
import fr.bge.model.TypeAdresse;

public class TypeAdresseService implements CRUDable<TypeAdresse, Long> {

	private TypeAdresseDao dao = TypeAdresseDao.getInstance(); 
	
	private final static TypeAdresseService INSTANCE = new TypeAdresseService();
	
	private TypeAdresseService() {
		
	}
	
	public static TypeAdresseService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public Long save(TypeAdresse obj) {
		return this.dao.save(obj);
	}

	@Override
	public TypeAdresse get(Long id) {
		return this.dao.get(id);
	}

	@Override
	public TypeAdresse remove(Long id) {
		return this.dao.remove(id);
	}

	@Override
	public List<TypeAdresse> select() {
		return this.dao.select();
	}

	@Override
	public void update(TypeAdresse obj) {
		this.dao.update(obj);
	}

	@SuppressWarnings("static-method")
	public TypeAdresse create(String label) {
		TypeAdresse typeAdresse = new TypeAdresse();
		typeAdresse.setLabel(label);
		return typeAdresse;
	}

	public boolean exist(String label) {
		return this.dao.exist(label);
	}

	public TypeAdresse merge(Long id, String label) {
		TypeAdresse typeAdresse = this.dao.get(id);
		typeAdresse.setLabel(label);
		return typeAdresse;
	}

}
