package co.edureka.model;

public class Address {

	// Attributes
	Integer aid;
	String addressLine;
	String city;
	String state;
	Integer zipCode;
	
	// HAS-A Relation
	Customer customer; // 1 to 1 Mapping | 1 Address belongs to 1 Customer
	
	public Address() {
	
	}

	public Address(Integer aid, String addressLine, String city, String state, Integer zipCode, Customer customer) {
		this.aid = aid;
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.customer = customer;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", addressLine=" + addressLine + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + ", customer=" + customer + "]";
	}
	
	
	
}
