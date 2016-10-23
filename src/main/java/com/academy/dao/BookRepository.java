package com.academy.dao;

import com.academy.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
