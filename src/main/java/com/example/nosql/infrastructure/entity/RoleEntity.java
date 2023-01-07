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
public class RoleEntity extends BaseEntity<Integer> {
    private String name;
}
