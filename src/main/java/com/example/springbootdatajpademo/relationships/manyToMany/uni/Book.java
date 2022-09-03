package com.example.springbootdatajpademo.relationships.manyToMany.uni;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    Long id;

}
