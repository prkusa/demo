package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setEmpId(rs.getInt("EMP_ID"));
		e.setEmpName(rs.getString("EMP_NAME"));
		e.setEmpSal(rs.getInt("EMP_SAL"));
		e.setEmpDept(rs.getInt("EMP_DEPT"));
		return e;
	}

}
