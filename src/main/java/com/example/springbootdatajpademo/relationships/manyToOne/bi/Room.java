package com.example.springbootdatajpademo.relationships.manyToOne.bi;

import javax.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "room_id")
    Long id;

    // @ManyToOne should be the owner of the relationship by adding mappedBy attribute to the @OneToMany annotation.
    // If @OneToMany have to be the owner you have to add @JoinColumn on both sides.
    @ManyToOne
    House house;
}
