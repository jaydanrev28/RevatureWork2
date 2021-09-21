package com.jaydanjacobs.spring.data.jpa.demo.repository;

import com.jaydanjacobs.spring.data.jpa.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

