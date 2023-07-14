/*
package com.maqant.springboot.demo.myfirstapp.service;

import com.maqant.springboot.demo.myfirstapp.dao.EmployeeDAO;
import com.maqant.springboot.demo.myfirstapp.dao.EmployeeRepository;
import com.maqant.springboot.demo.myfirstapp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    */
/*private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int theId) {
         return employeeDAO.findById(theId);
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int theId) {
        employeeDAO.deleteEmployee(theId );
    }*//*


    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> byId = employeeRepository.findById(theId);
        Employee theEmployee;
        if(byId.isPresent()){
            theEmployee = byId.get();
        }
        else{
            throw new RuntimeException("Selected Employee could not find");
        }
        return theEmployee;
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int theId) {
        employeeRepository.deleteById(theId );
    }
}
*/
