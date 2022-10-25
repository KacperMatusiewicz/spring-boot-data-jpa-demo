package dev.k2.springbootdatajpademo.relationships.manyToMany.explicitJoinTable;

import javax.persistence.*;

@Entity
public class FlightTraveler {

    @EmbeddedId
    FlightTravelerPk id;

    @ManyToOne
    @MapsId("flightId")
    @JoinColumn(name = "flight_id")
    Flight flight;

    @ManyToOne
    @MapsId("travelerId")
    @JoinColumn(name = "traveler_id")
    Traveler traveler;
}
