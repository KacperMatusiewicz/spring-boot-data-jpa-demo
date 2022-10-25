package dev.k2.springbootdatajpademo.relationships.manyToMany.explicitJoinTable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FlightTravelerPk implements Serializable {

    @Column(name = "flight_id")
    Long flightId;
    @Column(name = "traveler_id")
    Long travelerId;
}
