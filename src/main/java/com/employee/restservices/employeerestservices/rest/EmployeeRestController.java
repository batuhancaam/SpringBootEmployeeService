package com.employee.restservices.employeerestservices.rest;

import com.employee.restservices.employeerestservices.dao.EmployeeDAO;
import com.employee.restservices.employeerestservices.entity.Employee;
import com.employee.restservices.employeerestservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
