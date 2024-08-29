package com.github.alina.studentsmgmt.models.dtos;

import lombok.Data;

@Data
public class StudentDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
