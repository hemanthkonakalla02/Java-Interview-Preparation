package com.java.standard.edition.methodreferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReferenceToConstructor
{
	String name;
	
	public ReferenceToConstructor(String name)
	{
		this.name=name;
		System.out.println("Name is:"+name);
	}
	
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>(Arrays.asList("Hemanth","Kumar","Konakalla","Chinni"));
		list.forEach(ReferenceToConstructor::new);
	}
	
}
