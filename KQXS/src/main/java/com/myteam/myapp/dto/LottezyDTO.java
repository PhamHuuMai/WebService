package com.myteam.myapp.dto;

public class LottezyDTO {
	private String lottezyId;
	private String lottezyName;

	public LottezyDTO(String lottezyId, String lottezyName) {
		super();
		this.lottezyId = lottezyId;
		this.lottezyName = lottezyName;
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

}
