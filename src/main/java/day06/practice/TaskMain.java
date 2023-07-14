package day06.practice;

import java.util.ArrayList;

class taskArrayList {
	
	private ArrayList<Task> taskArray;
	
	taskArrayList(){
		taskArray = new ArrayList();
	}
	
	
	public void addElement(Task element){
		taskArray.add(element);
	}
	
	public String gettaskArray(Task task) {
        return task.getTask();
    }
	
}

public class TaskMain {
	
	public static void main(String[] args) {
		
		taskArrayList taskArray = new taskArrayList();
		
		Task task1 = new Task("Check Instagram", 1);
		Task task2 = new Task("Clean my desk", 2);
		Task task3 = new Task("Learn about web3.0", 3);
		Task task4 = new Task("Learn java", 4);
		Task task5 = new Task("complete the project", 5);
		
		taskArray.addElement(task1);
		taskArray.addElement(task2);
		taskArray.addElement(task3);
		taskArray.addElement(task4);
		taskArray.addElement(task5);
		
		System.out.print(taskArray.gettaskArray(task1));
		System.out.print(taskArray.gettaskArray(task2));
		System.out.print(taskArray.gettaskArray(task3));
		System.out.print(taskArray.gettaskArray(task4));
		System.out.print(taskArray.gettaskArray(task5));
		
		
	}

}
