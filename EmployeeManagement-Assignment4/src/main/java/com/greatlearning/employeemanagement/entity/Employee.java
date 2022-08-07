package com.greatlearning.employeemanagement.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.domain.Sort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Id")
	private int id;
	
	@Column(name ="FirstName")
	private String firstName;
	
	@Column(name ="LastName")
	private String lastName;
	
	@Column(name ="Email")
	private String email;
	

public Employee() {
	
}



public Employee(int id, String firstName, String lastName, String email) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
}



public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}

public void sortEmloyeeByFname(Sort firstName2) {
	// TODO Auto-generated method stub
	
}



public List<Employee> findAll(Sort sortByFnameAsc) {
	// TODO Auto-generated method stub
	return null;
}


}
