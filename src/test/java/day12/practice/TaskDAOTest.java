package day12.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TaskDAOTest {

    private static TaskDAO taskDAO;

    @BeforeAll
    public static void setup() {
        taskDAO = new TaskDAO();
    }

    @Test
    public void testCreateTask() {
        Task task = new Task();
        task.id = 1;
        task.name = "Reading";
        task.status = 1;

        Assertions.assertDoesNotThrow(() -> taskDAO.createTask(task));
    }

    @Test
    public void testUpdateTask() {
        Task task = new Task();
        task.id = 1;
        task.name = "Reading";
        task.status = 1;

        Assertions.assertDoesNotThrow(() -> taskDAO.updateTask(task));
    }

    @Test
    public void testDeleteTask() {
        int taskId = 1;

        Assertions.assertDoesNotThrow(() -> taskDAO.deleteTask(taskId));
    }

    @Test
    public void testGetAllTasks() {
        Assertions.assertDoesNotThrow(() -> {
            List<Task> tasks = taskDAO.getAllTasks();
            System.out.println(tasks);
        });
    }
}

