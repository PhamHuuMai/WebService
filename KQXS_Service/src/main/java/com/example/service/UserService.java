package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.User;
import com.example.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public boolean login(String account, String password) {
		User user = userRepository.findByAccount(account);
		if (user != null && user.getPassword().equals(password)) {
			return true;
		}
		return false;
	}
}
