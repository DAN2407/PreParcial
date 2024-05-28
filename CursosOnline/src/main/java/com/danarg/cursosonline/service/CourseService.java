package com.danarg.cursosonline.service;

import com.danarg.cursosonline.domain.entities.Course;

import java.util.List;
import java.util.UUID;

public interface CourseService {
    Course createCourse(Course course);
    Course getCourseById(UUID id);
    List<Course> getAllCourses();
    Course updateCourse(UUID id, Course courseDetails);
    void deleteCourse(UUID id);
}
