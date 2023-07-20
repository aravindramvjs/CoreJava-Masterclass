package day07.practice;

import java.time.LocalDate;

public class Task {
	private int id;
	private String name;
	private LocalDate deadline;
	
	public Task(int id, String name, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
    }

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
	}
	
}
