package com.academy.service;

import com.academy.dao.StudentRepository;
import com.academy.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired // Automatycznie podłącza studentRepository
    private StudentRepository studentRepository;

    @Override
    public Collection<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findOne(id);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.delete(id);
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

}
