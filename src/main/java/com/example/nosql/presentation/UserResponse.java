package com.example.nosql.presentation;

import lombok.Data;

@Data
public class UserResponse {
    private String username;
    private String password;
    private String name;
    private String family;
    private String age;
    private String streetName;
    private String zipCode;
}
