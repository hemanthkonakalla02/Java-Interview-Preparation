package com.java.standard.edition.multithreading;

public class Employee extends Thread
{
	
	public Employee(String tName)
	{
		super(tName);
	}
	
	@Override
	public void run() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Employee Thread:"+Thread.currentThread().getName()+" >>> "+Thread.currentThread().threadId());

		}
		
	}
	
	
}

class Manager extends Thread
{
	
	public Manager(String tName)
	{
		super(tName);
	}
	
	@Override
	public void run() 
	{
		for(int i=0;i<15;i++)
		{
			System.out.println("Manager Thread:"+Thread.currentThread().getName()+" >>> "+Thread.currentThread().threadId());

		}


	}
	
	
}
