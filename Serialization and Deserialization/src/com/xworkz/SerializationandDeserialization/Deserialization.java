package com.xworkz.SerializationandDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	
	public static void main(String[] args) throws IOException,ClassNotFoundException{
	Company comp=null;
	try {
	FileInputStream fis=new FileInputStream("c:\\files\\char.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	comp=(Company) ois.readObject();
	ois.close();
	fis.close();
	System.out.println("Deserialisation happening sucessfully");
		
	
	}
	finally
	{
	
		System.out.println("Deserialization Employee ");
		System.out.println("company name"+comp.companyName);
		System.out.println("Employee name"+comp.empName);
		System.out.println("Location name"+comp.location);
		
	}

}
}
