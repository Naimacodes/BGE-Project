package fr.bge.service;


import java.util.List;

import fr.bge.dao.AdresseDao;
import fr.bge.dao.CRUDable;
import fr.bge.model.Adresse;

public class AdresseService implements CRUDable<Adresse, Long> {

	private AdresseDao dao = AdresseDao.getInstance(); 
	
	private final static AdresseService INSTANCE = new AdresseService();
	
	private AdresseService() {
		
	}
	
	public static AdresseService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public Long save(Adresse obj) {
		return this.dao.save(obj);
	}

	@Override
	public Adresse get(Long id) {
		return this.dao.get(id);
	}

	@Override
	public Adresse remove(Long id) {
		return this.dao.remove(id);
	}

	@Override
	public List<Adresse> select() {
		return this.dao.select();
	}

	@Override
	public void update(Adresse obj) {
		this.dao.update(obj);		
	}

	public Adresse create(String libelle1, String libelle2, String codePostal, String ville) {
		Adresse adresse = new Adresse();
		adresse.setLibelle1(libelle1);
		adresse.setLibelle2(libelle2);
		adresse.setCodePostal(codePostal);
		adresse.setVille(ville);
		return adresse;
	}
	
	public boolean exist(String label) {
		return this.dao.exist(label);
	}

	public Adresse merge(Long id, String libelle1, String libelle2, String codePostal,String ville) {
		Adresse adresse = this.dao.get(id);
		adresse.setLibelle1(libelle1);
		adresse.setLibelle2(libelle2);
		adresse.setCodePostal(codePostal);
		adresse.setVille(ville);
		return adresse;
	}

	

}
