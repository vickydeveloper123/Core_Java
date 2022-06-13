package com.xworkz.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.validation.BeanPropertyBindingResult;

import com.xworkz.employee.dto.EmployeeDTO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private DataSource dataSource;

	private JdbcTemplate jdbcTemplate;

	public EmployeeDAOImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@Override
	public boolean save(EmployeeDTO dto) {

		String query = "insert into Employee_details values (?,?,?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(query, new Object[] { dto.getId(), dto.getName(),dto.getPhone(), dto.getEmail() });
		return true;

	}

	@Override
	public List<EmployeeDTO> findAll() {

		String query = "Select * from employee_details";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<EmployeeDTO> employess = jdbcTemplate.query(query, new BeanPropertyRowMapper(EmployeeDTO.class));

		return employess;
	}

	@Override
	public void updateByName(int id, String name) {

		String query = "update Employee_details set id=? where name=? ";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(query, id, name);
		System.out.println(id);

	}

	@Override
	public void deleteByName(String name) {

		String query = "delete from Employee_details where name=? ";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(query, name);
		System.out.println(name);

	}

}