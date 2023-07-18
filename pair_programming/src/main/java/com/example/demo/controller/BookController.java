package com.example.demo.controller;


import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/{book_id}")
    public Book getBook(@PathVariable int book_id){
        return bookService.getBook(book_id);
    }

    @PostMapping("/")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PutMapping("/")
    public String updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    @DeleteMapping("/{book_id}")
    public String deleteBook(@PathVariable int book_id){
        return bookService.deleteBook(book_id);
    }
}
