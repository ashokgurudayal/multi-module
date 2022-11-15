package com.ashokgurudayal.service;

import com.ashokgurudayal.modal.Course;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class CourseServiceImpl implements CourseService {

    HashSet<Course> courseList = new HashSet<Course>();
    @Override
    public HashSet<Course> findAllCourse() {
        if (courseList.isEmpty())
            return null;
        else
            return courseList;
    }

    @Override
    public Course findCourseByID(long id) {
        Course course = courseList.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
        return course;
    }

    @Override
    public void addCourse(Course b) {
        courseList.add(b);
    }

    @Override
    public void deleteAllData() {
        courseList.clear();
    }
}
