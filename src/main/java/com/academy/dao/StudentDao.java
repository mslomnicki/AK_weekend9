package com.academy.dao;

import com.academy.entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
public class StudentDao {
    Map<Long, Student> students = new HashMap<>();

    public StudentDao() {
        addStudent(new Student(1L, "Zenon", "Baleron", "plażing"));
        addStudent(new Student(2L, "Arek", "Zegarek", "informatyka"));
        addStudent(new Student(3L, "Innocenty", "Kuś", "matematyka"));
    }

    public Collection<Student> getAllStudents() {
        return students.values();
    }

    public Student getStudentById(long id) {
        return students.get(id);
    }

    public void deleteStudentById(Long id) {
        students.remove(id);
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void updateStudent(Student student) {
        students.replace(student.getId(), student);
    }

}
