package com.team.service.util;

import java.util.Date;

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
}
