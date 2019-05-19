package com.employee.restservices.employeerestservices.dao;

import com.employee.restservices.employeerestservices.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


}
