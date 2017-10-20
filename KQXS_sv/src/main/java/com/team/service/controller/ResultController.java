package com.team.service.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.team.service.Response.Response;
import com.team.service.Response.ResultResponse;
import com.team.service.domain.Lottezy;
import com.team.service.domain.Result;
import com.team.service.service.ResultService;

@Controller
@RequestMapping("lottezy")
public class ResultController {

	@Autowired
	ResultService resultService;

	@GetMapping("/{lottezyId}")
	public ResponseEntity<Response> result(
			@PathVariable("lottezyId") String lottezyId,
			@RequestParam(required = false, name = "date") String date) {
		Response response = new Response();
		try {
			// validate param
			if (lottezyId == null || lottezyId.isEmpty()) {
				response.setCode(1);
				return new ResponseEntity<Response>(response, HttpStatus.OK);
			}
			System.out.println(lottezyId + "===" + date);
			//
			Lottezy lottezy = resultService.getLottezy(lottezyId);
			if (lottezy == null) {
				response.setCode(1);
				return new ResponseEntity<Response>(response, HttpStatus.OK);
			}
			ResultResponse resultResponse = new ResultResponse();
			resultResponse.setLottezyId(lottezy.getId());
			resultResponse.setLottezyName(lottezy.getName());
			Result result = new Result();
			if (date == null || date.isEmpty()) {
				// GET result nearest
				result = resultService.getResultNearest(lottezyId);

				System.out.println("null");
			} else {
				// GET result by date
				result = resultService.getResultNearest(lottezyId);
				System.out.println("not null");
			}
			if (result == null) {
				response.setCode(1);
				return new ResponseEntity<Response>(response, HttpStatus.OK);
			}
			// mapper result vs ResultResponse
			Date dateD = new Date(result.getDateTime());
			String dateStr = dateD.getYear() + "-" + dateD.getMonth() + "-"
					+ dateD.getDate();
			resultResponse.setDate(dateStr);
			resultResponse.setSpecialPrize(result.getSpecialPrize());
			resultResponse.setFirstPrize(result.getFirstPrize());
			resultResponse.setSecondPrize(result.getSecondPrize());
			resultResponse.setThirdPrize(result.getThirdPrize());
			resultResponse.setFourtyPrize(result.getFourtyPrize());
			resultResponse.setFiftyPrize(result.getFourtyPrize());

			// get data by lottezyId to resultResponse
			response.setData(resultResponse);
			response.setCode(0);
		} catch (Exception e) {
			response.setCode(1);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@PostMapping("/{lottezyId}")
	public ResponseEntity<Response> result(
			@PathVariable("lottezyId") String lottezyId) {
		Response response = new Response();
		try {
			// validate param
			 resultService.initData();
		
			ResultResponse resultResponse = new ResultResponse();
			// get data by lottezyId to resultResponse
			response.setData(resultResponse);
			response.setCode(0);
		} catch (Exception e) {
			response.setCode(1);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<Response> result() {
		Response response = new Response();
		try {
			List<Lottezy> lottezies = resultService.getListLottezy();
			response.setData(lottezies);
			response.setCode(0);
		} catch (Exception e) {
			response.setCode(1);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
}
