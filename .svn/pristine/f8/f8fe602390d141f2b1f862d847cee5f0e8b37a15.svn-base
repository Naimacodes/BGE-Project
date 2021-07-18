package fr.bge.facilities;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import fr.bge.jpa.EntityManagerSingleton;
import fr.bge.model.EtatMateriel;
import fr.bge.model.TypeAdresse;
import fr.bge.service.EtatMaterielService;
import fr.bge.service.TypeAdresseService;

@WebListener
public class DataInitContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		createEtatsMateriel(servletContextEvent);
		createTypeAdresse(servletContextEvent);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		EntityManagerSingleton.getInstance().getEntityManager().getEntityManagerFactory().close();
	}
	
	private static void createEtatsMateriel(ServletContextEvent servletContextEvent) {
		EtatMaterielService service = EtatMaterielService.getInstance();
		createEtatMateriel("Neuf", service);
		createEtatMateriel("Presque Neuf", service);
		createEtatMateriel("Usagé", service);
		createEtatMateriel("Abimé", service);
		createEtatMateriel("Hors Service", service);
	}

	private static void createEtatMateriel(String label, EtatMaterielService service) {
		if (service.exist(label)) {
			System.out.println("L'etat materiel '" + label + "' est déjà dans la bdd");
			return;
		}
		EtatMateriel etat = service.create(label);
		service.save(etat);
	}

	private static void createTypeAdresse(ServletContextEvent servletContextEvent) {
		TypeAdresseService service = TypeAdresseService.getInstance();
		createTypeAdresse("Centre de formation", service);
		createTypeAdresse("Personne", service);
	}
	
	private static void createTypeAdresse(String label, TypeAdresseService service) {
		if (service.exist(label)) {
			System.out.println("Le type d'adresse '" + label + "' est déjà dans la bdd");
			return;
		}
		TypeAdresse typeAdresse = service.create(label);
		service.save(typeAdresse);
	}
}
