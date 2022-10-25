package dev.k2.springbootdatajpademo.relationships.manyToMany.bi;

import javax.persistence.*;
import java.util.List;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "patient_id")
    Long id;

    @ManyToMany(mappedBy = "patients")
    List<Doctor> doctors;
}
