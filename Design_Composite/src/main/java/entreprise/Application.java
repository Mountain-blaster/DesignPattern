package entreprise;

import java.util.Date;

import entreprise.task.Content;
import entreprise.task.SubTask;
import entreprise.user.Developer;
import entreprise.user.ProductManager;

public class Application {

	public static void main(String[] args) {
		
		// Crearion Projet
		Project projet = new Project("Prestation de Service");
		
		System.out.println("	---------------------------------------------------------------------------------------------------------------------\n");
	    System.out.printf("	%75s", Entreprise.nomEntreprise + " Entreprise : " + projet.getName() + "\n\n");
	    System.out.println("	---------------------------------------------------------------------------------------------------------------------");
	    
	    ProductManager manager = new ProductManager();
	    Developer developer1 = new Developer();
	    Developer developer2 = new Developer();
	    
	    developer1.setPrenom("Mouhamed");
	    developer1.setNom("Tall");
	    
	    developer2.setPrenom("Falilou");
	    developer2.setNom("Fall");
	    
		// TODO Auto-generated method stub
		SubTask task1 = new SubTask("Gestion task 1", null, null, null);
		SubTask task2 = new SubTask("Gestion task 2", null, null, null);
		SubTask subtask1 = new SubTask("Test Deployment", null, null, null);
		SubTask subtask2 = new SubTask("Change Template", null, null, null);
		
		task1.setManager(developer1);
		task1.setDeadline(new Date());
		
		task2.setManager(developer2);
		task2.setDeadline(new Date());
		
		subtask1.setManager(developer1);
		subtask1.setDeadline(new Date());
		
		subtask2.setManager(developer2);
		subtask2.setDeadline(new Date());
		
		task1.addTask(subtask1);
		task1.addTask(subtask2);
		
		task1.addTask(new Content("Mise en prod", task1.getStatus().InProgress, new Date(), null));
		task1.addTask(new Content("Correct bugs", null, new Date(), null));
		task1.addTask(new Content("Change design", task1.getStatus().InProgress, new Date(), null));
		
		subtask1.addTask(new Content("Gestion du ticket 11", subtask1.getStatus().Done, new Date(), developer1));
		subtask1.addTask(new Content("Gestion du ticket 12", subtask1.getStatus().New, new Date(), developer1));
		subtask1.addTask(new Content("Gestion du ticket 13", subtask1.getStatus().Done, new Date(), developer1));
		
		subtask2.addTask(new Content("Gestion du ticket 21", subtask2.getStatus().New, new Date(), developer2));
		subtask2.addTask(new Content("Gestion du ticket 22", subtask2.getStatus().New, new Date(), developer2));
		subtask2.addTask(new Content("Gestion du ticket 23", subtask2.getStatus().Done, new Date(), developer2));
		
		task1.operation();
		task2.operation();
	}
}
