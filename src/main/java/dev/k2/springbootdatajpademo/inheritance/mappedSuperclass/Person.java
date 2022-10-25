package dev.k2.springbootdatajpademo.inheritance.mappedSuperclass;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

// Every entity which inherits from a class with @MappedSuperclass annotation will have its fields.
// Db will act as if the entities would have these fields defined in them, the association os only visible in objects, not db.
// Must have default constructor just like @Entity.
@MappedSuperclass
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;

}
