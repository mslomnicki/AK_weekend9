package com.academy.service;

import com.academy.entity.Book;

import java.util.Collection;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
public interface BookService {
    Collection<Book> getAllBooks();

    Book getBookById(Long id);

    void deleteBookById(Long id);

    void addBook(Book book);

    void updateBook(Book book);
}
