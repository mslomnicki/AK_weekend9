package com.academy.service;

import com.academy.dao.StudentDao;
import com.academy.entity.Student;

import java.util.Collection;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
public class StudentService {
    StudentDao studentDao = new StudentDao();

    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudentById(long id) {
        return studentDao.getStudentById(id);
    }

    public void deleteStudentById(Long id) {
        studentDao.deleteStudentById(id);
    }

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

}
