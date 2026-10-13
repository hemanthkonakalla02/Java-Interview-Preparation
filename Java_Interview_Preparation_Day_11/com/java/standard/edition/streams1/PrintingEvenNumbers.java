package com.java.standard.edition.streams1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintingEvenNumbers 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(54,33,17,24,39,43,12));
		list.stream().filter(i->i%2==0).forEach(System.out::println);
		
	}

}
