package com.example.springbootwithmultipledatasorce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootwithmultipledatasorce.primary.entity.Employee;
import com.example.springbootwithmultipledatasorce.primary.repository.EmployeeRepository;
import com.example.springbootwithmultipledatasorce.secondary.entity.Manager;
import com.example.springbootwithmultipledatasorce.secondary.repository.ManagerRepository;

@RestController
public class TestController 
{
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ManagerRepository managerRepository;
	
	@RequestMapping(value="/primary/save", method=RequestMethod.POST)
	public Employee saveDataIntoPrimary(@RequestBody Employee emp) {
		
		return employeeRepository.save(emp);
	}
	
	@RequestMapping(value="/secondary/save", method=RequestMethod.POST)
	public Manager saveDataIntoSecondary(@RequestBody Manager manager) {
		
		return managerRepository.save(manager);
	}

	@RequestMapping(value="/primary", method=RequestMethod.GET)
	public List<Employee> getPrimaryDatabaseData() {
		List<Employee> list = (List<Employee>)employeeRepository.findAll();
		
		return list;
	}
	
	@RequestMapping(value="/secondary", method=RequestMethod.GET)
	public List<Manager> getSecondaryDatabaseData() {
		List<Manager> list = (List<Manager>)managerRepository.findAll();
		
		return list;
	}
}