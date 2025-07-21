package com.prahlad.bookstore.repository;

import com.prahlad.bookstore.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    // custom query methods later (if needed)
}
