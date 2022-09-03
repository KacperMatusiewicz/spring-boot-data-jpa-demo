package com.example.springbootdatajpademo.relationships.manyToMany.uni;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    Long id;

    // If you want to configure join table, you can add:
    // @JoinTable(
    //      name = "author_book"
    //      joinColumns = @JoinColumn(name = "author_id"),
    //      inverseJoinColumns = @JoinColumn(name = "book_id")
    // )
    @ManyToMany
    List<Book> books;
}
