package co.edureka.bean;

import java.util.Date;

public class CA {
	
	public void sayHello(String name){
		Date date = new Date();
		System.out.println("Hello, "+name);
		System.out.println(">> Its "+date);
	}

}
