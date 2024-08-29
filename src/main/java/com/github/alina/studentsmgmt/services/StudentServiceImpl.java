package com.github.alina.studentsmgmt.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.alina.studentsmgmt.models.dtos.StudentDTO;
import com.github.alina.studentsmgmt.models.entities.Student;
import com.github.alina.studentsmgmt.repositories.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final ObjectMapper objectMapper;

    public StudentServiceImpl(StudentRepository studentRepository, ObjectMapper objectMapper) {
        this.studentRepository = studentRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public StudentDTO update(StudentDTO studentDTO) {
        Student updatedValue = studentRepository.save(objectMapper.convertValue(studentDTO, Student.class));
        return objectMapper.convertValue(updatedValue, StudentDTO.class);
    }

    @Override
    public StudentDTO findById(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        return objectMapper.convertValue(student, StudentDTO.class);
    }

    @Override
    public List<StudentDTO> getAll() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map(student -> objectMapper.convertValue(student, StudentDTO.class)).toList();
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO) {
        Student studentEntityToBeSaved = objectMapper.convertValue(studentDTO, Student.class);
        Student studentResponseEntity = studentRepository.save(studentEntityToBeSaved);
        return objectMapper.convertValue(studentResponseEntity, StudentDTO.class);
    }
}
