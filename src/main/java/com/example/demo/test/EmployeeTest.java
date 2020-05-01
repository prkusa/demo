package com.example.demo.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(100, "John", "Can");
		Employee e2 = new Employee(110, "Mike", "Sub");
		Employee e3 = new Employee(20, "Ganesh", "Aus");
		Employee[] myEmplArray = new Employee[3];
		
		List<Employee> myEmpList = Arrays.asList(myEmplArray);

		myEmplArray[0] = e1;
		myEmplArray[1] = e2;
		myEmplArray[2] = e3;

		for (Employee e : myEmplArray) {
			System.out.println(e.getId() + ":" + e.getName() + ":" + e.getCity());
		}

	//	Arrays.sort(myEmplArray);
		
		Collections.sort(myEmpList);

		for (Employee e : myEmplArray) {
			System.out.println(e.getId() + ":" + e.getName() + ":" + e.getCity());
		}
		
		

	}

}
