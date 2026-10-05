package com.java.standard.edition.interfaces;

public class Demo 
{
	public static void main(String[] args) 
	{
		Jio j = new Jio();
		Airtel a = new Airtel();
		SimOperator s = new SimOperator();
		
		s.call(j,j);
		j.jioTunes();
		j.jioTvApp();
		
		System.out.println("=============================================================================");
		
		s.call(a,a);
		a.freeTvApp();
		
	}

}
