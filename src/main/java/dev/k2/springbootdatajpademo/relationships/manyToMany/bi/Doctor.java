package dev.k2.springbootdatajpademo.relationships.manyToMany.bi;

import javax.persistence.*;
import java.util.List;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "doctor_id")
    Long id;

    // You need to specify owner of the relationship by using mappedBy attribute.
    @ManyToMany
    List<Patient> patients;
}
