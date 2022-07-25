package com.mybatis.controller;

import com.mybatis.entity.Employee;
import com.mybatis.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable String id)
    {
        Employee employee = employeeRepository.findbyID(Integer.parseInt(id));
        return employee;
    }


    @PostMapping("/employees")
    public int createEmployee(@RequestBody Employee employee)
    {
        return employeeRepository.save(employee);
        //return employeeRepository.findbyID(id);
    }

}
