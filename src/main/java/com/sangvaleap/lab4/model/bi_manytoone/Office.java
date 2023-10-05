package com.sangvaleap.lab4.model.bi_manytoone;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "office")
    private List<Officer> officers;
}
