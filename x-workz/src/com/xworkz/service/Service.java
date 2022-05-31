package com.xworkz.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.dao.XworkzBatchDao;
import com.xworkz.dto.XworkzBatchDetails;

/*id>0, courseName not null, not empty,min 3 , max 20 chars,startDate is not null and 
 * should be future date, fees > 5000
*/
public class Service {

	private XworkzBatchDao dao;

	public Service(XworkzBatchDao dao) {
		super();
		this.dao = dao;
	}

	public boolean validateandsave(XworkzBatchDetails dto) {

		if (dto != null) {

			if (dto.getId() != 0 && dto.getCourseName() != null
					&& (dto.getCourseName().length() > 3 && dto.getCourseName().length() < 20)
					&& dto.getStartDate() != null && dto.getFess() > 5000) {

				Boolean save=dao.save(dto);
				System.out.println(save);
			}

		}
		return false;
	}
}