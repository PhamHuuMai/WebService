package com.team.service.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.team.service.domain.Result;

import java.lang.String;
import java.util.List;

public interface ResultRepository extends MongoRepository<Result, String> {
	
	Result findByLottezyIdAndDateTime(String lottezyid, long dateTime);

	List<Result> findById(String id, Sort sort);

	List<Result> findByLottezyId(String lottezyid, Sort sort);
	
}
