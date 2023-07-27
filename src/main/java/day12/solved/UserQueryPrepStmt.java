package day12.solved;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserQueryPrepStmt {
	public static void main(String[] args) throws Exception{
		Connection connection = ConnectionUtil.getConnection();
		String query ="INSERT INTO USERS (user_name, email_id,  password) VALUES ( ?, ?, ? );";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, "aravind ram");
		pst.setString(2, "aravind.ram@fssa.freshworks.com");
		pst.setString(3, "password21");
		System.out.println(pst.toString());
		int rows2 = pst.executeUpdate();
		System.out.println("No of rows inserted :" + rows2 );
		pst.close();
	
	}
	
}
