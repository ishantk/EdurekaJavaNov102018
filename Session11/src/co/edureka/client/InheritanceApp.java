package co.edureka.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.CA;
import co.edureka.model.CB;
import co.edureka.model.CC;
import co.edureka.model.Customer;

public class InheritanceApp {

	public static void main(String[] args) {
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		CA ca = new CA();
		ca.setId(null);
		ca.setA(10);

		CB cb = new CB();
		cb.setId(null);
		cb.setA(100);
		cb.setB(200);
		
		CC cc = new CC();
		cc.setId(null);
		cc.setA(1000);
		cc.setB(2000);
		cc.setC(3000);
		
		try {
			
			config = new Configuration();
			config.configure(); // Reads/Parses hibernate.cfg.xml file !!
	
			factory = config.buildSessionFactory();
			
			session = factory.openSession(); // Creating Connection with DB
			
			transaction = session.beginTransaction();	// Fire our SQL as Transaction
			
			session.save(ca);
			session.save(cb);
			session.save(cc);
			
			transaction.commit(); 
			
			System.out.println(">> Transaction Finished");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}finally{
			session.close(); // Close Connection with DB to release resources
		}

	}

}
