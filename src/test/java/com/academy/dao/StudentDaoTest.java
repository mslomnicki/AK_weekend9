package com.academy.dao;

import com.academy.entity.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
public class StudentDaoTest {
    StudentDao studentDao;
    Student newStudent;
    Collection<Student> currentStudents;

    @Before
    public void setUp() throws Exception {
        studentDao = new StudentDao();
        newStudent = new Student(666L, "Marek", "Słomnicki", "java");
        currentStudents = studentDao.getAllStudents();
    }

    @Test
    public void getAllStudents() throws Exception {
        //given

        //when
        Collection<Student> students = studentDao.getAllStudents();

        //then
        Assert.assertEquals(3, students.size());
    }

    @Test
    public void getStudentById() throws Exception {
        //given
        studentDao.addStudent(newStudent);

        //when
        Student student = studentDao.getStudentById(666);

        // then
        Assert.assertEquals(newStudent, student);

    }

    @Test
    public void deleteStudentById() throws Exception {
        //given
        Long id = studentDao.getAllStudents().iterator().next().getId();

        //when
        studentDao.deleteStudentById(id);
        Student deletedStudent = studentDao.getStudentById(id);

        // then
        Assert.assertNull(deletedStudent);
    }

    @Test
    public void addStudent() throws Exception {
        // given

        //when
        studentDao.addStudent(newStudent);
        Student addedStudent = studentDao.getStudentById(newStudent.getId());

        // then
        Assert.assertEquals(newStudent, addedStudent);

    }

    @Test
    public void updateStudent() throws Exception {
        //given

        //when
        studentDao.addStudent(newStudent);
        newStudent.setName("Krzysztof");
        newStudent.setLastName("Całczyński");
        studentDao.updateStudent(newStudent);
        Student updatedStudent = studentDao.getStudentById(newStudent.getId());

        //then
        Assert.assertEquals(newStudent, updatedStudent);
    }

}