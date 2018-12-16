package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.Address;
import co.edureka.bean.CB;
import co.edureka.bean.Person;

public class DIApp {

	public static void main(String[] args) {
		
		// Coupling was HIGH
		//Person person = new Person();
		
		// Coupling is REDUCED, with the help of constructor
		//Address address = new Address();
		//Person person = new Person(address); // pass address as input to constructor
		
		// Coupling is REDUCED, with the help of Setter Method
		//Person person = new Person();
		//person.setAddress(address); // pass address as input to setter
		
		// We need to figure out how this can be done in Spring FW !!
		ApplicationContext context = new ClassPathXmlApplicationContext("dibeans.xml");
		
		/*Person person = context.getBean("pRef",Person.class);
		System.out.println(person);
		
		System.out.println("==Qualificiation==");
		System.out.println(person.getQualifications());*/
		
		CB cbRef = context.getBean("cb",CB.class);
		cbRef.getCa().sayHello("John");
	}

}
