package com.employee.restservices.employeerestservices.service;

import com.employee.restservices.employeerestservices.dao.EmployeeRepository;
import com.employee.restservices.employeerestservices.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository){
        employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);

        Employee employee = null;

        if(result.isPresent()){
            employee=result.get();
        }
        return employee;
    }

    @Override
    public void save(Employee employee) {

        employeeRepository.save(employee);

    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
