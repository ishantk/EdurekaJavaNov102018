package co.edureka.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.Certificate;
import co.edureka.model.Customer;
import co.edureka.model.Manager;

public class OneToManyApp {

	public static void main(String[] args) {
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
	
		Certificate c1 = new Certificate();
		c1.setCname("OCJP");
		
		Certificate c2 = new Certificate();
		c2.setCname("CCNA");
		
		Certificate c3 = new Certificate();
		c3.setCname("AWS");
		
		List<Certificate> certificates = new ArrayList<Certificate>();
		certificates.add(c1);  // 0
		//certificates.add(c2);  // 1
		certificates.add(c3);  // 2
		
		
		Manager mRef = new Manager();
		mRef.setName("Fionna Flynn");
		mRef.setEmail("fionna.f@example.com");
		mRef.setCertificates(certificates); // Reference Copy
		
		
		try {
			
			config = new Configuration();
			config.configure(); // Reads/Parses hibernate.cfg.xml file !!
	
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // Creating Connection with DB
			
			transaction = session.beginTransaction();	// Fire our SQL as Transaction
			
			//session.save(mRef);	// Saving Manager shall Save Certificates as well !!
			
			Manager manager = (Manager)session.get(Manager.class, 1);
			System.out.println(manager);
			
			transaction.commit(); 
			
			System.out.println(">> Transaction Finished");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}finally{
			session.close(); // Close Connection with DB to release resources
		}

	}

}
