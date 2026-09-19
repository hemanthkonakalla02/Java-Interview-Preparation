package com.java.standard.edition.primitivedatatypes;

public class PrimitiveDatatypes 
{
		boolean a;
		char b;
		byte c;
		short d;
		int e;
		long f; 
		float g;
		double h;
		
	public static void main(String[] args) 
	{
				//default values
				PrimitiveDatatypes pd = new PrimitiveDatatypes();
				System.out.println(pd.a);
				System.out.println(pd.b);
				System.out.println(pd.c);
				System.out.println(pd.d);
				System.out.println(pd.e);
				System.out.println(pd.f);
				System.out.println(pd.g);
				System.out.println(pd.h);
				System.out.println("==========================================================================");

		boolean a =true;
		char b = 'h';
		byte c = 100;
		short d =30000;
		int e =76538910;
		long f=9515537631l;
		float g =76.2F;
		double h =78.90876;
		
		//actual values
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		
		
		
		System.out.println("==========================================================================");
		
		System.out.println("The memory occupied by char datatype is :"+Character.BYTES+" byte's");
		System.out.println("The memory occupied by byte datatype is :"+Byte.BYTES+" byte's");
		System.out.println("The memory occupied by short datatype is :"+Short.BYTES+" byte's");
		System.out.println("The memory occupied by int datatype is :"+Integer.BYTES+" byte's");
		System.out.println("The memory occupied by long datatype is :"+Long.BYTES+" byte's");
		System.out.println("The memory occupied by float datatype is :"+Float.BYTES+" byte's");
		System.out.println("The memory occupied by double datatype is :"+Double.BYTES+" byte's");
		
		System.out.println("==========================================================================");

		System.out.println("The char datatype can store the values from range "+Character.MIN_VALUE+" to "+Character.MAX_VALUE);
		System.out.println("The byte datatype can store the values from range "+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE);
		System.out.println("The short datatype can store the values from range "+Short.MIN_VALUE+" to "+Short.MAX_VALUE);
		System.out.println("The int datatype can store the values from range "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
		System.out.println("The long datatype can store the values from range "+Long.MIN_VALUE+" to "+Long.MAX_VALUE);
		System.out.println("The float datatype can store the values from range "+Float.MIN_VALUE+" to "+Float.MAX_VALUE);
		System.out.println("The double datatype can store the values from range "+Double.MIN_VALUE+" to "+Double.MAX_VALUE);

		
	}

}
