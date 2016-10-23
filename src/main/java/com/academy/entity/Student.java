package com.academy.entity;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
@Entity
@Table(name = "STUDENTS")
public class Student {
    @Id
    @GenericGenerator(name = "studentSequence", strategy = "sequence-identity",
            parameters = @org.hibernate.annotations.Parameter(name = "sequence", value = "STUDENTS_SEQ"))
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "studentSequence")
    @Column(name = "STUDENT_ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LAST_NAME")
    private String lastName;

    @OneToOne
    @JoinColumn(name = "ADDRESS_ID")
    private Address address;

    @OneToMany(mappedBy = "student")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    private Set<Book> books;

    @ManyToMany
    @JoinTable(name = "STUDENTS_COURSES",
            joinColumns = @JoinColumn(name = "STUDENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "COURSE_ID"))
    private List<Course> courses;

    public Student() {
    }

    public Student(Long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
