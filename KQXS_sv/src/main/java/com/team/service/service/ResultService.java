package com.team.service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.service.domain.Lottezy;
import com.team.service.repository.LottezyRepository;
import com.team.service.repository.ResultRepository;

@Service
public class ResultService {
	@Autowired
	LottezyRepository lottezyRepository;
	@Autowired
	ResultRepository resultRepository;
	
	public void initData(){
		lottezyRepository.insert(new Lottezy("Xổ số Miền Bắc","MB"));
		lottezyRepository.insert(new Lottezy("Xổ số Miền Nam","MN"));
		lottezyRepository.insert(new Lottezy("Xổ số Nam Định","ND"));
		lottezyRepository.insert(new Lottezy("Xổ số Thanh Hóa","TH"));
		lottezyRepository.insert(new Lottezy("Xổ số Hải Phòng","HP"));
		lottezyRepository.insert(new Lottezy("Xổ số Thái Bình","TB"));
	}
    
	public List<Lottezy> getListLottezy(){
		List<Lottezy> lottezies = lottezyRepository.findAll(); 
		if(lottezies==null)
			return new ArrayList<Lottezy>();
		return lottezies;
	}
}
