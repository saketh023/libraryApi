package com.example.libraryApi.repository;

import com.example.libraryApi.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
//    List<Book> getAllBooks();
//    Book getBookById(int id);
//    void createBook(Book book);
//    void updateBook(int id, Book book);
//    void deleteBookById(int id);
//
//    List<Book> searchBooksByAuthor(String author);
//    List<Book> searchBooksByGenre(String genre);
}
