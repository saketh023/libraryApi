package com.example.libraryApi;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Book {

    @Getter
    @Setter
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
