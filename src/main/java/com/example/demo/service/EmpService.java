package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeData;

@Component
public interface EmpService {
	
	public int  insertEmployee(Employee e);
	
	public List<Employee> getEmployees();
	
	public Employee getEmployeeById(int id);
	
	public int update(Employee e);
	
	public int deleteEmployee(int id);

	public List<EmployeeData> getMe();
	
}
