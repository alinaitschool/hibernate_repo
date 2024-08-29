package com.github.alina.studentsmgmt.models.dtos;

import lombok.Data;

@Data
public class Student {
    private String firstName;
    private String lastName;
    private Long id;
    private String email;
}
