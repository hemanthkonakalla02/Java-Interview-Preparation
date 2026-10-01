package com.java.standard.edition.operators;

public class UnaryOperators 
{

	public static void main(String[] args) 
	{
		int a=10;
		System.out.println(+a);
		
		int b=-20;
		System.out.println(-b);
		
		boolean value=true;
		System.out.println(!value);
		
		//incrementation and decrementation
		int x=10;
		int y;
		y=x++ + ++x - x++ * --x + x++ - --x + x++ * x++;
		System.out.println(x);
		System.out.println(y);
		
	}
}
