package com.academy.dao;

import com.academy.entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
public class StudentDaoImpl implements StudentDao {
    Map<Long, Student> students = new HashMap<>();

    public StudentDaoImpl() {
        addStudent(new Student(1L, "Zenon", "Baleron", "plażing"));
        addStudent(new Student(2L, "Arek", "Zegarek", "informatyka"));
        addStudent(new Student(3L, "Innocenty", "Kuś", "matematyka"));
    }

    @Override
    public Collection<Student> getAllStudents() {
        return students.values();
    }

    @Override
    public Student getStudentById(long id) {
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
