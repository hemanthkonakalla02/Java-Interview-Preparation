package com.java.standard.edition.interfaces;

public class Jio extends JioTvApp implements Trai ,Government
{

	@Override
	public void call() 
	{
		
		System.out.println("Jio provides unlimited calls for 189 rupees package");
	}

	@Override
	public void data() 
	{
		System.out.println("Jio provides only 3Gb of data for 28 days");
	}

	@Override
	public void message() 
	{
		System.out.println("Jio provides 100 sms per day");
		
	}
	
	public void jioTunes()
	{
		System.out.println("Jio provides free saavn music subscription for users");
	}

	@Override
	public void SpectrumAuction() 
	{
		System.out.println("Government is inviting the sim operators in india for 5g spectrum auction");
		
	}

}
