package com.sangvaleap.lab4.bi_manytomany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private  String name;
    private String code;
    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}
