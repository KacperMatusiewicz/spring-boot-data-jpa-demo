package dev.k2.springbootdatajpademo.repository.custom;

import javax.persistence.*;

@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pizza_id")
    private Long id;
    private String name;

    private Integer slices;

    public Pizza(Long id, String name, Integer slices) {
        this.id = id;
        this.name = name;
        this.slices = slices;
    }

    public Pizza(String name, Integer slices) {
        this.name = name;
        this.slices = slices;
    }

    public Pizza() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSlices() {
        return slices;
    }

    public void setSlices(Integer slices) {
        this.slices = slices;
    }
}
