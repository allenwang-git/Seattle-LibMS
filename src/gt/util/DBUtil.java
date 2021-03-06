package gt.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Database connection utility class
 * @author Wang, Yinuo
 *
 */
public class DBUtil {

	// Set database login info
	public static final String URL = "jdbc:mysql://localhost:3306/lib_db?useSSL=false";
	public static final String USER = "root";
	public static final String PASSWORD = "666";
	
	/*
	 * Close the connection
	 */ 
	public void closeCon(Connection conn) throws Exception{
		if(conn!=null)
		{
			conn.close();
		}
	}
	/*
	 * Connect to the database
	 */
	public Connection getCon() throws Exception{
		// Load database driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Connect database
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		return conn;
	}
	
	/*
	 * Demo run for DB test
	 */
	public void dbDemo(Connection conn) throws Exception {
		// query the database
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT Name, User_id FROM user WHERE Name='Percy Reyes'");
		// if query result is not void, rs return true
		while(rs.next()){
			System.out.println(rs.getString("Name")+" ID:"+rs.getString("User_id"));
		}
	}
	/*
	 * Main function for test
	 */
	public static void main(String[] args) throws Exception {
		
		DBUtil dbUtil = new DBUtil();
		
		try {
			Connection conn = dbUtil.getCon();
			System.out.println("Database Connected.");
			if (conn!=null) 
			{
				// run the demo
				dbUtil.dbDemo(conn);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Connection Failed.");
		}
		
	}

}
