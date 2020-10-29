package business;

import java.util.Date;
import java.util.List;

public class Activity {
	private int number;
	private String description;
	private Date startDate;
	private String deliverable;
	private int hour;
	private List<Task> tasks;
	private IMediator mediator;
	public Activity(IMediator mediator,int number,String description,Date startDate,String deliverable,int hour,List<Task> tasks) {
		this.description=description;
		this.number=number;
		this.startDate=startDate;
		this.deliverable=deliverable;
		this.hour=hour;
		this.tasks=tasks;
		this.mediator=mediator;
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
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getNumber() {
		return number;
	}
	public int getHour() {
		return hour;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getDeliverable() {
		return deliverable;
	}
	public void setDeliverable(String deliverable) {
		this.deliverable = deliverable;
	}
	
	
}
