package dev.k2.springbootdatajpademo.inheritance.singleTable;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("car")
public class Car extends Vehicle {

}
