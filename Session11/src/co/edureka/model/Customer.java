package co.edureka.model;

import java.util.List;

public class Customer {
	
	// Attributes
	Integer cid;
	String name;
	String email;
	String phone;
	
	// HAS-A Relation
	Address address; 			// 1 to 1 Mapping		| 1 customer has 1 address
	//List<Address> addresses;	// 1 to many Mapping	| 1 customer can hav many addresses
	
	public Customer() {
	
	}

	public Customer(Integer cid, String name, String email, String phone, Address address) {
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
				+ address + "]";
	}
	
}
