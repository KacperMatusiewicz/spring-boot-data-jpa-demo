package com.example.springbootdatajpademo.relationships.oneToMany.bi;

import javax.persistence.*;

@Entity
public class ParkingTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "parking_ticket_id")
    Long id;

    @ManyToOne
    Driver driver;
}
