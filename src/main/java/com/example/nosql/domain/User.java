package com.example.nosql.domain;

public class User {
    private String username;
    private String password;
    private Address address;

    private User(String username, String password, Address address) {
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public static User createUser(String username, String password, Address address)
    {
        return new User(username,password,address);
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Address getAddress() {
        return address;
    }
}
