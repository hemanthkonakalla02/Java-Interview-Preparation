package com.java.standard.edition.checkedexception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded sucessfully");
			
			Connection con=null;
			try
			{
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlcomplete", "root", "root");
				 System.out.println("Connection established sucessfully");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				if(con!=null)
				{
					try {
						con.close();
						System.out.println("Connection closed sucessfully");
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		catch(ClassNotFoundException fe)
		{
			fe.printStackTrace();
		}
		
		System.out.println("this is the last line of the program");
		
		
	}

}
