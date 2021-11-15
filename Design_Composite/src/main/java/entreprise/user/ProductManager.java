package entreprise.user;

import entreprise.Project;

public class ProductManager extends User {
	
	public void removeCollaborator(Project p, User c) { 
		p.getCollaborators().remove(c);
	}
	
	public void addCollaborator(Project p, User c) {
		p.getCollaborators().add(c);
	}
}