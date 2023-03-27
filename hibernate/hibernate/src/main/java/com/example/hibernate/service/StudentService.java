package com.example.hibernate.service;

import com.example.hibernate.model.Student;
import com.example.hibernate.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student addStudent(Student student) {
        Student st=studentRepo.save(student);
        return st;
    }
    public List<Student> getStudents() {
       return studentRepo.findAll();
    }

    public Student getStudentById(Integer ID) {
        return studentRepo.findById(ID).get();
    }

    public void deleteStudent(Integer ID) {
        studentRepo.deleteById(ID);
    }

    public void updateStudent(Integer ID, Student student) {
        Student student1=studentRepo.findById(ID).get();

        student1.setName(student.getName());
        student1.setAge(student.getAge());
        student1.setBranch(student.getBranch());
        student1.setDepartment(student.getDepartment());
        student1.setPhoneNo(student.getPhoneNo());
        studentRepo.save(student1);
    }


}
