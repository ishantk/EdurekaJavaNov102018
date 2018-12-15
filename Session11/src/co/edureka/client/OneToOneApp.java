package co.edureka.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.Customer;

public class OneToOneApp {

	public static void main(String[] args) {
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		// Object Constructions
		Customer cRef = new Customer();
		cRef.setCid(null);
		cRef.setName("John Watson");
		cRef.setEmail("john.w@example.com");
		cRef.setPhone("+91 99999 88888");
		
		Address aRef = new Address();
		aRef.setAid(null);
		aRef.setAddressLine("Pristine Magnum");
		aRef.setCity("Bengaluru");
		aRef.setState("Karnataka");
		aRef.setZipCode(520001);
		
		// Pass By Reference
		cRef.setAddress(aRef); 		// 1 to 1 mapping
		aRef.setCustomer(cRef);		// 1 to 1 mapping
		
		try {
			
			config = new Configuration();
			config.configure(); // Reads/Parses hibernate.cfg.xml file !!
	
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // Creating Connection with DB
			
			transaction = session.beginTransaction();	// Fire our SQL as Transaction
			
			// Saving just cRef will also save aRef as cascading is all
			session.save(cRef);
			
			transaction.commit(); 
			
			System.out.println(">> Transaction Finished");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}finally{
			session.close(); // Close Connection with DB to release resources
		}

	}

}
