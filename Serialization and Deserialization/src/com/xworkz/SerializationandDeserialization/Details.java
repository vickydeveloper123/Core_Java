package com.xworkz.SerializationandDeserialization;

import java.io.FileOutputStream;


import java.io.ObjectOutputStream;
import java.io.Serializable;

class Details implements Serializable{
	
	String name;
	String job;
	int age;
	double salary;
	double height;
	
	public Details() {
		// TODO Auto-generated constructor stub
	}

	public Details(String name, String job, int age, double salary, double height) {
		super();
		this.name = name;
		this.job = job;
		this.age = age;
		this.salary = salary;
		this.height = height;
	}
	
	
}

 
class serialise
{
	public static void main(String[] args)
	{
		Details details=new Details("SRI VIGNESH","SOFTWARE DEVELOPER",24,1000000.0,5.10);
		try{
			FileOutputStream fos=new FileOutputStream("C:\\VICKY.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(fos);
			oos.close();
			fos.close();
			System.out.println("sucessfully serialisable");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
