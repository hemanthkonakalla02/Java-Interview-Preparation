package com.java.standard.edition.multithreading;

public class Student implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello");
			System.out.println(Thread.currentThread().getName()+" >>> "+Thread.currentThread().threadId());
		}
		
	}

}


class ManagerOne implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=0;i<15;i++)
		{
			System.out.println("Hii");
			System.out.println(Thread.currentThread().getName()+" >>> "+Thread.currentThread().threadId());
		}
		
	}
	
}
