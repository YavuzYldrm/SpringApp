package com.maqant.springboot.demo.myfirstapp.dao;

import com.maqant.springboot.demo.myfirstapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //First Attribute is entry type
    //Second Attribute is primary key
}
