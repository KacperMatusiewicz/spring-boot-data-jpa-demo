package com.example.springbootdatajpademo.relationships.manyToMany.explicitJoinTable;

import javax.persistence.*;
import java.util.List;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "flight_id")
    Long id;

    @OneToMany(mappedBy = "flight")
    List<FlightTraveler> flightTravelers;

}
