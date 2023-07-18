package com.example.demo.service;

import com.example.demo.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getBooks();

    public Book getBook(int book_id);

    public String addBook(Book book);

    public String updateBook(Book book);

    public String deleteBook(int book_id);
}
