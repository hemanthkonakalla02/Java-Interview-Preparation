package com.java.coding.string;

public class StringCompression 
{
	public static void main(String[] args)  
	{
		String s ="abbcccdddd";
		StringBuilder sb =new StringBuilder();
		int count=1;
		
		char[] charArray = s.toCharArray();
		
		for(int i=0;i<charArray.length-1;i++)//9<=10
		{
			if(charArray[i]==charArray[i+1])
			{
				count++;
			}
			else
			{
				sb.append(s.charAt(i)).append(count);
				count=1;
			}
		}
		
		sb.append(s.charAt(s.length()-1)).append(count);
		
		
		System.out.println(sb);
		
	}

}
