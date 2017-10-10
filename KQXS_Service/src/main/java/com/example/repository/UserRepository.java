package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.domain.User;
import java.lang.String;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
	User findByAccount(String account);
}
