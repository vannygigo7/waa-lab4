package com.sangvaleap.lab4.model.bi_manytoone;

import jakarta.persistence.*;

@Entity
public class Officer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;

    @ManyToOne
    @JoinTable(name = "office_officer",
            joinColumns = {@JoinColumn(name = "officer_id")},
            inverseJoinColumns = {@JoinColumn(name = "office_id")}
    )
    private Office office;
}
