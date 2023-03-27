package com.example.hibernate.controller;

import com.example.hibernate.model.Book;
import com.example.hibernate.model.Course;
import com.example.hibernate.model.Laptop;
import com.example.hibernate.service.BookService;
import com.example.hibernate.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping("/book")
    public Book addBook(@RequestBody String book)
    {
       Book book1=bookService.addBook(book);
       return book1;
    }
    @GetMapping("/book")
    public List<Book> getBook(){
        return bookService.getCourse();
    }
    @GetMapping("/book/Id/{ID}")
    public Book getBookById(@PathVariable Integer ID){
        return bookService.getBookById(ID);
    }
    @DeleteMapping("/book/Id/{ID}")
    public void deleteBook(@PathVariable Integer ID){
         bookService.deleteBook(ID);
    }
    @PutMapping("/book/Id/{ID}")
    public void updateBook(@PathVariable Integer ID, @RequestBody Book book){
        bookService.updateBook(ID, book);
    }
}
