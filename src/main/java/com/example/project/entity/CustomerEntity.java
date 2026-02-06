package com.example.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="customer")
public class CustomerEntity {
	@Id
	
	@Column(name="id")
	private int id;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="salary")
	private double salary;
	
//	setters and getters
	
	public void setId(int id) {
		
		this.id=id;
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setfirstname(String firstname) {
		
		this.firstname=firstname;
		
	}
	
	public String getfirstname() {
		return firstname;
	}
	
	public void setlastname(String lastname) {
		
		this.lastname=lastname;
		
	}
	public String getlastname() {
		return lastname;
	}
	
	public void setEmail(String email) {
		
		this.email=email;
		
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setSalary(Double salary) {
		
		this.salary=salary;
		
	}
	
	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", salary=" + salary + "]";
	}
	
	
}
