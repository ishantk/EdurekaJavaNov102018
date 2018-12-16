package co.edureka.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {
		
		// Create Objects
		/*Employee emp1 = new Employee();
		emp1.setEid(null);
		emp1.setName("Sia");
		emp1.setEmail("sia@example.com");
		emp1.setSalary(40000);
		emp1.setDepartment("HR");
		
		Employee emp2 = new Employee(null, "Fionna", "fionna@example.com", 50000, "R&D");

		// Lets see data in Objects
		System.out.println(emp1); // -> System.out.println(emp1.toString());
		System.out.println(emp2);*/
		
		// Object containing data is temporary as its in Heap of RAM
		// We need to persist the data !!
		// Use Database with Hibernate
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		AnnotationConfiguration aConfig;
		
		try {

			config = new Configuration();
			config.configure(); // Reads/Parses hibernate.cfg.xml file !!
			//config.configure(anyname.xml); // Reads/Parses anyname.xml if hibernate.cfg.xml file is renamed to anyname.xml !!
			
			//aConfig = new AnnotationConfiguration();
			//aConfig.configure();
			
			factory = config.buildSessionFactory();
			//factory = aConfig.buildSessionFactory();
			
			session = factory.openSession(); // Creating Connection with DB
			
			transaction = session.beginTransaction();	// Fire our SQL as Transaction
			
			//1. Insert Data into Tables
			//session.save(emp1); 
			//session.save(emp2);
			
			//2. Get the Row as Object from Hibernate : Read Operation | Read a Single Record
			/*Employee emp = (Employee)session.get(Employee.class, 3);
			System.out.println(emp);
			
			//3. Update the Record
			// Get the Record First
			emp.setName("Fionna Flynn");
			emp.setEmail("fionna.flynn@example.com");
			emp.setSalary(75700);
			
			session.update(emp);*/
			
			//4. Delete the Record
			/*Employee emp = new Employee();
			emp.setEid(2); // We just need primary key value
			session.delete(emp);*/
			
			// 5. Fetch All Records from Table
			// 5.1 Hibernate Query Language
			//String hql = "From Employee"; // Very much like SQL i.e. Select * from Employee
			/*String hql = "From Employee where salary > 30000";
			
			List<Employee> employees = session.createQuery(hql).list();
			for(Employee emp : employees){
				System.out.println(emp);
			}*/
			
			//session.createSQLQuery(); -> API to execute RAW SQL Queries | Explore in case
			
			// 5.2 Criteria API to fetch all records without using SQL
			/*Criteria criteria = session.createCriteria(Employee.class); // Criteria is an API to retrieve data with some conditions in case we want
			criteria.add(Restrictions.gt("salary", 30000));
			
			List<Employee> employees = criteria.list();
			for(Employee emp : employees){
				System.out.println(emp);
			}*/
			
			//Batch Processing
			/*for(int i=1;i<=100;i++){
				Employee emp = new Employee(null, "Emp"+i, "emp"+i+"@example.com", 20000+i, "Sales"); // 100 employee objects will be created
				session.save(emp); // save all 100 objects in session
			}*/
			
			// Cache Demo
			// Retrieved 2 rows as objects !!
			Employee emp1 = (Employee)session.get(Employee.class, 3);
			Employee emp2 = (Employee)session.get(Employee.class, 4);
			System.out.println(emp1);
			System.out.println(emp2);
			
			System.out.println(">> Re-Reading the same data with id 3 and 4");
			System.out.println(">> Now Read from Cache");
			
			Employee emp3 = (Employee)session.get(Employee.class, 3);
			Employee emp4 = (Employee)session.get(Employee.class, 4);
			System.out.println(emp3);
			System.out.println(emp4);
			
			transaction.commit(); // A batch of 100 Employees shallbe saved together now !!
			
			System.out.println(">> Transaction Finished");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}finally{
			session.close(); // close will release the memory resources and will destroy the cache
			factory.close();
		}
	}

}
