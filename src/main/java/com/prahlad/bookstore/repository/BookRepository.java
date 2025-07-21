package com.prahlad.bookstore.repository;


import com.prahlad.bookstore.model.Book;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // e.g., List<Book> findByGenre(String genre);

    Page<Book> findByGenreIgnoreCase(String genre, Pageable pageable); // Pagination

}
