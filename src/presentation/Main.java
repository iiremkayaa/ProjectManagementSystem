package presentation;

import java.util.Date;

import business.Activity;
import business.Consultant;
import business.Employee;
import business.IMediator;
import business.Mediator;
import business.Person;
import business.Project;
import business.Task;

public class Main {
	public static void main(String[] args) {
		IMediator mediator=new Mediator();
		Person person1=new Employee(mediator,1,"Irem","Kaya",null);
		Person person2=new Consultant(mediator,2,"Melisa","Oklu",null);
		Person person3=new Employee(mediator,3,"Hazal","Erdogan",null);
		Person person4=new Consultant(mediator,4,"Merve","Tekin",null);
		mediator.addPerson(person1);
		mediator.addPerson(person2);
		mediator.addPerson(person3);
		mediator.addPerson(person4);
		
		Project project1=new Project(mediator,1,"Project-1","Description-1",new Date(),null);
		Activity activity1=new Activity(mediator,1,"Activity-1",new Date(),"Deliverable",2,null);
		Task task1=new Task(mediator,1,"Task-1",new Date(),5,"Deliverable");
		mediator.addTaskToActivity(task1, activity1.getNumber());
		mediator.addActivityToProject(activity1, project1.getId());
		mediator.assignResourcetoTask(task1, 3);
		
	}
}
