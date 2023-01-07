package com.example.nosql.domain;

import java.util.regex.Pattern;

public record Password (String password){
    public Password {
        String passwordValidation =  "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?'\\d')(?=.*?[#?!@$ %^&*-]).{8,}$";
        boolean isValid = Pattern.matches(passwordValidation, password);
        if (!isValid)
            throw new RuntimeException("password of user is  Not valid");
    }

    public String getPassword() {
        return password;
    }
}

