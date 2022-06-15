package com.xworkz.employee;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.employee.dao.EmployeeDAO;
import com.xworkz.employee.dao.EmployeeDAOImpl;
import com.xworkz.employee.dto.EmployeeDTO;

public class EmployeeRunner {
	public static void main(String[] args) {

		EmployeeDTO dto1 = new EmployeeDTO(106, "VICKY", 12345, "rds@gmail.com");
		EmployeeDTO dto2 = new EmployeeDTO(107, "rajani", 22345, "raj@gmail.com");
		EmployeeDTO dto3 = new EmployeeDTO(108, "madhu", 32345, "mdh@gmail.com");
		EmployeeDTO dto4 = new EmployeeDTO(109, "suyog", 42345, "syg@gmail.com");
		EmployeeDTO dto5 = new EmployeeDTO(110, "afreeen", 852858, "afrn@gmail.com");

		String xmlFile = "resources/Spring.xml";
		try (ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(xmlFile)) {

			EmployeeDAOImpl daoImpl = appContext.getBean("employeeDAOImpl", EmployeeDAOImpl.class);

			daoImpl.save(dto1);
			daoImpl.save(dto2);
			daoImpl.save(dto3);
			daoImpl.save(dto4);
			daoImpl.save(dto5);
			
			daoImpl.updateByName(109, "VIGNESH");
			
			daoImpl.deleteByName("rajani");
			
			daoImpl.equals(dto1);
			
			daoImpl.findAll();
			
			

			

		}

	}

}
