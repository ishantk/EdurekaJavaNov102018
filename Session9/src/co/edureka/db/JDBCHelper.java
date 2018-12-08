package co.edureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import co.edureka.model.User;

public class JDBCHelper {

	Connection con;
	
	// To Execute SQL Statament
	PreparedStatement pStmt;
	
	// 1. Load the Driver
	public JDBCHelper() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // In Latest jar files -> com.mysql.jdbc.cj.Driver
			System.out.println(">> Driver Loaded");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	//2. Create the Connection
	public void createConnection(){
		try {

			String user = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/edureka";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println(">> Connection Created");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	//3. Write SQL Statement
	//4. Execute SQL Statement
	public int registerUser(User user){
		
		int i = 0;
		
		try {
			
			String sql = "insert into User values(null, ?, ?, ?)";
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.name);
			pStmt.setString(2, user.email);
			pStmt.setString(3, user.password);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return i;
	}
	
	public boolean loginUser(User user){
		boolean check = false;
		try {
			
			String sql = "select * from User where email = ? and password = ?";
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.email);
			pStmt.setString(2, user.password);
			
			ResultSet rs = pStmt.executeQuery();
			
			check = rs.next(); // if next returns true, it means row is fetched !!
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		return check;
		
	}
	
	
	
	//5. Close Connection
	public void closeConnection(){
		try {
			con.close();
			System.out.println(">> Connection Closed");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
}
