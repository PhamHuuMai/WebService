package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.LoginRequest;
import com.example.response.Response;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	public ResponseEntity<Response> login(@RequestBody LoginRequest request) {
		Response response = new Response();
		try {
			if (!request.isValid()) {
				throw new Exception();
			}
			if (userService.login(request.getAccount(), request.getPassword())) {
				response.setCode(0);
			}
		} catch (Exception e) {
			response.setCode(1);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
}
