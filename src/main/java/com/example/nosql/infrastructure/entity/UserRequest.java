package com.example.nosql.infrastructure.entity;

import com.example.nosql.domain.Address;
import com.example.nosql.domain.Password;
import com.example.nosql.domain.Username;
import lombok.Data;

import java.util.Optional;

@Data
public class UserRequest {
    private Username username;
    private Password password;
    private Address address;

    public Optional<Address> getAddress() {
        return Optional.ofNullable(address);
    }
}
