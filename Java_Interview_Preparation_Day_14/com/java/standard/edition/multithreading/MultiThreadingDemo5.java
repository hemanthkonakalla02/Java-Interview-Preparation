package com.java.standard.edition.multithreading;

//creating Thread using Anonymous Inner type
public class MultiThreadingDemo5 
{
	public static void main(String[] args) 
	{
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello");
				System.out.println("Hi "+Thread.currentThread().getName()+" >>> "+Thread.currentThread().threadId());
				
			}
		};
		
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() 
			{
				System.out.println("Hello "+Thread.currentThread().getName()+" >>> "+Thread.currentThread().threadId());
			}
		};
		
		
		
		
		Thread t1 = new Thread(r1);
		
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
		System.out.println("Active Thread Count is :"+Thread.activeCount());
		
	}

}
