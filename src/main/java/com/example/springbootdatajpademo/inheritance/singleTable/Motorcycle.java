package com.example.springbootdatajpademo.inheritance.singleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("motorcycle")
public class Motorcycle extends Vehicle {
}
