package com.example.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "result")
public class Result {
	@Id
	private String id;
	@Field("time")
	private long dateTime;
	@Field("lottezy_id")
	private String lottezyId;
	@Field("special_prize")
	private List<String> specialPrize;
	@Field("first_prize")
	private List<String> firstPrize;
	@Field("second_prize")
	private List<String> secondPrize;
	@Field("third_prize")
	private List<String> thirdPrize;
	@Field("fourty_prize")
	private List<String> fourtyPrize;
	@Field("fifty_prize")
	private List<String> fiftyPrize;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getDateTime() {
		return dateTime;
	}

	public void setDateTime(long dateTime) {
		this.dateTime = dateTime;
	}

	public String getLottezyId() {
		return lottezyId;
	}

	public void setLottezyId(String lottezyId) {
		this.lottezyId = lottezyId;
	}

	public List<String> getSpecialPrize() {
		return specialPrize;
	}

	public void setSpecialPrize(List<String> specialPrize) {
		this.specialPrize = specialPrize;
	}

	public List<String> getFirstPrize() {
		return firstPrize;
	}

	public void setFirstPrize(List<String> firstPrize) {
		this.firstPrize = firstPrize;
	}

	public List<String> getSecondPrize() {
		return secondPrize;
	}

	public void setSecondPrize(List<String> secondPrize) {
		this.secondPrize = secondPrize;
	}

	public List<String> getThirdPrize() {
		return thirdPrize;
	}

	public void setThirdPrize(List<String> thirdPrize) {
		this.thirdPrize = thirdPrize;
	}

	public List<String> getFourtyPrize() {
		return fourtyPrize;
	}

	public void setFourtyPrize(List<String> fourtyPrize) {
		this.fourtyPrize = fourtyPrize;
	}

	public List<String> getFiftyPrize() {
		return fiftyPrize;
	}

	public void setFiftyPrize(List<String> fiftyPrize) {
		this.fiftyPrize = fiftyPrize;
	}

}
