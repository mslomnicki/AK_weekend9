package com.academy.service;

import com.academy.entity.Course;

import java.util.Collection;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
public interface CourseService {
    Collection<Course> getAllCourses();
}
