package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.exception.BookNotFoundException;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;
    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(int book_id) {
        Optional<Book> tempBook = bookRepository.findById(book_id);
        Book book=null;
        if(tempBook.isPresent())
        {
            book=tempBook.get();
            return book;
        }
        else
            throw new BookNotFoundException("Book with id "+book_id+" is not found");
    }

    @Override
    public String addBook(Book book) {
        book.setId(0);
        bookRepository.save(book);
        return "Book is added successfully";
    }

    @Override
    public String updateBook(Book book) {
        Optional<Book> tempBook = bookRepository.findById(book.getId());
        if(tempBook.isPresent())
        {
            bookRepository.save(book);
            return "Book is updated successfully";
        }
        else
            throw new BookNotFoundException("Book does not exist, cannot update");
    }

    @Override
    public String deleteBook(int book_id) {
        bookRepository.deleteById(book_id);
        return "Book with id "+book_id+" is deleted successfully";
    }
}
