package com.example.springbootdatajpademo.relationships.manyToOne.bi;

import javax.persistence.*;
import java.util.List;

@Entity
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "house_id")
    Long id;

    @OneToMany(mappedBy = "house")
    List<Room> rooms;
}
