package business;

import java.util.List;

public class Employee extends Person {

	public Employee(IMediator mediator, int id, String name, String lastName, List<Task> tasks) {
		super(mediator, id, name, lastName, tasks);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assignResourcetoTask(Task task) {
		getMediator().assignResourcetoTask(task, this.getId());
		
	}

	@Override
	public void unassignResourceToTask(Task task) {
		getMediator().unassignResourceToTask(task, this.getId());		
	}

}
