package com.xworkz.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BakeryRunner {
	public static void main(String[] args)
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//loading class. and registering for name.(static block)
			System.out.println("Driver Class is  loaded Successfully");
			String username="root";
			String password="Vignesh@8368";
			String url="jdbc:mysql://localhost:3306/xworkzjan15";
			
			Connection connection=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established sucessfully ==>"+connection);
			

			String insertQuery="INSERT INTO  BAKERY_DETAILSS VALUES(201,'ARCHANA_BAKERY',2010,'NELLORE',18)";
			
			
			Statement statement=connection.createStatement();
			System.out.println("Connection is created ==>"+connection);
			
			
			int newNumberOfRows=statement.executeUpdate(insertQuery);
			System.out.println(newNumberOfRows);
			
			
			
		}
		
		
		
		catch (ClassNotFoundException e) {

			
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

}
