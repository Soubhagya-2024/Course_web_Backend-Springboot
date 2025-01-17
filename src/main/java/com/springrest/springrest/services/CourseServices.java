package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;


public interface CourseServices {
    public List<Course> getCourses();
    Course getCourse(long courseId);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);
}
