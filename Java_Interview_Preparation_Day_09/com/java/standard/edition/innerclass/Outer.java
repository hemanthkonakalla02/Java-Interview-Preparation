package com.java.standard.edition.innerclass;

public class Outer 
{
	private int x=1000;
	
	static int x1=5000;
	public Outer()
	{
		System.out.println("This is outer class constructor");
	}
	
	public void display1()
	{
		System.out.println("This is display1 method of outer class");
	}
	
	public class InnerOne
	{
		int x=2000;
		
		public InnerOne()
		{
			System.out.println("This is innerone class constructor");
		}
		
		public void display2()
		{
			System.out.println("The value stored in private variable x of outer class is :"+Outer.this.x);
			display1();
			System.out.println("This is display2 method of inner class one");
		}
	}
	
	private class InnerTwo
	{
		int x=2000;
		
		public InnerTwo()
		{
			System.out.println("This is innertwo class constructor");
		}
		
		public void display2()
		{
			System.out.println("The value stored in private variable x of outer class is :"+Outer.this.x);
			display1();
			System.out.println("This is display2 method of inner class two");
		}
	}
	
	protected class InnerThree
	{
		int x=2000;
		
		public InnerThree()
		{
			System.out.println("This is innerthree class constructor");
		}
		
		public void display2()
		{
			System.out.println("The value stored in private variable x of outer class is :"+Outer.this.x);
			display1();
			System.out.println("The value stored in inner class variable x is :"+this.x);
			System.out.println("This is display2 method of inner class three");
		}
	}
	
	static class InnerFour
	{
		int x=5000;
		
		public InnerFour()
		{
			System.out.println("This is inner four class constructor");
		}
		
		public void display2()
		{
			System.out.println("This is display2 method of static inner class four");
			System.out.println("The value stored in variable x is :"+this.x);
			System.out.println("The value stored in outer class static variable x is :"+Outer.x1);
		}
		
		public static void main(String[] args) 
		{
			InnerFour i4 = new InnerFour();
			i4.display2();
			
			
		}
	}
	
	abstract class InnerFive
	{
		abstract void add();
	}
	
	final class InnerSix extends InnerFive
	{

		@Override
		void add() 
		{
			int a=10;
			int b=5;
			int c=a+b;
			System.out.println("Addition of "+a+" and "+b+" is :"+c);
			
		}
		
	}
	

	class InnerSeven
	{
		int x=1500;
		
		public InnerSeven()
		{
			System.out.println("This is innerseven class constructor");
		}
		
		public void display2()
		{
			int x=100;
			System.out.println("The value stored in local variable x is:"+x);
			System.out.println("The value stored in instance variable x of inner class is :"+this.x);
			System.out.println("The value stored in instance variable x of outer class is :"+Outer.this.x);
		}
	}
	
	
	class InnerEight extends Employee
	{
		public InnerEight()
		{
			System.out.println("This is inner8 class constructor");
		}
		
		public void display()
		{
			System.out.println("This is display method of InnerEight class");
			super.display();
		}
	}
	
	
	class InnerNine implements Calculator
	{

		@Override
		public int add(int a, int b) {
			int c=a+b;
			return c;
		}
		
	}
	public static void main(String[] args) 
	{
		Outer o = new Outer();
		
//		InnerOne i1 = o.new InnerOne();
//		i1.display2();
		
//		InnerTwo i2 = o.new InnerTwo();
//		i2.display2();
		
//		InnerThree i3 = o.new InnerThree();
//		i3.display2();
		
//		InnerFour i4 = new InnerFour();
//		i4.display2();
		
//		InnerSix i6 = o.new InnerSix();
//		i6.add();
		
		
//		InnerSeven i7 = o.new InnerSeven();
//		i7.display2();
		
//		InnerEight i8 = o.new InnerEight();
//		i8.display();
		
		
		InnerNine i9 = o.new InnerNine();
		 System.out.println(i9.add(50, 45));
		
		
		
		
	}

}
