package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	// before is Executed before actual business logic will be executed in Product bean
	// before shall check for the stock !!
	@Override
	public void before(Method method, Object[] inputs, Object beanRef) throws Throwable {
		
		if(method.getName().equals("processProductOrder")){
			System.out.println("** BeforeAdvice in Action **");
			
			Product pRef = (Product)beanRef;
			
			if(pRef.stock>0){
				User.canOrder = true;
				System.out.println(">> Product can be ordered");
			}else{
				User.canOrder = false;
				System.out.println("Sorry !! "+pRef.getName()+" is out of Stock !!");
			}
			
			System.out.println("*************************");
		}
		
	
		
	}

}
