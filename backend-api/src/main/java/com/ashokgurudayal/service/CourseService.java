package com.ashokgurudayal.service;

import com.ashokgurudayal.modal.Course;

import java.util.HashSet;

public interface CourseService {
    HashSet<Course> findAllCourse();
    Course findCourseByID(long id);
    void addCourse(Course b);
    void deleteAllData();
}
