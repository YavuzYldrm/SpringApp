package com.maqant.springboot.demo.myfirstapp.service;

import com.maqant.springboot.demo.myfirstapp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteEmployee(int theId);
}
