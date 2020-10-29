package business;

import java.util.Date;
import java.util.List;

public class Project {
	public int id;
	private String name;
	private String description;
	private Date startDate;
	private List<Activity> activities;
	private IMediator mediator;
	public Project(IMediator mediator,int id, String name, String description, Date startDate, List<Activity> activities) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.startDate = startDate;
		this.activities = activities;
		this.mediator=mediator;
	}
	public IMediator getMediator() {
		return mediator;
	}
	public void setMediator(IMediator mediator) {
		this.mediator = mediator;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Activity> getActivities() {
		return activities;
	}
	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public void addActivityToProject(Activity activity) {
		getMediator().addActivityToProject(activity,this.getId());
	}
	
	
}
