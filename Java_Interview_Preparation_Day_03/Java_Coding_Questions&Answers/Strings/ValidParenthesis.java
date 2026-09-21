package com.java.coding.string;

import java.util.Stack;

public class ValidParenthesis 
{
	public static void main(String[] args)  
	{
		String s="[(){}()]";
		boolean res=validParenthesisOrNot(s);
		if(res)
		{
			System.out.println("Valid parenthesis");
		}
		else
		{
			System.out.println("Not Valid parenthesis");
		}
	}
	
	public static boolean validParenthesisOrNot(String s)
	{
		Stack<Character> stack = new Stack<Character>();
		for(char c:s.toCharArray())
		{
			if(c=='[')
			{
				stack.push(']');
			}
			else if(c=='{')
			{
				stack.push('}');
			}
			else if(c=='(')
			{
				stack.push(')');
			}
			else if(stack.isEmpty() || stack.pop()!=c)
			{
				return false;
			}
			
			
		}
		
		return stack.isEmpty();
	}

}
