package com.academy.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
@Entity
@Table(name = "COURSES")
public class Course {
    @Id
    @GenericGenerator(name = "courseSequence", strategy = "sequence-identity",
            parameters = @org.hibernate.annotations.Parameter(name = "sequence", value = "COURSES_SEQ"))
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "courseSequence")
    @Column(name = "COURSE_ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "STUDENTS_COURSES",
            joinColumns = @JoinColumn(name = "COURSE_ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID"))
    private List<Student> students;

    @JsonProperty
    public List<Long> getStudentsId() {
        return students
                .stream()
                .map(Student::getId)
                .collect(Collectors.toList());
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
