package com.example.demo.test;

public class Employee implements Comparable<Employee> {

	private int Id;
	private String name;
	private String city;

	public Employee() {

	}

	public Employee(int id, String name, String city) {
		super();
		Id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		return Id + "-" + name + "-" + city;
	}

	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if (Id == e.Id)
			return 0;
		else if (Id > e.Id)
			return 1;
		else
			return -1;

	}

}
