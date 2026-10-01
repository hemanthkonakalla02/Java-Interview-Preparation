package com.java.standard.edition.wrapperclass;

public class WrapperClassDemo 
{
	public static void main(String[] args)   
	{
		Boolean a =true;
		Character b ='k';
		Byte c=100;
		Short d =30000;
		Integer e =25000;
		Long f=1000000L;
		Float g=76.2f;
		Double h = 78.90876;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		System.out.println("=======================================================================");
		
		//Autoboxing
		int x=100;
		Integer y=x;
		System.out.println("The value stored in variable x is :"+x);
		System.out.println("The value stored in variable y is :"+y);
		
		System.out.println("=======================================================================");

		//Unboxing
		int p=y;
		System.out.println("The value stored in variable p is :"+p);
		
	}

}
