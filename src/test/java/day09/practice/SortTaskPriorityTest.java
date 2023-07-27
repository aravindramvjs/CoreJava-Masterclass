package day09.practice;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTaskPriorityTest {

    @Test
    public void testSortTasksWithPriority_EmptyList() {
        List<TaskwithPriority> taskList = new ArrayList<>();
        List<TaskwithPriority> expectedOutput = new ArrayList<>();
        List<TaskwithPriority> result = SortTaskPriority.sortTasksWithPriority(taskList);
        assertEquals(expectedOutput, result, "Empty list should return empty list");
    }

    @Test
    public void testSortTasksWithPriority_SingleTask() {
        TaskwithPriority task = new TaskwithPriority(1, "Task A", LocalDate.parse("2023-07-30"), 2);
        List<TaskwithPriority> taskList = Arrays.asList(task);
        List<TaskwithPriority> expectedOutput = Arrays.asList(task);
        List<TaskwithPriority> result = SortTaskPriority.sortTasksWithPriority(taskList);
        assertEquals(expectedOutput, result, "Single task list should remain unchanged");
    }
}
