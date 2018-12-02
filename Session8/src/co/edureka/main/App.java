package co.edureka.main;

import java.util.ArrayList;

import co.edureka.db.JDBCHelper;
import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {
		
		//Employee emp1 = new Employee(0,"Erwin",32500);
		//Employee emp2 = new Employee(0,"Bob",87500);
		
		//System.out.println(emp1);  //System.out.println(emp1.toString());
		//System.out.println(emp2);  //System.out.println(emp2.toString());
		
		//Employee emp = new Employee(4, "John Watson", 98900);
		
		
		// 1. Load the Driver
		JDBCHelper helper = new JDBCHelper();
		// 2. Create Connection
		helper.createConnection();
		// 3. and 4. Create and Execute SQL Statement
		//helper.insertEmployee(emp1);
		//helper.insertEmployee(emp2);
		
		//helper.updateEmployee(emp);
		//helper.deleteEmployee(4);
		
		ArrayList<Employee> employees = helper.fetchEmployees();
		for(Employee e : employees){
			System.out.println(e);
		}
		
		// 5. Close Connection
		helper.closeConnection();
		

	}

}
