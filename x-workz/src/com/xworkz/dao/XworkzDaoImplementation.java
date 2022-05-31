package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.dto.XworkzBatchDetails;

public class XworkzDaoImplementation implements XworkzBatchDao {

	String query = "insert into Batch_Details values(?,?,?,?)";

	@Override
	public boolean save(XworkzBatchDetails dto) {

		String url = "jdbc:mysql://localhost:3306/xworkzjan15";

		String username = "root";
		String password = "Vignesh@8368";

		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement prepares = connection.prepareStatement(query))

		{

			prepares.setInt(1, dto.getId());
			prepares.setString(2, dto.getCourseName());
			prepares.setString(3, dto.getStartDate());
			prepares.setInt(4, dto.getFess());
			

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

}
