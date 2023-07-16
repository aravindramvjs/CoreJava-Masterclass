package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveTaskDuplicates {

	public static void main(String[] args) {

        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(new Task(1, "Task 1", LocalDate.of(2023, 7, 15)));
        taskList.add(new Task(2, "Task 2", LocalDate.of(2023, 7, 16)));
        taskList.add(new Task(3, "Task 1", LocalDate.of(2023, 7, 15)));
        taskList.add(new Task(4, "Task 3", LocalDate.of(2023, 7, 17)));
        taskList.add(new Task(5, "Task 1", LocalDate.of(2023, 7, 15)));
        
        
        HashSet<Task> uniqueTasks = new HashSet<>(taskList);

      taskList.clear();
      taskList.addAll(uniqueTasks);

        System.out.println("\nTask list after removing duplicates:");
        for (Task task : taskList) {
            System.out.println(task);
        }


	}
	
}
