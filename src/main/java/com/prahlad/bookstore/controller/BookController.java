package com.prahlad.bookstore.controller;


import com.prahlad.bookstore.model.Book;
import com.prahlad.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // CREATE
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }


    @GetMapping("/all")
    public List<Book> getAllBooksUnpaged() {
        return bookService.getAllBooks();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }


    // ✅ GET with Pagination, Sorting, and Filtering
    @GetMapping("/filter")
    public Page<Book> getBooksByGenre(
            @RequestParam String genre,
            @PageableDefault(size = 5, sort = "title") Pageable pageable
    ) {
        return bookService.getBooksByGenre(genre, pageable);
    }

    @GetMapping
    public Page<Book> getAllBooks(@PageableDefault(size = 5) Pageable pageable) {
        return bookService.getBooks(pageable);
    }
}
