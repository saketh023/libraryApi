package com.example.libraryApi.service;

import com.example.libraryApi.Book;
import com.example.libraryApi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

//    getAllBooks() - Returns list of all books
//
//    getBookById(Long id) - Returns a single book by ID
//
//    createBook(Book book) - Saves a new book
//
//    updateBook(Long id, Book book) - Updates an existing book
//
//    deleteBook(Long id) - Deletes a book by ID
    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(int id){
        return bookRepository.findById(id);
    }

    public Book createBook(Book book){
//        Book b = new Book();
//        b.setId(id);
//        b.setTitle(title);
//        b.setAuthor(author);
//        b.setPublishYear(publishYear);
//        b.setIsbn(isbn);
//        b.setGenre(genre);
        return bookRepository.save(book);
    }

    public void deleteBookById(int bookId){
        if(bookRepository.existsById(bookId)){
            bookRepository.deleteById(bookId);
        }else {
            System.out.println("BookId does not exist!");
        }
    }

    public Optional<Book> updateBookById(int bookId, Book updatedBook){
        Optional<Book> optionalBook = getBookById(bookId);
        if(optionalBook.isPresent()){
            Book existingBook = optionalBook.get();

            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setPublishYear(updatedBook.getPublishYear());
            existingBook.setIsbn(updatedBook.getIsbn());
            existingBook.setGenre(updatedBook.getGenre());

            Book savedBook = bookRepository.save(existingBook);
            return Optional.of(savedBook);
        }
        return Optional.empty();
    }
}
