package com.example.nosql.infrastructure;

import com.example.nosql.infrastructure.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressEntity extends BaseEntity<Integer> {

    private String streetName;
    private String zipCode;
}
