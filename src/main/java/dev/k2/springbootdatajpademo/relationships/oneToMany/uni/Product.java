package dev.k2.springbootdatajpademo.relationships.oneToMany.uni;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    Long id;
}
