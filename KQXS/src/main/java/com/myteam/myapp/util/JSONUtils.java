package com.myteam.myapp.util;

import org.json.JSONArray;

public class JSONUtils {
	public static String getFromList(JSONArray listNumber) {
		String result = "";
		int i = 0;
		for (Object object : listNumber) {
			if (i % 2 == 1)
				result = result + object.toString() + "</br>";
			else
				result = result + object.toString() + "     ";
			i++;
		}
		return result;
	}

	public static String getFromListLotto(JSONArray listNumber) {
		String result = "";
		for (Object object : listNumber) {
			result = result + object.toString() + " , ";
		}
		return result;
	}
}
