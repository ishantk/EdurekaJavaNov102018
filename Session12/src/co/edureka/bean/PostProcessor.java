package co.edureka.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object beanRef, String beanName) throws BeansException {
		
		System.out.println(">> postProcessAfterInitialization executed");
		
		return beanRef;
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanRef, String beanName) throws BeansException {
		
		System.out.println(">> postProcessBeforeInitialization executed");
		
		Connection con = (Connection)beanRef;
		// Authorization
		if(con.getUsername().equals("john")){
			System.out.println(">> Grant some privileges here !!");
		}
		
		return beanRef;
	}

}
