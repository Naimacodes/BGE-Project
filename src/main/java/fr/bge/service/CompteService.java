package fr.bge.service;

import java.util.List;

import fr.bge.dao.CRUDable;
import fr.bge.dao.CompteDao;
import fr.bge.model.Compte;

public class CompteService implements CRUDable<Compte, Long> {

	private CompteDao dao = CompteDao.getInstance();

	private final static CompteService INSTANCE = new CompteService();

	private CompteService() {

	}

	public static CompteService getInstance() {
		return INSTANCE;
	}

	@Override
	public Long save(Compte obj) {
		return this.dao.save(obj);
	}

	@Override
	public Compte get(Long id) {
		return this.dao.get(id);
	}

	@Override
	public Compte remove(Long id) {
		return this.dao.remove(id);
	}

	@Override
	public List<Compte> select() {

		return this.dao.select();
	}

	@Override
	public void update(Compte obj) {
		this.dao.update(obj);
	}

	public boolean exist(String email) {
		return this.dao.exist(email);
	}

	/**
	 * Recherche le compte du mail trouvé. Normalement le mail est unique.
	 * 
	 * @param email
	 * @return
	 */
	public Compte findByEmail(String email) {
		return this.dao.findByEmail(email);
	}

	public boolean login(String email, String motDePasse) {
		return this.dao.login(email, motDePasse);
	}
	public Compte create(String email, String motDePasse, String nom, String prenom, String telephone) {
		Compte compte = new Compte();
		compte.setNom(nom);
		compte.setPrenom(prenom);
		compte.setEmail(email);
		compte.setTelephone(telephone);
		compte.setMotDePasse(motDePasse);
        return compte;
    }
	public Compte merge(Long id, String telephone) {
		Compte compte = this.dao.get(id);
		compte.setTelephone(telephone);
		return compte;
	}
}
