package com.github.alina.studentsmgmt.services;

import com.github.alina.studentsmgmt.models.dtos.StudentDTO;

import java.util.List;

public interface StudentService {
    StudentDTO updateStudent(StudentDTO studentDTO);
    StudentDTO getStudentById(Long id);
    List<StudentDTO> getStudents(Long id);
    void deleteStudent(Long id);
    StudentDTO createStudent(StudentDTO studentDTO);
}
