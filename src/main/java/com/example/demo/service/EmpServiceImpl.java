package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmpDAOImpl;
import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeData;

@Component
public class EmpServiceImpl implements EmpService {
    
	@Autowired
	EmpDAOImpl empDAOImpl;
	@Override
	public int insertEmployee(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("in EmpSeriveImpl");
		return empDAOImpl.insertEmployee(e);
	}
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return empDAOImpl.getEmployees();
	}
	@Override
	public int update(Employee e) {
		// TODO Auto-generated method stub
		return empDAOImpl.update(e);
	}
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return empDAOImpl.getEmployeeById(id);
	}
	@Override
	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return empDAOImpl.deleteEmployee(id);
	}
	@Override
	public List<EmployeeData> getMe() {
		// TODO Auto-generated method stub
		return empDAOImpl.getMe();
		
	}

}
