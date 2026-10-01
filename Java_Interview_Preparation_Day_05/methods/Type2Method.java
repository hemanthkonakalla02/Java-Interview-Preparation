package com.java.standard.edition.methods;

public class Type2Method 
{
	//Type2 method with parameters and no return type
	void add(int a,int b) //Parameters
	{
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is :"+c);
	}
	
	public static void main(String[] args) 
	{
		Type2Method tm = new Type2Method();
		tm.add(45, 45);//Arguments
		
	}

}
