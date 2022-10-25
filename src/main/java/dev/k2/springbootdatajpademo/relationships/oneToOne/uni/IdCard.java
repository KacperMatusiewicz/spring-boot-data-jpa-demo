package dev.k2.springbootdatajpademo.relationships.oneToOne.uni;

import javax.persistence.*;

@Entity
public class IdCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_card_id")
    Long id;
}
