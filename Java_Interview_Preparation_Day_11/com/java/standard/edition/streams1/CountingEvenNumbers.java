package com.java.standard.edition.streams1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CountingEvenNumbers 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(54,33,17,24,39,43,12));
		 
		long count = list.stream().filter(t-> t%2==0).count();
		System.out.println("Even Numbers Count is:"+count);
		
	}

}
