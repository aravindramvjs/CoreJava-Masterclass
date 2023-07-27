package day11.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

class Task {
    public int id;
    public String name;
    public boolean status;

    public Task(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public String toString() {
        String s = "Task Id: " + id + " Task name: " + name + " Task Status: " + status;
        return s;
    }
}

