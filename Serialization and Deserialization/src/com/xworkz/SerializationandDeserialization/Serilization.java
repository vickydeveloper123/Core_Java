package com.xworkz.SerializationandDeserialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.xworkz.SerializationandDeserialization.Company;

public class Serilization {
	public static void main(String[] args)
	{
		
		Company company=new Company("XWORKZ","VICKY","BANGLORE");

		try {
			
			FileOutputStream fos=new FileOutputStream("c:\\FILES\\char.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(oos);
			oos.close();
			fos.close();
			System.out.println("Serialized data is saved in char.txt file");
			
			
		}
		catch(IOException e)
		{
			
			e.printStackTrace();
		}
		
		
		
	}
	

}
