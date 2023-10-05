package com.sangvaleap.lab4.model.bi_manytomany;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;

    private LocalDate birthDate;

    @ManyToMany
    private List<Course> courses;

}
