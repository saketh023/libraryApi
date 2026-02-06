package com.example.libraryApi;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="books")
@ToString
public class Book {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Setter
    @Getter
    private String title;

    @Setter
    @Getter
    private String author;

    @Setter
    @Getter
    private int isbn;

    @Setter
    @Getter
    private int publishYear;

    @Setter
    @Getter
    private String genre;

}
