package com.team.service.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StringUtil {

	public static long convertToLong(String dateTime) {
		String[] dateArr = dateTime.split("-");
		int year = Integer.parseInt(dateArr[0]);
		int month = Integer.parseInt(dateArr[1]);
		int date = Integer.parseInt(dateArr[2]);
		Date d = new Date(year, month, date);
		d.setHours(0);
		d.setMinutes(0);
		d.setSeconds(0);
		return d.getTime();
	}
	public static String get2LastDigit(String str) {
		return str.substring(str.length()-2);
	}
    public static List<String> computePrize2LastDigit(List<String> prizes){
    	List<String> result = new ArrayList<String>();
    	for (String prize : prizes) {
			result.add(get2LastDigit(prize));
		}
    	return result;
    }
}
