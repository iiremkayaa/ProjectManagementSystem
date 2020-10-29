package business;

import java.util.Date;
import java.util.List;

public interface IMediator {
	public void addProject(Project project);
	public void removeProject(Project project);
	public void updateProject(int id,Project project);
	public void assignResourcetoTask(Task task,int personId);
	public void unassignResourceToTask(Task task,int personId);
	public int calculateProjectDuration(int projectId);
	public int calculateTaskDuration(int taskNumber);
	public int calculateActivityDuration(int activityNumber);
	public int numberOfResource();
	
	
	public void addPerson(Person person);
	public void addActivityToProject(Activity activity,int projectId);
	public void addTaskToActivity(Task task,int activityNumber);
}
