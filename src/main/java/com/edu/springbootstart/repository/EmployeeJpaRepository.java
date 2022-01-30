package com.edu.springbootstart.repository;

import com.edu.springbootstart.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJpaRepository extends JpaRepository<Employee,Long> {
}