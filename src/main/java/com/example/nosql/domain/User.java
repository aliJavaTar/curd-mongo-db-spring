package com.example.nosql.domain;

public class User {
    private final Username username;
    private final Password password;
    private final Address address;

    private User(Username username, Password password, Address address) {
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public static User createUser(Username username, Password password, Address address) {
        return new User(username, password, address);
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
