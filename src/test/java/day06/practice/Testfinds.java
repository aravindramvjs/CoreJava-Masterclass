package day06.practice;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Testfinds {
	
	@Test
	void TestfindTaskByName() {
		
		ArrayList<Task> taskArray = new ArrayList<Task>();
		
		Task task1 = new Task("Check Instagram", 1);
		Task task2 = new Task("Clean my desk", 2);
		Task task3 = new Task("Learn about web3.0", 3);
		Task task4 = new Task("Learn java", 4);
		Task task5 = new Task("complete the project", 5);
		
		taskArray.add(task1);
		taskArray.add(task2);
		taskArray.add(task3);
		taskArray.add(task4);
		taskArray.add(task5);
		
		String searchName = "Learn java";
		
		boolean result = Finds.findTaskByName(taskArray, searchName);
		
		assertTrue(result);
		
		
	}

}
