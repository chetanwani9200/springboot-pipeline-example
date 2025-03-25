package com.example.jenkins.Controller;

import com.example.jenkins.dto.EmployeeDto;
import com.example.jenkins.entity.Employee;
import com.example.jenkins.repository.EmployeeRepository;
import com.example.jenkins.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
@Autowired

    public EmployeeService employeeService;
@Autowired
    public EmployeeRepository employeeRepository;

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable  Long id){
        Employee employee =employeeService.getEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @PostMapping("/addEmployee")
    public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employeeDto){
         EmployeeDto employeeDto1 = employeeService.addEmployee(employeeDto);
        return new ResponseEntity<>(employeeDto1,HttpStatus.OK);
    }

}
