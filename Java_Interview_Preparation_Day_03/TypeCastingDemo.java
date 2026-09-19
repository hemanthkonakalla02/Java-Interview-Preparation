package com.java.standard.edition.typecasting;

public class TypeCastingDemo 
{
	public static void main(String[] args) 
	{
		//implicit typecasting
		int a=1000;
		long b=a;
		
		System.out.println("The value stored in variable a is :"+a); //1000 
		System.out.println("The value stored in variable b is :"+b); //1000
		
		System.out.println("=======================================================");
		//explicit typecasting
		short x=100;
		byte y=(byte)x;
		
		System.out.println("The value stored in variable x is:"+x);
		System.out.println("The value stored in variable y is :"+y);
		
		System.out.println("=======================================================");
		//dataloss during explicit typecasting
		float p=76.2f;
		int q=(int)p;
		System.out.println("The value stored in variable p is :"+p);//76.2
		System.out.println("The value stored in variable q is :"+q);//76
		
		System.out.println("=======================================================");
		//converting the char datatype into another datatype
		char x1='A';
		int y1=(int)x1;
		
		System.out.println("The value stored in variable x1 is :"+x1);//A
		System.out.println("The value stored in variable y1 is :"+y1);//65
		
		System.out.println("=======================================================");

		short a1=131;
		byte b1=(byte)a1;  //-128 to +127
		System.out.println("The value stored in variable a1 is :"+a1);//128
		System.out.println("The value stored in variable b1 is :"+b1);//-125
		
	}

}
