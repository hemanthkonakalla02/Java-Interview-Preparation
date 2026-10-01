package com.java.standard.edition.mutablestrings;

public class MutableStrings
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("Hemanth");
		StringBuilder sb2 = new StringBuilder("Kumar");
//		System.out.println(sb1);
		System.out.println(sb2);
//		System.out.println(sb1.append("KumarKonakalla")); //HemanthKumarKonakalla
//		System.out.println(sb1.insert(1, "Chinni")); //HChinniemanth
//		System.out.println(sb1.replace(0, 4, "Chinni"));//Chinninth
//		System.out.println(sb1.reverse());//htnameH
//		System.out.println(sb1.delete(0, 4));//nth
		System.out.println(sb1.capacity());//23
	}

}
