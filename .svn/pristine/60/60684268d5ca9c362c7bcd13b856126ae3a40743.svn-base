
package fr.bge.service;

import java.util.List;

import fr.bge.dao.CRUDable;
import fr.bge.dao.FormateurDao;
import fr.bge.model.Formateur;



public class FormateurService  implements CRUDable<Formateur, Long> {

	private FormateurDao dao = FormateurDao.getInstance(); 
	
	private final static FormateurService INSTANCE = new FormateurService ();
	
	private FormateurService () {
		
	}
	
	public static FormateurService getInstance() {
		return INSTANCE;
	}
	
	@Override
	public Long save(Formateur obj) {
		return this.dao.save(obj);
	}

	@Override
	public Formateur get(Long id) {
		return this.dao.get(id);
	}

	@Override
	public Formateur remove(Long id) {
		return this.dao.remove(id);
	}

	@Override
	public List<Formateur> select() {
		return this.dao.select();
	}

	@Override
	public void update(Formateur obj) {
		this.dao.update(obj);
	}
		
	@SuppressWarnings("static-method")
	public Formateur create(String libelle, Boolean isActif, String description,String libelleCourt) {
		// TODO Auto-generated method stub
		Formateur formateur = new Formateur();
		//Formateur.setActif(isActif.booleanValue());
		//Formateur.setDescription(description);
		//Formateur.setLibelle(libelle);
		//Formateur.setLibelleCourt(libelleCourt);
		 
		return formateur;
	}
	
	

}
