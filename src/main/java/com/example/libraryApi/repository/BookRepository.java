package com.example.libraryApi.repository;

import com.example.libraryApi.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> getAllBooks();
    Book getBookById(int id);
    void createBook(Book book);
    void updateBook(Long id, Book book);
    void deleteBook(Long id);

    List<Book> searchBooksByAuthor(String author);
    List<Book> searchBooksByGenre(String genre);
}
