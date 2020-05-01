package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeData;

@Repository
public interface EmpDAO {
	
	public int  insertEmployee(Employee e);
	
	public List<Employee> getEmployees();
	
	public int update(Employee e);
	
	public Employee getEmployeeById(int id);
	
	public int deleteEmployee(int id);
	
	public List<EmployeeData> getMe();

}
