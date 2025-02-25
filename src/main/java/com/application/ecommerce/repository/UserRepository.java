package com.application.ecommerce.repository;

import com.application.ecommerce.modals.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByAge(int age);
}
