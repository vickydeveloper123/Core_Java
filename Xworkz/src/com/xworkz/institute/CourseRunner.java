package com.xworkz.institute;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.institute.dto.CourseDTO;
import com.xworkz.service.CourseService;
import com.xworkz.service.CourseServiceImplementation;

public class CourseRunner {

	public static void main(String[] args) {

		CourseDTO course1 = new CourseDTO(101, "May_Batch", LocalTime.of(22, 33), 6, LocalDate.of(2022, 06, 02), true);
		/*
		 * CourseDTO course2 = new CourseDTO(101, "June_Batch", LocalTime.now(), 7,
		 * LocalDate.now(), false); CourseDTO course3 = new CourseDTO(101,
		 * "August_Batch", LocalTime.now(), 8, LocalDate.now(), true); CourseDTO course4
		 * = new CourseDTO(101, "December_Batch", LocalTime.now(), 9, LocalDate.now(),
		 * false); CourseDTO course5 = new CourseDTO(101, "May_Batch", LocalTime.now(),
		 * 3, LocalDate.now(), false);
		 * 
		 * CourseService service = new CourseServiceImplementation();
		 * System.out.println(service.save(course1));
		 * System.out.println(service.save(course2));
		 * System.out.println(service.save(course3));
		 * System.out.println(service.save(course4));
		 * System.out.println(service.save(course5));
		 * 
		 * LocalDate presentDate = LocalDate.now(); System.out.println(presentDate);
		 * 
		 * LocalDate afterSevenDate = LocalDate.now().plusDays(7);
		 * System.out.println(afterSevenDate);
		 * 
		 * boolean yes = presentDate.isAfter(afterSevenDate); System.out.println(yes);
		 * 
		 * Date date = Date.valueOf(presentDate);
		 * 
		 * System.out.println(date);
		 */

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"resources/Spring.xml")) {

			CourseService batchService = applicationContext.getBean(CourseServiceImplementation.class);
			boolean savingBatchDetails = batchService.save(course1);
			System.out.println(savingBatchDetails);

		}

	}

}
