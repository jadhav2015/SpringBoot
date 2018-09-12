package com.dev.service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name="Employee")
public class Employee 

{

	@Id
	@JsonProperty(value="id")
	int id;
	@Column(name="name")
	@JsonProperty(value="name")
	String  name;
	
	@Column(name="salary")
	@JsonProperty(value="salary")
	String  salary;
	
	
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) 
	{
		this.salary = salary;
	}
	
	
}
