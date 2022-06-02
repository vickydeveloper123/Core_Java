package com.xworkz.institute.dao;

import java.net.PasswordAuthentication;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import com.xworkz.institute.dto.CourseDTO;

public class CourseDAOImplentation implements CourseDAO {

	String query = "insert into Xworkz_batch(id,name,duration,fees,startDate,fees) values(?,?,?,?,?,?)";

	@Override
	public boolean save(CourseDTO dto) {
		
		String url = "jdbc:mysql://localhost:3306/xworkzjan15";

		String username = "root";
		String password = "Vignesh@8368";
		
		try (Connection connection = DriverManager.getConnection(url, username, password);
				                                              //url.value,password.value,username.value
				PreparedStatement prepares = connection.prepareStatement(query))

		{

			prepares.setInt(1, dto.getId());
			prepares.setString(2, dto.getName());
			prepares.setString(3, dto.getDuration().toString());
			prepares.setFloat(4, dto.getFees());
			prepares.setString(5, dto.getStartDate().toString());
			prepares.setBoolean(6, dto.isFree());
			
			int effectesRows=prepares.executeUpdate();
			System.out.println(effectesRows);
			
			return effectesRows== 1 ? true :false;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;

	}

}
