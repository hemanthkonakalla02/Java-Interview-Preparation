package com.java.standard.edition.serializationdeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		Employee emp = new Employee(15,"HemanthKumarKonakalla", 95000, "SoftwareDevelopment");
		
		FileOutputStream fos = new FileOutputStream("./data.ser");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(emp);
		System.out.println("Data serialized sucessfully");
		os.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("./data.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp1=(Employee)ois.readObject();
		System.out.println("Data de-serialized sucessfully");
		System.out.println("Id :"+emp1.getEid());
		System.out.println("Name:"+emp1.getName());
		System.out.println("Salary:"+emp1.getSalary());
		System.out.println("Dept:"+emp1.getDept());
		ois.close();
		fis.close();
	}

}
