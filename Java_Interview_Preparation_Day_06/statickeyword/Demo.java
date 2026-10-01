package com.java.standard.edition.statickeyword;

public class Demo 
{
	//static method
	public static void main(String[] args) 
	{
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		Bank b3 = new Bank();
		
		b1.takeInput();
		b1.calculateIntrest();
		
		System.out.println("====================================================================");
		
		b2.takeInput();
		b2.calculateIntrest();
		
		System.out.println("====================================================================");
		
		b3.takeInput();
		b3.calculateIntrest();
		
	}

}
