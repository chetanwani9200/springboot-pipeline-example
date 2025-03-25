package com.example.jenkins.service;

import com.example.jenkins.dto.EmployeeDto;
import com.example.jenkins.entity.Employee;
import com.example.jenkins.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
@Autowired
    public EmployeeRepository employeeRepository;


    public Employee getEmployeeById(Long id){
       Employee employee =employeeRepository.findById(id).get();
       return employee;
    }

    public EmployeeDto addEmployee(EmployeeDto employeeDto){
        Employee employee = new Employee();
        employee.setName(employeeDto.getName());
        employee.setAge(employeeDto.getAge());
        employee.setEducation(employeeDto.getEducation());
        Employee employeeResponse = employeeRepository.save(employee);

        EmployeeDto employeeDto1 = new EmployeeDto();
        employeeDto1.setId(employeeResponse.getId());
        employeeDto1.setName(employeeResponse.getName());
        employeeDto1.setAge(employeeResponse.getAge());
        employeeDto1.setEducation(employeeResponse.getEducation());
        return employeeDto1;

    }

}
