package com.example.nosql.infrastructure.db;

import com.example.nosql.infrastructure.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserMongoRepository extends MongoRepository<UserEntity, Integer> {
}
