package entreprise.task;

import java.util.Date;

import entreprise.user.Developer;

public class Content extends Task {

	public Content(String description, Statuts statut, Date deadline, Developer manager) {
		super(description, statut, deadline, manager);
	}

	public void operation() {
		String tab = "	";
		for (int i = 0; i < level; i++) { tab += "	"; }
		System.out.println();
	}
}