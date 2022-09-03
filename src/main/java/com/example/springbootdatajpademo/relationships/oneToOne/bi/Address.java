package com.example.springbootdatajpademo.relationships.oneToOne.bi;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    Long id;

    // If you don't want foreign keys in both tables you have to add mappedBy attribute,
    // which represents name of the field with @OneToOne in the other entity.
    @OneToOne(mappedBy = "address")
    User user;
}
