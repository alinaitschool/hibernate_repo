package com.github.alina.studentsmgmt.services;

import com.github.alina.studentsmgmt.models.dtos.StudentDTO;

import java.util.List;

public interface StudentService {
    StudentDTO update(StudentDTO studentDTO);

    StudentDTO findById(Long id);

    List<StudentDTO> getAll();

    void deleteStudent(Long id);

    StudentDTO createStudent(StudentDTO studentDTO);
}
