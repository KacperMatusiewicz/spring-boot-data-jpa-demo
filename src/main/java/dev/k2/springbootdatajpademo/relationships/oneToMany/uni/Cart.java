package dev.k2.springbootdatajpademo.relationships.oneToMany.uni;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    Long id;

    // Creates one-to-many relationship adding foreign key to "many" table.
    // If you want to have join table between both tables, don't use @JoinColumn annotation.
    @OneToMany
    @JoinColumn(name = "customer_id", nullable = false)
    List<Product> products;
}
