package com.example.nosql.infrastructure.entity.base;

public class BaseEntity<ID> {
    private ID id;
    //todo add create at and update at to base Entity

    public ID getId() {
        return id;
    }
}
