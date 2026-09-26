package com.java.standard.edition.methods;

public class Type1Method 
{
	//Type-1 method ,which has no parameters and return type
	void add()
	{
		int a=10;
		int b=5;
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is :"+c);
	}
	
	
	public static void main(String[] args) 
	{
		Type1Method tm = new Type1Method();
		tm.add();
		
	}

}
