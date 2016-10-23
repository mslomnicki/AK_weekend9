package com.academy.dao;

import com.academy.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
public interface CourseRepository extends JpaRepository<Course, Long> {
}
