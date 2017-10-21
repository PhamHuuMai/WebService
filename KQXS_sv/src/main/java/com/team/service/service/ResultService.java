package com.team.service.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.team.service.domain.Lottezy;
import com.team.service.domain.Result;
import com.team.service.repository.LottezyRepository;
import com.team.service.repository.ResultRepository;
import com.team.service.util.StringUtil;

@Service
public class ResultService {
	@Autowired
	LottezyRepository lottezyRepository;
	@Autowired
	ResultRepository resultRepository;

	public void initData() {
		// lottezyRepository.insert(new Lottezy("Xổ số Miền Bắc", "MB"));
		// lottezyRepository.insert(new Lottezy("Xổ số Miền Nam", "MN"));
		// lottezyRepository.insert(new Lottezy("Xổ số Nam Định", "ND"));

		List<String> specialPrize = new ArrayList<String>();
		List<String> firstPrize = new ArrayList<String>();
		List<String> secondPrize = new ArrayList<String>();
		List<String> thirstPrize = new ArrayList<String>();
		List<String> fortyPrize = new ArrayList<String>();
		List<String> fiftyPrize = new ArrayList<String>();
		specialPrize.add("012345");
		//
		firstPrize.add("012345");
		//
		secondPrize.add("012345");
		secondPrize.add("012345");
		//
		thirstPrize.add("012345");
		thirstPrize.add("012345");
		//
		fortyPrize.add("012345");
		fortyPrize.add("012345");
		fortyPrize.add("012345");
		fortyPrize.add("012345");
		//
		fiftyPrize.add("012345");
		fiftyPrize.add("012345");
		fiftyPrize.add("012345");
		fiftyPrize.add("012345");

		Calendar now = Calendar.getInstance();
		
		Result result = new Result();
		int month = now.get(Calendar.MONTH)+1;
		result.setDateTime(now.get(Calendar.YEAR)+"-"+month+"-"+now.get(Calendar.DATE));
		result.setLottezyId("59e63b290cab9d375895c296");
		result.setSpecialPrize(specialPrize);
		result.setFirstPrize(firstPrize);
		result.setSecondPrize(secondPrize);
		result.setThirdPrize(thirstPrize);
		result.setFourtyPrize(fortyPrize);
		result.setFiftyPrize(fiftyPrize);
		
		resultRepository.insert(result);

	}

	public List<Lottezy> getListLottezy() {
		List<Lottezy> lottezies = lottezyRepository.findAll();
		if (lottezies == null)
			return new ArrayList<Lottezy>();
		return lottezies;
	}

	public Lottezy getLottezy(String lottezyId) {
		Lottezy lottezy = lottezyRepository.findOne(lottezyId);
		return lottezy;
	}

	public Result getResult(String lottezyId, String dateTime) {
		// dateTime format yyyy-MM-dd
		Result result = resultRepository.findByLottezyIdAndDateTime(lottezyId,dateTime);
		return result;
	}

	public Result getResultNearest(String lottezyId) throws Exception {
		Sort sort = new Sort(Sort.Direction.DESC, "time");
		List<Result> result = resultRepository.findByLottezyId(lottezyId, sort);
		if (result == null || result.isEmpty()) {
			throw new Exception();
		}
		return result.get(0);
	}
}
