package co.edureka.main;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.Product;

public class App {

	public static void main(String[] args) {

		/*
		 	Spring AOP Procedure:
			0. Configure Build Path with Spring Core and AOP jar Files
			1. Create a Bean with Business Method eg: processCustomerOrder()	
			2. Create a class which implements MethodBeforeAdvice
			3. Create a class which implements AfterReturingAdvice
			4. Copy and edit XML File in src Directory
			5. Configure ProxyFactoryBean API in xml file, which shall link before and after with business method
			6. Test Spring AOP in main class
		  
		 */
		
		//ProxyFactoryBean
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//Product product = context.getBean("pRef",Product.class);
		Product product = context.getBean("proxyBean",Product.class);
		System.out.println(product);
		product.processProductOrder();
		
		

	}

}
