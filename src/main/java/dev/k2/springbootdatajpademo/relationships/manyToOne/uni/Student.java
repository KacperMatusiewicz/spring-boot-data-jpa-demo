package dev.k2.springbootdatajpademo.relationships.manyToOne.uni;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    Long id;
}
