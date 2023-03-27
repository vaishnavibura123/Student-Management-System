package com.example.hibernate.controller;

import com.example.hibernate.model.Student;
import com.example.hibernate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/student")
    public Student addStudent(@RequestBody  Student student){
       Student st= studentService.addStudent(student);
        return  st;

    }
    @GetMapping("/student")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @GetMapping("/student/Id/{ID}")
    public Student getStudentById(@PathVariable Integer ID){
        return studentService.getStudentById(ID);
    }
    @DeleteMapping("/student/Id/{ID}")
    public String deleteStudent(@PathVariable Integer ID){
        studentService.deleteStudent(ID);
        return "Student deleted By ID"+ ID;
    }
    @PutMapping("/student/Id/{ID}")
    public void updateStudent(@PathVariable Integer ID, @RequestBody Student student){
        studentService.updateStudent(ID, student);
    }

}
