package day09.practice;

import java.time.LocalDate;
import java.util.*;

class Task {
    private int id;
    private String name;
    private LocalDate deadline;

    public Task(int id, String name, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public String toString() {
        return "\n" + "id=" + id + ", name=" + name + ", deadline=" + deadline;
    }
}

class DeadLineComparator implements Comparator<Task> {

    public int compare(Task t1, Task t2) {
        return t1.getDeadline().compareTo(t2.getDeadline());
    }
}

public class SortTask {

    public static List<Task> sortTasks(List<Task> taskList) {
        Collections.sort(taskList, new DeadLineComparator());
        return taskList;
    }

    // Test case
    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task(1, "Task A", LocalDate.parse("2023-07-30")));
        taskList.add(new Task(2, "Task B", LocalDate.parse("2023-08-15")));
        taskList.add(new Task(3, "Task C", LocalDate.parse("2023-07-25")));

        List<Task> sortedTasks = sortTasks(taskList);
        System.out.println(sortedTasks);
    }
}
