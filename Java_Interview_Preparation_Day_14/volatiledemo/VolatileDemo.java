package com.java.standard.edition.volatiledemo;

class VolatileTest implements Runnable 
{
	public static volatile boolean isStopRequested;
	
	int i=0;
	@Override
	public void run() 
	{
		while(!isStopRequested)
		{
			i++;
		}
		
		System.out.println("BackGround Thread is completed");
		
	}

}

public class VolatileDemo
{
	public static void main(String[] args) 
	{
		VolatileTest vt = new VolatileTest();
		Thread t1 = new Thread(vt);
		t1.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		VolatileTest.isStopRequested=true;
		
		System.out.println("Main thread is completed");
		
	}
}
