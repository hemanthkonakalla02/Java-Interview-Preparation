package com.java.standard.edition.objectclass;

public class Demo 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("HemanthKumarKonakalla", 95000, "Software");
		Employee e2 = new Employee("HemanthKumarKonakalla", 95000, "Software");
		Employee e3 = new Employee("AnandKumarKonakalla", 180000, "Analyst");
		
		//After overriding equals and hashCode output will be true
		System.out.println(e1.equals(e2)); //true
		System.out.println(e1.equals(e3)); //false
		System.out.println(e1);
		
		 //Different hashcode for e1 and e2 as thier are 2 different objects
		//After overriding equals and hashCode ,hashcode will be same for e1 and e2
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
	}

}
