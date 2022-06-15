package com.demo.springdatajpaquery.service;

import com.demo.springdatajpaquery.entity.Employee;
import com.demo.springdatajpaquery.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployeeData() {
        return employeeRepository.findAllEmployeesQuery();
    }

    public List<Employee> findEmployeesByDesignationAndActiveData(Boolean activeState, List<String> designationList) {
        return employeeRepository.findEmployeeByDesignationAndActiveQuery(activeState, designationList, Sort.by("age"));
    }

   
}
