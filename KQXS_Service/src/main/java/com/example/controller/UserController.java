package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.constans.ResponseCode;
import com.example.request.LoginRequest;
import com.example.response.Response;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping()
	public ResponseEntity<Response> login(@RequestBody LoginRequest request) {
		Response response = new Response();
		try {
			if (!request.isValid()) {
				throw new Exception();
			}
			if (userService.login(request.getAccount(), request.getPassword())) {
				response.setCode(ResponseCode.SUSSESS);
			}
		} catch (Exception e) {
			response.setCode(ResponseCode.UNKNOWN_ERROR);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
}
