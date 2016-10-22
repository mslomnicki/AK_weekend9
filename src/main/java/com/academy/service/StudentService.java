package com.academy.service;

import com.academy.entity.Student;

import java.util.Collection;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
public interface StudentService {
    Collection<Student> getAllStudents();

    Student getStudentById(long id);

    void deleteStudentById(Long id);

    void addStudent(Student student);

    void updateStudent(Student student);
}
