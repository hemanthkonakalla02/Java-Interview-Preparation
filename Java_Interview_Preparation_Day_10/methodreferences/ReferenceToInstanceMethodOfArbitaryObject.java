package com.java.standard.edition.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReferenceToInstanceMethodOfArbitaryObject 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>(Arrays.asList("Hemanth","Kumar","Konakalla","Chinni"));
		//list.stream().map(String::toUpperCase).forEach(System.out::println);
		Collections.sort(list,String::compareTo);
		list.forEach(System.out::println);
	}

}
