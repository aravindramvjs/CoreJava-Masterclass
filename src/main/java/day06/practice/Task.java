package day06.practice;

public class Task {
	
	private String taskName;
	private int priority;
	
	public Task(String taskName, int priority) {
		this.taskName = taskName;
		this.priority = priority;
	}

	public String getTask() {
		return  "\n" + "TaskName : " + taskName + ", priority : " + priority;
	}
	
	
}
