package com.team.service.Response;

import java.util.List;

public class ResultResponse {
	private String lottezyId;
	private String lottezyName;
	private String date; // yyyy-MM-dd
	private List<String> specialPrize;
	private List<String> special;
	private List<String> firstPrize;
	private List<String> first;
	private List<String> secondPrize;
	private List<String> second;
	private List<String> thirdPrize;
	private List<String> third;
	private List<String> fourtyPrize;
	private List<String> fourty;
	private List<String> fiftyPrize;
	private List<String> fifty;

	public List<String> getSpecial() {
		return special;
	}

	public void setSpecial(List<String> special) {
		this.special = special;
	}

	public List<String> getFirst() {
		return first;
	}

	public void setFirst(List<String> first) {
		this.first = first;
	}

	public List<String> getSecond() {
		return second;
	}

	public void setSecond(List<String> second) {
		this.second = second;
	}

	public List<String> getThird() {
		return third;
	}

	public void setThird(List<String> third) {
		this.third = third;
	}

	public List<String> getFourty() {
		return fourty;
	}

	public void setFourty(List<String> fourty) {
		this.fourty = fourty;
	}

	public List<String> getFifty() {
		return fifty;
	}

	public void setFifty(List<String> fifty) {
		this.fifty = fifty;
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

	public String getLottezyId() {
		return lottezyId;
	}

	public void setLottezyId(String lottezyId) {
		this.lottezyId = lottezyId;
	}

	public String getLottezyName() {
		return lottezyName;
	}

	public void setLottezyName(String lottezyName) {
		this.lottezyName = lottezyName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<String> getSpecialPrize() {
		return specialPrize;
	}

	public void setSpecialPrize(List<String> specialPrize) {
		this.specialPrize = specialPrize;
	}

}
