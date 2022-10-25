package dev.k2.springbootdatajpademo.relationships.manyToMany.explicitJoinTable;

import javax.persistence.*;
import java.util.List;

@Entity
public class Traveler {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "traveler_id")
    Long id;

    @OneToMany(mappedBy = "traveler")
    List<FlightTraveler> travelerFlights;
}
