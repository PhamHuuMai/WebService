package com.team.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team.service.Response.Response;
import com.team.service.service.ResultService;

@Controller
@RequestMapping("result/")
public class ResultController {

	@Autowired
	ResultService resultService;
	
	@PostMapping()
	public ResponseEntity<Response> result( ) {
		Response response = new Response();
		try {
			//
			
            response.setCode(0);
		} catch (Exception e) {
			response.setCode(1);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
}
