package business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mediator implements IMediator {
	private List<Person> personList = new ArrayList<>();
	private List<Project> projectList = new ArrayList<>();
	@Override
	public void addPerson(Person person) {
		personList.add(person);
	}

	@Override
	public void addProject(Project project) {
		projectList.add(project);
	}

	@Override
	public void removeProject(Project project) {
		projectList.remove(project);

	}

	@Override
	public void updateProject(int id, Project project) {
		if (id == project.id) {
			for (Project p : projectList) {
				if (p.getId() == id) {
					p.setName(project.getName());
					p.setStartDate(project.getStartDate());
					p.setActivities(project.getActivities());
					p.setDescription(project.getDescription());
				}
			}
		}

	}

	@Override
	public void assignResourcetoTask(Task task, int personId) {
		for (Person person : personList) {
			if (person.getId() == personId) {
				List<Task> tasks = person.getTasks();
				tasks.add(task);
				person.setTasks(tasks);
				task.setResourceId(personId);
				break;
			}
		}

	}

	@Override
	public void unassignResourceToTask(Task task, int personId) {
		for (Person person : personList) {
			if (person.getId() == personId) {
				List<Task> tasks = person.getTasks();
				tasks.remove(task);
				person.setTasks(tasks);
				break;
			}
		}

	}

	@Override
	public int calculateProjectDuration(int projectId) {
		int duration = 0;
		for (Project project : projectList) {
			if (project.getId() == projectId) {
				List<Activity> activities = project.getActivities();
				for (Activity activity : activities) {
					duration += activity.getHour();
				}
				break;
			}

		}
		return duration;
	}

	@Override
	public int calculateTaskDuration(int taskNumber) {
		int duration = 0;
		for (Project project : projectList) {
			List<Activity> activities = project.getActivities();
			for (Activity activity : activities) {
				for(Task task:activity.getTasks()) {
					if(taskNumber==task.getNumber()) {
						duration=task.getHour();
					}
				}
			}
		}
		return duration;
	}

	@Override
	public int calculateActivityDuration(int activityNumber) {
		int duration = 0;
		for (Project project : projectList) {
			List<Activity> activities = project.getActivities();
			for (Activity activity : activities) {
				if(activity.getNumber()==activityNumber) {
					duration += activity.getHour();
				}
			}
		}
		return duration;
	}

	@Override
	public int numberOfResource() {
		return 0;
	}
	@Override
	public void addActivityToProject(Activity activity,int projectId) {
		for(Project project:projectList) {
			if(project.getId()==projectId) {
				List<Activity> activities=project.getActivities();
				activities.add(activity);
				project.setActivities(activities);
				break;
			}
		}
		
	}

	@Override
	public void addTaskToActivity(Task task, int activityNumber) {
		for(Project project:projectList) {
			for(Activity activity:project.getActivities()) {
				if(activity.getNumber()==activityNumber) {
					List<Task> taskList=new ArrayList<Task>();
					taskList.add(task);
					activity.setTasks(taskList);
				}
			}
		}
	}
}
