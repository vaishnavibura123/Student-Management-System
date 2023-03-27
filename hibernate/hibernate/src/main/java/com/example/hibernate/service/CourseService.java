package com.example.hibernate.service;
;
import com.example.hibernate.model.Course;
import com.example.hibernate.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;
    public  void deleteCourse(Integer ID) {
        courseRepo.deleteById(ID);

    }
    public void addCourse(Course course) {
        courseRepo.save(course);
    }

    public List<Course> getCourse() {
        return courseRepo.findAll();
    }

    public Course getCourseById(Integer ID) {
        return courseRepo.findById(ID).get();
    }
    public  void updateCourse(Integer ID, Course course) {
        Course course1=courseRepo.findById(ID).get();
        course1.setSt(course.getSt());
        course1.setDuration(course.getDuration());
        course1.setTitle((course.getTitle()));
        courseRepo.save(course1);
    }
}
