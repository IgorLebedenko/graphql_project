package com.example.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer salary;
    private LocalDate birthDate;
}
