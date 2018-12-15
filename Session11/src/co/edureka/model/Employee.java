package co.edureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// Class Representing the Structure of an Object
// POJO (Plain Old Java Object) | Model | Bean

@Entity
@Table(name="EMPLOYEES")
public class Employee {
	
	// Attributes
	@Id @GeneratedValue
	@Column(name="EID")
	Integer eid;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="EMAIL")
	String email;
	
	@Column(name="SALARY")
	Integer salary;
	
	@Column(name="DEPT")
	String department;
	
	// Constructors
	public Employee() {
	
	}

	public Employee(Integer eid, String name, String email, Integer salary, String department) {
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.department = department;
	}

	// Getters and Setters
	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
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

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// To display data in Object
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", salary=" + salary + ", department="
				+ department + "]";
	}
}
