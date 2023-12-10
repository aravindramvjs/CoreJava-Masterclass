package day12.practice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class DAOException extends Exception {

	private static final long serialVersionUID = -5868756665431641926L;

	public DAOException(String message) {
        super(message);
    }
}

class Task {
    int id;
    String name;
    int status;
}

class TaskDAO {

    private static final String DB_URL = "jdbc:mysql://:3306/jdbc_learn";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public void createTask(Task task) throws DAOException {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String insertQuery = "INSERT INTO task_details (id, taskname, status) VALUES (?, ?, ?)";
            try (PreparedStatement psmt = connection.prepareStatement(insertQuery)) {
                psmt.setInt(1, task.id);
                psmt.setString(2, task.name);
                psmt.setInt(3, task.status);
                psmt.executeUpdate();
            }
        } catch (SQLException e) {
            throw new DAOException("Error while creating task: " + e.getMessage());
        }
    }

    public void updateTask(Task task) throws DAOException {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String updateQuery = "UPDATE task_details SET taskname=?, status=? WHERE id=?";
            try (PreparedStatement psmt = connection.prepareStatement(updateQuery)) {
                psmt.setString(1, task.name);
                psmt.setInt(2, task.status);
                psmt.setInt(3, task.id);
                psmt.executeUpdate();
            }
        } catch (SQLException e) {
            throw new DAOException("Error while updating task: " + e.getMessage());
        }
    }

    public void deleteTask(int taskId) throws DAOException {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String deleteQuery = "DELETE FROM task_details WHERE id=?";
            try (PreparedStatement psmt = connection.prepareStatement(deleteQuery)) {
                psmt.setInt(1, taskId);
                psmt.executeUpdate();
            }
        } catch (SQLException e) {
            throw new DAOException("Error while deleting task: " + e.getMessage());
        }
    }

    public List<Task> getAllTasks() throws DAOException {
        List<Task> tasks = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String selectQuery = "SELECT id, taskname, status FROM task_details";
            try (PreparedStatement psmt = connection.prepareStatement(selectQuery);
                 ResultSet rs = psmt.executeQuery()) {

                while (rs.next()) {
                    Task task = new Task();
                    task.id = rs.getInt("id");
                    task.name = rs.getString("taskname");
                    task.status = rs.getInt("status");
                    tasks.add(task);
                }
            }
        } catch (SQLException e) {
            throw new DAOException("Error while fetching all tasks: " + e.getMessage());
        }
        return tasks;
    }

}
