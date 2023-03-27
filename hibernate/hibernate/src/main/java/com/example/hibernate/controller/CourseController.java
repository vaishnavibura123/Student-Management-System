package com.example.hibernate.controller;

import com.example.hibernate.model.Course;

import com.example.hibernate.service.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @PostMapping("/course")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }
    @GetMapping("/course")
    public List<Course> getCourse(){
        return courseService.getCourse();
    }
    @GetMapping("/course/Id/{ID}")
    public Course getCourseById(@PathVariable Integer ID){

        return courseService.getCourseById(ID);
    }
    @DeleteMapping("/course/Id/{ID}")
    public void deleteCourse(@PathVariable Integer ID){
        courseService.deleteCourse(ID);
    }
    @PutMapping("/course/Id/{ID}")
    public void updateCourse(@PathVariable Integer ID, @RequestBody Course course){
        courseService.updateCourse(ID,course);
    }
}
