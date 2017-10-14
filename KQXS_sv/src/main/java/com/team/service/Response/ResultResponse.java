package com.team.service.Response;

import java.util.List;

public class ResultResponse {
	private String lottezyId;
	private String lottezyName;
	private String date; // ddMMyyyy
	private List<String> specialPrize;
	private List<String> first_prize;
	private List<String> second_prize;
	private List<String> third_prize;
	private List<String> fourty_prize;
	private List<String> fifty_prize;

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

	public List<String> getFirst_prize() {
		return first_prize;
	}

	public void setFirst_prize(List<String> first_prize) {
		this.first_prize = first_prize;
	}

	public List<String> getSecond_prize() {
		return second_prize;
	}

	public void setSecond_prize(List<String> second_prize) {
		this.second_prize = second_prize;
	}

	public List<String> getThird_prize() {
		return third_prize;
	}

	public void setThird_prize(List<String> third_prize) {
		this.third_prize = third_prize;
	}

	public List<String> getFourty_prize() {
		return fourty_prize;
	}

	public void setFourty_prize(List<String> fourty_prize) {
		this.fourty_prize = fourty_prize;
	}

	public List<String> getFifty_prize() {
		return fifty_prize;
	}

	public void setFifty_prize(List<String> fifty_prize) {
		this.fifty_prize = fifty_prize;
	}

}
