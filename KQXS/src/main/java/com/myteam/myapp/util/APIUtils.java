package com.myteam.myapp.util;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class APIUtils {

	public static JSONObject callAPI(String host, String path,
			HttpMethod httpMethod, Map<String, Object> params) throws Exception {

		try {
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			// headers.add("Authorization", token);
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			String url = host + path;
			HttpEntity<String> entity;

			if (httpMethod == HttpMethod.GET) {
				String parameter = "?";
				if (params != null) {
					for (Entry<String, Object> ele : params.entrySet()) {
						parameter = parameter + ele.getKey() + "="
								+ ele.getValue().toString() + "&";
					}
				}
				url = url + parameter.substring(0, parameter.length() - 1);
				entity = new HttpEntity("", headers);
			} else {
				headers.setContentType(MediaType.APPLICATION_JSON);
				ObjectMapper objMapper = new ObjectMapper();
				String JSONStr = objMapper.writeValueAsString(params);
				entity = new HttpEntity(JSONStr, headers);
			}
			ResponseEntity<String> result = restTemplate.exchange(url,
					httpMethod, entity, String.class);
			JSONObject resultJS = new JSONObject(result.getBody());
			return resultJS;
		} catch (Exception e) {
			throw new Exception();
		}
	}
}