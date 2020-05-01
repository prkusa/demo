package com.example.demo.model;

public class Employee {
	
	private int empId;
	
    private String empName;
    
    private int empSal;
    
    private int empDept;

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

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public int getEmpDept() {
		return empDept;
	}

	public void setEmpDept(int empDept) {
		this.empDept = empDept;
	}
	
	public Employee()
	{
		
	}

	public Employee(int empId, String empName, int empSal, int empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDept = empDept;
	}
    
    

}
