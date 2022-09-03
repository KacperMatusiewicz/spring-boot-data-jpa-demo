package com.example.springbootdatajpademo.relationships.oneToOne.bi;

import javax.persistence.*;

@Entity(name = "user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    Long id;

    @OneToOne
    Address address;
}
