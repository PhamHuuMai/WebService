package com.myteam.myapp;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myteam.myapp.dto.LottezyDTO;
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
		try {
			// validator
			System.out.println(lottezyId + " === " + date);
			// call API
			ResultDTO resultDTO = APIService.getResultTable(lottezyId, date);
			model.addAttribute("prizes", resultDTO);
		} catch (Exception e) {
			return "error";
		}
		return "ResultTable";
	}

	@RequestMapping(value = "/lottezies", method = RequestMethod.GET)
	public String listLottezy(Model model) {
		try {
			// call API
			List<LottezyDTO> list = APIService.getListLottezy();
			model.addAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "listlottezy";
	}
}
