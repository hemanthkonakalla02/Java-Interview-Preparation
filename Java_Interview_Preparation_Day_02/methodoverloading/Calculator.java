package com.java.standard.edition.methodoverloading;

public class Calculator 
{
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public void add(float a,float b)
	{
		float c =a+b;
		System.out.println(c);
	}
	
	public float add(int a,int b,float c)
	{
		float d=a+b+c;
		return d;
	}
	
	public void add(float a,int b,int c)
	{
		float d=a+b+c;
		System.out.println(d);
	}

}
