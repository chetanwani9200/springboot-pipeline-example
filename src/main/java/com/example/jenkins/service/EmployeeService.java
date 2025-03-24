package com.example.jenkins.service;

import com.example.jenkins.entity.Employee;
import com.example.jenkins.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public EmployeeRepository employeeRepository;


    public Employee getEmployeeById(Long id){
       Employee employee =employeeRepository.findById(id).get();
       return employee;
    }

}
