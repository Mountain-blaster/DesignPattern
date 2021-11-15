package entreprise.task;

import java.util.*;

import entreprise.Project;
import entreprise.user.Developer;

public abstract class Task {
	
	public enum Statuts { New, InProgress, Done };
	
	protected int idProject;
	protected int level;
	protected String description;
	protected Statuts statut;
	protected Date deadline;
	protected Developer manager;
	protected Boolean subTask = false;
	
	public Task(Project p, String description, Statuts statut, Date deadline, Developer manager) {
		this.idProject = p.getId();
		this.description = description;
		this.statut = statut;
		this.deadline = deadline;
		this.manager = manager;
	}
	
	public Task(String description, Statuts statut, Date deadline, Developer manager) {
		this.description = description;
		this.statut = statut;
		this.deadline = deadline;
		this.manager = manager;
	}
	
	public String getDescription() { return this.description; }
	
	public void setDescription(String description) { this.description = description; }
	
	public Statuts getStatus() { return this.statut; }
	
	public void setStatus(Statuts status) { this.statut = status; }
	
	public Developer getManager() { return this.manager; }
	
	public void setManager(Developer d) { this.manager = d; }
	
	public Date getDeadline() { return this.deadline; }
	
	public void setDeadline(Date d) { this.deadline = d; }

	public void operation() {};
}
