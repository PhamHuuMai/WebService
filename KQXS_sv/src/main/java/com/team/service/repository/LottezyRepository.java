package com.team.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.team.service.domain.Lottezy;

public interface LottezyRepository extends MongoRepository<Lottezy, String>{

}
