package com.academy.dao;

import com.academy.entity.Student;

import java.util.Collection;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(long id);

    void deleteStudentById(Long id);

    void addStudent(Student student);

    void updateStudent(Student student);
}
