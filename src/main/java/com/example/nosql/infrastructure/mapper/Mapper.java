package com.example.nosql.infrastructure.mapper;

import com.example.nosql.infrastructure.entity.base.BaseEntity;
import org.modelmapper.ModelMapper;

public class Mapper {
    private static ModelMapper mapper;

    private Mapper() {
    }

    private static ModelMapper getMapper() {
        if (mapper == null)
            mapper = new ModelMapper();

        return mapper;
    }

    public static <E extends BaseEntity<Integer>, D> D convertToDto(E entity, Class<D> dto) {
        return getMapper().map(entity, dto);
    }

    public static <E extends BaseEntity<Integer>, D> E convertToEntity(D dto, Class<E> entity) {
        return getMapper().map(dto, entity);
    }

}
