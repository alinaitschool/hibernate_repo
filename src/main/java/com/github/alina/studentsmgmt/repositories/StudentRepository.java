package com.github.alina.studentsmgmt.repositories;

import com.github.alina.studentsmgmt.models.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByFirstNameOrLastNameOrEmail(String firstName, String lastName, String email);
}
