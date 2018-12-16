package co.edureka.bean;

import java.util.List;

public class Person {
	
	int pid;
	String email;
	String phone;
	
	Address address; 				// Has-A Relationship | Dependency | 1 to 1 relationship
	
	List<String> qualifications;    // Has-A Relationship | Dependency | 1 to many relationship
	
	public Person() {
		// This is not good !! 
		// Because Address Object Construction shall be dependent on Person Object Construction
		// High Coupling is introduced
		// address = new Address();  // Dont do this
		System.out.println(">> Person Object Default Constructor");
	}

	public Person(Address address) {
		System.out.println(">> Person Object Constructed with Constructor");
		this.address = address;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println(">> Person Object Constructed with Setter");
		this.address = address;
	}
	
	

	public List<String> getQualifications() {
		return qualifications;
	}

	// Setter Injection
	public void setQualifications(List<String> qualifications) {
		System.out.println(">> Setter Injection for List of Qualifications");
		this.qualifications = qualifications;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", email=" + email + ", phone=" + phone + ", address=" + address + "]";
	}

}
