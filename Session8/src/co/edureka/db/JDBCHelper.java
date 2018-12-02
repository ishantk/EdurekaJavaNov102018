package co.edureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.Employee;

public class JDBCHelper {

	Connection con;
	
	// To Execute SQL Statament
	Statement stmt;
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
	public void insertEmployee(Employee emp){
		try {
			
			//3.
			//String sql = "insert into Employee values(1,'John',30000)";
			//String sql = "insert into Employee values(null,'"+emp.name+"',"+emp.salary+")";
			
			String sql = "insert into Employee values(?, ?, ?)";
			
			//4.
			//stmt = con.createStatement();   		// Create Statement Object
			//int i = stmt.executeUpdate(sql);		// Execution of SQL Statement | executeUpdate -> insert, delete and update operations
			
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, 0);
			pStmt.setString(2, emp.name);
			pStmt.setInt(3, emp.salary);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> "+emp.name+" inserted !!");
			}else{
				System.out.println(">> "+emp.name+" not inserted !!");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void updateEmployee(Employee emp){
		try {
			
			//3.
			//String sql = "insert into Employee values(1,'John',30000)";
			//String sql = "insert into Employee values(null,'"+emp.name+"',"+emp.salary+")";
			
			String sql = "update Employee set name = ?, salary = ? where eid = ?";
			
			//4.
			//stmt = con.createStatement();   		// Create Statement Object
			//int i = stmt.executeUpdate(sql);		// Execution of SQL Statement | executeUpdate -> insert, delete and update operations
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, emp.name);
			pStmt.setInt(2, emp.salary);
			pStmt.setInt(3, emp.eid);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> "+emp.name+" updated !!");
			}else{
				System.out.println(">> "+emp.name+" not updated !!");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void deleteEmployee(int empId){
		try {
			
			String sql = "delete from Employee where eid = ?";
			
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, empId);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> "+empId+" Deleted !!");
			}else{
				System.out.println(">> "+empId+" not Deleted !!");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public ArrayList<Employee> fetchEmployees(){
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		try {
			
			String sql = "Select * from Employee";
			pStmt = con.prepareStatement(sql);
			
			// ResultSet is a data structure contains all the rows fetched from Table
			ResultSet rs = pStmt.executeQuery();		// executeQuery is to retrieve the data from Table
			
			// Iterate in ResultSet to capture all the Records one by one
			// We are mapping a table row as Employee Object
			while(rs.next()){
				Employee emp = new Employee();
				emp.eid = rs.getInt(1);
				emp.name = rs.getString(2);
				emp.salary = rs.getInt(3);
				//System.out.println(emp); //System.out.println(emp.toString());
				//System.out.println("------------------------------------------------");
				
				employees.add(emp);
			}
			
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		return employees;
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
