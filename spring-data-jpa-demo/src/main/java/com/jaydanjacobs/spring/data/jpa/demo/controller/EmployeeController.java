package com.jaydanjacobs.spring.data.jpa.demo.controller;

import com.jaydanjacobs.spring.data.jpa.demo.entity.Employee;
import com.jaydanjacobs.spring.data.jpa.demo.service.EmployeeImpl;
import com.jaydanjacobs.spring.data.jpa.demo.service.EmployeeService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") long employeeId) {
        return service.getEmployeeById(employeeId);
    }
}