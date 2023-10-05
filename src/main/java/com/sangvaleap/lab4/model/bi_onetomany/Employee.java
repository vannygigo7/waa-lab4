package com.sangvaleap.lab4.model.bi_onetomany;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String firstName;
    private  String lastName;

    @ManyToOne
    @JoinTable(name = "department_employee",
            joinColumns = {@JoinColumn(name = "employee_id")},
            inverseJoinColumns = {@JoinColumn(name = "department_id")}
    )
    private Department department;
}
