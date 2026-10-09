package com.java.standard.edition.java8features;

@FunctionalInterface
public interface Calculator 
{
	//abstract method
	void add();
	
	//default method
	default void sub()
	{
		commonCode();
		int a=10;
		int b=5;
		int c=a-b;
		System.out.println(c);
	}
	
	
	//static method
	static void mul()
	{
		commonCode();
		int a=10;
		int b=2;
		int c=a*b;
		System.out.println(c);
	}
	
	
	//private static method
	private static void commonCode()
	{
		System.out.println("Calculator operations");
	}

}
