package com.example.springbootdatajpademo.relationships.oneToOne.uni;

import javax.persistence.*;

@Entity
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "citizen_id")
    Long id;

    // Creates in the owner table a foreign key which represents primary key in the other table
    // You can also add @PrimaryKeyJoinColumn to avoid adding foreign key.
    // In that case, tables will be associated by the same value of primary keys.
    @OneToOne
    IdCard idCard;
}
