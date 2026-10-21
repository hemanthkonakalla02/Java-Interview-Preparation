package com.java.standard.edition.multithreading;


//Creating Thread using LambdaExpressions
public class MultiThreadingDemo6 
{
	public static void main(String[] args) 
	{
		Runnable r1 = ()->
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("Hello");
				System.out.println(Thread.currentThread().getName()+" >>> "+Thread.currentThread().threadId());

			}
		};
		
		
		Runnable r2 = ()->
		{
			for(int i=0;i<=15;i++)
			{
				System.out.println("Hii");
				System.out.println(Thread.currentThread().getName()+" >>> "+Thread.currentThread().threadId());
			}
		};
		
		
		Thread t1 = new Thread(r1,"T1");
		Thread t2 = new Thread(r2,"T2");
		
		t1.start();
		
		t2.start();
		
		System.out.println("Active Thread Count is :"+Thread.activeCount());
		
	}

}
