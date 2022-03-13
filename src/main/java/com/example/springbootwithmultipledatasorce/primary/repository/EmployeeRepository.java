package com.example.springbootwithmultipledatasorce.primary.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootwithmultipledatasorce.primary.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
	
}
