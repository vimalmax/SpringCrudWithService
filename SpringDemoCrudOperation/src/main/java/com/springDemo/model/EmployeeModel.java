package com.springDemo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeModel implements Serializable {

	@Id
	@GeneratedValue
	private int id;

	private String name;

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeModel(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	
	
	public EmployeeModel(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	
	
	public EmployeeModel(int id) {
		super();
		this.id = id;
	}

	public EmployeeModel() {
		super();
	}
	

}
