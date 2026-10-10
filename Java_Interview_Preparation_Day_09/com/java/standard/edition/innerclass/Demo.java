package com.java.standard.edition.innerclass;

import com.java.standard.edition.innerclass.Outer.InnerNine;

public class Demo 
{
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		InnerNine i9 = o.new InnerNine();
		System.out.println(i9.add(50, 40));
		
	}

}
