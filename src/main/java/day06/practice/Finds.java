package day06.practice;

import java.util.ArrayList;

public class Finds {
	
	 public static boolean findTaskByName(ArrayList<Task> taskArray, String name) {
		boolean isMatch = false;
		
        for (Task task : taskArray) {
            if (task.getTaskName().equalsIgnoreCase(name)) {
                isMatch = true;
            }
        }
        
        if(isMatch) {
        	return true;
        }
        else {
        	return false;
        }
	 }
}
