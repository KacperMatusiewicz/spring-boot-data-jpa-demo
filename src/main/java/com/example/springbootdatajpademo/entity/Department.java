package com.example.springbootdatajpademo.entity;

import javax.persistence.*;

// @Entity annotation tells JPA that this class will be a table in the database
@Entity
public class Department {

    // Entity must have an @Id field which will be converted to a primary key
    // You can have also composite id using @EmbeddedId or @IdClass:
    //      1. @EmbeddedId - used on field which is a custom class with id fields
    //      2. @IdClass(CustomId.class) - used on entity class, fields with @Id have to match fields of class passed
    //         in annotation value.
    // Custom id class should have: be public, serializable, have no-args constructor; implement equals(), hashcode()
    // and  have @Embeddable annotation.
    @Id

    // @GeneratedValue annotation tells JPA that this field should be generated.
    //      There are couple options when it comes to generating values:
    //          1. AUTO (default) - based on type of field, numeric will be generated from the sequence,
    //                              UUID from UUIDGenerator
    //          2. IDENTITY - based on auto generated table in db which stores used ids
    //          3. SEQUENCE - uses a sequence from db, you can define sequence using @SequenceGenerator annotation
    //          4. TABLE - uses a table that kind of emulates sequence, you can use @TableGenerator to make that table
    //          5. custom generator - you can make your own generator implementing IdentifierGenerator, then specifying
    //                                it in @GenericGenerator annotation.
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "department_name", nullable = false, length = 123, unique = true)
    private String name;

}
