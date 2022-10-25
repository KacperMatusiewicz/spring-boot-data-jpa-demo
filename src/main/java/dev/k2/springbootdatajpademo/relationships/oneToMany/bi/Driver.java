package dev.k2.springbootdatajpademo.relationships.oneToMany.bi;

import javax.persistence.*;
import java.util.List;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "driver_id")
    Long id;

    // You need to specify mappedBy (which represents @ManyToOne field in the other table)
    // or you'll have two unidirectional relationships meaning that in @ManyToOne table there'll be a foreign key
    // and in between these two tables there'll be a join table.
    // If you add @JoinColumn instead of mappedBy,
    // you'll have two foreign keys in @ManyToOne table representing @OneToMany primary key.
    @OneToMany(mappedBy = "driver")
    List<ParkingTicket> parkingTickets;

}
