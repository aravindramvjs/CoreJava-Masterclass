package day09.practice;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTaskTest {

    @Test
    public void testSortTasks_EmptyList() {
        List<Task> taskList = new ArrayList<>();
        List<Task> expectedOutput = new ArrayList<>();
        List<Task> result = SortTask.sortTasks(taskList);
        assertEquals(expectedOutput, result, "Empty list should return empty list");
    }

    @Test
    public void testSortTasks_SingleTask() {
        Task task = new Task(1, "Task A", LocalDate.parse("2023-07-30"));
        List<Task> taskList = Arrays.asList(task);
        List<Task> expectedOutput = Arrays.asList(task);
        List<Task> result = SortTask.sortTasks(taskList);
        assertEquals(expectedOutput, result, "Single task list should remain unchanged");
    }

    @Test
    public void testSortTasks_MultipleTasks() {
        Task task1 = new Task(1, "Task A", LocalDate.parse("2023-07-30"));
        Task task2 = new Task(2, "Task B", LocalDate.parse("2023-08-15"));
        Task task3 = new Task(3, "Task C", LocalDate.parse("2023-07-25"));

        List<Task> taskList = Arrays.asList(task1, task2, task3);

        List<Task> expectedOutput = Arrays.asList(task3, task1, task2);
        List<Task> result = SortTask.sortTasks(taskList);

        assertEquals(expectedOutput, result, "Tasks should be sorted based on the deadline");
    }
}
