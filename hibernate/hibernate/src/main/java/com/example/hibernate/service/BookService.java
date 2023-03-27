package com.example.hibernate.service;

import com.example.hibernate.model.Book;
import com.example.hibernate.model.Student;
import com.example.hibernate.repository.BookRepo;
import com.example.hibernate.repository.StudentRepo;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;
    @Autowired
    private StudentRepo studentRepo;
    public Book addBook(String book) {
        JSONObject jsonObject = new JSONObject(book);
        Student student = null;
        int studentId = jsonObject.getInt("student");

        if(studentRepo.findById(studentId).isPresent()) {
            student = studentRepo.findById(studentId).get();
        } else {
            return null;
        }

        Book book1 = new Book();
        book1.setStudent(student);
        book1.setTitle(jsonObject.getString("title"));
        book1.setAuthor(jsonObject.getString("author"));
        book1.setDescription(jsonObject.getString("description"));
        book1.setPrice(jsonObject.getString("price"));

        Book bookObj=bookRepo.save(book1);


        return bookObj;
    }

    public List<Book> getCourse() {
        return bookRepo.findAll();
    }

    public Book getBookById(Integer ID) {
        return bookRepo.findById(ID).get();
    }

    public void deleteBook(Integer ID) {
        bookRepo.deleteById(ID);
    }

    public void updateBook(Integer ID, Book book) {
        Book book1=bookRepo.findById(ID).get();
        book1.setAuthor(book.getAuthor());
        book1.setDescription(book.getDescription());
        book1.setTitle(book.getTitle());
        book1.setPrice( book.getPrice());
        bookRepo.save(book1);
    }
}
