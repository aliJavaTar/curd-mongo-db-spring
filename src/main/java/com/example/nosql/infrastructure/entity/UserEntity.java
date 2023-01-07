package com.example.nosql.infrastructure.entity;

import com.example.nosql.infrastructure.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends BaseEntity<Integer> {

    private String username;
    private String password;
    private String name;
    private String family;
    private String age;
    private AddressEntity addressEntity;
}
