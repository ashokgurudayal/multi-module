package com.ashokgurudayal.controller;

import com.ashokgurudayal.modal.Course;
import com.ashokgurudayal.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.HashSet;

@RestController
public class CourseController {
    @Autowired
    CourseServiceImpl courseServiceImpl;

    @PostMapping("/addcourse")
    public void addCourse(@RequestBody Course course) {
        courseServiceImpl.addCourse(course);
    }

    @GetMapping("/findall")
    public HashSet<Course> getAllCourse() {
        return courseServiceImpl.findAllCourse();
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/findbyid/{id}")
    public Course geBookById(@PathVariable long id) {
        return courseServiceImpl.findCourseByID(id);
    }

    @DeleteMapping("/delete")
    public void deleteCourse() {
        courseServiceImpl.deleteAllData();
    }
}
