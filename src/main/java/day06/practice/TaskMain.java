package day06.practice;

import java.util.ArrayList;

public class TaskMain {
	
	public static ArrayList<Task> createTaskList(Task... task){
		
		ArrayList<Task> taskList = new ArrayList<Task>();
		
		for(Task newtask : task) {
			
			taskList.add(newtask);

		}
		
		return taskList;
		
	}
	
}
