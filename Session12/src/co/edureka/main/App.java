package co.edureka.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.bean.Connection;
import co.edureka.bean.Phone;
import co.edureka.bean.Product;

public class App {

	public static void main(String[] args) {
		
		// Traditionally we create Objects like below:
		/*Connection con1 = new Connection();
		con1.setDriver("com.mysql.jdbc.Driver");
		con1.setUrl("jdbc:mysql://localhost/edureka");
		con1.setUsername("root");
		con1.setPassword("");
		
		System.out.println(con1);*/
		
		// Challenge:
		// If we change our DB to some other Server, details shall change and 
		// hence, we need to re compile our code. because changes are done in source file !!
		// Build and Release shall come into picture even with such a minor change !!
		
		// Lets use Spring FW as a remedy:
		
		/*  Spring Core : Procedure
			0. Configure BuildPath for Spring FW core Jar files
			1. Write a bean which is a Java Object
			2. Copy and Edit an XML File in src directory by writing data for object in it
			3. In class with main method we get the objects from IOC Containers	*/	
		
		// Objects were constructed traditionally and now lets create objects the Spring FW Way using IOC.
		// Inversion of Control (IOC)
		// 1. IOC Container: BeanFacotry
		
		/*
		Resource resource = new ClassPathResource("beans.xml"); // Parsing XML file
		BeanFactory factory = new XmlBeanFactory(resource);		// Construct the Objects and Manages them !!
		
		Connection cRef1 = (Connection)factory.getBean("con1");
		Connection cRef2 = factory.getBean("con2",Connection.class);
		
		System.out.println(cRef1);
		System.out.println(cRef2);
		
		// If we fetch the same object again we don't see a new object getting constructed
		Connection cRef3 = (Connection)factory.getBean("con1");
		System.out.println(cRef3);
		
		// If we do not request for the Objects !! No Object shall be Constructed by BeanFactory !!
		// factory.getBean is a request to Spring FW to get the Object with ID, and object is constrcuted at that moment !!
		*/
		
		//2. IOC Container : ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		///Connection cRef1 = (Connection)context.getBean("con1");
		//Connection cRef2 = context.getBean("con2",Connection.class);
		
		//System.out.println(cRef1+" "+cRef1.hashCode());
		//System.out.println(cRef2+" "+cRef2.hashCode());
		
		// If we do not request for the Objects !! Objects shall be Constructed by ApplicationContext !!
		// context.getBean is a request to Spring FW to get the Object with ID
		
		// If we fetch the same object again we don't see a new object getting constructed
		//Connection cRef3 = (Connection)context.getBean("con1");
		//System.out.println(cRef3+" "+cRef3.hashCode());
		
		//Product product = context.getBean("pRef",Product.class);
		//System.out.println(product);
		
		Phone phone = context.getBean("cRef",Phone.class);
		System.out.println(phone);
		
		// Downcasting for the context
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close(); // we are closing IOC Container which shall remove all objects from memeory		

	}

}
