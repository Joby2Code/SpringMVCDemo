package com.santosh.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmpDAOImplDB implements EmpDAO {

	private JdbcTemplate jdbcTemplate;
	private EmpRowMapper empRowMapper;

	public EmpDAOImplDB(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setMapper(EmpRowMapper empRowMapper) {
		this.empRowMapper = empRowMapper;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		String query = "select * from employee";
		return jdbcTemplate.query(query, empRowMapper);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EmpDetails getEmployeeDetailsByEmpno(final int empno) {
		// TODO Auto-generated method stub
		String query = "select * from employee where empno=?";
		return (EmpDetails) jdbcTemplate.query(query,
				new Object[] { new Integer(empno) }, new ResultSetExtractor() {

					@Override
					public Object extractData(ResultSet rs)
							throws SQLException, DataAccessException {
						if (rs.next()) {
							EmpDetails ed = new EmpDetails();
							ed.setEmpno(rs.getInt(1));
							ed.setName(rs.getString(2));
							ed.setJob(rs.getString(3));
							ed.setMgr(rs.getInt(4));
							ed.setHiredate(rs.getDate(5));
							ed.setSal(rs.getDouble(6));
							ed.setComm(rs.getDouble(7));
							ed.setDeptno(rs.getInt(8));
							return ed;
						} else
							return null;
					}
				});

	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection getEmployeeDetailsByName(String name) {
		// TODO Auto-generated method stub
		String query = "select * from employee where name like ?";

		return jdbcTemplate.query(query, new Object[] { name }, empRowMapper);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection getEmployeeDetailsByDeptno(int deptno) {
		// TODO Auto-generated method stub
		String query = "select * from employee where deptno=?";
		return jdbcTemplate.query(query, new Object[] { new Integer(deptno) },
				empRowMapper);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection getEmployeeDetailsByJob(String job) {
		// TODO Auto-generated method stub
		String query = "select * from employee where job=?";
		return jdbcTemplate.query(query, new Object[] { job }, empRowMapper);
	}

}
