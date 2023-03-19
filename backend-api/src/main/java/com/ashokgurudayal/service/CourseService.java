package com.ashokgurudayal.service;

import com.ashokgurudayal.modal.Course;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.HashSet;

public interface CourseService {

    @Cacheable("courses")
    HashSet<Course> findAllCourse();
    Course findCourseByID(long id);
    @CacheEvict(value="courses", allEntries=true)
    void addCourse(Course b);
    void deleteAllData();
}
