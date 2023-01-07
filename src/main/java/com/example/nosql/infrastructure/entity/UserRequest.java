package com.example.nosql.infrastructure.entity;

import com.example.nosql.domain.Address;
import lombok.Data;

import java.util.Optional;

@Data
public class UserRequest {
    private UserEntity user;
    private AddressEntity address;

    public Optional<AddressEntity> getAddress() {
        return Optional.ofNullable(address);
    }
}
