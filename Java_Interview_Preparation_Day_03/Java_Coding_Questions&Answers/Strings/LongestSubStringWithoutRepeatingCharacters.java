package com.java.coding.string;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharacters 
{ 
	public static void main(String[] args) 
	{
		String s = "pwwkew";
		int subString = findingLongestSubString(s);
		System.out.println(subString);
	}
	
	public static int findingLongestSubString(String s)
	{
		HashSet<Character> hs = new HashSet<Character>();
		
		int left=0;
		int maxLength=0;
		
		for(int right=0;right<=s.length()-1;right++)
		{
			while(hs.contains(s.charAt(right)))
			{
				hs.remove(s.charAt(left));
				left++;
			}
			
			hs.add(s.charAt(right));
			maxLength=Math.max(maxLength, right-left+1);
		}
		
		return maxLength;
	}

}
