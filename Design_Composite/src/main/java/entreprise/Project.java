package entreprise;

import java.util.ArrayList;
import java.util.List;

import entreprise.user.User;

public class Project implements Entreprise {
	
	private static int count = 0; 
	private int id;
	private String description;
	private String name;
	private List<User> collaborators = new ArrayList<User>();
	
	public Project(String name) {
		this.id = count++;
		this.name = name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<User> getCollaborators() {
		return collaborators;
	}
}