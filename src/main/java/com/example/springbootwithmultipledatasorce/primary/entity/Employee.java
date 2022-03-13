package com.example.springbootwithmultipledatasorce.primary.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private Integer id;
	private String name;
	private Double salary;
	
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
