package day09.practice;

import java.time.LocalDate;
import java.util.*;

class Task {
	private int id;
	private String name;
	private LocalDate deadline;
	
	public Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
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

	public String toString() {
		return "\n" + "id=" + id + ", name=" + name + ", deadline=" + deadline;
	}


}

class DeadLineComparator implements Comparator<Task>{
	
	public int compare(Task t1, Task t2) {
		return(t1.getDeadline().compareTo(t2.getDeadline()));
	}
}

public class SortTask {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Task> TaskList = new ArrayList();
		
		System.out.println("Enter the inputs: ");
		
		String input = scan.nextLine();
		
		while (!input.equalsIgnoreCase("exit")) {
			
			String[] parts = input.split(",");
			
			int id = Integer.parseInt(parts[0].trim());
			String task = parts[1].trim();
			LocalDate deadLine = LocalDate.parse(parts[2].trim());
			
			TaskList.add(new Task(id, task, deadLine));
			
			input = scan.nextLine();
		}
		
		Collections.sort(TaskList, new DeadLineComparator() );
		
		System.out.println(TaskList);
		
	}

}
