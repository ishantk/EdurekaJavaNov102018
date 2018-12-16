package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	// afterReturning is Executed after actual business logic will be executed in Product bean
	// afterReturning shall check for the payment methods !!
	@Override
	public void afterReturning(Object ref1, Method method, Object[] inputs, Object beanRef) throws Throwable {
		
		if(method.getName().equals("processProductOrder") && User.canOrder){
			System.out.println("** AfterAdvice in Action **");
			Product pRef = (Product)beanRef;
			
			if(User.paymentMethod == 1){
				System.out.println(">> Get Cash when Product shall be Delivered to User");
			}else{
				System.out.println(">> Please Process Shipment for Product "+pRef.getName()+" to User");
			}
			System.out.println("*************************");
		}
		
		
	}

}
