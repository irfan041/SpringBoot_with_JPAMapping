package com.demo.springdatajpamappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.springdatajpamappings.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
