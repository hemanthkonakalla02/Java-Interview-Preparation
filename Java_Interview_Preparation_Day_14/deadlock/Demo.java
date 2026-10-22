package com.java.standard.edition.deadlock;

public class Demo 
{
	public static void main(String[] args) 
	{
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		
		t1.t2=t2;
		t2.t1=t1;
		
		t1.start();
		t2.start();
		
		System.out.println("Main thread");
		
	}

}
