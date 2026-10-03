package com.java.standard.edition.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeDemo 
{
	public static void main(String[] args) 
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss:SSSS");
		String res=sdf.format(d);
		System.out.println(res);
	}

}
