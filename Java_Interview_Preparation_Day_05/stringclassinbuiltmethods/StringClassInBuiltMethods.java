package com.java.standard.edition.stringclassinbuiltmethods;

public class StringClassInBuiltMethods 
{
	public static void main(String[] args) 
	{
		//System.out.println(getLength("HemanthKumarKonakalla"));//21
		//System.out.println(getCharacter("HemanthKumarKonakalla", 1));//e
		//System.out.println(isStringEmpty(""));//true
		//System.out.println(isStringBlank(" "));//true
		//System.out.println(stringContains("Hemanth","man"));//true
		//System.out.println(stringStartsWith("Hemanth", "H"));//true
		//System.out.println(stringEndsWith("hemanth", "e"));//false
		//System.out.println(IndexOf("Hemanth", "h"));//6
		//System.out.println(lastIndexOf("hemanth", "h"));//6
		//System.out.println(subString("HemanthKumar", 1, 6));//emant
		//System.out.println(isEquals("Hemanth", "hemanth"));//false
		//System.out.println(isEqualsCase("Hemanth", "hemanth"));//true
		//System.out.println(replacing("HemanthKumar", 'a', 'x'));//HemxnthKumxr
		//System.out.println(replacingFirst("HemanthKumar", "a", "XX"));//HemXXnthKumar
		//System.out.println(upperCase("HemanthKumarKonakalla"));//HEMANTHKUMARKONAKALLA
		//System.out.println(lowerCase("HEMANTHKUMARKONAKALLA"));//hemanthkumarkonakalla
	}
	
	public static int getLength(String s)
	{
		int res=s.length();
		return res;
	}
	
	public static char getCharacter(String s,int index)
	{
		return s.charAt(index);
	}
	
	
	public static boolean isStringEmpty(String s)
	{
		return s.isEmpty();
	}
	
	
	public static boolean isStringBlank(String s)
	{
		return s.isBlank();
	}
	
	
	public static boolean stringContains(String s1,String s2)
	{
		return s1.contains(s2);
	}
	
	public static boolean stringStartsWith(String s1,String s2)
	{
		return s1.startsWith(s2);
	}
	
	public static boolean stringEndsWith(String s1,String s2)
	{
		return s1.endsWith(s2);
	}
	
	public static int IndexOf(String s1,String s2)
	{
		return s1.indexOf(s2);
	}
	
	public static int lastIndexOf(String s1,String s2)
	{
		return s1.lastIndexOf(s2);
	}
	
	public static String subString(String s1,int index1,int index2)
	{
		return s1.substring(index1,index2);
	}
	
	public static boolean isEquals(String s1,String s2)
	{
		return s1.equals(s2);
	}
	
	public static boolean isEqualsCase(String s1,String s2)
	{
		return s1.equalsIgnoreCase(s2);
	}
	
	public static String replacing(String s1,char index1,char index2)
	{
		return s1.replace(index1, index2);
	}
	
	
	public static String replacingFirst(String s1,String index1,String index2)
	{
		return s1.replaceFirst(index1, index2);
	}
	
	public static String upperCase(String s1)
	{
		return s1.toUpperCase();
	}
	
	public static String lowerCase(String s1)
	{
		return s1.toLowerCase();
	}
}


