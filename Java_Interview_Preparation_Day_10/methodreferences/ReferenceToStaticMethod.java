package com.java.standard.edition.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReferenceToStaticMethod 
{
	public static void main(String[] args) 
	{
		
		List<String> list = new ArrayList<String>(Arrays.asList("Hemanth","Kumar","Konakalla","Chinni"));
		list.forEach(ReferenceToStaticMethod::greet);
		
	}

	public static void  greet(String name)
	{
		System.out.println("Hello,this is :"+name);
	}
}
