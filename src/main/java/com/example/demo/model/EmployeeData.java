package com.example.demo.model;

public class EmployeeData {
	private int empId;
	private String empName;
	private String salary;
	private DepartmentData departmentData;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public DepartmentData getDepartmentData() {
		return departmentData;
	}
	public void setDepartmentData(DepartmentData departmentData) {
		this.departmentData = departmentData;
	}

}