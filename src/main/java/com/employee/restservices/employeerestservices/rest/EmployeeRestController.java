package com.employee.restservices.employeerestservices.rest;

import com.employee.restservices.employeerestservices.entity.Employee;
import com.employee.restservices.employeerestservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {


    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;

    }

    @GetMapping("/employees")
    public List<Employee> GetEmployees(){

        return employeeService.findAll();

    }

    @GetMapping("/employees/{id}")
    public Employee GetEmployee(@PathVariable int id){
        Employee employee = employeeService.findById(id);

        return employee;

    }

    @PostMapping("/employess")
    public Employee addEmployee(@RequestBody Employee employee){

        employee.setId(0);
        employeeService.save(employee);
        return employee;

    }

    @PutMapping("/employess")
    public Employee updateEmployee(@RequestBody Employee employee){

        employeeService.save(employee);

        return employee;
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable int id){

        employeeService.deleteById(id);

        return "Employee Deleted id = "+id;
    }


}
