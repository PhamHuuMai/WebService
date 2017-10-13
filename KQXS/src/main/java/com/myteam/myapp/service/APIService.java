package com.myteam.myapp.service;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.myteam.myapp.constant.Constant;
import com.myteam.myapp.dto.ResultDTO;
import com.myteam.myapp.util.APIUtils;

@Service
public class APIService {
	public ResultDTO getResultTable(String lottezyId, String date)
			throws Exception {
		Map<String, Object> params = new HashMap<String, Object>();
		if (date != null && !date.isEmpty()) {
			params.put("date", date);
		}
		JSONObject result = APIUtils.callAPI(Constant.HOST, "/" + lottezyId,
				HttpMethod.GET, params);
		// convert JsonObject to ResultDTO
		if (result.getInt("code") != 0) {
			JSONObject data = result.getJSONObject("data");
             
		} else {
			throw new Exception();
		}
		return new ResultDTO();
	}
}
