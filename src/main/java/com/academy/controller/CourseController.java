package com.academy.controller;

import com.academy.entity.Course;
import com.academy.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}
