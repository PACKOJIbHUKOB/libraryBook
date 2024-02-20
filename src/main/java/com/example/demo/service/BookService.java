package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {


    private final BookRepository bookRepository;


    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addNewBook(String name,long authorId) {
        Book newBook = new Book(authorId,name);
        newBook = bookRepository.save(newBook);
        return newBook;

    }
}
