package com.example.nosql.infrastructure;

import com.example.nosql.infrastructure.base.BaseEntity;

public class UserEntity extends BaseEntity<Integer> {

    private String username;
    private String password;
    private String name;
    private String family;
    private String age;
}
