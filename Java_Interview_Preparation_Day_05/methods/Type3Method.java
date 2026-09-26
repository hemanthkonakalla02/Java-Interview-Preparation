package com.java.standard.edition.methods;

public class Type3Method 
{
	//Type3Method with return type and no parameters
	int add()
	{
		int a=10;
		int b=5;
		
		return a+b;
		
	}
	
	public static void main(String[] args) 
	{
		Type3Method tm = new Type3Method();
		int res = tm.add();
		System.out.println(res);
	}

}
