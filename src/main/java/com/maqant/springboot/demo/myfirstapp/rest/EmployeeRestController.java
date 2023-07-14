/*
package com.maqant.springboot.demo.myfirstapp.rest;

 import com.maqant.springboot.demo.myfirstapp.dao.EmployeeDAO;
 import com.maqant.springboot.demo.myfirstapp.entity.Employee;
import com.maqant.springboot.demo.myfirstapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;

 import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee theEmployee = employeeService.findById(employeeId);
        if(theEmployee == null) {
            throw new RuntimeException("Employee Not Found! " + employeeId);
        }
        return theEmployee;
    }

    //Add Employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {

        //we will add employeeId as 0
        //With that way we will force it to save as a new one
        theEmployee.setId(0);
        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {

        Employee selectedEmployee = employeeService.save(theEmployee);

        return selectedEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        Employee selectedEmployee = employeeService.findById(employeeId);

        if(selectedEmployee == null){
            throw new RuntimeException("Employee id not found: " + employeeId);
        }

        employeeService.deleteEmployee(employeeId);
        return employeeId + " employee is deleted";
    }
}
*/
