package day11.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class AddTaskIntoDB {

    public void addTasksToDb(List<Task> tasks) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_learn", "root", "root");

        String query = "INSERT INTO task_details(id, taskname, status) VALUES (?, ?, ?)";

        try (PreparedStatement psmt = con.prepareStatement(query)) {
            for (Task t : tasks) {
                psmt.setInt(1, t.id);
                psmt.setString(2, t.name);
                psmt.setBoolean(3, t.status);

                int num = psmt.executeUpdate();

                System.out.println(num);
            }
        }
    }
}
