package business;

import java.util.Date;

public class Task {
	
	private int number;
	private String description;
	private Date startDate;
	private int hour;
	private int resourceId;
	private String deliverable;
	private IMediator mediator;
	public Task(IMediator mediator,int number, String description, Date startDate, int hour,String deliverable) {
		super();
		this.number = number;
		this.description = description;
		this.startDate = startDate;
		this.hour = hour;
		this.deliverable = deliverable;
		this.mediator=mediator;
	}
	public IMediator getMediator() {
		return mediator;
	}
	public void setMediator(IMediator mediator) {
		this.mediator = mediator;
	}
	public String getDeliverable() {
		return deliverable;
	}
	public void setDeliverable(String deliverable) {
		this.deliverable = deliverable;
	}
	public int getNumber() {
		return number;
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
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getResourceId() {
		return resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	
	
}
