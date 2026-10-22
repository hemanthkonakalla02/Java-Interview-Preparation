package com.java.standard.edition.multithreading;

public class RaceConditionDemo
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		BrickDairy bd = new BrickDairy();
		
		Runnable r1 = ()->
		{
			for(int i=0;i<250000;i+=50)
			{
				bd.bricksIncrementCounter();
			}
		};
		
		
		Runnable r2 = ()->
		{
			for(int i=0;i<250000;i+=50)
			{
				bd.bricksIncrementCounter();
			}
		};
		
		
		Runnable r3 = ()->
		{
			for(int i=0;i<500000;i+=50)
			{
				bd.bricksIncrementCounter();
			}
		};
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Bricks Count :"+bd.bricksCount);
		
		
		
	}
	

}


class BrickDairy
{
	int bricksCount=0;
	
	public synchronized void bricksIncrementCounter()
	{
		bricksCount+=50;
	}
}