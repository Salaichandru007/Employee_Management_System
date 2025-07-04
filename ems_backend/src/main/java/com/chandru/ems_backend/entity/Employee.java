package com.chandru.ems_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Employee {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int empId;
    @Column(name="FIRST_NAME")
    private String empFirstName;
    @Column(name="LAST_NAME")
    private String empLastName;
    @Column(name="EMAIL", nullable = false, unique = true)
    private String empEmail;
    @Column(name="PHONE")
    private long empPhone;
    @Column(name="SALARY")
    private double empSal;
}
