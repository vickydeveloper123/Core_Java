package com.xworkz.service;

import com.xworkz.institute.dto.CourseDTO;

public interface CourseService {
	
	public boolean validate(CourseDTO dto);
	
	public boolean save(CourseDTO dto);

}
