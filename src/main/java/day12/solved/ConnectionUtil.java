package day12.solved;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static Connection getConnection() throws Exception {
		String url = "jdbc:mysql://:3306/jdbc_learn";
		String userName = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		return con;
	}
}
