package com.example.springbootdatajpademo.inheritance.joinedTable;

import javax.persistence.*;

// Joined table strategy creates as many tables as there are entities.
// Inherited fields are stored in the parent table.
// Furthermore, each of the child entities have foreign key reflecting primary key of the parent table.
// You can customize foreign key column by adding @PrimaryKeyJoinColumn annotation.
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aircraft_id")
    Long id;
}
