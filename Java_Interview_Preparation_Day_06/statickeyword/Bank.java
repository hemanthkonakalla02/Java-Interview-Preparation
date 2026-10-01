package com.java.standard.edition.statickeyword;

import java.util.Scanner;

public class Bank 
{
	int principleAmount;
	static float ri;   //static variable
	int time;
	float si;
	
	//static block
	static
	{
		ri=2.0f;
	}
	
	
	public void takeInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principleAmount:");
		principleAmount=sc.nextInt();
		System.out.println("Enter the no of months taken to clear the loan:");
		time=sc.nextInt();
		
	}
	
	public void calculateIntrest()
	{
		si=(principleAmount*time*ri)/100;
		System.out.println("Simple Intrest for the amount "+principleAmount+" is "+si+" ruppes");
		System.out.println("Time taken to clean the loan is :"+time+" month's");
	}

}
