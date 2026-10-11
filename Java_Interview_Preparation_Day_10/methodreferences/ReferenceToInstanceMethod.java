package com.java.standard.edition.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReferenceToInstanceMethod 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>(Arrays.asList("Hemanth","Kumar","Konakalla","Chinni"));
		
		ReferenceToInstanceMethod rim = new ReferenceToInstanceMethod();
		list.forEach(rim::greet);
	}
	
	public void greet(String name)
	{
		System.out.println("Hello,this is :"+name);
	}

}
