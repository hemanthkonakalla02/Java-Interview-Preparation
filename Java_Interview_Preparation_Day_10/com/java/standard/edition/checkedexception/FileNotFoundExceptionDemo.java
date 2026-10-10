package com.java.standard.edition.checkedexception;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFoundExceptionDemo 
{
	public static void main(String[] args) 
	{
		try(FileReader fr = new FileReader("./test.txt");
			Scanner sc = new Scanner(fr);)
		{
			while(sc.hasNext())
			{
				String data=sc.nextLine();
				System.out.println(data);
			}
		}
		catch(IOException fe)
		{
			fe.printStackTrace();
		}
		
		System.out.println("This is last line of the program");
		
		
	}

}
