package entreprise.user;

import java.util.List;

import entreprise.Project;

public abstract class User {
	
	private String nom;
	private String prenom;
	private String email;
	private int telephone;
	
	public String getNom() { return this.nom; }
	
	public void setNom(String nom) { this.nom = nom; }
	
	public String getPrenom() { return this.prenom; }
	
	public void setPrenom(String prenom) { this.prenom = prenom; }
	
	public String getEmail() { return this.email; }
	
	public void setEmail(String email) { this.email = email; }
	
	public int getTelephone() { return this.telephone; }
	
	public void setTelephone(int telephone) { this.telephone = telephone; }
	
	public List<User> getAllCollaborator(Project project) {
		return project.getCollaborators();
	}
}