package com.prahlad.bookstore.service;


import com.prahlad.bookstore.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface BookService {
    Book createBook(Book book);
    List<Book> getAllBooks();

    Page<Book> getBooks(Pageable pageable); // NEW Pagination
    Page<Book> getBooksByGenre(String genre, Pageable pageable); // NEW Pagination

    Book getBookById(Long id);
    void deleteBook(Long id);



}
