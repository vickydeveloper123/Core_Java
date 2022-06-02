package com.xworkz.service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.institute.dao.CourseDAO;
import com.xworkz.institute.dao.CourseDAOImplentation;
import com.xworkz.institute.dto.CourseDTO;

public class CourseServiceImplementation implements CourseService {

	private CourseDAO dao;// its just a property like classes we are having.

	public CourseServiceImplementation(CourseDAO dao) {
		this.dao = dao;

	}

	public CourseServiceImplementation() {

		System.out.println("Default Course Service Implementation");
	}

	@Override
	public boolean validate(CourseDTO dto) {

		if (dto != null) {
			LocalDate startDate = dto.getStartDate();
			System.out.println("Vlidating the batch details ==>");
			if (dto.getName() != null && dto.getName().isEmpty() && dto.getName().length() > 4
					&& dto.getName().length() < 30 && dto.getDuration().isAfter(LocalTime.now())
					&& dto.getFees() < 50000 && dto.getFees() > 0 && startDate.isAfter(LocalDate.of(2022, 06, 01))) {
				System.out.println("Details are sucessfull");
				return true;
			} else {
				System.out.println("Details are invalid");
			}

		}
		return false;
	}

	@Override
	public boolean save(CourseDTO dto) {

		if (validate(dto)) {
			System.out.println("Saving batch details sucessfully");
			return dao.save(dto);
		}

		return false;
	}

}
