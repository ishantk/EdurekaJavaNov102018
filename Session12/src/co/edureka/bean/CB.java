package co.edureka.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {

	CA ca; // Has-A Relationship | 1 to 1 

	public CB() {
	}
	
	//@Autowired
	public CB(CA ca) {
		System.out.println(">> Constructor Injection");
		this.ca = ca;
	}

	public CA getCa() {
		return ca;
	}

	@Autowired
	public void setCa(CA ca) {
		System.out.println(">> Setter Injection");
		this.ca = ca;
	}
	
}
