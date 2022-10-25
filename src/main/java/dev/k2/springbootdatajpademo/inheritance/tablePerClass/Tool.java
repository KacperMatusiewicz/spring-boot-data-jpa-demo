package dev.k2.springbootdatajpademo.inheritance.tablePerClass;

import javax.persistence.*;

// Table per class strategy creates a table for each entity. Each table has all fields including inherited ones.
// You can still use polymorphic queries though.
// When querying base entity, the result will return child entities also (by using "UNION" statement under the hood).
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Tool {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tool_id")
    Long id;
}
