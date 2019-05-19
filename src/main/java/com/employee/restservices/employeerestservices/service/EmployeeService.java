package com.employee.restservices.employeerestservices.service;

import com.employee.restservices.employeerestservices.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public List<Employee> findAll();
    public Optional<Employee> findById(int id);
    public void save(Employee employee);
    public void deleteById(int id);

}
