package fr.bge.service;

import java.math.BigDecimal;
import java.util.List;

import fr.bge.dao.CRUDable;
import fr.bge.dao.TypeMaterielDao;
import fr.bge.model.TypeMateriel;

public class TypeMaterielService implements CRUDable<TypeMateriel, Long> {

	private TypeMaterielDao dao = TypeMaterielDao.getInstance(); 
	
	private final static TypeMaterielService INSTANCE = new TypeMaterielService();
	
	private TypeMaterielService() {
		
	}
	
	public static TypeMaterielService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public Long save(TypeMateriel obj) {
		return this.dao.save(obj);
	}

	@Override
	public TypeMateriel get(Long id) {
		return this.dao.get(id);
	}

	@Override
	public TypeMateriel remove(Long id) {
		return this.dao.remove(id);
	}

	@Override
	public List<TypeMateriel> select() {
		return this.dao.select();
	}

	@Override
	public void update(TypeMateriel obj) {
		this.dao.update(obj);
	}

	@SuppressWarnings("static-method")
	public TypeMateriel create(String label, BigDecimal montantCaution) {
		TypeMateriel typeMateriel = new TypeMateriel();
		typeMateriel.setLabel(label);
		typeMateriel.setMontantCaution(montantCaution);
		return typeMateriel;
	}
	
	public boolean exist(String label) {
		return this.dao.exist(label);
	}

	public TypeMateriel merge(Long id, String label, BigDecimal montantCaution) {
		TypeMateriel typeMateriel = this.dao.get(id);
		typeMateriel.setLabel(label);
		typeMateriel.setMontantCaution(montantCaution);
		
	
		return typeMateriel;
	}

}


