package com.academy.service;

import com.academy.dao.CourseRepository;
import com.academy.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Collection<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
