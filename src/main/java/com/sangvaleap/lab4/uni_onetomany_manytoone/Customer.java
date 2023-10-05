package com.sangvaleap.lab4.uni_onetomany_manytoone;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String fullName;

    private String phone;

    @OneToMany
    private List<Reservation> reservations;

}
