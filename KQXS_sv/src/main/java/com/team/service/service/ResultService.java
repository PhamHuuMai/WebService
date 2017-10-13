package com.team.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.service.repository.LottezyRepository;

@Service
public class ResultService {
	@Autowired
	LottezyRepository lottezyRepository;

}
