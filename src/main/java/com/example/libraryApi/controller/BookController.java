package com.example.libraryApi.controller;

import com.example.libraryApi.Book;
import com.example.libraryApi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Book> getBookById(@PathVariable int id){
//        return service.getBookById(id);
//    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return service.createBook(book);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBookById(@PathVariable int id) {
        service.deleteBookById(id);
        System.out.println("Entry deleted successfully!");
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable int id) {
        return service.getBookById(id);
    }

    @PutMapping("/{id}")
    public Book updateBookById(@PathVariable int id, @RequestBody Book updatedBook) {

        return service.updateBookById(id, updatedBook).orElseThrow(() -> new RuntimeException("Book not found with id " + id));
    }
}
