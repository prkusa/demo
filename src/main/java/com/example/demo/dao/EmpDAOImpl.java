package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeData;

@Repository
public class EmpDAOImpl implements EmpDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insertEmployee(Employee e) {

		String sql = "insert into emp_hib (emp_id,emp_name,emp_sal,emp_dept) values(emp_seq.nextval,?,?,?)";
		int result = jdbcTemplate.update(sql,e.getEmpName(), e.getEmpSal(), e.getEmpDept());
		return result;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		String sql = "SELECT EMP_ID,EMP_NAME,EMP_SAL,EMP_DEPT FROM EMP_HIB";
		List<Employee> empList =  jdbcTemplate.query(sql, new EmployeeRowMapper());
		return empList;
	}

	@Override
	public int update(Employee e) {
		// TODO Auto-generated method stub
		String sql = "UPDATE EMP_HIB SET EMP_NAME ='"+e.getEmpName()+"', EMP_SAL ="+e.getEmpSal()+", EMP_DEPT ="+e.getEmpDept()+" WHERE EMP_ID ="+e.getEmpId();
		return jdbcTemplate.update(sql);
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM EMP_HIB WHERE EMP_ID= ?";
		
		return jdbcTemplate.queryForObject(sql, new Object[]{id}, new EmployeeRowMapper());
	}

	@Override
	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM EMP_HIB WHERE EMP_ID="+id;
		return jdbcTemplate.update(sql);
	}

	@Override
	public List<EmployeeData> getMe() {
		// TODO Auto-generated method stub
		String sql  = " SELECT TEST_SPRING_JDBC.EMPID,TEST_SPRING_JDBC.EMPNAME,TEST_SPRING_JDBC.SALARY,TEST_SPRING_JDBC.DEPTID,\r\n" + 
				"                TEST_SPRING_JDBC_DEPT.DEPTNAME \r\n" + 
				"                FROM TEST_SPRING_JDBC  INNER JOIN TEST_SPRING_JDBC_DEPT  \r\n" + 
				"                ON TEST_SPRING_JDBC_DEPT.DEPTID = TEST_SPRING_JDBC.DEPTID";
		List<EmployeeData> empList = jdbcTemplate.query(sql, new EmployeeRowDataMapper());
		return empList;
	}
	
}
