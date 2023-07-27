package day09.practice;

import java.time.LocalDate;
import java.util.*;

class TaskwithPriority {
    private int id;
    private String name;
    private LocalDate deadline;
    private int priority;

    public TaskwithPriority(int id, String name, LocalDate deadline, int priority) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
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

    public int getPriority() {
        return priority;
    }

    public String toString() {
        return "\n" + "id=" + id + ", name=" + name + ", deadline=" + deadline + " Priority: " + priority;
    }
}

class DeadLinePriorityComparator implements Comparator<TaskwithPriority> {

    public int compare(TaskwithPriority task1, TaskwithPriority task2) {
        if (task1.getDeadline().compareTo(task2.getDeadline()) == 0) {
            if (task1.getPriority() == task2.getPriority()) {
                return 0;
            } else if (task1.getPriority() < task2.getPriority()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return task1.getDeadline().compareTo(task2.getDeadline());
        }
    }
}

public class SortTaskPriority {

    public static List<TaskwithPriority> sortTasksWithPriority(List<TaskwithPriority> taskList) {
        Collections.sort(taskList, new DeadLinePriorityComparator());
        return taskList;
    }

    // Test case
    public static void main(String[] args) {
        List<TaskwithPriority> taskList = new ArrayList<>();
        taskList.add(new TaskwithPriority(1, "Task A", LocalDate.parse("2023-07-30"), 2));
        taskList.add(new TaskwithPriority(2, "Task B", LocalDate.parse("2023-08-15"), 1));
        taskList.add(new TaskwithPriority(3, "Task C", LocalDate.parse("2023-07-25"), 3));

        List<TaskwithPriority> sortedTasks = sortTasksWithPriority(taskList);
        System.out.println(sortedTasks);
    }
}

