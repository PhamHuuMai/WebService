package com.team.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.team.service.domain.Result;

public interface ResultRepository extends MongoRepository<Result, String> {

}
