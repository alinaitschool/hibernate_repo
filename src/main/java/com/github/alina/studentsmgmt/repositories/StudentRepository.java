package com.github.alina.studentsmgmt.repositories;

import com.github.alina.studentsmgmt.models.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
