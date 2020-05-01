/**
 * 
 */
package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.DepartmentData;
import com.example.demo.model.EmployeeData;

/**
 * @author ram
 *
 */
public class EmployeeRowDataMapper implements RowMapper<EmployeeData> {

	@Override
	public EmployeeData mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		EmployeeData ed = new EmployeeData();
		ed.setEmpId(rs.getInt("EMPID"));
		ed.setEmpName(rs.getString("EMPNAME"));
		ed.setSalary(rs.getString("SALARY"));
		DepartmentData dd = new DepartmentData();
		dd.setDeptId(rs.getInt("DEPTID"));
		dd.setDeptName(rs.getString("DEPTNAME"));
		ed.setDepartmentData(dd);
		return ed;
	}

}
