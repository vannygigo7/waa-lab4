package com.sangvaleap.lab4.model.uni_manytoone;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String isbn;

    private double price;
    @ManyToOne
    private Publisher publisher;
}
