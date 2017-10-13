package com.myteam.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myteam.myapp.dto.ResultDTO;
import com.myteam.myapp.service.APIService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);
	@Autowired
	APIService APIService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		return "home";
	}

	@RequestMapping(value = "/lottezy", method = RequestMethod.GET)
	public String tableResult(String lottezyId, String date, Model model) {
		//validator
		
		//call API
		
		
		ResultDTO resultDTO = new ResultDTO();
		resultDTO.setLottezyId("ssssss");
		resultDTO.setLottezyName("ssssss");
		resultDTO.setDate("ssssss");
		resultDTO.setSpecialPrize("012345");
		resultDTO.setFirstPrize("012345");
		resultDTO.setFiftyPrize("012345");
		resultDTO.setFourtyPrize("012345");
		resultDTO.setThirdPrize("012345");
		resultDTO.setSecondPrize("012345");
		model.addAttribute("prizes", resultDTO);
		// return view
		return "ResultTable";
	}
}
