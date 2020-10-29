package business;

import java.util.List;

public abstract class Person {
	private IMediator mediator;
	private int id;
	private String name;
	private String lastName;
	private List<Task> tasks;
	public Person(IMediator mediator,int id,String name,String lastName,List<Task> tasks) {
		this.lastName=lastName;
		this.name=name;
		this.id=id;
		this.tasks=tasks;
	}
	public IMediator getMediator() {
		return mediator;
	}
	public void setMediator(IMediator mediator) {
		this.mediator = mediator;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public abstract void assignResourcetoTask(Task task);

	public abstract void unassignResourceToTask(Task task);
	
}
