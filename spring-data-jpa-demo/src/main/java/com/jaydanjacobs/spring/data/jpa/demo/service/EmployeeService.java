package com.jaydanjacobs.spring.data.jpa.demo.service;

import  com.jaydanjacobs.spring.data.jpa.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long empId);
    Employee deleteEmployee(long empId);
    Employee updateEmployee(long empId, Employee employee);
}

