package com.example.springbootwithmultipledatasorce.secondary.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootwithmultipledatasorce.secondary.entity.Manager;

@Repository
public interface ManagerRepository extends CrudRepository<Manager, Integer>{

}
