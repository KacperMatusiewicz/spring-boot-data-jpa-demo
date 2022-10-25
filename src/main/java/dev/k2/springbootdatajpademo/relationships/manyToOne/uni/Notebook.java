package dev.k2.springbootdatajpademo.relationships.manyToOne.uni;

import javax.persistence.*;

@Entity
public class Notebook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "notebook_id")
    Long id;

    // There'll be added foreign key to this table representing primary key of the "one" table
    @ManyToOne
    Student student;
}
