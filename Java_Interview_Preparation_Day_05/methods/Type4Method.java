package com.java.standard.edition.methods;

public class Type4Method 
{
	//Type4Method with parameters and return type
	int add(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) 
	{
		Type4Method tm = new Type4Method();
		int res = tm.add(45,45);
		
		System.out.println(res);
	}

}
