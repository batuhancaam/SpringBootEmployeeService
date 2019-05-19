package com.employee.restservices.employeerestservices.rest;

import com.employee.restservices.employeerestservices.dao.EmployeeDAO;
import com.employee.restservices.employeerestservices.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {


    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeRestController(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;

    }

    @GetMapping("/employees")
    public List<Employee> GetEmployees(){

        return employeeDAO.findAll();

    }
}
