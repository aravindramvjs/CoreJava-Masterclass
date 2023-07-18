package day09.practice;

import java.time.LocalDate;
import java.util.*;

class TaskwithPriority {
	private int id;
	private String name;
	private LocalDate deadline;
	private int priority;
	
	public TaskwithPriority(int id, String name, LocalDate deadline, int priority) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.priority = priority;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDeadline() {
		return deadline;
	}
	public int getPriority() {
		return priority;
	}

	public String toString() {
		return "\n" + "id=" + id + ", name=" + name + ", deadline=" + deadline + " Priority: " + priority;
	}
}

class DeadLinePriorityComparator implements Comparator<TaskwithPriority>{
	
	public int compare(TaskwithPriority task1, TaskwithPriority task2) {
		if(task1.getDeadline().compareTo(task2.getDeadline()) == 0) {
			if(task1.getPriority() == task2.getPriority()) {
				return 0;
			}
			else if(task1.getPriority() < task2.getPriority()) {
				return 1;
			}
			else {
				return -1;
			}
		}
		else {
			return (task1.getDeadline().compareTo(task2.getDeadline()));
		}
	}
}

public class SortTaskPriority {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<TaskwithPriority> TaskList = new ArrayList();
		
		System.out.println("Enter the inputs: ");
		
		String input = scan.nextLine();
		
		while (!input.equalsIgnoreCase("exit")) {
			
			String[] parts = input.split(",");
			
			int id = Integer.parseInt(parts[0].trim());
			String task = parts[1].trim();
			LocalDate deadLine = LocalDate.parse(parts[2].trim());
			int priority = Integer.parseInt(parts[3].trim());
			
			TaskList.add(new TaskwithPriority(id, task, deadLine, priority));
			
			input = scan.nextLine();
		}
		
		Collections.sort(TaskList, new DeadLinePriorityComparator() );
		
		System.out.println(TaskList);
		
	}

}
