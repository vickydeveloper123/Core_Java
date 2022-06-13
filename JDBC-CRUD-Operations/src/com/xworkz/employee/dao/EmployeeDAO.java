package com.xworkz.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.xworkz.employee.dto.EmployeeDTO;

public interface EmployeeDAO
{
    public boolean save(EmployeeDTO dto);
    public List<EmployeeDTO>findAll();
    public void updateByName(int id,String name);
    public void deleteByName(String name);
    
    
}
