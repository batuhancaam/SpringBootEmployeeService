package com.employee.restservices.employeerestservices.service;

import com.employee.restservices.employeerestservices.dao.EmployeeRepository;
import com.employee.restservices.employeerestservices.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Employee> findById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    @Transactional
    public void save(Employee employee) {

        employeeRepository.save(employee);

    }

    @Override
    @Transactional
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}
