package com.crm.JavaUtility;

import java.time.LocalDate;

public class Localdate {
	
	public static String startDate()
	{
		LocalDate date=LocalDate.now();
		return date.toString();
	}
	
	public static String endDate()
	{
		LocalDate date=LocalDate.now();
		return date.plusDays(20).toString();
	}

}
