package com.java.standard.edition.interfaces;

public class Airtel implements Trai{

	@Override
	public void call() 
	{
		System.out.println("Airtel provides unlimited calls for 189 rupees package");
	}

	@Override
	public void data() 
	{
		System.out.println("Airtel provides only 2Gb of data for 28 days");
	}

	@Override
	public void message() 
	{
		System.out.println("Airtel provides 50 sms per day");

	}
	
	
	public void freeTvApp()
	{
		System.out.println("Airtel provides free telivision app for users");
	}

	@Override
	public void SpectrumAuction() 
	{
		System.out.println("Government is inviting the sim operators in india for 5g spectrum auction");
	}

}
