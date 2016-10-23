package com.academy.dao;

import com.academy.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Klasa dziedzicząca po komponencie springowym,
 * który rozmawia z bazą danych opartą na obiekcie Student z indeksem Long
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}
