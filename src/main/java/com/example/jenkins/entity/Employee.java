package com.example.jenkins.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="employee_id")
    private Long Id;
    @Column(name="employee_name")
    private String Name;
    @Column(name="employee_education")
    private String Education;
    @Column(name="employee_age")
    private Integer Age;


}
