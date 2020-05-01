package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeData;
import com.example.demo.service.EmpService;

//@Controller
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class MyEmployeeController {
	
	@Autowired
	EmpService eService;
	
	@RequestMapping(value = "/myDataEmployees")
	public List<EmployeeData> myFunc1() {
		
		List<EmployeeData> empList = new ArrayList<EmployeeData>();
		
		 empList = eService.getMe();
		 
		 return empList;
	}

}
