package com.example.nosql.domain;

import com.example.nosql.infrastructure.entity.UserRequest;

public class User {
    private final Username username;
    private final Password password;
    private final Address address;

    private User(Username username, Password password, Address address) {
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public static User createUser(UserRequest userRequest) {

        Username validUsername = new Username(userRequest.getUser().getUsername());
        Password validPassword = new Password(userRequest.getUser().getPassword());
        //todo vlidation done and save user
        return null;
    }

    public Username getUsername() {
        return username;
    }

    public Password getPassword() {
        return password;
    }

    public Address getAddress() {
        return address;
    }
}
