package com.ashokgurudayal.controller;

import com.ashokgurudayal.modal.Course;
import com.ashokgurudayal.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.HashSet;

@RequestMapping("/courses")
@RestController
public class CourseController {
    @Autowired
    CourseServiceImpl courseServiceImpl;

    @CacheEvict(value="courses", allEntries=true)
    @PostMapping("/addcourse")
    public void addCourse(@RequestBody Course course) {
        courseServiceImpl.addCourse(course);
    }

    @GetMapping("/findall")
    public HashSet<Course> getAllCourse() {
        return courseServiceImpl.findAllCourse();
    }

    @GetMapping("/findbyid/{id}")
    public Course geBookById(@PathVariable long id) {
        return courseServiceImpl.findCourseByID(id);
    }

    @DeleteMapping("/deleteall")
    public void deleteCourse() {
        courseServiceImpl.deleteAllData();
    }
}
