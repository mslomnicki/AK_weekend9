package com.academy.dao;

import com.academy.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDaoImpl implements StudentDao {
    Map<Long, Student> students = new HashMap<>();

    public StudentDaoImpl() {
        addStudent(new Student(1L, "Zenon", "Baleron"));
        addStudent(new Student(2L, "Arek", "Zegarek"));
        addStudent(new Student(3L, "Innocenty", "Kuś"));
    }

    @Override
    public Collection<Student> getAllStudents() {
        return students.values();
    }

    @Override
    public Student getStudentById(Long id) {
        return students.get(id);
    }

    @Override
    public void deleteStudentById(Long id) {
        students.remove(id);
    }

    @Override
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public void updateStudent(Student student) {
        students.replace(student.getId(), student);
    }

}
