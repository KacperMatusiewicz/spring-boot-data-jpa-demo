package com.example.springbootdatajpademo.inheritance.singleTable;

import javax.persistence.*;

// Single table strategy creates only one table in db.
// By default, this adds a discriminator column with a name "DTYPE",
// where its values are the names of each of the entity that is in the table.
// You can override that column using @DiscriminatorColumn annotation and its values using @DiscriminatorValue annotation.
// @DiscriminatorValue has predefined values:
//  - "null" which means that row without discriminator value will be mapped to that entity
//  - "not null" which means that row with discriminator value different from these defined in the entities
//    will be mapped to that entity.
// Also, it's good to know that you cannot have "not null" constraint on child entities.
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "vehicle_type",
        discriminatorType = DiscriminatorType.STRING
)
@DiscriminatorValue("not null")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vehicle_id")
    Long id;
}
