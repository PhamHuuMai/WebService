package com.team.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.team.service.Response.Response;
import com.team.service.Response.ResultResponse;
import com.team.service.service.ResultService;

@Controller
@RequestMapping("lottezy")
public class ResultController {

	@Autowired
	ResultService resultService;
	
	@GetMapping("/{lottezyId}")
	public ResponseEntity<Response> result(@PathVariable("lottezyId") String lottezyId,@RequestParam(required=true,name="date") String date) {
		Response response = new Response();
		try {
			// validate param
			
			
		    // 
			if(date == null){
				// GET result nearest
				
				
			}else {
				// GET result by date
				
			}
			ResultResponse resultResponse = new ResultResponse();
			// get data by lottezyId to resultResponse
			
			response.setData(resultResponse);
            response.setCode(0);
		} catch (Exception e) {
			response.setCode(1);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
	@PostMapping("/{lottezyId}")
	public ResponseEntity<Response> result(@RequestParam("lottezyId") String lottezyId) {
		Response response = new Response();
		try {
			// validate param
			
			
			//
			ResultResponse resultResponse = new ResultResponse();
			// get data by lottezyId to resultResponse
			
			response.setData(resultResponse);
            response.setCode(0);
		} catch (Exception e) {
			response.setCode(1);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
}
