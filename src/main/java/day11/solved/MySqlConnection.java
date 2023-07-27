package day11.solved;

import java.sql.*;

public class MySqlConnection {
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://:3306/freshtimejdbc";
		String userName = "root";
		String password = "root";
		
		String query = "SELECT * FROM Users";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		System.out.println("connection created");
		
	    con.close();
	}
}