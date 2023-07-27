package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class RemoveTaskDuplicates {
	
	public static ArrayList<Task> removeDuplicateTasks(ArrayList<Task> taskList) {
		
		HashSet<Task> uniqueTasks = new HashSet<>(taskList);
		taskList.clear();
		taskList.addAll(uniqueTasks);
		
		return taskList;
	}
	
}
