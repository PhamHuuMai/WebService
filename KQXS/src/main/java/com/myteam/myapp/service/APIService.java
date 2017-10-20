package com.myteam.myapp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.myteam.myapp.constant.Constant;
import com.myteam.myapp.dto.LottezyDTO;
import com.myteam.myapp.dto.ResultDTO;
import com.myteam.myapp.util.APIUtils;
import com.myteam.myapp.util.JSONUtils;

@Service
public class APIService {
	
	public ResultDTO getResultTable(String lottezyId, String date)
			throws Exception {
		ResultDTO resultDTO = new ResultDTO();
		Map<String, Object> params = new HashMap<String, Object>();
		if (date != null ) {
			params.put("date", date);
		}else {
			params.put("date", "");
		}
		JSONObject result = APIUtils.callAPI(Constant.HOST, "lottezy/"
				+ lottezyId, HttpMethod.GET, params);
		// convert JsonObject to ResultDTO
		if (result.getInt("code") == 0) {
			JSONObject data = result.getJSONObject("data");
			resultDTO.setLottezyId(data.getString("lottezyId"));
			resultDTO.setLottezyName(data.getString("lottezyName"));
			resultDTO.setDate(data.getString("date"));
			
			resultDTO.setSpecialPrize(JSONUtils.getFromList(data.getJSONArray("specialPrize")));
			resultDTO.setFirstPrize(JSONUtils.getFromList(data.getJSONArray("firstPrize")));
			resultDTO.setFiftyPrize(JSONUtils.getFromList(data.getJSONArray("fiftyPrize")));
			resultDTO.setFourtyPrize(JSONUtils.getFromList(data.getJSONArray("fourtyPrize")));
			resultDTO.setThirdPrize(JSONUtils.getFromList(data.getJSONArray("thirdPrize")));
			resultDTO.setSecondPrize(JSONUtils.getFromList(data.getJSONArray("secondPrize")));
		} else {
			throw new Exception();
		}
		return resultDTO;
	}

	public List<LottezyDTO> getListLottezy() throws Exception {
		Map<String, Object> params = new HashMap<String, Object>();
		List<LottezyDTO> lottezies = new ArrayList<LottezyDTO>();
		JSONObject result = APIUtils.callAPI(Constant.HOST, "lottezy",
				HttpMethod.GET, params);
		// convert JsonObject to ResultDTO
		if (result.getInt("code") == 0) {
			JSONArray data = result.getJSONArray("data");
			for (Object obj : data) {
				JSONObject jsonObj = (JSONObject) obj;
				lottezies.add(new LottezyDTO(jsonObj.getString("id"), jsonObj
						.getString("name")));
			}
		} else {
			throw new Exception();
		}
		return lottezies;
	}

}
