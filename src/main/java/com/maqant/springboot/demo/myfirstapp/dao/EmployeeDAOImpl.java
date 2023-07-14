/*
package com.maqant.springboot.demo.myfirstapp.dao;

import com.maqant.springboot.demo.myfirstapp.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    //define field for EntityManager
    private EntityManager entityManager;

    //Construction injection
    @Autowired
    public EmployeeDAOImpl(EntityManager theEntityManager)  {
        entityManager = theEntityManager;
        return;
    }


    @Override
    public List<Employee> findAll() {
        //create query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
        //execute query
        List<Employee> employeeList = theQuery.getResultList();
        //return results
        return employeeList;
    }

    @Override
    public Employee findById(int theId) {
        // get Employee
        Employee theEmployee = entityManager.find(Employee.class, theId);
        //return Employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {

        //save Employee
        Employee dbEmployee = entityManager.merge(theEmployee);
        //return saved Employee
        return dbEmployee;
    }

    @Override
    public void deleteEmployee(int theId) {

        //find Employee
        Employee theEmployee = entityManager.find(Employee.class, theId);
        entityManager.remove(theEmployee);
        System.out.println("This employee is deleted : " + theEmployee);
    }
}
*/
