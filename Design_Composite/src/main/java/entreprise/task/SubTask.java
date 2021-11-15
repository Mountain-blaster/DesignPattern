package entreprise.task;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entreprise.user.Developer;

public class SubTask extends Task {
	
	private List<Comment> comments = new ArrayList<Comment>();	
	private List<Task> tasks = new ArrayList<Task>();
	
	public SubTask(String description, Statuts statut, Date deadline, Developer manager) {
		super(description, statut, deadline, manager);
		subTask = true;
	}
	
	public void operation() {
		String tab = "	";
		for (int i = 0; i < level; i++) {
			if (i == level - 1) tab = "\n" + tab + "	"; 
			else tab += "	"; 
		}
		
		if (level == 0) {
			System.out.println("\n\n");
			System.out.printf("%70s", "Task: " + description + "\n");
			System.out.println();
			System.out.println(tab + "	" + "==============================================================================================\n");
		    System.out.printf(tab + "		" + "%10s %25s %30s %30s", "DESCRIPTION", "STATUS", "DEADLINE", "MANAGER" + "\n");
		}
		else System.out.println(tab + "SubTask: " + description);
		
		for (Task task:tasks) {
			task.operation();
			if (!task.subTask)
				System.out.format(tab + "	" + "%10s %15s %40s %20s", task.getDescription(), task.getStatus(), task.getDeadline(), task.getManager() != null ? task.getManager().getPrenom() : null);
				System.out.println();
		}
	}
	
	public void addComment(Comment c) {
		this.comments.add(c);
	}
	
	public void removeComment(Comment c) { 
		this.comments.remove(c);
	}
	
	public List<Comment> getAllComment() {
		return comments;
	}
	
	public void addTask(Task task) {
		task.level += this.level + 1;
		tasks.add(task);
	}
	
	public void removeTask(Task task) {
		tasks.remove(task);
	}
	
	public List<Task> getAllTask() {
		return tasks;
	}
}