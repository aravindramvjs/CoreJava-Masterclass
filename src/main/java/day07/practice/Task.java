package day07.practice;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
	private int id;
	private String name;
	private LocalDate deadline;
	
	public Task(int id, String name, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
    }
	
	public boolean equals(Task task) {
        if (this == task) {
            return true;
        }
        if (task == null || getClass() != task.getClass()) {
            return false;
        }
        return this.id == task.id && Objects.equals(this.name, task.name) && Objects.equals(this.deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, deadline);
    }

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
	}
	
}
