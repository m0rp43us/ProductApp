package com.ProductApp.springangularmongodb.repos;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ProductApp.springangularmongodb.model.User;

public interface UserRepo extends MongoRepository<User, String> {

    User findByEmail(String email);
    User findByPhone_number(String phone_number);
    User findByFullName(String fullname);
}