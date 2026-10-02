package com.java.standard.edition.aggregationcomposition;

public class Mobile 
{
	Os os = new Os(64, "Android"); // composite object
	
	public void mobileCharger(Charger ref)
	{
		System.out.println(ref.getColor());//black
		System.out.println(ref.getCost());//1500
	}
	
	public static void main(String[] args) 
	{
		Mobile m = new Mobile();  //enclosing object
		
		System.out.println(m.os.getType());//64
		System.out.println(m.os.getName());//Android
		
		Charger charger = new Charger("black",1500); // aggregate object
		m.mobileCharger(charger);
		
		try
		{
			m=null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(charger.getColor());
		System.out.println(charger.getCost());
		
		
	}

}
