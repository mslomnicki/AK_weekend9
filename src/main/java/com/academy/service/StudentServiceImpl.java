package com.academy.service;

import com.academy.dao.StudentDao;
import com.academy.dao.StudentDaoImpl;
import com.academy.entity.Student;

import java.util.Collection;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
public class StudentServiceImpl implements StudentService {
    StudentDao studentDao = new StudentDaoImpl();

    @Override
    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public Student getStudentById(long id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentDao.deleteStudentById(id);
    }

    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

}
