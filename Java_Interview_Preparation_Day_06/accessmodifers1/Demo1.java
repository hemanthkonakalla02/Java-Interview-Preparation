package com.java.standard.edition.accessmodifers1;

public class Demo1 
{
	//Public Access Modifier
	
	
	public int x=100;
	
	public Demo1()
	{
		System.out.println("This is Demo1 class constructor");
	}
	
	public void display1()
	{
		System.out.println("This is Demo1 class instance method");
	}
	
	
	//Protected Access Modifier
	
	
//  protected int x=100;
//	
//	protected Demo1()
//	{
//		System.out.println("This is Demo1 class constructor");
//	}
//	
//	protected void display1()
//	{
//		System.out.println("This is Demo1 class instance method");
//	}
	
	
	
	//Default Access Modifier
	
	
//	int x=100;
//	
//	Demo1()
//	{
//		System.out.println("This is Demo1 class constructor");
//	}
//	
//	 void display1()
//	{
//		System.out.println("This is Demo1 class instance method");
//	}
	
	
	//Private Access Modifier
	
//	private int x=100;
//	
//	private Demo1()
//	{
//		System.out.println("This is Demo1 class constructor");
//	}
//	
//	private void display1()
//	{
//		System.out.println("This is Demo1 class instance method");
//	}
	
	public static void main(String[] args) 
	{
		Demo1 d1 = new Demo1();
		System.out.println("The value stored in variable x is :"+d1.x);
		d1.display1();
		
	}

}
