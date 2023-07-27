package day07.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class testRemoveTaskDuplicates {

    @Test
    void testRemoveDuplicateTasks() {
    	Task task1 = new Task(1, "Task 1", LocalDate.of(2023, 7, 15));
    	Task task2 = new Task(2, "Task 2", LocalDate.of(2023, 7, 16));
    	Task task3 = new Task(1, "Task 1", LocalDate.of(2023, 7, 15));

        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);

        ArrayList<Task> actualOutput = RemoveTaskDuplicates.removeDuplicateTasks(taskList);

        HashSet<Task> expectedOutput = new HashSet<>();
        expectedOutput.add(task1);
        expectedOutput.add(task2);

        assertEquals(expectedOutput, actualOutput);
        assertEquals(expectedOutput.size(), taskList.size());
    }

}