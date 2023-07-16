package day06.practice;

public class Task {
	
	private String taskName;
	private int priority;
	
	public Task(String taskName, int priority) {
		this.taskName = taskName;
		this.priority = priority;
	}

	public String toString() {
		return  "\n" + "TaskName : " + taskName + ", priority : " + priority;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	
}
