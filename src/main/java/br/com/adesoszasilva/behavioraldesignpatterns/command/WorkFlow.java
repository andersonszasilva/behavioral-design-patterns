package br.com.adesoszasilva.behavioraldesignpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class WorkFlow {
	
	private List<Command> commands = new ArrayList<>();

	public void process() {
		commands.forEach(Command::execute);
	}
	
	public void addCommands(Command command) {
		commands.add(command);
	}

}
